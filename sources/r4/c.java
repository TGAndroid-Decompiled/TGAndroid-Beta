package r4;
public final class c implements Runnable {
    public final int f54253a;
    public final androidx.emoji2.text.q f54254b;
    public final int f54255c;

    public c(androidx.emoji2.text.q qVar, int i3, int i10) {
        this.f54253a = i10;
        this.f54254b = qVar;
        this.f54255c = i3;
    }

    @Override
    public final void run() {
        switch (this.f54253a) {
            case 0:
                w wVar = ((e) ((p7.d) this.f54254b.f1751f).f53346c).d;
                if (wVar != null) {
                    wVar.j(this.f54255c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((p7.d) this.f54254b.f1751f).f53346c).d;
                if (wVar2 != null) {
                    wVar2.k(this.f54255c);
                    return;
                }
                return;
        }
    }
}
