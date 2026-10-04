package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45494a;
    public final q f45495b;

    public l(q qVar, p pVar) {
        this.f45495b = qVar;
        this.f45494a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45494a;
        if (!pVar.h && !pVar.f45505i) {
            q qVar = this.f45495b;
            if ((qVar.f45509c.f25250f3.f31316x.size() - 1) - qVar.f45509c.f25249e3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
