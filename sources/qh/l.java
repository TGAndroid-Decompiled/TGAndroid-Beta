package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42181a;
    public final q f42182b;

    public l(q qVar, p pVar) {
        this.f42182b = qVar;
        this.f42181a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42181a;
        if (!pVar.h && !pVar.f42191i) {
            q qVar = this.f42182b;
            if ((qVar.f42195c.f28778f3.f26226x.size() - 1) - qVar.f42195c.f28777e3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
