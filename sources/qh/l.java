package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46705a;
    public final q f46706b;

    public l(q qVar, p pVar) {
        this.f46706b = qVar;
        this.f46705a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46705a;
        if (!pVar.h && !pVar.f46716i) {
            q qVar = this.f46706b;
            if ((qVar.f46720c.W2.f25283x.size() - 1) - qVar.f46720c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
