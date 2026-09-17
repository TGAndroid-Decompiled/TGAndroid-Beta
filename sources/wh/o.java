package wh;
public final class o implements Runnable {
    public final int f48664a;
    public final p f48665b;

    public o(p pVar, int i10) {
        this.f48664a = i10;
        this.f48665b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f48664a) {
            case 0:
                p pVar = this.f48665b;
                pVar.post(new o(pVar, 1));
                return;
            default:
                p pVar2 = this.f48665b;
                pVar2.d = true;
                pVar2.b();
                return;
        }
    }
}
