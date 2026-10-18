package ri;
public final class d implements Runnable {
    public final int f45797a;
    public final p f45798b;
    public final Throwable f45799c;

    public d(p pVar, Throwable th2, int i10) {
        this.f45797a = i10;
        this.f45798b = pVar;
        this.f45799c = th2;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.f45797a) {
            case 0:
                p pVar = this.f45798b;
                pVar.getClass();
                Throwable th2 = this.f45799c;
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                pVar.g(runtimeException);
                return;
            default:
                p pVar2 = this.f45798b;
                pVar2.getClass();
                Throwable th3 = this.f45799c;
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
