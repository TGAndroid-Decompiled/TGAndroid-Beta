package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import s4.s0;
public final class o extends s0 {
    public final int f54515a;
    public final Object f54516b;

    public o(Object obj, int i10) {
        this.f54515a = i10;
        this.f54516b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f54515a) {
            case 2:
                x xVar = (x) this.f54516b;
                if (i10 == 0) {
                    xVar.e = !xVar.d.canScrollVertically(-1);
                    xVar.d.canScrollVertically(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f54515a;
        Object obj = this.f54516b;
        switch (i12) {
            case 0:
                p pVar = (p) obj;
                pVar.f54524w.b(pVar.d);
                return;
            case 1:
                z zVar = (z) obj;
                if (zVar.f54557x1.I1) {
                    i0.v1(zVar.f54555v1.f26635r);
                    return;
                }
                return;
            case 2:
                z zVar2 = ((x) obj).f54540f;
                int i13 = z.M1;
                zVar2.f21587b.invalidate();
                return;
            default:
                u uVar = (u) obj;
                uVar.f54534n.D1.b(uVar.d);
                return;
        }
    }
}
