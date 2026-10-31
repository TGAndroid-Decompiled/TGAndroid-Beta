package p4;
public final class c implements Runnable {
    public final int f44706a;
    public final androidx.emoji2.text.p f44707b;
    public final int f44708c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44706a = i11;
        this.f44707b = pVar;
        this.f44708c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44706a) {
            case 0:
                w wVar = ((e) ((li.k) this.f44707b.f1404f).d).d;
                if (wVar != null) {
                    wVar.j(this.f44708c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((li.k) this.f44707b.f1404f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.f44708c);
                    return;
                }
                return;
        }
    }
}
