package ri;
public final class d implements Runnable {
    public final int f44722a;
    public final q f44723b;
    public final Throwable f44724c;

    public d(q qVar, Throwable th2, int i10) {
        this.f44722a = i10;
        this.f44723b = qVar;
        this.f44724c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f44722a) {
            case 0:
                q qVar = this.f44723b;
                qVar.getClass();
                Throwable th2 = this.f44724c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                qVar.g(runtimeException);
                return;
            default:
                q qVar2 = this.f44723b;
                qVar2.getClass();
                Throwable th3 = this.f44724c;
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
