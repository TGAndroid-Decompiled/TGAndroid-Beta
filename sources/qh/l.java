package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46814a;
    public final q f46815b;

    public l(q qVar, p pVar) {
        this.f46815b = qVar;
        this.f46814a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46814a;
        if (!pVar.h && !pVar.f46825i) {
            q qVar = this.f46815b;
            if ((qVar.f46829c.W2.f25652x.size() - 1) - qVar.f46829c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
