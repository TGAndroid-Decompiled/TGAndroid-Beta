package ph;
public final class v8 implements Runnable {
    public final int f42484a;
    public final da f42485b;

    public v8(da daVar, int i10) {
        this.f42484a = i10;
        this.f42485b = daVar;
    }

    @Override
    public final void run() {
        switch (this.f42484a) {
            case 0:
                da daVar = this.f42485b;
                daVar.getClass();
                daVar.g(1.0f, true, new h8(daVar, 6));
                daVar.Y0.b(true, true);
                return;
            default:
                da daVar2 = this.f42485b;
                daVar2.f(false);
                daVar2.f41504j2 = null;
                return;
        }
    }
}
