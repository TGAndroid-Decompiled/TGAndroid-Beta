package t3;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import java.util.Arrays;
import s8.i0;
import s8.l;
import s8.t;
import s8.v;
public final class f implements a {
    public final v f47871a;
    public final int f47872b;

    public f(int i10, i0 i0Var) {
        this.f47872b = i10;
        this.f47871a = i0Var;
    }

    public static f b(int i10, w wVar) {
        String str;
        a gVar;
        String str2;
        int i11 = 4;
        l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = wVar.f7310c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (wVar.a() > 8) {
            int i16 = wVar.i();
            int i17 = wVar.f7309b + wVar.i();
            wVar.E(i17);
            if (i16 == 1414744396) {
                gVar = b(wVar.i(), wVar);
            } else {
                d dVar = null;
                switch (i16) {
                    case 1718776947:
                        if (i14 == 2) {
                            wVar.G(i11);
                            int i18 = wVar.i();
                            int i19 = wVar.i();
                            wVar.G(i11);
                            int i20 = wVar.i();
                            switch (i20) {
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
                                e2.c.q(i20, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                m0 m0Var = new m0();
                                m0Var.f9270t = i18;
                                m0Var.f9271u = i19;
                                m0Var.f9265o = str2;
                                gVar = new g(new n0(m0Var));
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int n10 = wVar.n();
                                if (n10 == 1) {
                                    str = "audio/raw";
                                } else if (n10 != 85) {
                                    if (n10 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (n10 != 8192) {
                                        if (n10 != 8193) {
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
                                    e2.c.q(n10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int n11 = wVar.n();
                                    int i21 = wVar.i();
                                    wVar.G(6);
                                    int v = d0.v(wVar.z());
                                    int n12 = wVar.n();
                                    byte[] bArr = new byte[n12];
                                    wVar.e(i13, n12, bArr);
                                    m0 m0Var2 = new m0();
                                    m0Var2.f9265o = str;
                                    m0Var2.B = n11;
                                    m0Var2.C = i21;
                                    if ("audio/raw".equals(str) && v != 0) {
                                        m0Var2.D = v;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && n12 > 0) {
                                        m0Var2.f9267q = v.x(bArr);
                                    }
                                    gVar = new g(new n0(m0Var2));
                                    break;
                                }
                            } else {
                                h5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.B(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int i22 = wVar.i();
                        wVar.G(8);
                        int i23 = wVar.i();
                        int i24 = wVar.i();
                        wVar.G(i11);
                        wVar.i();
                        wVar.G(12);
                        gVar = new c(i22, i23, i24);
                        break;
                    case 1752331379:
                        int i25 = wVar.i();
                        wVar.G(12);
                        wVar.i();
                        int i26 = wVar.i();
                        int i27 = wVar.i();
                        wVar.G(i11);
                        int i28 = wVar.i();
                        int i29 = wVar.i();
                        wVar.G(8);
                        dVar = new d(i25, i26, i27, i28, i29);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.s(wVar.a(), r8.d.f46738c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i30 = ((d) gVar).f47857a;
                    if (i30 != 1935960438) {
                        if (i30 != 1935963489) {
                            if (i30 != 1937012852) {
                                h5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i30));
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
                int i31 = i15 + 1;
                if (objArr.length < i31) {
                    objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i31));
                }
                objArr[i15] = gVar;
                i15 = i31;
            }
            wVar.F(i17);
            wVar.E(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, v.s(i15, objArr));
    }

    public final a a(Class cls) {
        t listIterator = this.f47871a.listIterator(0);
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
        return this.f47872b;
    }
}
