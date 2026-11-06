package wg;
public final class i implements Runnable {
    public final int f57662a;
    public final l f57663b;

    public i(l lVar, int i7) {
        this.f57662a = i7;
        this.f57663b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57662a) {
            case 0:
                this.f57663b.dismiss();
                return;
            default:
                this.f57663b.onBackPressed();
                return;
        }
    }
}
