package p4;
public final class c implements Runnable {
    public final int f46689a;
    public final androidx.emoji2.text.p f46690b;
    public final int f46691c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f46689a = i11;
        this.f46690b = pVar;
        this.f46691c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46689a) {
            case 0:
                v vVar = ((e) ((k6.c) this.f46690b.f2570f).d).d;
                if (vVar != null) {
                    vVar.j(this.f46691c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((k6.c) this.f46690b.f2570f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f46691c);
                    return;
                }
                return;
        }
    }
}
