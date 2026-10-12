package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46642a;
    public final q f46643b;

    public l(q qVar, p pVar) {
        this.f46643b = qVar;
        this.f46642a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46642a;
        if (!pVar.h && !pVar.f46653i) {
            q qVar = this.f46643b;
            if ((qVar.f46657c.W2.f26678x.size() - 1) - qVar.f46657c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
