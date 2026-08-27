package zg;

import androidx.recyclerview.widget.RecyclerView;
import f2.b1;

public final class m extends b1 {

    public final q f50844a;

    public final r f50845b;

    public m(r rVar, q qVar) {
        this.f50845b = rVar;
        this.f50844a = qVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q qVar = this.f50844a;
        if (qVar.h || qVar.f50855i) {
            return;
        }
        r rVar = this.f50845b;
        if ((rVar.f50859c.U2.f26945x.size() - 1) - rVar.f50859c.T2.M0() < 5) {
            qVar.a();
        }
    }
}
