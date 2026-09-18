package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42045a;
    public final q f42046b;

    public l(q qVar, p pVar) {
        this.f42046b = qVar;
        this.f42045a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42045a;
        if (!pVar.h && !pVar.f42055i) {
            q qVar = this.f42046b;
            if ((qVar.f42059c.Y2.f26045x.size() - 1) - qVar.f42059c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
