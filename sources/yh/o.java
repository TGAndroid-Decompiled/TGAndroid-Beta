package yh;
public final class o implements Runnable {
    public final int f50493a;
    public final v f50494b;

    public o(v vVar, int i10) {
        this.f50493a = i10;
        this.f50494b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50493a) {
            case 0:
                this.f50494b.onBackPressed();
                return;
            default:
                this.f50494b.T();
                return;
        }
    }
}
