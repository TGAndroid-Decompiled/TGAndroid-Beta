package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45501a;
    public final q f45502b;

    public l(q qVar, p pVar) {
        this.f45502b = qVar;
        this.f45501a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45501a;
        if (!pVar.h && !pVar.f45512i) {
            q qVar = this.f45502b;
            if ((qVar.f45516c.f26034f3.f32534x.size() - 1) - qVar.f45516c.f26033e3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
