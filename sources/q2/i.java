package q2;
public final class i implements Runnable {
    public final int f55180a;
    public final k f55181b;
    public final Object f55182c;

    public i(k kVar, l lVar, int i7) {
        this.f55180a = i7;
        this.f55181b = kVar;
        this.f55182c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f55180a) {
            case 0:
                k kVar = this.f55181b;
                this.f55182c.z(kVar.f55185a, kVar.f55186b);
                return;
            default:
                k kVar2 = this.f55181b;
                this.f55182c.w(kVar2.f55185a, kVar2.f55186b);
                return;
        }
    }
}
