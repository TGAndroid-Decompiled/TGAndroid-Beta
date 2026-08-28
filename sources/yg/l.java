package yg;

import androidx.recyclerview.widget.RecyclerView;
import f2.d1;
public final class l extends d1 {
    public final p f50246a;
    public final q f50247b;

    public l(q qVar, p pVar) {
        this.f50247b = qVar;
        this.f50246a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        p pVar = this.f50246a;
        if (!pVar.h && !pVar.f50257i) {
            q qVar = this.f50247b;
            if ((qVar.f50261c.U2.f35191x.size() - 1) - qVar.f50261c.T2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
