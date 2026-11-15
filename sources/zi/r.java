package zi;
public final class r implements Runnable {
    public final int f61677a;
    public final u f61678b;

    public r(u uVar, int i7) {
        this.f61677a = i7;
        this.f61678b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f61677a) {
            case 0:
                u uVar = this.f61678b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    return;
                }
                return;
            default:
                this.f61678b.c();
                return;
        }
    }
}
