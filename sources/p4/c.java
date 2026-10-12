package p4;
public final class c implements Runnable {
    public final int f43004a;
    public final androidx.emoji2.text.p f43005b;
    public final int f43006c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f43004a = i11;
        this.f43005b = pVar;
        this.f43006c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43004a) {
            case 0:
                w wVar = ((e) ((li.k) this.f43005b.f1505f).d).d;
                if (wVar != null) {
                    wVar.j(this.f43006c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((li.k) this.f43005b.f1505f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.f43006c);
                    return;
                }
                return;
        }
    }
}
