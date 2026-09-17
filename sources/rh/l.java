package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f45674a;
    public final q f45675b;

    public l(q qVar, p pVar) {
        this.f45675b = qVar;
        this.f45674a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45674a;
        if (!pVar.h && !pVar.f45685i) {
            q qVar = this.f45675b;
            if ((qVar.f45689c.Y2.f31166x.size() - 1) - qVar.f45689c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
