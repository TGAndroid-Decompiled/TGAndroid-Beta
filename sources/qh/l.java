package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42111a;
    public final q f42112b;

    public l(q qVar, p pVar) {
        this.f42112b = qVar;
        this.f42111a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42111a;
        if (!pVar.h && !pVar.f42121i) {
            q qVar = this.f42112b;
            if ((qVar.f42125c.Y2.f26345x.size() - 1) - qVar.f42125c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
