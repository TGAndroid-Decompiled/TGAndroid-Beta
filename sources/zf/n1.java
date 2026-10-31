package zf;
public final class n1 implements Runnable {
    public final o1 f55595a;

    public n1(o1 o1Var) {
        this.f55595a = o1Var;
    }

    public final void a() {
        o1 o1Var = this.f55595a;
        if (o1Var.Q) {
            return;
        }
        o1Var.Q = true;
        o1Var.I.clear();
        o1Var.J.clear();
        o1Var.F.clear();
        o1Var.E.clear();
        o1Var.G.clear();
        o1Var.H.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: zf.n1.run():void");
    }
}
