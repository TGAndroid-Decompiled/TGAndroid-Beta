package qi;
public final class d implements Runnable {
    public final int f43398a;
    public final q f43399b;
    public final Throwable f43400c;

    public d(q qVar, Throwable th2, int i10) {
        this.f43398a = i10;
        this.f43399b = qVar;
        this.f43400c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f43398a) {
            case 0:
                q qVar = this.f43399b;
                qVar.getClass();
                Throwable th2 = this.f43400c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                qVar.g(runtimeException);
                return;
            default:
                q qVar2 = this.f43399b;
                qVar2.getClass();
                Throwable th3 = this.f43400c;
                if (th3 instanceof Exception) {
                    runtimeException2 = (Exception) th3;
                } else {
                    runtimeException2 = new RuntimeException(th3);
                }
                qVar2.g(runtimeException2);
                return;
        }
    }
}
