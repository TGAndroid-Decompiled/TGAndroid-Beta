package vi;
public final class o implements Runnable {
    public final int f50517a;
    public final s f50518b;

    public o(s sVar, int i10) {
        this.f50517a = i10;
        this.f50518b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f50517a) {
            case 0:
                s sVar = this.f50518b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    return;
                }
                return;
            default:
                this.f50518b.c();
                return;
        }
    }
}
