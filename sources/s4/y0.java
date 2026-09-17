package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f45907a = -1;
    public RecyclerView f45908b;
    public o0 f45909c;
    public boolean d;
    public boolean f45910e;
    public View f45911f;
    public final x0 f45912g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f45894f = false;
        obj.f45895g = 0;
        obj.f45890a = 0;
        obj.f45891b = 0;
        obj.f45892c = Integer.MIN_VALUE;
        obj.f45893e = null;
        this.f45912g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f45909c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f45908b;
        if (this.f45907a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f45911f == null && this.f45909c != null && (a2 = a(this.f45907a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f45911f;
        x0 x0Var = this.f45912g;
        if (view != null) {
            this.f45908b.getClass();
            if (RecyclerView.S(view) == this.f45907a) {
                View view2 = this.f45911f;
                z0 z0Var = recyclerView.f1891t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f45911f = null;
            }
        }
        if (this.f45910e) {
            z0 z0Var2 = recyclerView.f1891t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.f45910e) {
                this.d = true;
                recyclerView.f1886q0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, x0 x0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, x0 x0Var);

    public final void h() {
        if (!this.f45910e) {
            return;
        }
        this.f45910e = false;
        f();
        this.f45908b.f1891t0.f45916a = -1;
        this.f45911f = null;
        this.f45907a = -1;
        this.d = false;
        o0 o0Var = this.f45909c;
        if (o0Var.f45845e == this) {
            o0Var.f45845e = null;
        }
        this.f45909c = null;
        this.f45908b = null;
    }
}
