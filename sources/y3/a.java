package y3;
public final class a implements o3.k {
    public final b f50210a = new b(null, 0);
    public final f5.w f50211b = new f5.w(2786);
    public boolean f50212c;

    @Override
    public final int d(o3.l lVar, o3.n nVar) {
        f5.w wVar = this.f50211b;
        int read = ((o3.h) lVar).read(wVar.f6640a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        wVar.C(0);
        wVar.B(read);
        boolean z10 = this.f50212c;
        b bVar = this.f50210a;
        if (!z10) {
            bVar.f(4, 0L);
            this.f50212c = true;
        }
        bVar.c(wVar);
        return 0;
    }

    @Override
    public final boolean e(o3.l r14) {
        throw new UnsupportedOperationException("Method not decompiled: y3.a.e(o3.l):boolean");
    }

    @Override
    public final void f(long j10, long j11) {
        this.f50212c = false;
        this.f50210a.a();
    }

    @Override
    public final void i(o3.m mVar) {
        this.f50210a.e(mVar, new d0(0, 1));
        mVar.e1();
        mVar.D1(new o3.o(-9223372036854775807L));
    }

    @Override
    public final void release() {
    }
}
