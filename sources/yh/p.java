package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import s4.s0;
public final class p extends s0 {
    public final int f54514a;
    public final Object f54515b;

    public p(Object obj, int i10) {
        this.f54514a = i10;
        this.f54515b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f54514a) {
            case 2:
                y yVar = (y) this.f54515b;
                if (i10 == 0) {
                    yVar.e = !yVar.d.canScrollVertically(-1);
                    yVar.d.canScrollVertically(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f54514a;
        Object obj = this.f54515b;
        switch (i12) {
            case 0:
                q qVar = (q) obj;
                qVar.f54523w.b(qVar.d);
                return;
            case 1:
                a0 a0Var = (a0) obj;
                if (a0Var.f54455x1.I1) {
                    i0.v1(a0Var.f54453v1.f26588r);
                    return;
                }
                return;
            case 2:
                a0 a0Var2 = ((y) obj).f54539f;
                int i13 = a0.M1;
                a0Var2.f21586b.invalidate();
                return;
            default:
                v vVar = (v) obj;
                vVar.f54533n.D1.b(vVar.d);
                return;
        }
    }
}
