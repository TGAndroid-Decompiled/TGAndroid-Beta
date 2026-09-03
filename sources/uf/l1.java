package uf;
public final class l1 implements Runnable {
    public final m1 f48674a;

    public l1(m1 m1Var) {
        this.f48674a = m1Var;
    }

    public final void a() {
        m1 m1Var = this.f48674a;
        if (m1Var.N) {
            return;
        }
        m1Var.N = true;
        m1Var.F.clear();
        m1Var.G.clear();
        m1Var.C.clear();
        m1Var.B.clear();
        m1Var.D.clear();
        m1Var.E.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: uf.l1.run():void");
    }
}
