package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45799a;
    public final q f45800b;

    public l(q qVar, p pVar) {
        this.f45800b = qVar;
        this.f45799a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45799a;
        if (!pVar.h && !pVar.f45809i) {
            q qVar = this.f45800b;
            if ((qVar.f45813c.W2.f30203x.size() - 1) - qVar.f45813c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
