package s4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f47668a;
    public int f47669b;
    public int f47670c;
    public int d;
    public int e;
    public int f47671f;
    public int f47672g;
    public int h;
    public int f47673i;
    public int f47674j;
    public List f47675k;
    public boolean f47676l;

    public final void a(View view) {
        int b10;
        int size = this.f47675k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((e1) this.f47675k.get(i11)).f47735a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f47829a.j() && (b10 = (q0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
            this.d = ((q0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(b1 b1Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < b1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(rf.e eVar) {
        List list = this.f47675k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((e1) this.f47675k.get(i10)).f47735a;
                q0 q0Var = (q0) view.getLayoutParams();
                if (!q0Var.f47829a.j() && this.d == q0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f47735a;
        this.d += this.e;
        return view2;
    }
}
