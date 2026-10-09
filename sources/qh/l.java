package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46703a;
    public final q f46704b;

    public l(q qVar, p pVar) {
        this.f46704b = qVar;
        this.f46703a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46703a;
        if (!pVar.h && !pVar.f46714i) {
            q qVar = this.f46704b;
            if ((qVar.f46718c.W2.f25283x.size() - 1) - qVar.f46718c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
