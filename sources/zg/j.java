package zg;

public final class j implements Runnable {

    public final int f50839a;

    public final Object f50840b;

    public j(Object obj, int i10) {
        this.f50839a = i10;
        this.f50840b = obj;
    }

    @Override
    public final void run() {
        switch (this.f50839a) {
            case 0:
                ((r) this.f50840b).f50859c.U2.N(true);
                break;
            default:
                ((q) this.f50840b).a();
                break;
        }
    }
}
