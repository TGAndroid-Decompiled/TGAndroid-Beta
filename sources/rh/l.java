package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45819a;
    public final q f45820b;

    public l(q qVar, p pVar) {
        this.f45820b = qVar;
        this.f45819a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45819a;
        if (!pVar.h && !pVar.f45829i) {
            q qVar = this.f45820b;
            if ((qVar.f45833c.W2.f30210x.size() - 1) - qVar.f45833c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
