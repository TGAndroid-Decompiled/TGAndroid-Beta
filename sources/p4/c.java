package p4;
public final class c implements Runnable {
    public final int f40544a;
    public final androidx.emoji2.text.o f40545b;
    public final int f40546c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40544a = i11;
        this.f40545b = oVar;
        this.f40546c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40544a) {
            case 0:
                v vVar = ((e) ((lf.i) this.f40545b.f2348f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40546c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.i) this.f40545b.f2348f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40546c);
                    return;
                }
                return;
        }
    }
}
