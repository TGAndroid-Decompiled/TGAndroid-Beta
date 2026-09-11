package wh;
public final class o implements Runnable {
    public final int f48663a;
    public final p f48664b;

    public o(p pVar, int i10) {
        this.f48663a = i10;
        this.f48664b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f48663a) {
            case 0:
                p pVar = this.f48664b;
                pVar.post(new o(pVar, 1));
                return;
            default:
                p pVar2 = this.f48664b;
                pVar2.d = true;
                pVar2.b();
                return;
        }
    }
}
