package zh;
public final class o implements Runnable {
    public final int f60387a;
    public final v f60388b;

    public o(v vVar, int i7) {
        this.f60387a = i7;
        this.f60388b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f60387a) {
            case 0:
                this.f60388b.onBackPressed();
                return;
            default:
                this.f60388b.f1();
                return;
        }
    }
}
