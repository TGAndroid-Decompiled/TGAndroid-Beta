package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46650a;
    public final q f46651b;

    public l(q qVar, p pVar) {
        this.f46651b = qVar;
        this.f46650a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46650a;
        if (!pVar.h && !pVar.f46661i) {
            q qVar = this.f46651b;
            if ((qVar.f46665c.W2.f26682x.size() - 1) - qVar.f46665c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
