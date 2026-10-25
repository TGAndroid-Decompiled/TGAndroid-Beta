package zh;
public final class o implements Runnable {
    public final int f53163a;
    public final v f53164b;

    public o(v vVar, int i10) {
        this.f53163a = i10;
        this.f53164b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53163a) {
            case 0:
                this.f53164b.onBackPressed();
                return;
            default:
                this.f53164b.T();
                return;
        }
    }
}
