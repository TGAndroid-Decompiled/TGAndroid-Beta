package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42078a;
    public final q f42079b;

    public l(q qVar, p pVar) {
        this.f42079b = qVar;
        this.f42078a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42078a;
        if (!pVar.h && !pVar.f42088i) {
            q qVar = this.f42079b;
            if ((qVar.f42092c.Y2.f25927x.size() - 1) - qVar.f42092c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
