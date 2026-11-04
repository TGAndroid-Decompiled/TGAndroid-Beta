package xg;
public final class k implements Runnable {
    public final int f58716a;
    public final n f58717b;

    public k(n nVar, int i3) {
        this.f58716a = i3;
        this.f58717b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f58716a) {
            case 0:
                this.f58717b.dismiss();
                return;
            default:
                this.f58717b.onBackPressed();
                return;
        }
    }
}
