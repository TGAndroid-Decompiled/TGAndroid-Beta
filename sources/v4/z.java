package v4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f57203a;
    public int f57204b;
    public int f57205c;
    public int d;
    public int f57206e;
    public int f57207f;
    public int f57208g;
    public int h;
    public int f57209i;
    public int f57210j;
    public List f57211k;
    public boolean f57212l;

    public final void a(View view) {
        int b10;
        int size = this.f57211k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.f57211k.get(i10)).f57044a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f57144a.j() && (b10 = (o0Var.b() - this.d) * this.f57206e) >= 0 && b10 < i7) {
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
        List list = this.f57211k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((d1) this.f57211k.get(i7)).f57044a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f57144a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = v0Var.j(this.d, Long.MAX_VALUE).f57044a;
        this.d += this.f57206e;
        return view2;
    }
}
