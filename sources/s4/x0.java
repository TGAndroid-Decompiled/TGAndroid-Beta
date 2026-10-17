package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class x0 {
    public int f46079a = -1;
    public RecyclerView f46080b;
    public n0 f46081c;
    public boolean d;
    public boolean e;
    public View f46082f;
    public final w0 f46083g;
    public boolean h;

    public x0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46077f = false;
        obj.f46078g = 0;
        obj.f46074a = 0;
        obj.f46075b = 0;
        obj.f46076c = Integer.MIN_VALUE;
        obj.e = null;
        this.f46083g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.f46081c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46080b;
        if (this.f46079a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46082f == null && this.f46081c != null && (a2 = a(this.f46079a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46082f;
        w0 w0Var = this.f46083g;
        if (view != null) {
            this.f46080b.getClass();
            if (RecyclerView.S(view) == this.f46079a) {
                View view2 = this.f46082f;
                y0 y0Var = recyclerView.f3630u0;
                g(view2, w0Var);
                w0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46082f = null;
            }
        }
        if (this.e) {
            y0 y0Var2 = recyclerView.f3630u0;
            d(i10, i11, w0Var);
            if (w0Var.d >= 0) {
                z10 = true;
            }
            w0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f3626r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, w0 w0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, w0 w0Var);

    public final void h() {
        if (!this.e) {
            return;
        }
        this.e = false;
        f();
        this.f46080b.f3630u0.f46094a = -1;
        this.f46082f = null;
        this.f46079a = -1;
        this.d = false;
        n0 n0Var = this.f46081c;
        if (n0Var.e == this) {
            n0Var.e = null;
        }
        this.f46081c = null;
        this.f46080b = null;
    }
}
