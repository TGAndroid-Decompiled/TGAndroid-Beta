package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45646a;
    public final q f45647b;

    public l(q qVar, p pVar) {
        this.f45647b = qVar;
        this.f45646a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45646a;
        if (!pVar.h && !pVar.f45657i) {
            q qVar = this.f45647b;
            if ((qVar.f45661c.Y2.f31139x.size() - 1) - qVar.f45661c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
