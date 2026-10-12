package qi;
public final class m implements Runnable {
    public final int f46811a;
    public final p f46812b;

    public m(p pVar, int i10) {
        this.f46811a = i10;
        this.f46812b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f46811a) {
            case 0:
                p pVar = this.f46812b;
                if (pVar.P != 0) {
                    pVar.O = true;
                    return;
                }
                return;
            default:
                this.f46812b.b();
                return;
        }
    }
}
