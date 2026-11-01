package th;
public final class r2 implements Runnable {
    public final int f49421a;
    public final vh.w6 f49422b;

    public r2(vh.w6 w6Var, int i10) {
        this.f49421a = i10;
        this.f49422b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f49421a) {
            case 0:
                this.f49422b.dismiss();
                return;
            case 1:
                this.f49422b.dismiss();
                return;
            default:
                this.f49422b.onBackPressed();
                return;
        }
    }
}
