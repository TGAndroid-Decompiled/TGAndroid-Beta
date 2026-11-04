package zh;
public final class e implements Runnable {
    public final int f60560a;
    public final k f60561b;

    public e(k kVar, int i3) {
        this.f60560a = i3;
        this.f60561b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f60560a) {
            case 0:
                this.f60561b.e();
                return;
            case 1:
                k.k(this.f60561b.f60594q, true, true);
                return;
            default:
                this.f60561b.e();
                return;
        }
    }
}
