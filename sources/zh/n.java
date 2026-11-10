package zh;
public final class n implements Runnable {
    public final int f60487a;
    public final u f60488b;

    public n(u uVar, int i7) {
        this.f60487a = i7;
        this.f60488b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f60487a) {
            case 0:
                this.f60488b.onBackPressed();
                return;
            default:
                this.f60488b.f1();
                return;
        }
    }
}
