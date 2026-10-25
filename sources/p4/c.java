package p4;
public final class c implements Runnable {
    public final int f46651a;
    public final androidx.emoji2.text.p f46652b;
    public final int f46653c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f46651a = i11;
        this.f46652b = pVar;
        this.f46653c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46651a) {
            case 0:
                v vVar = ((e) ((k6.c) this.f46652b.f2570f).d).d;
                if (vVar != null) {
                    vVar.j(this.f46653c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((k6.c) this.f46652b.f2570f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f46653c);
                    return;
                }
                return;
        }
    }
}
