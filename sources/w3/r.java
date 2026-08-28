package w3;

import f2.i0;
public final class r implements h {
    public final a0 f48657a;
    public String f48658b;
    public m3.w f48659c;
    public q d;
    public boolean f48660e;
    public long f48666l;
    public final boolean[] f48661f = new boolean[3];
    public final i0 f48662g = new i0(32);
    public final i0 h = new i0(33);
    public final i0 f48663i = new i0(34);
    public final i0 f48664j = new i0(39);
    public final i0 f48665k = new i0(40);
    public long f48667m = -9223372036854775807L;
    public final d5.y f48668n = new d5.y();

    public r(a0 a0Var) {
        this.f48657a = a0Var;
    }

    public final void a(int i9, int i10, byte[] bArr) {
        boolean z10;
        q qVar = this.d;
        if (qVar.f48650f) {
            int i11 = qVar.d;
            int i12 = (i9 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qVar.f48651g = z10;
                qVar.f48650f = false;
            } else {
                qVar.d = (i10 - i9) + i11;
            }
        }
        if (!this.f48660e) {
            this.f48662g.a(i9, i10, bArr);
            this.h.a(i9, i10, bArr);
            this.f48663i.a(i9, i10, bArr);
        }
        this.f48664j.a(i9, i10, bArr);
        this.f48665k.a(i9, i10, bArr);
    }

    @Override
    public final void g(d5.y r45) {
        throw new UnsupportedOperationException("Method not decompiled: w3.r.g(d5.y):void");
    }

    @Override
    public final void h() {
        this.f48666l = 0L;
        this.f48667m = -9223372036854775807L;
        d5.a.m(this.f48661f);
        this.f48662g.f();
        this.h.f();
        this.f48663i.f();
        this.f48664j.f();
        this.f48665k.f();
        q qVar = this.d;
        if (qVar != null) {
            qVar.f48650f = false;
            qVar.f48651g = false;
            qVar.h = false;
            qVar.f48652i = false;
            qVar.f48653j = false;
        }
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f48658b = d0Var.f48528e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.f48659c = I;
        this.d = new q(I);
        this.f48657a.b(mVar, d0Var);
    }

    @Override
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f48667m = j10;
        }
    }

    @Override
    public final void i() {
    }
}
