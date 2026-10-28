package sh;

import androidx.recyclerview.widget.RecyclerView;
import s4.u0;
public final class l extends u0 {
    public final p f48692a;
    public final q f48693b;

    public l(q qVar, p pVar) {
        this.f48693b = qVar;
        this.f48692a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f48692a;
        if (!pVar.h && !pVar.f48702i) {
            q qVar = this.f48693b;
            if ((qVar.f48706c.f32504g3.f29882y.size() - 1) - qVar.f48706c.f32503f3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
