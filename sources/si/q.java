package si;
public final class q implements Runnable {
    public final int f46789a;
    public final u f46790b;

    public q(u uVar, int i10) {
        this.f46789a = i10;
        this.f46790b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f46789a) {
            case 0:
                u uVar = this.f46790b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    return;
                }
                return;
            default:
                this.f46790b.c();
                return;
        }
    }
}
