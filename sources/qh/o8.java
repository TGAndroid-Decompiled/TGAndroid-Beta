package qh;
public final class o8 implements Runnable {
    public final int f45842a;
    public final ba f45843b;
    public final boolean f45844c;

    public o8(ba baVar, boolean z4, int i10) {
        this.f45842a = i10;
        this.f45843b = baVar;
        this.f45844c = z4;
    }

    @Override
    public final void run() {
        switch (this.f45842a) {
            case 0:
                this.f45843b.f(this.f45844c);
                return;
            case 1:
                ba baVar = this.f45843b;
                if (!this.f45844c) {
                    baVar.G0.b(false, false);
                    return;
                } else {
                    baVar.getClass();
                    return;
                }
            default:
                ba baVar2 = this.f45843b;
                baVar2.O = null;
                baVar2.f45054e = false;
                baVar2.q(this.f45844c);
                return;
        }
    }
}
