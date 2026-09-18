package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f41818a;
    public final q f41819b;

    public l(q qVar, p pVar) {
        this.f41819b = qVar;
        this.f41818a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f41818a;
        if (!pVar.h && !pVar.f41828i) {
            q qVar = this.f41819b;
            if ((qVar.f41832c.Y2.f29857x.size() - 1) - qVar.f41832c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
