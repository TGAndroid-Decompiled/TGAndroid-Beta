package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45781a;
    public final q f45782b;

    public l(q qVar, p pVar) {
        this.f45782b = qVar;
        this.f45781a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45781a;
        if (!pVar.h && !pVar.f45791i) {
            q qVar = this.f45782b;
            if ((qVar.f45795c.W2.f30864x.size() - 1) - qVar.f45795c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
