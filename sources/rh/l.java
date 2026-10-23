package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f46206a;
    public final q f46207b;

    public l(q qVar, p pVar) {
        this.f46207b = qVar;
        this.f46206a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46206a;
        if (!pVar.h && !pVar.f46216i) {
            q qVar = this.f46207b;
            if ((qVar.f46220c.Z2.f24976y.size() - 1) - qVar.f46220c.Y2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
