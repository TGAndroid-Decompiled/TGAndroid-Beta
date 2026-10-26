package sh;

import androidx.recyclerview.widget.RecyclerView;
import s4.u0;
public final class l extends u0 {
    public final p f48657a;
    public final q f48658b;

    public l(q qVar, p pVar) {
        this.f48658b = qVar;
        this.f48657a = pVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.f48657a;
        if (!pVar.h && !pVar.f48667i) {
            q qVar = this.f48658b;
            if ((qVar.f48671c.f32152g3.f29511y.size() - 1) - qVar.f48671c.f32151f3.M0() < 5) {
                pVar.a();
            }
        }
    }
}
