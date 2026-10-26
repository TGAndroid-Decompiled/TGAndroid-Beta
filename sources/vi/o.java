package vi;
public final class o implements Runnable {
    public final int f50520a;
    public final s f50521b;

    public o(s sVar, int i10) {
        this.f50520a = i10;
        this.f50521b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f50520a) {
            case 0:
                s sVar = this.f50521b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    return;
                }
                return;
            default:
                this.f50521b.c();
                return;
        }
    }
}
