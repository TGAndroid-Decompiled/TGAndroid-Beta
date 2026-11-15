package zi;
public final class k0 implements Runnable {
    public final int f61551a;
    public final u7.i f61552b;
    public final Exception f61553c;

    public k0(u7.i iVar, Exception exc, int i7) {
        this.f61551a = i7;
        this.f61552b = iVar;
        this.f61553c = exc;
    }

    @Override
    public final void run() {
        switch (this.f61551a) {
            case 0:
                v0 v0Var = (v0) this.f61552b.f57880a;
                v0Var.f61756m.a("recording segment interrupted in state=".concat(p0.b(v0Var.f61745a0)), this.f61553c);
                int i7 = v0Var.f61745a0;
                if (i7 == 3) {
                    v0Var.q();
                    return;
                } else if (i7 == 2) {
                    v0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((v0) this.f61552b.f57880a).h(this.f61553c);
                return;
        }
    }
}
