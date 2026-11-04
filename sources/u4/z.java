package u4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f55694a;
    public int f55695b;
    public int f55696c;
    public int d;
    public int f55697e;
    public int f55698f;
    public int f55699g;
    public int h;
    public int f55700i;
    public int f55701j;
    public List f55702k;
    public boolean f55703l;

    public final void a(View view) {
        int b10;
        int size = this.f55702k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.f55702k.get(i10)).f55540a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f55645a.j() && (b10 = (p0Var.b() - this.d) * this.f55697e) >= 0 && b10 < i3) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i3 = b10;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(a1 a1Var) {
        int i3 = this.d;
        if (i3 >= 0 && i3 < a1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(tf.e eVar) {
        List list = this.f55702k;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = ((d1) this.f55702k.get(i3)).f55540a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.f55645a.j() && this.d == p0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f55540a;
        this.d += this.f55697e;
        return view2;
    }
}
