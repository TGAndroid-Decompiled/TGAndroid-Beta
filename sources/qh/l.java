package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;
public final class l extends s0 {
    public final p f42076a;
    public final q f42077b;

    public l(q qVar, p pVar) {
        this.f42077b = qVar;
        this.f42076a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f42076a;
        if (!pVar.h && !pVar.f42086i) {
            q qVar = this.f42077b;
            if ((qVar.f42090c.Y2.f25293x.size() - 1) - qVar.f42090c.X2.M0() < 5) {
                pVar.a();
            }
        }
    }
}
