package s4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f45703a;
    public int f45704b;
    public int f45705c;
    public int d;
    public int f45706e;
    public int f45707f;
    public int f45708g;
    public int h;
    public int f45709i;
    public int f45710j;
    public List f45711k;
    public boolean f45712l;

    public final void a(View view) {
        int b10;
        int size = this.f45711k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((c1) this.f45711k.get(i11)).f45738a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f45857a.j() && (b10 = (p0Var.b() - this.d) * this.f45706e) >= 0 && b10 < i10) {
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

    public final View c(pf.e eVar) {
        List list = this.f45711k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((c1) this.f45711k.get(i10)).f45738a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.f45857a.j() && this.d == p0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f45738a;
        this.d += this.f45706e;
        return view2;
    }
}
