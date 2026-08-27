package q3;

import d5.y;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j4.k1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m3.h;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.r;
import m3.w;

public final class b implements k {

    public final z f46150a = new z(4);

    public final z f46151b = new z(9);

    public final z f46152c = new z(11);
    public final z d = new z();

    public final c f46153e;

    public m f46154f;

    public int f46155g;
    public boolean h;

    public long f46156i;

    public int f46157j;

    public int f46158k;

    public int f46159l;

    public long f46160m;

    public boolean f46161n;

    public a f46162o;

    public d f46163p;

    public b() {
        c cVar = new c(new j());
        cVar.f46164b = -9223372036854775807L;
        cVar.f46165c = new long[0];
        cVar.d = new long[0];
        this.f46153e = cVar;
        this.f46155g = 1;
    }

    public final z a(l lVar) {
        int i10 = this.f46159l;
        z zVar = this.d;
        byte[] bArr = zVar.f4858a;
        if (i10 > bArr.length) {
            zVar.A(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            zVar.C(0);
        }
        zVar.B(this.f46159l);
        lVar.readFully(zVar.f4858a, 0, this.f46159l);
        return zVar;
    }

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        long j10;
        long j11;
        int i10;
        long j12;
        int i11;
        boolean z10;
        boolean z11;
        long j13;
        d5.a.j(this.f46154f);
        while (true) {
            int i12 = this.f46155g;
            if (i12 == 1) {
                z zVar = this.f46151b;
                if (!((h) lVar).d(zVar.f4858a, 0, 9, true)) {
                    return -1;
                }
                zVar.C(0);
                zVar.D(4);
                int iR = zVar.r();
                boolean z12 = (iR & 4) != 0;
                boolean z13 = (iR & 1) != 0;
                if (z12 && this.f46162o == null) {
                    this.f46162o = new a(this.f46154f.C(8, 1));
                }
                if (z13 && this.f46163p == null) {
                    this.f46163p = new d(this.f46154f.C(9, 2));
                }
                this.f46154f.A();
                this.f46157j = zVar.e() - 5;
                this.f46155g = 2;
            } else if (i12 == 2) {
                ((h) lVar).t(this.f46157j);
                this.f46157j = 0;
                this.f46155g = 3;
            } else if (i12 == 3) {
                z zVar2 = this.f46152c;
                if (!((h) lVar).d(zVar2.f4858a, 0, 11, true)) {
                    return -1;
                }
                zVar2.C(0);
                this.f46158k = zVar2.r();
                this.f46159l = zVar2.t();
                this.f46160m = zVar2.t();
                this.f46160m = (((long) (zVar2.r() << 24)) | this.f46160m) * 1000;
                zVar2.D(3);
                this.f46155g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.h;
                c cVar = this.f46153e;
                if (z14) {
                    j10 = this.f46156i + this.f46160m;
                } else {
                    if (cVar.f46164b == -9223372036854775807L) {
                        j11 = 0;
                    } else {
                        j10 = this.f46160m;
                    }
                    i10 = this.f46158k;
                    if (i10 == 8 || this.f46162o == null) {
                        if (i10 == 9 || this.f46163p == null) {
                            j12 = -9223372036854775807L;
                            i11 = 0;
                            if (i10 == 18 || this.f46161n) {
                                ((h) lVar).t(this.f46159l);
                                z10 = false;
                            } else {
                                z zVarA = a(lVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (zVarA.r() == 2 && "onMetaData".equals(c.S(zVarA)) && zVarA.a() != 0 && zVarA.r() == 8) {
                                    HashMap mapR = c.R(zVarA);
                                    Object obj = mapR.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.f46164b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapR.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f46165c = new long[size];
                                            cVar.d = new long[size];
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj5 = list.get(i13);
                                                Object obj6 = list2.get(i13);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f46165c = new long[0];
                                                    cVar.d = new long[0];
                                                    break;
                                                }
                                                double d10 = d;
                                                cVar.f46165c[i13] = (long) (((Double) obj6).doubleValue() * d10);
                                                cVar.d[i13] = ((Double) obj5).longValue();
                                                i13++;
                                                d = d10;
                                            }
                                        }
                                    }
                                }
                                long j14 = cVar.f46164b;
                                if (j14 != -9223372036854775807L) {
                                    this.f46154f.n(new r(j14, cVar.d, cVar.f46165c));
                                    this.f46161n = true;
                                }
                                z10 = true;
                            }
                            z11 = false;
                        } else {
                            if (!this.f46161n) {
                                this.f46154f.n(new o(-9223372036854775807L));
                                this.f46161n = true;
                            }
                            d dVar = this.f46163p;
                            z zVarA2 = a(lVar);
                            dVar.getClass();
                            int iR2 = zVarA2.r();
                            int i14 = (iR2 >> 4) & 15;
                            int i15 = iR2 & 15;
                            if (i15 != 7) {
                                throw new k1(i0.a.k(i15, "Video format not supported: "));
                            }
                            dVar.f46170g = i14;
                            if (i14 != 5) {
                                z zVar3 = dVar.f46166b;
                                w wVar = (w) dVar.f2040a;
                                z zVar4 = dVar.f46167c;
                                int iR3 = zVarA2.r();
                                byte[] bArr = zVarA2.f4858a;
                                j12 = -9223372036854775807L;
                                int i16 = zVarA2.f4859b;
                                int i17 = i16 + 1;
                                zVarA2.f4859b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                i11 = 0;
                                int i19 = i16 + 2;
                                zVarA2.f4859b = i19;
                                int i20 = ((bArr[i17] & 255) << 8) | i18;
                                zVarA2.f4859b = i16 + 3;
                                long j15 = (((long) ((bArr[i19] & 255) | i20)) * 1000) + j11;
                                boolean z15 = false;
                                if (iR3 == 0 && !dVar.f46168e) {
                                    byte[] bArr2 = new byte[zVarA2.a()];
                                    z zVar5 = new z(bArr2);
                                    zVarA2.c(0, zVarA2.a(), bArr2);
                                    e5.a aVarA = e5.a.a(zVar5);
                                    dVar.d = aVarA.f5223b;
                                    s0 s0Var = new s0();
                                    s0Var.f8135o = "video/avc";
                                    s0Var.h = aVarA.f5226f;
                                    s0Var.f8140t = aVarA.f5224c;
                                    s0Var.f8141u = aVarA.d;
                                    s0Var.f8143x = aVarA.f5225e;
                                    s0Var.f8137q = aVarA.f5222a;
                                    wVar.c(new t0(s0Var));
                                    dVar.f46168e = true;
                                } else if (iR3 == 1 && dVar.f46168e) {
                                    int i21 = dVar.f46170g == 1 ? 1 : 0;
                                    if (dVar.f46169f || i21 != 0) {
                                        byte[] bArr3 = zVar4.f4858a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i22 = 4 - dVar.d;
                                        int i23 = 0;
                                        while (zVarA2.a() > 0) {
                                            zVarA2.c(i22, dVar.d, zVar4.f4858a);
                                            zVar4.C(0);
                                            int iU = zVar4.u();
                                            zVar3.C(0);
                                            wVar.a(4, zVar3);
                                            wVar.a(iU, zVarA2);
                                            i23 = i23 + 4 + iU;
                                        }
                                        ((w) dVar.f2040a).e(j15, i21, i23, 0, null);
                                        dVar.f46169f = true;
                                        z15 = true;
                                    }
                                }
                                if (z15) {
                                    z11 = true;
                                }
                            } else {
                                j12 = -9223372036854775807L;
                                i11 = 0;
                            }
                            z11 = false;
                        }
                        if (!this.h && z11) {
                            this.h = true;
                            if (cVar.f46164b == j12) {
                                j13 = -this.f46160m;
                            } else {
                                j13 = 0;
                            }
                            this.f46156i = j13;
                        }
                        this.f46157j = 4;
                        this.f46155g = 2;
                        if (z10) {
                            return i11;
                        }
                    } else {
                        if (!this.f46161n) {
                            this.f46154f.n(new o(-9223372036854775807L));
                            this.f46161n = true;
                        }
                        a aVar = this.f46162o;
                        z zVarA3 = a(lVar);
                        w wVar2 = (w) aVar.f2040a;
                        if (aVar.f46148b) {
                            zVarA3.D(1);
                        } else {
                            int iR4 = zVarA3.r();
                            int i24 = (iR4 >> 4) & 15;
                            aVar.d = i24;
                            if (i24 == 2) {
                                int i25 = a.f46147e[(iR4 >> 2) & 3];
                                s0 s0Var2 = new s0();
                                s0Var2.f8135o = "audio/mpeg";
                                s0Var2.B = 1;
                                s0Var2.C = i25;
                                wVar2.c(new t0(s0Var2));
                                aVar.f46149c = true;
                            } else if (i24 == 7 || i24 == 8) {
                                String str = i24 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                s0 s0Var3 = new s0();
                                s0Var3.f8135o = str;
                                s0Var3.B = 1;
                                s0Var3.C = 8000;
                                wVar2.c(new t0(s0Var3));
                                aVar.f46149c = true;
                            } else if (i24 != 10) {
                                throw new k1("Audio format not supported: " + aVar.d);
                            }
                            aVar.f46148b = true;
                        }
                        w wVar3 = (w) aVar.f2040a;
                        z11 = true;
                        if (aVar.d == 2) {
                            int iA = zVarA3.a();
                            wVar3.a(iA, zVarA3);
                            ((w) aVar.f2040a).e(j11, 1, iA, 0, null);
                        } else {
                            int iR5 = zVarA3.r();
                            if (iR5 == 0 && !aVar.f46149c) {
                                int iA2 = zVarA3.a();
                                byte[] bArr4 = new byte[iA2];
                                zVarA3.c(0, iA2, bArr4);
                                j3.a aVarH = j3.b.h(new y(bArr4, iA2), false);
                                s0 s0Var4 = new s0();
                                s0Var4.f8135o = "audio/mp4a-latm";
                                s0Var4.h = aVarH.f12303c;
                                s0Var4.B = aVarH.f12302b;
                                s0Var4.C = aVarH.f12301a;
                                s0Var4.f8137q = Collections.singletonList(bArr4);
                                wVar3.c(new t0(s0Var4));
                                aVar.f46149c = true;
                            } else if (aVar.d != 10 || iR5 == 1) {
                                int iA3 = zVarA3.a();
                                wVar3.a(iA3, zVarA3);
                                ((w) aVar.f2040a).e(j11, 1, iA3, 0, null);
                            }
                            z11 = false;
                        }
                        j12 = -9223372036854775807L;
                        i11 = 0;
                    }
                    z10 = true;
                    if (!this.h) {
                        this.h = true;
                        if (cVar.f46164b == j12) {
                            j13 = -this.f46160m;
                        } else {
                            j13 = 0;
                        }
                        this.f46156i = j13;
                    }
                    this.f46157j = 4;
                    this.f46155g = 2;
                    if (z10) {
                        return i11;
                    }
                }
                j11 = j10;
                i10 = this.f46158k;
                if (i10 == 8) {
                    if (i10 == 9) {
                    }
                    j12 = -9223372036854775807L;
                    i11 = 0;
                    if (i10 == 18) {
                        ((h) lVar).t(this.f46159l);
                        z10 = false;
                    } else {
                        ((h) lVar).t(this.f46159l);
                        z10 = false;
                    }
                    z11 = false;
                } else {
                    if (i10 == 9) {
                    }
                    j12 = -9223372036854775807L;
                    i11 = 0;
                    if (i10 == 18) {
                        ((h) lVar).t(this.f46159l);
                        z10 = false;
                    } else {
                        ((h) lVar).t(this.f46159l);
                        z10 = false;
                    }
                    z11 = false;
                }
                if (!this.h) {
                    this.h = true;
                    if (cVar.f46164b == j12) {
                        j13 = -this.f46160m;
                    } else {
                        j13 = 0;
                    }
                    this.f46156i = j13;
                }
                this.f46157j = 4;
                this.f46155g = 2;
                if (z10) {
                    return i11;
                }
            }
        }
    }

    @Override
    public final void c(m mVar) {
        this.f46154f = mVar;
    }

    @Override
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        z zVar = this.f46150a;
        h hVar = (h) lVar;
        hVar.g(zVar.f4858a, 0, 3, false);
        zVar.C(0);
        if (zVar.t() == 4607062) {
            hVar.g(zVar.f4858a, 0, 2, false);
            zVar.C(0);
            if ((zVar.w() & 250) == 0) {
                hVar.g(zVar.f4858a, 0, 4, false);
                zVar.C(0);
                int iE = zVar.e();
                hVar.f17614f = 0;
                hVar.a(iE, false);
                hVar.g(zVar.f4858a, 0, 4, false);
                zVar.C(0);
                if (zVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f46155g = 1;
            this.h = false;
        } else {
            this.f46155g = 3;
        }
        this.f46157j = 0;
    }

    @Override
    public final void release() {
    }
}
