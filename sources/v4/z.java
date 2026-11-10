package v4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f57211a;
    public int f57212b;
    public int f57213c;
    public int d;
    public int f57214e;
    public int f57215f;
    public int f57216g;
    public int h;
    public int f57217i;
    public int f57218j;
    public List f57219k;
    public boolean f57220l;

    public final void a(View view) {
        int b10;
        int size = this.f57219k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.f57219k.get(i10)).f57052a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f57152a.j() && (b10 = (o0Var.b() - this.d) * this.f57214e) >= 0 && b10 < i7) {
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
        List list = this.f57219k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((d1) this.f57219k.get(i7)).f57052a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f57152a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = v0Var.j(this.d, Long.MAX_VALUE).f57052a;
        this.d += this.f57214e;
        return view2;
    }
}
