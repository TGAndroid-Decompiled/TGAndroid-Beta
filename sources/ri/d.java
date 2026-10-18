package ri;
public final class d implements Runnable {
    public final int f45845a;
    public final p f45846b;
    public final Throwable f45847c;

    public d(p pVar, Throwable th2, int i10) {
        this.f45845a = i10;
        this.f45846b = pVar;
        this.f45847c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f45845a) {
            case 0:
                p pVar = this.f45846b;
                pVar.getClass();
                Throwable th2 = this.f45847c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                pVar.g(runtimeException);
                return;
            default:
                p pVar2 = this.f45846b;
                pVar2.getClass();
                Throwable th3 = this.f45847c;
                if (th3 instanceof Exception) {
                    runtimeException2 = (Exception) th3;
                } else {
                    runtimeException2 = new RuntimeException(th3);
                }
                pVar2.g(runtimeException2);
                return;
        }
    }
}
