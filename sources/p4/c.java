package p4;
public final class c implements Runnable {
    public final int f46654a;
    public final androidx.emoji2.text.p f46655b;
    public final int f46656c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f46654a = i11;
        this.f46655b = pVar;
        this.f46656c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46654a) {
            case 0:
                v vVar = ((e) ((k6.c) this.f46655b.f2570f).d).d;
                if (vVar != null) {
                    vVar.j(this.f46656c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((k6.c) this.f46655b.f2570f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f46656c);
                    return;
                }
                return;
        }
    }
}
