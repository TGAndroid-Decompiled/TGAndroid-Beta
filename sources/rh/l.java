package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45785a;
    public final q f45786b;

    public l(q qVar, p pVar) {
        this.f45786b = qVar;
        this.f45785a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45785a;
        if (!pVar.h && !pVar.f45795i) {
            q qVar = this.f45786b;
            if ((qVar.f45799c.W2.f30868x.size() - 1) - qVar.f45799c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
