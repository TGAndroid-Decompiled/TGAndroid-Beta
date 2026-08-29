package rf;
public final class l1 implements Runnable {
    public final m1 f47304a;

    public l1(m1 m1Var) {
        this.f47304a = m1Var;
    }

    public final void a() {
        m1 m1Var = this.f47304a;
        if (m1Var.M) {
            return;
        }
        m1Var.M = true;
        m1Var.E.clear();
        m1Var.F.clear();
        m1Var.B.clear();
        m1Var.A.clear();
        m1Var.C.clear();
        m1Var.D.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: rf.l1.run():void");
    }
}
