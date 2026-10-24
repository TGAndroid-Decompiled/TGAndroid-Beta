package yh;
public final class o implements Runnable {
    public final int f50882a;
    public final v f50883b;

    public o(v vVar, int i10) {
        this.f50882a = i10;
        this.f50883b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50882a) {
            case 0:
                this.f50883b.onBackPressed();
                return;
            default:
                this.f50883b.T();
                return;
        }
    }
}
