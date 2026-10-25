package vg;
public final class k implements Runnable {
    public final int f50185a;
    public final n f50186b;

    public k(n nVar, int i10) {
        this.f50185a = i10;
        this.f50186b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f50185a) {
            case 0:
                this.f50186b.dismiss();
                return;
            default:
                this.f50186b.onBackPressed();
                return;
        }
    }
}
