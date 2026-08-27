package s4;

import d5.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r4.l;

public final class c extends i {
    public final int h;

    public final int f47738i;

    public final int f47739j;

    public List f47743n;

    public List f47744o;

    public int f47745p;

    public int f47746q;

    public boolean f47747r;

    public boolean f47748s;

    public byte f47749t;

    public byte f47750u;

    public boolean f47751w;

    public long f47752x;

    public static final int[] f47735y = {11, 1, 3, 12, 14, 5, 7, 9};

    public static final int[] f47736z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    public final z f47737g = new z();

    public final ArrayList f47741l = new ArrayList();

    public b f47742m = new b(0, 4);
    public int v = 0;

    public final long f47740k = 16000000;

    public c(String str, int i10) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f47739j = 0;
            this.f47738i = 0;
        } else if (i10 == 2) {
            this.f47739j = 1;
            this.f47738i = 0;
        } else if (i10 == 3) {
            this.f47739j = 0;
            this.f47738i = 1;
        } else if (i10 != 4) {
            d5.a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f47739j = 0;
            this.f47738i = 0;
        } else {
            this.f47739j = 1;
            this.f47738i = 1;
        }
        h(0);
        g();
        this.f47751w = true;
        this.f47752x = -9223372036854775807L;
    }

    @Override
    public final a5.b b() {
        List list = this.f47743n;
        this.f47744o = list;
        list.getClass();
        return new a5.b(1, list);
    }

    @Override
    public final void c(g gVar) {
        boolean z10;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f14429b;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        z zVar = this.f47737g;
        zVar.A(iLimit, bArrArray);
        boolean z11 = false;
        while (true) {
            int iA = zVar.a();
            int i14 = this.h;
            if (iA < i14) {
                if (z11) {
                    int i15 = this.f47745p;
                    if (i15 == 1 || i15 == 3) {
                        this.f47743n = f();
                        this.f47752x = this.f47793e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iR = i14 == 2 ? -4 : zVar.r();
            int iR2 = zVar.r();
            int iR3 = zVar.r();
            if ((iR & 2) == 0 && (iR & 1) == this.f47738i) {
                byte b10 = (byte) (iR2 & 127);
                byte b11 = (byte) (iR3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f47747r;
                    if ((iR & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iR2] && zArr[iR3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f47747r = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f47748s = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f47751w = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f47751w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f47751w = true;
                                            break;
                                    }
                                } else {
                                    this.f47751w = true;
                                }
                            }
                            if (this.f47751w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.v = (b10 >> 3) & 1;
                                }
                                if (this.v != this.f47739j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f47742m.b();
                                                this.f47742m.a((char) ((b10 & 1) == 0 ? D[b11 & 31] : E[b11 & 31]));
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                this.f47742m.a(' ');
                                                boolean z13 = (b11 & 1) == 1;
                                                b bVar = this.f47742m;
                                                bVar.f47729a.add(new a((b11 >> 1) & 7, z13, bVar.f47731c.length()));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i16 = f47735y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i16++;
                                                }
                                                b bVar2 = this.f47742m;
                                                if (i16 != bVar2.d) {
                                                    if (this.f47745p != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f47745p, this.f47746q);
                                                        this.f47742m = bVar3;
                                                        this.f47741l.add(bVar3);
                                                    }
                                                    this.f47742m.d = i16;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i17 = (b11 >> 1) & 7;
                                                b bVar4 = this.f47742m;
                                                bVar4.f47729a.add(new a(z14 ? 8 : i17, z15, bVar4.f47731c.length()));
                                                if (z14) {
                                                    this.f47742m.f47732e = f47736z[i17];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f47742m.f47733f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    h(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            h(1);
                                                            this.f47746q = 2;
                                                            this.f47742m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.f47746q = 3;
                                                            this.f47742m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.f47746q = 4;
                                                            this.f47742m.h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f47745p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f47743n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1 || i13 == 3) {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1 && !this.f47742m.e()) {
                                                                                b bVar5 = this.f47742m;
                                                                                arrayList = bVar5.f47730b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f47731c.setLength(0);
                                                                                bVar5.f47729a.clear();
                                                                                iMin = Math.min(bVar5.h, bVar5.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.f47743n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f47742m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            this.f47742m.a((char) C[b11 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f47742m;
                                        iArr = B;
                                        bVar6.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f47742m.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            g();
                            z11 = true;
                        }
                    } else if (this.f47748s && this.f47749t == b10 && this.f47750u == b11) {
                        this.f47748s = false;
                    } else {
                        this.f47748s = true;
                        this.f47749t = b10;
                        this.f47750u = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f47751w = true;
                                    } else {
                                        this.f47751w = true;
                                    }
                                }
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f47751w = true;
                                } else {
                                    this.f47751w = true;
                                }
                            }
                            if (this.f47751w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.v = (b10 >> 3) & 1;
                                }
                                if (this.v != this.f47739j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    h(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.f47746q = 2;
                                                                            this.f47742m.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.f47746q = 3;
                                                                            this.f47742m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.f47746q = 4;
                                                                            this.f47742m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f47745p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f47743n = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar7 = this.f47742m;
                                                                                                arrayList = bVar7.f47730b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f47731c.setLength(0);
                                                                                                bVar7.f47729a.clear();
                                                                                                iMin = Math.min(bVar7.h, bVar7.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f47743n = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f47742m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar8 = this.f47742m;
                                                                                            arrayList = bVar8.f47730b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f47731c.setLength(0);
                                                                                            bVar8.f47729a.clear();
                                                                                            iMin = Math.min(bVar8.h, bVar8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar9 = this.f47742m;
                                                                                            arrayList = bVar9.f47730b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f47731c.setLength(0);
                                                                                            bVar9.f47729a.clear();
                                                                                            iMin = Math.min(bVar9.h, bVar9.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar10 = this.f47742m;
                                                                                        arrayList = bVar10.f47730b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f47731c.setLength(0);
                                                                                        bVar10.f47729a.clear();
                                                                                        iMin = Math.min(bVar10.h, bVar10.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar11 = this.f47742m;
                                                                                            arrayList = bVar11.f47730b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f47731c.setLength(0);
                                                                                            bVar11.f47729a.clear();
                                                                                            iMin = Math.min(bVar11.h, bVar11.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar12 = this.f47742m;
                                                                                        arrayList = bVar12.f47730b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f47731c.setLength(0);
                                                                                        bVar12.f47729a.clear();
                                                                                        iMin = Math.min(bVar12.h, bVar12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar13 = this.f47742m;
                                                                                        arrayList = bVar13.f47730b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f47731c.setLength(0);
                                                                                        bVar13.f47729a.clear();
                                                                                        iMin = Math.min(bVar13.h, bVar13.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar14 = this.f47742m;
                                                                                    arrayList = bVar14.f47730b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f47731c.setLength(0);
                                                                                    bVar14.f47729a.clear();
                                                                                    iMin = Math.min(bVar14.h, bVar14.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar15 = this.f47742m;
                                                                                            arrayList = bVar15.f47730b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f47731c.setLength(0);
                                                                                            bVar15.f47729a.clear();
                                                                                            iMin = Math.min(bVar15.h, bVar15.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar16 = this.f47742m;
                                                                                        arrayList = bVar16.f47730b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f47731c.setLength(0);
                                                                                        bVar16.f47729a.clear();
                                                                                        iMin = Math.min(bVar16.h, bVar16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar17 = this.f47742m;
                                                                                        arrayList = bVar17.f47730b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f47731c.setLength(0);
                                                                                        bVar17.f47729a.clear();
                                                                                        iMin = Math.min(bVar17.h, bVar17.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar18 = this.f47742m;
                                                                                    arrayList = bVar18.f47730b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f47731c.setLength(0);
                                                                                    bVar18.f47729a.clear();
                                                                                    iMin = Math.min(bVar18.h, bVar18.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar19 = this.f47742m;
                                                                                        arrayList = bVar19.f47730b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f47731c.setLength(0);
                                                                                        bVar19.f47729a.clear();
                                                                                        iMin = Math.min(bVar19.h, bVar19.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar110 = this.f47742m;
                                                                                    arrayList = bVar110.f47730b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f47731c.setLength(0);
                                                                                    bVar110.f47729a.clear();
                                                                                    iMin = Math.min(bVar110.h, bVar110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar111 = this.f47742m;
                                                                                    arrayList = bVar111.f47730b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f47731c.setLength(0);
                                                                                    bVar111.f47729a.clear();
                                                                                    iMin = Math.min(bVar111.h, bVar111.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    h(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            h(1);
                                                            this.f47746q = 2;
                                                            this.f47742m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.f47746q = 3;
                                                            this.f47742m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.f47746q = 4;
                                                            this.f47742m.h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f47745p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f47743n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar112 = this.f47742m;
                                                                                arrayList = bVar112.f47730b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f47731c.setLength(0);
                                                                                bVar112.f47729a.clear();
                                                                                iMin = Math.min(bVar112.h, bVar112.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.f47743n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f47742m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    h(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.f47746q = 2;
                                                                            this.f47742m.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.f47746q = 3;
                                                                            this.f47742m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.f47746q = 4;
                                                                            this.f47742m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f47745p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f47743n = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar113 = this.f47742m;
                                                                                                arrayList = bVar113.f47730b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f47731c.setLength(0);
                                                                                                bVar113.f47729a.clear();
                                                                                                iMin = Math.min(bVar113.h, bVar113.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f47743n = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f47742m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar114 = this.f47742m;
                                                                                            arrayList = bVar114.f47730b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f47731c.setLength(0);
                                                                                            bVar114.f47729a.clear();
                                                                                            iMin = Math.min(bVar114.h, bVar114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar115 = this.f47742m;
                                                                                            arrayList = bVar115.f47730b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f47731c.setLength(0);
                                                                                            bVar115.f47729a.clear();
                                                                                            iMin = Math.min(bVar115.h, bVar115.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar116 = this.f47742m;
                                                                                        arrayList = bVar116.f47730b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f47731c.setLength(0);
                                                                                        bVar116.f47729a.clear();
                                                                                        iMin = Math.min(bVar116.h, bVar116.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar117 = this.f47742m;
                                                                                            arrayList = bVar117.f47730b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f47731c.setLength(0);
                                                                                            bVar117.f47729a.clear();
                                                                                            iMin = Math.min(bVar117.h, bVar117.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar118 = this.f47742m;
                                                                                        arrayList = bVar118.f47730b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f47731c.setLength(0);
                                                                                        bVar118.f47729a.clear();
                                                                                        iMin = Math.min(bVar118.h, bVar118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar119 = this.f47742m;
                                                                                        arrayList = bVar119.f47730b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f47731c.setLength(0);
                                                                                        bVar119.f47729a.clear();
                                                                                        iMin = Math.min(bVar119.h, bVar119.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1110 = this.f47742m;
                                                                                    arrayList = bVar1110.f47730b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f47731c.setLength(0);
                                                                                    bVar1110.f47729a.clear();
                                                                                    iMin = Math.min(bVar1110.h, bVar1110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                h(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.f47746q = 2;
                                                                        this.f47742m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.f47746q = 3;
                                                                        this.f47742m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.f47746q = 4;
                                                                        this.f47742m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f47745p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f47743n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar1111 = this.f47742m;
                                                                                            arrayList = bVar1111.f47730b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f47731c.setLength(0);
                                                                                            bVar1111.f47729a.clear();
                                                                                            iMin = Math.min(bVar1111.h, bVar1111.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f47743n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f47742m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1112 = this.f47742m;
                                                                                        arrayList = bVar1112.f47730b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f47731c.setLength(0);
                                                                                        bVar1112.f47729a.clear();
                                                                                        iMin = Math.min(bVar1112.h, bVar1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1113 = this.f47742m;
                                                                                        arrayList = bVar1113.f47730b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f47731c.setLength(0);
                                                                                        bVar1113.f47729a.clear();
                                                                                        iMin = Math.min(bVar1113.h, bVar1113.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1114 = this.f47742m;
                                                                                    arrayList = bVar1114.f47730b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f47731c.setLength(0);
                                                                                    bVar1114.f47729a.clear();
                                                                                    iMin = Math.min(bVar1114.h, bVar1114.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            h(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    h(1);
                                                                    this.f47746q = 2;
                                                                    this.f47742m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.f47746q = 3;
                                                                    this.f47742m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.f47746q = 4;
                                                                    this.f47742m.h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f47745p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f47743n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1115 = this.f47742m;
                                                                                        arrayList = bVar1115.f47730b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f47731c.setLength(0);
                                                                                        bVar1115.f47729a.clear();
                                                                                        iMin = Math.min(bVar1115.h, bVar1115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f47743n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f47742m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1116 = this.f47742m;
                                                                                    arrayList = bVar1116.f47730b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f47731c.setLength(0);
                                                                                    bVar1116.f47729a.clear();
                                                                                    iMin = Math.min(bVar1116.h, bVar1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.f47746q = 2;
                                                                this.f47742m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.f47746q = 3;
                                                                this.f47742m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.f47746q = 4;
                                                                this.f47742m.h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f47745p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f47743n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1117 = this.f47742m;
                                                                                    arrayList = bVar1117.f47730b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f47731c.setLength(0);
                                                                                    bVar1117.f47729a.clear();
                                                                                    iMin = Math.min(bVar1117.h, bVar1117.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.f47743n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f47742m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    h(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            h(1);
                                                            this.f47746q = 2;
                                                            this.f47742m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.f47746q = 3;
                                                            this.f47742m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.f47746q = 4;
                                                            this.f47742m.h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f47745p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f47743n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar1118 = this.f47742m;
                                                                                arrayList = bVar1118.f47730b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f47731c.setLength(0);
                                                                                bVar1118.f47729a.clear();
                                                                                iMin = Math.min(bVar1118.h, bVar1118.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.f47743n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f47742m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f47742m;
                                        iArr = B;
                                        bVar20.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f47742m.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            g();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final l dequeueOutputBuffer() {
        l lVar;
        l lVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (lVarDequeueOutputBuffer != null) {
            return lVarDequeueOutputBuffer;
        }
        long j10 = this.f47740k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f47752x;
        if (j11 == -9223372036854775807L || this.f47793e - j11 < j10 || (lVar = (l) this.f47791b.pollFirst()) == null) {
            return null;
        }
        this.f47743n = Collections.EMPTY_LIST;
        this.f47752x = -9223372036854775807L;
        lVar.a(this.f47793e, b(), Long.MAX_VALUE);
        return lVar;
    }

    @Override
    public final boolean e() {
        return this.f47743n != this.f47744o;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.f47741l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            r4.c cVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(cVarC);
            if (cVarC != null) {
                iMin = Math.min(iMin, cVarC.f46742r);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            r4.c cVarC2 = (r4.c) arrayList2.get(i11);
            if (cVarC2 != null) {
                if (cVarC2.f46742r != iMin) {
                    cVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    cVarC2.getClass();
                }
                arrayList3.add(cVarC2);
            }
        }
        return arrayList3;
    }

    @Override
    public final void flush() {
        super.flush();
        this.f47743n = null;
        this.f47744o = null;
        h(0);
        this.f47746q = 4;
        this.f47742m.h = 4;
        g();
        this.f47747r = false;
        this.f47748s = false;
        this.f47749t = (byte) 0;
        this.f47750u = (byte) 0;
        this.v = 0;
        this.f47751w = true;
        this.f47752x = -9223372036854775807L;
    }

    public final void g() {
        b bVar = this.f47742m;
        bVar.f47734g = this.f47745p;
        bVar.f47729a.clear();
        bVar.f47730b.clear();
        bVar.f47731c.setLength(0);
        bVar.d = 15;
        bVar.f47732e = 0;
        bVar.f47733f = 0;
        ArrayList arrayList = this.f47741l;
        arrayList.clear();
        arrayList.add(this.f47742m);
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    public final void h(int i10) {
        int i11 = this.f47745p;
        if (i11 == i10) {
            return;
        }
        this.f47745p = i10;
        if (i10 != 3) {
            g();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f47743n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f47741l;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f47734g = i10;
            i12++;
        }
    }

    @Override
    public final void release() {
    }
}
