package zh;
public final class n implements Runnable {
    public final int f60470a;
    public final u f60471b;

    public n(u uVar, int i7) {
        this.f60470a = i7;
        this.f60471b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f60470a) {
            case 0:
                this.f60471b.onBackPressed();
                return;
            default:
                this.f60471b.f1();
                return;
        }
    }
}
