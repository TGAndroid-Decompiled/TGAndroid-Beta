package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f46205a;
    public final q f46206b;

    public l(q qVar, p pVar) {
        this.f46206b = qVar;
        this.f46205a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46205a;
        if (!pVar.h && !pVar.f46215i) {
            q qVar = this.f46206b;
            if ((qVar.f46219c.Z2.f24650y.size() - 1) - qVar.f46219c.Y2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
