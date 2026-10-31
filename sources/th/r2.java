package th;
public final class r2 implements Runnable {
    public final int f49407a;
    public final vh.w6 f49408b;

    public r2(vh.w6 w6Var, int i10) {
        this.f49407a = i10;
        this.f49408b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f49407a) {
            case 0:
                this.f49408b.dismiss();
                return;
            case 1:
                this.f49408b.dismiss();
                return;
            default:
                this.f49408b.onBackPressed();
                return;
        }
    }
}
