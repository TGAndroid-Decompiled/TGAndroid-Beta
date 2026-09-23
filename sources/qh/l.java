package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f41743a;
    public final q f41744b;

    public l(q qVar, p pVar) {
        this.f41744b = qVar;
        this.f41743a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f41743a;
        if (!pVar.h && !pVar.f41753i) {
            q qVar = this.f41744b;
            if ((qVar.f41757c.Y2.f28665x.size() - 1) - qVar.f41757c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
