package zh;
public final class o implements Runnable {
    public final int f60386a;
    public final v f60387b;

    public o(v vVar, int i7) {
        this.f60386a = i7;
        this.f60387b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f60386a) {
            case 0:
                this.f60387b.onBackPressed();
                return;
            default:
                this.f60387b.f1();
                return;
        }
    }
}
