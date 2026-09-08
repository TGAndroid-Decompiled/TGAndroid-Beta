package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45673a;
    public final q f45674b;

    public l(q qVar, p pVar) {
        this.f45674b = qVar;
        this.f45673a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45673a;
        if (!pVar.h && !pVar.f45684i) {
            q qVar = this.f45674b;
            if ((qVar.f45688c.Y2.f31165x.size() - 1) - qVar.f45688c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
