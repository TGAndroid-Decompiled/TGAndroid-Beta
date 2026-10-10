package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46749a;
    public final q f46750b;

    public l(q qVar, p pVar) {
        this.f46750b = qVar;
        this.f46749a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46749a;
        if (!pVar.h && !pVar.f46760i) {
            q qVar = this.f46750b;
            if ((qVar.f46764c.W2.f25590x.size() - 1) - qVar.f46764c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
