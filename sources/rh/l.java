package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class l extends r0 {
    public final p f45771a;
    public final q f45772b;

    public l(q qVar, p pVar) {
        this.f45772b = qVar;
        this.f45771a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f45771a;
        if (!pVar.h && !pVar.f45781i) {
            q qVar = this.f45772b;
            if ((qVar.f45785c.W2.f30204x.size() - 1) - qVar.f45785c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
