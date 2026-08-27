package r3;

import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.w;
import org.xmlpull.v1.XmlPullParserException;
import p8.l0;
import u3.j;

public final class a implements k {

    public m f46705b;

    public int f46706c;
    public int d;

    public int f46707e;

    public f4.b f46709g;
    public l h;

    public f2.c f46710i;

    public u3.m f46711j;

    public final z f46704a = new z(6);

    public long f46708f = -1;

    public final void a() {
        d(new z3.b[0]);
        m mVar = this.f46705b;
        mVar.getClass();
        mVar.A();
        this.f46705b.n(new o(-9223372036854775807L));
        this.f46706c = 6;
    }

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        String strM;
        f2.c cVarA;
        l0 l0Var;
        int i10;
        f4.b bVar;
        long j10;
        int i11 = this.f46706c;
        z zVar = this.f46704a;
        if (i11 == 0) {
            zVar.z(2);
            ((h) lVar).d(zVar.f4858a, 0, 2, false);
            int iW = zVar.w();
            this.d = iW;
            if (iW == 65498) {
                if (this.f46708f != -1) {
                    this.f46706c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iW < 65488 || iW > 65497) && iW != 65281) {
                this.f46706c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            zVar.z(2);
            ((h) lVar).d(zVar.f4858a, 0, 2, false);
            this.f46707e = zVar.w() - 2;
            this.f46706c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f46710i == null || lVar != this.h) {
                    this.h = lVar;
                    this.f46710i = new f2.c(lVar, this.f46708f);
                }
                u3.m mVar = this.f46711j;
                mVar.getClass();
                int iB = mVar.b(this.f46710i, nVar);
                if (iB == 1) {
                    nVar.f17620a += this.f46708f;
                }
                return iB;
            }
            long j11 = ((h) lVar).d;
            long j12 = this.f46708f;
            if (j11 != j12) {
                nVar.f17620a = j12;
                return 1;
            }
            h hVar = (h) lVar;
            if (!hVar.g(zVar.f4858a, 0, 1, true)) {
                a();
                return 0;
            }
            hVar.f17614f = 0;
            if (this.f46711j == null) {
                this.f46711j = new u3.m(0);
            }
            f2.c cVar = new f2.c(lVar, this.f46708f);
            this.f46710i = cVar;
            this.f46711j.getClass();
            if (!j.i(cVar, false, false)) {
                a();
                return 0;
            }
            u3.m mVar2 = this.f46711j;
            long j13 = this.f46708f;
            m mVar3 = this.f46705b;
            mVar3.getClass();
            mVar2.f48341q = new f2.c(j13, mVar3, 11);
            f4.b bVar2 = this.f46709g;
            bVar2.getClass();
            d(bVar2);
            this.f46706c = 5;
            return 0;
        }
        if (this.d == 65505) {
            z zVar2 = new z(this.f46707e);
            ((h) lVar).d(zVar2.f4858a, 0, this.f46707e, false);
            if (this.f46709g == null && "http://ns.adobe.com/xap/1.0/".equals(zVar2.m()) && (strM = zVar2.m()) != null) {
                long j14 = ((h) lVar).f17612c;
                if (j14 == -1) {
                    bVar = null;
                } else {
                    try {
                        cVarA = d.a(strM);
                    } catch (t1 | NumberFormatException | XmlPullParserException e9) {
                        d5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e9);
                        cVarA = null;
                    }
                    if (cVarA != null && (i10 = (l0Var = (l0) cVarA.f5631c).d) >= 2) {
                        int i12 = i10 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        boolean z10 = false;
                        while (i12 >= 0) {
                            b bVar3 = (b) l0Var.get(i12);
                            boolean zEquals = "video/mp4".equals(bVar3.f46712a) | z10;
                            if (i12 == 0) {
                                j14 -= bVar3.d;
                                j10 = 0;
                            } else {
                                j10 = j14 - bVar3.f46714c;
                            }
                            long j19 = j10;
                            long j20 = j14;
                            j14 = j19;
                            if (zEquals && j14 != j20) {
                                j18 = j20 - j14;
                                j17 = j14;
                                zEquals = false;
                            }
                            if (i12 == 0) {
                                j15 = j14;
                                j16 = j20;
                            }
                            i12--;
                            z10 = zEquals;
                        }
                        if (j17 == -1 || j18 == -1 || j15 == -1 || j16 == -1) {
                            bVar = null;
                        } else {
                            bVar = new f4.b(j15, j16, cVarA.f5630b, j17, j18);
                        }
                    } else {
                        bVar = null;
                    }
                }
                this.f46709g = bVar;
                if (bVar != null) {
                    this.f46708f = bVar.d;
                }
            }
        } else {
            ((h) lVar).t(this.f46707e);
        }
        this.f46706c = 0;
        return 0;
    }

    @Override
    public final void c(m mVar) {
        this.f46705b = mVar;
    }

    public final void d(z3.b... bVarArr) {
        m mVar = this.f46705b;
        mVar.getClass();
        w wVarC = mVar.C(1024, 4);
        s0 s0Var = new s0();
        s0Var.f8134n = "image/jpeg";
        s0Var.f8129i = new z3.c(bVarArr);
        wVarC.c(new t0(s0Var));
    }

    @Override
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        h hVar = (h) lVar;
        z zVar = this.f46704a;
        zVar.z(2);
        hVar.g(zVar.f4858a, 0, 2, false);
        if (zVar.w() == 65496) {
            zVar.z(2);
            hVar.g(zVar.f4858a, 0, 2, false);
            int iW = zVar.w();
            this.d = iW;
            if (iW == 65504) {
                zVar.z(2);
                hVar.g(zVar.f4858a, 0, 2, false);
                hVar.a(zVar.w() - 2, false);
                zVar.z(2);
                hVar.g(zVar.f4858a, 0, 2, false);
                this.d = zVar.w();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                zVar.z(6);
                hVar.g(zVar.f4858a, 0, 6, false);
                if (zVar.s() == 1165519206 && zVar.w() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f46706c = 0;
            this.f46711j = null;
        } else if (this.f46706c == 5) {
            u3.m mVar = this.f46711j;
            mVar.getClass();
            mVar.g(j10, j11);
        }
    }

    @Override
    public final void release() {
        u3.m mVar = this.f46711j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
