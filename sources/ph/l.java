package ph;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f40434a;
    public final q f40435b;

    public l(q qVar, p pVar) {
        this.f40435b = qVar;
        this.f40434a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f40434a;
        if (!pVar.h && !pVar.f40444i) {
            q qVar = this.f40435b;
            if ((qVar.f40448c.Y2.f24253x.size() - 1) - qVar.f40448c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
