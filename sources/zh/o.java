package zh;
public final class o implements Runnable {
    public final int f60392a;
    public final v f60393b;

    public o(v vVar, int i7) {
        this.f60392a = i7;
        this.f60393b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f60392a) {
            case 0:
                this.f60393b.onBackPressed();
                return;
            default:
                this.f60393b.f1();
                return;
        }
    }
}
