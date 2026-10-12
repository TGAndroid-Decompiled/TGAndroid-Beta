package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;
public final class m extends r0 {
    public final q f44693a;
    public final r f44694b;

    public m(r rVar, q qVar) {
        this.f44694b = rVar;
        this.f44693a = qVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q qVar = this.f44693a;
        if (!qVar.h && !qVar.f44703i) {
            r rVar = this.f44694b;
            if ((rVar.f44707c.W2.f31783x.size() - 1) - rVar.f44707c.V2.M0() < 5) {
                qVar.a();
            }
        }
    }
}
