package v4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f59044a;
    public int f59045b;
    public int f59046c;
    public int d;
    public int f59047e;
    public int f59048f;
    public int f59049g;
    public int h;
    public int f59050i;
    public int f59051j;
    public List f59052k;
    public boolean f59053l;

    public final void a(View view) {
        int b10;
        int size = this.f59052k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((f1) this.f59052k.get(i10)).f59122a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f59222a.j() && (b10 = (q0Var.b() - this.d) * this.f59047e) >= 0 && b10 < i7) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i7 = b10;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((q0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(c1 c1Var) {
        int i7 = this.d;
        if (i7 >= 0 && i7 < c1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(x0 x0Var) {
        List list = this.f59052k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((f1) this.f59052k.get(i7)).f59122a;
                q0 q0Var = (q0) view.getLayoutParams();
                if (!q0Var.f59222a.j() && this.d == q0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = x0Var.j(this.d, Long.MAX_VALUE).f59122a;
        this.d += this.f59047e;
        return view2;
    }
}
