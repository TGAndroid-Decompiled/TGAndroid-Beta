package v4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f58686a;
    public int f58687b;
    public int f58688c;
    public int d;
    public int f58689e;
    public int f58690f;
    public int f58691g;
    public int h;
    public int f58692i;
    public int f58693j;
    public List f58694k;
    public boolean f58695l;

    public final void a(View view) {
        int b10;
        int size = this.f58694k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((e1) this.f58694k.get(i10)).f58535a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f58637a.j() && (b10 = (p0Var.b() - this.d) * this.f58689e) >= 0 && b10 < i7) {
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
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(b1 b1Var) {
        int i7 = this.d;
        if (i7 >= 0 && i7 < b1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(w0 w0Var) {
        List list = this.f58694k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((e1) this.f58694k.get(i7)).f58535a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.f58637a.j() && this.d == p0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = w0Var.j(this.d, Long.MAX_VALUE).f58535a;
        this.d += this.f58689e;
        return view2;
    }
}
