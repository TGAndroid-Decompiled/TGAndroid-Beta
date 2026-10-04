package p4;
public final class c implements Runnable {
    public final int f44142a;
    public final androidx.emoji2.text.o f44143b;
    public final int f44144c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f44142a = i11;
        this.f44143b = oVar;
        this.f44144c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44142a) {
            case 0:
                v vVar = ((e) ((la.h) this.f44143b.f2541f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44144c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f44143b.f2541f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44144c);
                    return;
                }
                return;
        }
    }
}
