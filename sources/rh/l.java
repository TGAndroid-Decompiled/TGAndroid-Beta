package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45773a;
    public final q f45774b;

    public l(q qVar, p pVar) {
        this.f45774b = qVar;
        this.f45773a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45773a;
        if (!pVar.h && !pVar.f45783i) {
            q qVar = this.f45774b;
            if ((qVar.f45787c.W2.f30439x.size() - 1) - qVar.f45787c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
