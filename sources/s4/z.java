package s4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f46087a;
    public int f46088b;
    public int f46089c;
    public int d;
    public int e;
    public int f46090f;
    public int f46091g;
    public int h;
    public int f46092i;
    public int f46093j;
    public List f46094k;
    public boolean f46095l;

    public final void a(View view) {
        int b10;
        int size = this.f46094k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((b1) this.f46094k.get(i11)).f45920a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f46024a.j() && (b10 = (o0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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

    public final boolean b(y0 y0Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < y0Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(qf.e eVar) {
        List list = this.f46094k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((b1) this.f46094k.get(i10)).f45920a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f46024a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f45920a;
        this.d += this.e;
        return view2;
    }
}
