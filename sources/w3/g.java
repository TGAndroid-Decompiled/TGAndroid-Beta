package w3;

import h3.s0;
import h3.t0;
import java.util.Collections;
import java.util.List;
public final class g implements h {
    public final int f48557a;
    public boolean f48558b;
    public long f48559c;
    public int d;
    public int f48560e;
    public final Object f48561f;
    public Object f48562g;

    public g(List list) {
        this.f48557a = 0;
        this.f48561f = list;
        this.f48562g = new m3.w[list.size()];
        this.f48559c = -9223372036854775807L;
    }

    @Override
    public final void g(d5.y yVar) {
        m3.w[] wVarArr;
        boolean z10;
        boolean z11;
        switch (this.f48557a) {
            case 0:
                if (this.f48558b) {
                    if (this.d == 2) {
                        if (yVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (yVar.r() != 32) {
                                this.f48558b = false;
                            }
                            this.d--;
                            z11 = this.f48558b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (yVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (yVar.r() != 0) {
                                this.f48558b = false;
                            }
                            this.d--;
                            z10 = this.f48558b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i9 = yVar.f4411b;
                    int a2 = yVar.a();
                    for (m3.w wVar : (m3.w[]) this.f48562g) {
                        yVar.C(i9);
                        wVar.a(a2, yVar);
                    }
                    this.f48560e += a2;
                    return;
                }
                return;
            default:
                d5.y yVar2 = (d5.y) this.f48561f;
                d5.a.j((m3.w) this.f48562g);
                if (this.f48558b) {
                    int a3 = yVar.a();
                    int i10 = this.f48560e;
                    if (i10 < 10) {
                        int min = Math.min(a3, 10 - i10);
                        System.arraycopy(yVar.f4410a, yVar.f4411b, yVar2.f4410a, this.f48560e, min);
                        if (this.f48560e + min == 10) {
                            yVar2.C(0);
                            if (73 == yVar2.r() && 68 == yVar2.r() && 51 == yVar2.r()) {
                                yVar2.D(3);
                                this.d = yVar2.q() + 10;
                            } else {
                                d5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f48558b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.f48560e);
                    ((m3.w) this.f48562g).a(min2, yVar);
                    this.f48560e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void h() {
        switch (this.f48557a) {
            case 0:
                this.f48558b = false;
                this.f48559c = -9223372036854775807L;
                return;
            default:
                this.f48558b = false;
                this.f48559c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void i() {
        int i9;
        switch (this.f48557a) {
            case 0:
                if (this.f48558b) {
                    if (this.f48559c != -9223372036854775807L) {
                        for (m3.w wVar : (m3.w[]) this.f48562g) {
                            wVar.e(this.f48559c, 1, this.f48560e, 0, null);
                        }
                    }
                    this.f48558b = false;
                    return;
                }
                return;
            default:
                d5.a.j((m3.w) this.f48562g);
                if (this.f48558b && (i9 = this.d) != 0 && this.f48560e == i9) {
                    long j10 = this.f48559c;
                    if (j10 != -9223372036854775807L) {
                        ((m3.w) this.f48562g).e(j10, 1, i9, 0, null);
                    }
                    this.f48558b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        switch (this.f48557a) {
            case 0:
                m3.w[] wVarArr = (m3.w[]) this.f48562g;
                for (int i9 = 0; i9 < wVarArr.length; i9++) {
                    c0 c0Var = (c0) ((List) this.f48561f).get(i9);
                    d0Var.a();
                    d0Var.b();
                    m3.w I = mVar.I(d0Var.d, 3);
                    s0 s0Var = new s0();
                    d0Var.b();
                    s0Var.f9693a = d0Var.f48528e;
                    s0Var.f9705o = "application/dvbsubs";
                    s0Var.f9707q = Collections.singletonList(c0Var.f48514b);
                    s0Var.f9695c = c0Var.f48513a;
                    I.c(new t0(s0Var));
                    wVarArr[i9] = I;
                }
                return;
            default:
                d0Var.a();
                d0Var.b();
                m3.w I2 = mVar.I(d0Var.d, 5);
                this.f48562g = I2;
                s0 s0Var2 = new s0();
                d0Var.b();
                s0Var2.f9693a = d0Var.f48528e;
                s0Var2.f9705o = "application/id3";
                I2.c(new t0(s0Var2));
                return;
        }
    }

    @Override
    public final void k(int i9, long j10) {
        switch (this.f48557a) {
            case 0:
                if ((i9 & 4) != 0) {
                    this.f48558b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f48559c = j10;
                    }
                    this.f48560e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i9 & 4) != 0) {
                    this.f48558b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f48559c = j10;
                    }
                    this.d = 0;
                    this.f48560e = 0;
                    return;
                }
                return;
        }
    }

    public g() {
        this.f48557a = 1;
        this.f48561f = new d5.y(10);
        this.f48559c = -9223372036854775807L;
    }
}
