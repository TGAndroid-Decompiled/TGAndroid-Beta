package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45487a;
    public final q f45488b;

    public l(q qVar, p pVar) {
        this.f45488b = qVar;
        this.f45487a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45487a;
        if (!pVar.h && !pVar.f45498i) {
            q qVar = this.f45488b;
            if ((qVar.f45502c.f25245f3.f31310x.size() - 1) - qVar.f45502c.f25244e3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
