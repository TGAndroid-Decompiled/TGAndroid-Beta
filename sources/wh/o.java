package wh;
public final class o implements Runnable {
    public final int f48692a;
    public final p f48693b;

    public o(p pVar, int i10) {
        this.f48692a = i10;
        this.f48693b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f48692a) {
            case 0:
                p pVar = this.f48693b;
                pVar.post(new o(pVar, 1));
                return;
            default:
                p pVar2 = this.f48693b;
                pVar2.d = true;
                pVar2.b();
                return;
        }
    }
}
