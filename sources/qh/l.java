package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f41787a;
    public final q f41788b;

    public l(q qVar, p pVar) {
        this.f41788b = qVar;
        this.f41787a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f41787a;
        if (!pVar.h && !pVar.f41797i) {
            q qVar = this.f41788b;
            if ((qVar.f41801c.Y2.f29613x.size() - 1) - qVar.f41801c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
