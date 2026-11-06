package v4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f57086a;
    public int f57087b;
    public int f57088c;
    public int d;
    public int f57089e;
    public int f57090f;
    public int f57091g;
    public int h;
    public int f57092i;
    public int f57093j;
    public List f57094k;
    public boolean f57095l;

    public final void a(View view) {
        int b10;
        int size = this.f57094k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.f57094k.get(i10)).f56927a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f57027a.j() && (b10 = (o0Var.b() - this.d) * this.f57089e) >= 0 && b10 < i7) {
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
            this.d = ((o0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(a1 a1Var) {
        int i7 = this.d;
        if (i7 >= 0 && i7 < a1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(v0 v0Var) {
        List list = this.f57094k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((d1) this.f57094k.get(i7)).f56927a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f57027a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = v0Var.j(this.d, Long.MAX_VALUE).f56927a;
        this.d += this.f57089e;
        return view2;
    }
}
