package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42077a;
    public final q f42078b;

    public l(q qVar, p pVar) {
        this.f42078b = qVar;
        this.f42077a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42077a;
        if (!pVar.h && !pVar.f42087i) {
            q qVar = this.f42078b;
            if ((qVar.f42091c.Y2.f25294x.size() - 1) - qVar.f42091c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
