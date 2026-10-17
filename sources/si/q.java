package si;
public final class q implements Runnable {
    public final int f46771a;
    public final u f46772b;

    public q(u uVar, int i10) {
        this.f46771a = i10;
        this.f46772b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f46771a) {
            case 0:
                u uVar = this.f46772b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    return;
                }
                return;
            default:
                this.f46772b.c();
                return;
        }
    }
}
