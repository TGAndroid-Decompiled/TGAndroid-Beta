package zh;
public final class o implements Runnable {
    public final int f53224a;
    public final v f53225b;

    public o(v vVar, int i10) {
        this.f53224a = i10;
        this.f53225b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53224a) {
            case 0:
                this.f53225b.onBackPressed();
                return;
            default:
                this.f53225b.T();
                return;
        }
    }
}
