package zh;
public final class n implements Runnable {
    public final int f60480a;
    public final u f60481b;

    public n(u uVar, int i7) {
        this.f60480a = i7;
        this.f60481b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f60480a) {
            case 0:
                this.f60481b.onBackPressed();
                return;
            default:
                this.f60481b.f1();
                return;
        }
    }
}
