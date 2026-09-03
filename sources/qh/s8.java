package qh;
public final class s8 implements Runnable {
    public final int f46104a;
    public final ba f46105b;

    public s8(ba baVar, int i10) {
        this.f46104a = i10;
        this.f46105b = baVar;
    }

    @Override
    public final void run() {
        switch (this.f46104a) {
            case 0:
                ba baVar = this.f46105b;
                baVar.getClass();
                baVar.g(1.0f, true, new f8(baVar, 6));
                baVar.Y0.b(true, true);
                return;
            default:
                ba baVar2 = this.f46105b;
                baVar2.f(false);
                baVar2.f45073j2 = null;
                return;
        }
    }
}
