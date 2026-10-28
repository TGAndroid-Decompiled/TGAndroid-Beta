package vi;
public final class o implements Runnable {
    public final int f50560a;
    public final s f50561b;

    public o(s sVar, int i10) {
        this.f50560a = i10;
        this.f50561b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f50560a) {
            case 0:
                s sVar = this.f50561b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    return;
                }
                return;
            default:
                this.f50561b.c();
                return;
        }
    }
}
