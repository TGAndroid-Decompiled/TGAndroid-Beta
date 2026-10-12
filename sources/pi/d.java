package pi;
public final class d implements Runnable {
    public final int f45772a;
    public final s f45773b;
    public final Throwable f45774c;

    public d(s sVar, Throwable th2, int i10) {
        this.f45772a = i10;
        this.f45773b = sVar;
        this.f45774c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f45772a) {
            case 0:
                s sVar = this.f45773b;
                sVar.getClass();
                Throwable th2 = this.f45774c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                sVar.g(runtimeException);
                return;
            default:
                s sVar2 = this.f45773b;
                sVar2.getClass();
                Throwable th3 = this.f45774c;
                if (th3 instanceof Exception) {
                    runtimeException2 = (Exception) th3;
                } else {
                    runtimeException2 = new RuntimeException(th3);
                }
                sVar2.g(runtimeException2);
                return;
        }
    }
}
