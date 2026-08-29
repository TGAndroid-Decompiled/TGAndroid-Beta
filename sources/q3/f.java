package q3;

import f5.d0;
import f5.w;
import j3.s0;
import j3.t0;
import java.util.Arrays;
import q8.l;
import q8.l0;
import q8.x;
import q8.z;
public final class f implements a {
    public final z f46247a;
    public final int f46248b;

    public f(int i10, l0 l0Var) {
        this.f46248b = i10;
        this.f46247a = l0Var;
    }

    public static f b(int i10, w wVar) {
        String str;
        a gVar;
        String str2;
        int i11 = 4;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = wVar.f6642c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (wVar.a() > 8) {
            int g10 = wVar.g();
            int g11 = wVar.f6641b + wVar.g();
            wVar.B(g11);
            if (g10 == 1414744396) {
                gVar = b(wVar.g(), wVar);
            } else {
                d dVar = null;
                switch (g10) {
                    case 1718776947:
                        if (i14 == 2) {
                            wVar.D(i11);
                            int g12 = wVar.g();
                            int g13 = wVar.g();
                            wVar.D(i11);
                            int g14 = wVar.g();
                            switch (g14) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                com.google.android.recaptcha.internal.a.s(g14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                s0 s0Var = new s0();
                                s0Var.f10747t = g12;
                                s0Var.f10748u = g13;
                                s0Var.f10742o = str2;
                                gVar = new g(new t0(s0Var));
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int k9 = wVar.k();
                                if (k9 == 1) {
                                    str = "audio/raw";
                                } else if (k9 != 85) {
                                    if (k9 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (k9 != 8192) {
                                        if (k9 != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    com.google.android.recaptcha.internal.a.s(k9, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int k10 = wVar.k();
                                    int g15 = wVar.g();
                                    wVar.D(6);
                                    int u10 = d0.u(wVar.w());
                                    int k11 = wVar.k();
                                    byte[] bArr = new byte[k11];
                                    wVar.c(i13, k11, bArr);
                                    s0 s0Var2 = new s0();
                                    s0Var2.f10742o = str;
                                    s0Var2.B = k10;
                                    s0Var2.C = g15;
                                    if ("audio/raw".equals(str) && u10 != 0) {
                                        s0Var2.D = u10;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && k11 > 0) {
                                        s0Var2.f10744q = z.y(bArr);
                                    }
                                    gVar = new g(new t0(s0Var2));
                                    break;
                                }
                            } else {
                                f5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.B(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int g16 = wVar.g();
                        wVar.D(8);
                        int g17 = wVar.g();
                        int g18 = wVar.g();
                        wVar.D(i11);
                        wVar.g();
                        wVar.D(12);
                        gVar = new c(g16, g17, g18);
                        break;
                    case 1752331379:
                        int g19 = wVar.g();
                        wVar.D(12);
                        wVar.g();
                        int g20 = wVar.g();
                        int g21 = wVar.g();
                        wVar.D(i11);
                        int g22 = wVar.g();
                        int g23 = wVar.g();
                        wVar.D(8);
                        dVar = new d(g19, g20, g21, g22, g23);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.p(wVar.a(), p8.d.f45658c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).f46233a;
                    if (i16 != 1935960438) {
                        if (i16 != 1935963489) {
                            if (i16 != 1937012852) {
                                f5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                                i14 = -1;
                            } else {
                                i14 = 3;
                            }
                        } else {
                            i14 = 1;
                        }
                    } else {
                        i14 = 2;
                    }
                }
                int i17 = i15 + 1;
                if (objArr.length < i17) {
                    objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i17));
                }
                objArr[i15] = gVar;
                i15 = i17;
            }
            wVar.C(g11);
            wVar.B(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, z.s(i15, objArr));
    }

    public final a a(Class cls) {
        x listIterator = this.f46247a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.f46248b;
    }
}
