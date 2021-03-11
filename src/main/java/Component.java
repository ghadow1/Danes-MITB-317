// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Component {

	public static Component[] instances;
	public static LRUCache aCache_238;
	public static final LRUCache A_CACHE___264 = new LRUCache(30);
	public Image24 aImage_207;
	public int anInt208;
	public Image24[] aImageArray209;
	public int unusedInt;
	public int[] anIntArray212;
	public int anInt214;
	public int[] anIntArray215;
	public int anInt216;
	public int anInt217;
	public String aString218;
	public int anInt219;
	public int anInt220;
	public String aString221;
	public String aString222;
	public boolean aBoolean223;
	public int anInt224;
	public String[] aStringArray225;
	public int[][] anIntArrayArray226;
	public boolean aBoolean227;
	public String aString228;
	public int anInt230;
	public int anInt231;
	public int anInt232;
	public int anInt233;
	public int anInt234;
	public boolean aBoolean235;
	public int anInt236;
	public int anInt237;
	public int anInt239;
	public int[] anIntArray240;
	public int[] anIntArray241;
	public boolean aBoolean242;
	public BitmapFont aFont_243;
	public int anInt244;
	public int[] anIntArray245;
	public int anInt246;
	public int[] anIntArray247;
	public String aString248;
	public boolean aBoolean249;
	public int anInt250;
	public boolean unusedBool;
	public int[] anIntArray252;
	public int[] anIntArray253;
	public byte aByte254;
	public int anInt255;
	public int anInt256;
	public int anInt257;
	public int anInt258;
	public boolean aBoolean259;
	public Image24 aImage_260;
	public int anInt261;
	public int anInt262;
	public int anInt263;
	public int anInt265;
	public boolean aBoolean266;
	public int anInt267;
	public boolean aBoolean268;
	public int anInt269;
	public int anInt270;
	public int anInt271;
	public int[] anIntArray272;

	public Component() {
	}

	public static void load(FileArchive archive, BitmapFont[] aclass30_sub2_sub1_sub4, FileArchive archive_1) {
		aCache_238 = new LRUCache(50000);
		Packet packet = new Packet(archive.read("data", null));
		int i = -1;
		int j = packet.get2U();
		instances = new Component[j];
		while (packet.position < packet.data.length) {
			int k = packet.get2U();
			if (k == 65535) {
				i = packet.get2U();
				k = packet.get2U();
			}
			Component component = instances[k] = new Component();
			component.anInt250 = k;
			component.anInt236 = i;
			component.anInt262 = packet.get1U();
			component.anInt217 = packet.get1U();
			component.anInt214 = packet.get2U();
			component.anInt220 = packet.get2U();
			component.anInt267 = packet.get2U();
			component.aByte254 = (byte) packet.get1U();
			component.anInt230 = packet.get1U();
			if (component.anInt230 != 0) {
				component.anInt230 = ((component.anInt230 - 1) << 8) + packet.get1U();
			} else {
				component.anInt230 = -1;
			}
			int i1 = packet.get1U();
			if (i1 > 0) {
				component.anIntArray245 = new int[i1];
				component.anIntArray212 = new int[i1];
				for (int j1 = 0; j1 < i1; j1++) {
					component.anIntArray245[j1] = packet.get1U();
					component.anIntArray212[j1] = packet.get2U();
				}
			}
			int k1 = packet.get1U();
			if (k1 > 0) {
				component.anIntArrayArray226 = new int[k1][];
				for (int l1 = 0; l1 < k1; l1++) {
					int i3 = packet.get2U();
					component.anIntArrayArray226[l1] = new int[i3];
					for (int l4 = 0; l4 < i3; l4++) {
						component.anIntArrayArray226[l1][l4] = packet.get2U();
					}
				}
			}
			if (component.anInt262 == 0) {
				component.anInt261 = packet.get2U();
				component.aBoolean266 = packet.get1U() == 1;
				int i2 = packet.get2U();
				component.anIntArray240 = new int[i2];
				component.anIntArray241 = new int[i2];
				component.anIntArray272 = new int[i2];
				for (int j3 = 0; j3 < i2; j3++) {
					component.anIntArray240[j3] = packet.get2U();
					component.anIntArray241[j3] = packet.get2();
					component.anIntArray272[j3] = packet.get2();
				}
			}
			if (component.anInt262 == 1) {
				component.unusedInt = packet.get2U();
				component.unusedBool = packet.get1U() == 1;
			}
			if (component.anInt262 == 2) {
				component.anIntArray253 = new int[component.anInt220 * component.anInt267];
				component.anIntArray252 = new int[component.anInt220 * component.anInt267];
				component.aBoolean259 = packet.get1U() == 1;
				component.aBoolean249 = packet.get1U() == 1;
				component.aBoolean242 = packet.get1U() == 1;
				component.aBoolean235 = packet.get1U() == 1;
				component.anInt231 = packet.get1U();
				component.anInt244 = packet.get1U();
				component.anIntArray215 = new int[20];
				component.anIntArray247 = new int[20];
				component.aImageArray209 = new Image24[20];
				for (int j2 = 0; j2 < 20; j2++) {
					int k3 = packet.get1U();
					if (k3 == 1) {
						component.anIntArray215[j2] = packet.get2();
						component.anIntArray247[j2] = packet.get2();
						String s1 = packet.getString();
						if ((archive_1 != null) && (s1.length() > 0)) {
							int i5 = s1.lastIndexOf(",");
							component.aImageArray209[j2] = method207(Integer.parseInt(s1.substring(i5 + 1)), archive_1, s1.substring(0, i5));
						}
					}
				}
				component.aStringArray225 = new String[5];
				for (int l3 = 0; l3 < 5; l3++) {
					component.aStringArray225[l3] = packet.getString();
					if (component.aStringArray225[l3].length() == 0) {
						component.aStringArray225[l3] = null;
					}
				}
			}
			if (component.anInt262 == 3) {
				component.aBoolean227 = packet.get1U() == 1;
			}
			if ((component.anInt262 == 4) || (component.anInt262 == 1)) {
				component.aBoolean223 = packet.get1U() == 1;
				int k2 = packet.get1U();
				if (aclass30_sub2_sub1_sub4 != null) {
					component.aFont_243 = aclass30_sub2_sub1_sub4[k2];
				}
				component.aBoolean268 = packet.get1U() == 1;
			}
			if (component.anInt262 == 4) {
				component.aString248 = packet.getString();
				component.aString228 = packet.getString();
			}
			if ((component.anInt262 == 1) || (component.anInt262 == 3) || (component.anInt262 == 4)) {
				component.anInt232 = packet.get4();
			}
			if ((component.anInt262 == 3) || (component.anInt262 == 4)) {
				component.anInt219 = packet.get4();
				component.anInt216 = packet.get4();
				component.anInt239 = packet.get4();
			}
			if (component.anInt262 == 5) {
				String s = packet.getString();
				if ((archive_1 != null) && (s.length() > 0)) {
					int i4 = s.lastIndexOf(",");
					component.aImage_207 = method207(Integer.parseInt(s.substring(i4 + 1)), archive_1, s.substring(0, i4));
				}
				s = packet.getString();
				if ((archive_1 != null) && (s.length() > 0)) {
					int j4 = s.lastIndexOf(",");
					component.aImage_260 = method207(Integer.parseInt(s.substring(j4 + 1)), archive_1, s.substring(0, j4));
				}
			}
			if (component.anInt262 == 6) {
				int l = packet.get1U();
				if (l != 0) {
					component.anInt233 = 1;
					component.anInt234 = ((l - 1) << 8) + packet.get1U();
				}
				l = packet.get1U();
				if (l != 0) {
					component.anInt255 = 1;
					component.anInt256 = ((l - 1) << 8) + packet.get1U();
				}
				l = packet.get1U();
				if (l != 0) {
					component.anInt257 = ((l - 1) << 8) + packet.get1U();
				} else {
					component.anInt257 = -1;
				}
				l = packet.get1U();
				if (l != 0) {
					component.anInt258 = ((l - 1) << 8) + packet.get1U();
				} else {
					component.anInt258 = -1;
				}
				component.anInt269 = packet.get2U();
				component.anInt270 = packet.get2U();
				component.anInt271 = packet.get2U();
			}
			if (component.anInt262 == 7) {
				component.anIntArray253 = new int[component.anInt220 * component.anInt267];
				component.anIntArray252 = new int[component.anInt220 * component.anInt267];
				component.aBoolean223 = packet.get1U() == 1;
				int l2 = packet.get1U();
				if (aclass30_sub2_sub1_sub4 != null) {
					component.aFont_243 = aclass30_sub2_sub1_sub4[l2];
				}
				component.aBoolean268 = packet.get1U() == 1;
				component.anInt232 = packet.get4();
				component.anInt231 = packet.get2();
				component.anInt244 = packet.get2();
				component.aBoolean249 = packet.get1U() == 1;
				component.aStringArray225 = new String[5];
				for (int k4 = 0; k4 < 5; k4++) {
					component.aStringArray225[k4] = packet.getString();
					if (component.aStringArray225[k4].length() == 0) {
						component.aStringArray225[k4] = null;
					}
				}
			}
			if ((component.anInt217 == 2) || (component.anInt262 == 2)) {
				component.aString222 = packet.getString();
				component.aString218 = packet.getString();
				component.anInt237 = packet.get2U();
			}
			if ((component.anInt217 == 1) || (component.anInt217 == 4) || (component.anInt217 == 5) || (component.anInt217 == 6)) {
				component.aString221 = packet.getString();
				if (component.aString221.length() == 0) {
					if (component.anInt217 == 1) {
						component.aString221 = "Ok";
					}
					if (component.anInt217 == 4) {
						component.aString221 = "Select";
					}
					if (component.anInt217 == 5) {
						component.aString221 = "Select";
					}
					if (component.anInt217 == 6) {
						component.aString221 = "Continue";
					}
				}
			}
		}
		aCache_238 = null;
	}

	public static Image24 method207(int i, FileArchive archive, String s) {
		long l = (StringUtil.hashCode(s) << 8) + (long) i;
		Image24 image = (Image24) aCache_238.method222(l);
		if (image != null) {
			return image;
		}
		try {
			image = new Image24(archive, s, i);
			aCache_238.method223(image, l);
		} catch (Exception _ex) {
			return null;
		}
		return image;
	}

	public static void method208(int i, int j, Model model) {
		A_CACHE___264.method224();
		if ((model != null) && (j != 4)) {
			A_CACHE___264.method223(model, (j << 16) + i);
		}
	}

	public void method204(int i, int j) {
		int k = anIntArray253[i];
		anIntArray253[i] = anIntArray253[j];
		anIntArray253[j] = k;
		k = anIntArray252[i];
		anIntArray252[i] = anIntArray252[j];
		anIntArray252[j] = k;
	}

	public Model method206(int i, int j) {
		Model model = (Model) A_CACHE___264.method222((i << 16) + j);
		if (model != null) {
			return model;
		}
		if (i == 1) {
			model = Model.tryGet(j);
		}
		if (i == 2) {
			model = NPCType.method159(j).method160();
		}
		if (i == 3) {
			model = Game.aPlayer_1126.method453();
		}
		if (i == 4) {
			model = ObjType.method198(j).method202(50);
		}
		if (i == 5) {
			model = null;
		}
		if (model != null) {
			A_CACHE___264.method223(model, (i << 16) + j);
		}
		return model;
	}

	public Model method209(int j, int k, boolean flag) {
		Model model;
		if (flag) {
			model = method206(anInt255, anInt256);
		} else {
			model = method206(anInt233, anInt234);
		}
		if (model == null) {
			return null;
		}
		if ((k == -1) && (j == -1) && (model.faceColor == null)) {
			return model;
		}
		Model model_1 = new Model(true, SeqFrame.isNull(k) & SeqFrame.isNull(j), false, model);
		if ((k != -1) || (j != -1)) {
			model_1.createLabelReferences();
		}
		if (k != -1) {
			model_1.applySequenceFrame(k);
		}
		if (j != -1) {
			model_1.applySequenceFrame(j);
		}
		model_1.calculateNormals(64, 768, -50, -10, -50, true);
		return model_1;
	}

}
