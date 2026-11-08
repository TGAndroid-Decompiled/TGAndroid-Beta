package zh;
public final class n implements Runnable {
    public final int f60469a;
    public final u f60470b;

    public n(u uVar, int i7) {
        this.f60469a = i7;
        this.f60470b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f60469a) {
            case 0:
                this.f60470b.onBackPressed();
                return;
            default:
                this.f60470b.f1();
                return;
        }
    }
}
