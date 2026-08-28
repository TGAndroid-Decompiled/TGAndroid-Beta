package w3;
public final class c implements m3.k {
    public final b f48510a = new b(null, 1);
    public final d5.y f48511b = new d5.y(16384);
    public boolean f48512c;

    @Override
    public final int b(m3.l lVar, m3.n nVar) {
        d5.y yVar = this.f48511b;
        int read = ((m3.h) lVar).read(yVar.f4410a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yVar.C(0);
        yVar.B(read);
        boolean z10 = this.f48512c;
        b bVar = this.f48510a;
        if (!z10) {
            bVar.k(4, 0L);
            this.f48512c = true;
        }
        bVar.g(yVar);
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48510a.j(mVar, new d0(0, 1));
        mVar.B();
        mVar.y(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l r15) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.f(m3.l):boolean");
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48512c = false;
        this.f48510a.h();
    }

    @Override
    public final void release() {
    }
}
