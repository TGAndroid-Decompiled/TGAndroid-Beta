package s4;

import android.view.View;
import java.util.List;
public final class y {
    public boolean f48047a;
    public int f48048b;
    public int f48049c;
    public int d;
    public int e;
    public int f48050f;
    public int f48051g;
    public int h;
    public int f48052i;
    public int f48053j;
    public List f48054k;
    public boolean f48055l;

    public final void a(View view) {
        int b10;
        int size = this.f48054k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((c1) this.f48054k.get(i11)).f47909a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f48003a.j() && (b10 = (o0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
            this.d = ((o0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(z0 z0Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < z0Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(hf.e eVar) {
        List list = this.f48054k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((c1) this.f48054k.get(i10)).f47909a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f48003a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f47909a;
        this.d += this.e;
        return view2;
    }
}
