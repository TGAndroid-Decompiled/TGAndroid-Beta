package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42062a;
    public final q f42063b;

    public l(q qVar, p pVar) {
        this.f42063b = qVar;
        this.f42062a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42062a;
        if (!pVar.h && !pVar.f42072i) {
            q qVar = this.f42063b;
            if ((qVar.f42076c.Y2.f25268x.size() - 1) - qVar.f42076c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
