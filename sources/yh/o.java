package yh;
public final class o implements Runnable {
    public final int f50426a;
    public final v f50427b;

    public o(v vVar, int i10) {
        this.f50426a = i10;
        this.f50427b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50426a) {
            case 0:
                this.f50427b.onBackPressed();
                return;
            default:
                this.f50427b.U();
                return;
        }
    }
}
