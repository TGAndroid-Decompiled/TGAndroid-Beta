package s4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f41577a;
    public int f41578b;
    public int f41579c;
    public int d;
    public int e;
    public int f41580f;
    public int f41581g;
    public int h;
    public int f41582i;
    public int f41583j;
    public List f41584k;
    public boolean f41585l;

    public final void a(View view) {
        int b10;
        int size = this.f41584k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((c1) this.f41584k.get(i11)).f41610a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f41716a.j() && (b10 = (p0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
        List list = this.f41584k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((c1) this.f41584k.get(i10)).f41610a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.f41716a.j() && this.d == p0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f41610a;
        this.d += this.e;
        return view2;
    }
}
