package wi;
public final class q implements Runnable {
    public final int f58032a;
    public final u f58033b;

    public q(u uVar, int i7) {
        this.f58032a = i7;
        this.f58033b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f58032a) {
            case 0:
                u uVar = this.f58033b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    return;
                }
                return;
            default:
                this.f58033b.c();
                return;
        }
    }
}
