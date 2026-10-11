package s4;

import android.view.View;
import java.util.List;
public final class b0 {
    public boolean f47747a;
    public int f47748b;
    public int f47749c;
    public int d;
    public int f47750e;
    public int f47751f;
    public int f47752g;
    public int h;
    public int f47753i;
    public int f47754j;
    public List f47755k;
    public boolean f47756l;

    public final void a(View view) {
        int b10;
        int size = this.f47755k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((d1) this.f47755k.get(i11)).f47782a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f47904a.j() && (b10 = (q0Var.b() - this.d) * this.f47750e) >= 0 && b10 < i10) {
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

    public final boolean b(a1 a1Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < a1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(pf.e eVar) {
        List list = this.f47755k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((d1) this.f47755k.get(i10)).f47782a;
                q0 q0Var = (q0) view.getLayoutParams();
                if (!q0Var.f47904a.j() && this.d == q0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f47782a;
        this.d += this.f47750e;
        return view2;
    }
}
