package s4;

import android.view.View;
import java.util.List;
public final class b0 {
    public boolean f47623a;
    public int f47624b;
    public int f47625c;
    public int d;
    public int f47626e;
    public int f47627f;
    public int f47628g;
    public int h;
    public int f47629i;
    public int f47630j;
    public List f47631k;
    public boolean f47632l;

    public final void a(View view) {
        int b10;
        int size = this.f47631k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((d1) this.f47631k.get(i11)).f47658a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f47780a.j() && (b10 = (q0Var.b() - this.d) * this.f47626e) >= 0 && b10 < i10) {
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
        List list = this.f47631k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((d1) this.f47631k.get(i10)).f47658a;
                q0 q0Var = (q0) view.getLayoutParams();
                if (!q0Var.f47780a.j() && this.d == q0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f47658a;
        this.d += this.f47626e;
        return view2;
    }
}
