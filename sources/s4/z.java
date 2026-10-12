package s4;

import android.view.View;
import java.util.List;
public final class z {
    public boolean f45005a;
    public int f45006b;
    public int f45007c;
    public int d;
    public int e;
    public int f45008f;
    public int f45009g;
    public int h;
    public int f45010i;
    public int f45011j;
    public List f45012k;
    public boolean f45013l;

    public final void a(View view) {
        int b10;
        int size = this.f45012k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((b1) this.f45012k.get(i11)).f44838a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f44942a.j() && (b10 = (o0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
        List list = this.f45012k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((b1) this.f45012k.get(i10)).f44838a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f44942a.j() && this.d == o0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = eVar.j(this.d, Long.MAX_VALUE).f44838a;
        this.d += this.e;
        return view2;
    }
}
