package sh;

import androidx.recyclerview.widget.RecyclerView;
import s4.u0;
public final class l extends u0 {
    public final p f48654a;
    public final q f48655b;

    public l(q qVar, p pVar) {
        this.f48655b = qVar;
        this.f48654a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f48654a;
        if (!pVar.h && !pVar.f48664i) {
            q qVar = this.f48655b;
            if ((qVar.f48668c.f32150g3.f29509y.size() - 1) - qVar.f48668c.f32149f3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
