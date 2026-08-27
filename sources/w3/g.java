package w3;

import h3.s0;
import h3.t0;
import java.util.Collections;
import java.util.List;

public final class g implements h {

    public final int f49063a;

    public boolean f49064b;

    public long f49065c;
    public int d;

    public int f49066e;

    public final Object f49067f;

    public Object f49068g;

    public g(List list) {
        this.f49063a = 0;
        this.f49067f = list;
        this.f49068g = new m3.w[list.size()];
        this.f49065c = -9223372036854775807L;
    }

    @Override
    public final void b(d5.z zVar) {
        boolean z10;
        boolean z11;
        switch (this.f49063a) {
            case 0:
                if (this.f49064b) {
                    if (this.d == 2) {
                        if (zVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (zVar.r() != 32) {
                                this.f49064b = false;
                            }
                            this.d--;
                            z11 = this.f49064b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (zVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (zVar.r() != 0) {
                                this.f49064b = false;
                            }
                            this.d--;
                            z10 = this.f49064b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = zVar.f4859b;
                    int iA = zVar.a();
                    for (m3.w wVar : (m3.w[]) this.f49068g) {
                        zVar.C(i10);
                        wVar.a(iA, zVar);
                    }
                    this.f49066e += iA;
                }
                break;
            default:
                d5.z zVar2 = (d5.z) this.f49067f;
                d5.a.j((m3.w) this.f49068g);
                if (this.f49064b) {
                    int iA2 = zVar.a();
                    int i11 = this.f49066e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(zVar.f4858a, zVar.f4859b, zVar2.f4858a, this.f49066e, iMin);
                        if (this.f49066e + iMin == 10) {
                            zVar2.C(0);
                            if (73 == zVar2.r() && 68 == zVar2.r() && 51 == zVar2.r()) {
                                zVar2.D(3);
                                this.d = zVar2.q() + 10;
                            } else {
                                d5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f49064b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.f49066e);
                    ((m3.w) this.f49068g).a(iMin2, zVar);
                    this.f49066e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override
    public final void c() {
        switch (this.f49063a) {
            case 0:
                this.f49064b = false;
                this.f49065c = -9223372036854775807L;
                break;
            default:
                this.f49064b = false;
                this.f49065c = -9223372036854775807L;
                break;
        }
    }

    @Override
    public final void d() {
        int i10;
        switch (this.f49063a) {
            case 0:
                if (this.f49064b) {
                    if (this.f49065c != -9223372036854775807L) {
                        for (m3.w wVar : (m3.w[]) this.f49068g) {
                            wVar.e(this.f49065c, 1, this.f49066e, 0, null);
                        }
                    }
                    this.f49064b = false;
                }
                break;
            default:
                d5.a.j((m3.w) this.f49068g);
                if (this.f49064b && (i10 = this.d) != 0 && this.f49066e == i10) {
                    long j10 = this.f49065c;
                    if (j10 != -9223372036854775807L) {
                        ((m3.w) this.f49068g).e(j10, 1, i10, 0, null);
                    }
                    this.f49064b = false;
                    break;
                }
                break;
        }
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        switch (this.f49063a) {
            case 0:
                m3.w[] wVarArr = (m3.w[]) this.f49068g;
                for (int i10 = 0; i10 < wVarArr.length; i10++) {
                    d0 d0Var = (d0) ((List) this.f49067f).get(i10);
                    e0Var.a();
                    e0Var.b();
                    m3.w wVarC = mVar.C(e0Var.d, 3);
                    s0 s0Var = new s0();
                    e0Var.b();
                    s0Var.f8123a = e0Var.f49053e;
                    s0Var.f8135o = "application/dvbsubs";
                    s0Var.f8137q = Collections.singletonList(d0Var.f49030b);
                    s0Var.f8125c = d0Var.f49029a;
                    wVarC.c(new t0(s0Var));
                    wVarArr[i10] = wVarC;
                }
                break;
            default:
                e0Var.a();
                e0Var.b();
                m3.w wVarC2 = mVar.C(e0Var.d, 5);
                this.f49068g = wVarC2;
                s0 s0Var2 = new s0();
                e0Var.b();
                s0Var2.f8123a = e0Var.f49053e;
                s0Var2.f8135o = "application/id3";
                wVarC2.c(new t0(s0Var2));
                break;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f49063a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f49064b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f49065c = j10;
                    }
                    this.f49066e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f49064b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f49065c = j10;
                    }
                    this.d = 0;
                    this.f49066e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f49063a = 1;
        this.f49067f = new d5.z(10);
        this.f49065c = -9223372036854775807L;
    }
}
