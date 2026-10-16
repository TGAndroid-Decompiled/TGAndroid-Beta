package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f44450a;
    public final q f44451b;

    public l(q qVar, p pVar) {
        this.f44451b = qVar;
        this.f44450a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f44450a;
        if (!pVar.h && !pVar.f44460i) {
            q qVar = this.f44451b;
            if ((qVar.f44464c.W2.f23148x.size() - 1) - qVar.f44464c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
