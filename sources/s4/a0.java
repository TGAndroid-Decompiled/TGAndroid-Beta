package s4;

import android.view.View;
import java.util.List;
public final class a0 {
    public boolean f47671a;
    public int f47672b;
    public int f47673c;
    public int d;
    public int e;
    public int f47674f;
    public int f47675g;
    public int h;
    public int f47676i;
    public int f47677j;
    public List f47678k;
    public boolean f47679l;

    public final void a(View view) {
        int b10;
        int size = this.f47678k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((e1) this.f47678k.get(i11)).f47738a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f47832a.j() && (b10 = (q0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
        List list = this.f47678k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((e1) this.f47678k.get(i10)).f47738a;
                q0 q0Var = (q0) view.getLayoutParams();
                if (!q0Var.f47832a.j() && this.d == q0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f47738a;
        this.d += this.e;
        return view2;
    }
}
