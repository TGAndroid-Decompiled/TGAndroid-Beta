package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45784a;
    public final q f45785b;

    public l(q qVar, p pVar) {
        this.f45785b = qVar;
        this.f45784a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45784a;
        if (!pVar.h && !pVar.f45794i) {
            q qVar = this.f45785b;
            if ((qVar.f45798c.W2.f30867x.size() - 1) - qVar.f45798c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
