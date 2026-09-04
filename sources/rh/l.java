package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45645a;
    public final q f45646b;

    public l(q qVar, p pVar) {
        this.f45646b = qVar;
        this.f45645a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45645a;
        if (!pVar.h && !pVar.f45656i) {
            q qVar = this.f45646b;
            if ((qVar.f45660c.Y2.f31138x.size() - 1) - qVar.f45660c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
