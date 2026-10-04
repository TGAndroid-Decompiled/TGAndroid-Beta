package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45486a;
    public final q f45487b;

    public l(q qVar, p pVar) {
        this.f45487b = qVar;
        this.f45486a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45486a;
        if (!pVar.h && !pVar.f45497i) {
            q qVar = this.f45487b;
            if ((qVar.f45501c.f25244f3.f31309x.size() - 1) - qVar.f45501c.f25243e3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
