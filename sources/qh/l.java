package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.t0;
public final class l extends t0 {
    public final p f46780a;
    public final q f46781b;

    public l(q qVar, p pVar) {
        this.f46781b = qVar;
        this.f46780a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f46780a;
        if (!pVar.h && !pVar.f46791i) {
            q qVar = this.f46781b;
            if ((qVar.f46795c.W2.f25893x.size() - 1) - qVar.f46795c.V2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
