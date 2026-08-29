package y3;

import f2.f0;
public final class r implements h {
    public final a0 f50390a;
    public String f50391b;
    public o3.w f50392c;
    public q d;
    public boolean f50393e;
    public long f50399l;
    public final boolean[] f50394f = new boolean[3];
    public final f0 f50395g = new f0(32);
    public final f0 h = new f0(33);
    public final f0 f50396i = new f0(34);
    public final f0 f50397j = new f0(39);
    public final f0 f50398k = new f0(40);
    public long f50400m = -9223372036854775807L;
    public final f5.w f50401n = new f5.w();

    public r(a0 a0Var) {
        this.f50390a = a0Var;
    }

    @Override
    public final void a() {
        this.f50399l = 0L;
        this.f50400m = -9223372036854775807L;
        f5.a.m(this.f50394f);
        this.f50395g.f();
        this.h.f();
        this.f50396i.f();
        this.f50397j.f();
        this.f50398k.f();
        q qVar = this.d;
        if (qVar != null) {
            qVar.f50383f = false;
            qVar.f50384g = false;
            qVar.h = false;
            qVar.f50385i = false;
            qVar.f50386j = false;
        }
    }

    public final void b(int i10, int i11, byte[] bArr) {
        boolean z10;
        q qVar = this.d;
        if (qVar.f50383f) {
            int i12 = qVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qVar.f50384g = z10;
                qVar.f50383f = false;
            } else {
                qVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f50393e) {
            this.f50395g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f50396i.a(i10, i11, bArr);
        }
        this.f50397j.a(i10, i11, bArr);
        this.f50398k.a(i10, i11, bArr);
    }

    @Override
    public final void c(f5.w r45) {
        throw new UnsupportedOperationException("Method not decompiled: y3.r.c(f5.w):void");
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f50391b = d0Var.f50261e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 2);
        this.f50392c = Z1;
        this.d = new q(Z1);
        this.f50390a.b(mVar, d0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50400m = j10;
        }
    }

    @Override
    public final void d() {
    }
}
