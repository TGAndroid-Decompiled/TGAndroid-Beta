package qi;
public final class m implements Runnable {
    public final int f46803a;
    public final p f46804b;

    public m(p pVar, int i10) {
        this.f46803a = i10;
        this.f46804b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f46803a) {
            case 0:
                p pVar = this.f46804b;
                if (pVar.P != 0) {
                    pVar.O = true;
                    return;
                }
                return;
            default:
                this.f46804b.b();
                return;
        }
    }
}
