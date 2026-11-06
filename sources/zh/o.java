package zh;
public final class o implements Runnable {
    public final int f60362a;
    public final v f60363b;

    public o(v vVar, int i7) {
        this.f60362a = i7;
        this.f60363b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f60362a) {
            case 0:
                this.f60363b.onBackPressed();
                return;
            default:
                this.f60363b.f1();
                return;
        }
    }
}
