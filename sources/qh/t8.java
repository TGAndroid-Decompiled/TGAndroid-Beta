package qh;
public final class t8 implements Runnable {
    public final int f46124a;
    public final ca f46125b;

    public t8(ca caVar, int i10) {
        this.f46124a = i10;
        this.f46125b = caVar;
    }

    @Override
    public final void run() {
        switch (this.f46124a) {
            case 0:
                ca caVar = this.f46125b;
                caVar.getClass();
                caVar.g(1.0f, true, new g8(caVar, 6));
                caVar.Y0.b(true, true);
                return;
            default:
                ca caVar2 = this.f46125b;
                caVar2.f(false);
                caVar2.f45107j2 = null;
                return;
        }
    }
}
