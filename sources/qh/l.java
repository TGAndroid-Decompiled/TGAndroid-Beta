package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f41813a;
    public final q f41814b;

    public l(q qVar, p pVar) {
        this.f41814b = qVar;
        this.f41813a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f41813a;
        if (!pVar.h && !pVar.f41823i) {
            q qVar = this.f41814b;
            if ((qVar.f41827c.Y2.f29854x.size() - 1) - qVar.f41827c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
