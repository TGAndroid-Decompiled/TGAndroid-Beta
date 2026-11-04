package wi;
public final class o implements Runnable {
    public final int f57982a;
    public final s f57983b;

    public o(s sVar, int i3) {
        this.f57982a = i3;
        this.f57983b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f57982a) {
            case 0:
                s sVar = this.f57983b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    return;
                }
                return;
            default:
                this.f57983b.c();
                return;
        }
    }
}
