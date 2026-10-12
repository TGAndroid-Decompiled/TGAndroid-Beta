package pi;
public final class e implements Runnable {
    public final int f45780a;
    public final t f45781b;
    public final Throwable f45782c;

    public e(t tVar, Throwable th2, int i10) {
        this.f45780a = i10;
        this.f45781b = tVar;
        this.f45782c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f45780a) {
            case 0:
                t tVar = this.f45781b;
                tVar.getClass();
                Throwable th2 = this.f45782c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                tVar.i(runtimeException);
                return;
            default:
                t tVar2 = this.f45781b;
                tVar2.getClass();
                Throwable th3 = this.f45782c;
                if (th3 instanceof Exception) {
                    runtimeException2 = (Exception) th3;
                } else {
                    runtimeException2 = new RuntimeException(th3);
                }
                tVar2.i(runtimeException2);
                return;
        }
    }
}
