package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42090a;
    public final q f42091b;

    public l(q qVar, p pVar) {
        this.f42091b = qVar;
        this.f42090a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42090a;
        if (!pVar.h && !pVar.f42100i) {
            q qVar = this.f42091b;
            if ((qVar.f42104c.Y2.f25681x.size() - 1) - qVar.f42104c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
