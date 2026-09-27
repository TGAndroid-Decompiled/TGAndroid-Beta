package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42106a;
    public final q f42107b;

    public l(q qVar, p pVar) {
        this.f42107b = qVar;
        this.f42106a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42106a;
        if (!pVar.h && !pVar.f42116i) {
            q qVar = this.f42107b;
            if ((qVar.f42120c.Y2.f25962x.size() - 1) - qVar.f42120c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
