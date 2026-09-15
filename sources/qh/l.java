package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f41791a;
    public final q f41792b;

    public l(q qVar, p pVar) {
        this.f41792b = qVar;
        this.f41791a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f41791a;
        if (!pVar.h && !pVar.f41801i) {
            q qVar = this.f41792b;
            if ((qVar.f41805c.Y2.f29616x.size() - 1) - qVar.f41805c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
