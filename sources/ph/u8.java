package ph;
public final class u8 implements Runnable {
    public final int f42482a;
    public final da f42483b;

    public u8(da daVar, int i10) {
        this.f42482a = i10;
        this.f42483b = daVar;
    }

    @Override
    public final void run() {
        switch (this.f42482a) {
            case 0:
                da daVar = this.f42483b;
                daVar.getClass();
                daVar.g(1.0f, true, new g8(daVar, 6));
                daVar.Y0.b(true, true);
                return;
            default:
                da daVar2 = this.f42483b;
                daVar2.f(false);
                daVar2.f41542j2 = null;
                return;
        }
    }
}
