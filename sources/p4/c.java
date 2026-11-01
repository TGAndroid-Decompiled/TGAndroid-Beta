package p4;
public final class c implements Runnable {
    public final int f44717a;
    public final androidx.emoji2.text.p f44718b;
    public final int f44719c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44717a = i11;
        this.f44718b = pVar;
        this.f44719c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44717a) {
            case 0:
                w wVar = ((e) ((li.k) this.f44718b.f1404f).d).d;
                if (wVar != null) {
                    wVar.j(this.f44719c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((li.k) this.f44718b.f1404f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.f44719c);
                    return;
                }
                return;
        }
    }
}
