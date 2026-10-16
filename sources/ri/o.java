package ri;
public final class o implements Runnable {
    public final int f44660a;
    public final s f44661b;

    public o(s sVar, int i10) {
        this.f44660a = i10;
        this.f44661b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f44660a) {
            case 0:
                s sVar = this.f44661b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    return;
                }
                return;
            default:
                this.f44661b.c();
                return;
        }
    }
}
