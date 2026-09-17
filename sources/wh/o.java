package wh;
public final class o implements Runnable {
    public final int f48693a;
    public final p f48694b;

    public o(p pVar, int i10) {
        this.f48693a = i10;
        this.f48694b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f48693a) {
            case 0:
                p pVar = this.f48694b;
                pVar.post(new o(pVar, 1));
                return;
            default:
                p pVar2 = this.f48694b;
                pVar2.d = true;
                pVar2.b();
                return;
        }
    }
}
