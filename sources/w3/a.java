package w3;
public final class a implements m3.k {
    public final b f48477a = new b(null, 0);
    public final d5.y f48478b = new d5.y(2786);
    public boolean f48479c;

    @Override
    public final int b(m3.l lVar, m3.n nVar) {
        d5.y yVar = this.f48478b;
        int read = ((m3.h) lVar).read(yVar.f4410a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        yVar.C(0);
        yVar.B(read);
        boolean z10 = this.f48479c;
        b bVar = this.f48477a;
        if (!z10) {
            bVar.k(4, 0L);
            this.f48479c = true;
        }
        bVar.g(yVar);
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48477a.j(mVar, new d0(0, 1));
        mVar.B();
        mVar.y(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l r14) {
        throw new UnsupportedOperationException("Method not decompiled: w3.a.f(m3.l):boolean");
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48479c = false;
        this.f48477a.h();
    }

    @Override
    public final void release() {
    }
}
