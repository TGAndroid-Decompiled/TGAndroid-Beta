package s4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f42594a;
    public int f42595b;
    public int f42596c;
    public int d;
    public int e;
    public int f42597f;
    public int f42598g;
    public int h;
    public int f42599i;
    public int f42600j;
    public List f42601k;
    public boolean f42602l;

    public final void a(View view) {
        int b10;
        int size = this.f42601k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((c1) this.f42601k.get(i11)).f42627a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f42733a.j() && (b10 = (p0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i10 = b10;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(z0 z0Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < z0Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(of.e eVar) {
        List list = this.f42601k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((c1) this.f42601k.get(i10)).f42627a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.f42733a.j() && this.d == p0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f42627a;
        this.d += this.e;
        return view2;
    }
}
