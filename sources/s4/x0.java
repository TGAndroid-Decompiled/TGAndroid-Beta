package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class x0 {
    public int f46484a = -1;
    public RecyclerView f46485b;
    public n0 f46486c;
    public boolean d;
    public boolean e;
    public View f46487f;
    public final w0 f46488g;
    public boolean h;

    public x0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46482f = false;
        obj.f46483g = 0;
        obj.f46479a = 0;
        obj.f46480b = 0;
        obj.f46481c = Integer.MIN_VALUE;
        obj.e = null;
        this.f46488g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.f46486c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46485b;
        if (this.f46484a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46487f == null && this.f46486c != null && (a2 = a(this.f46484a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46487f;
        w0 w0Var = this.f46488g;
        if (view != null) {
            this.f46485b.getClass();
            if (RecyclerView.S(view) == this.f46484a) {
                View view2 = this.f46487f;
                y0 y0Var = recyclerView.f3634u0;
                g(view2, w0Var);
                w0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46487f = null;
            }
        }
        if (this.e) {
            y0 y0Var2 = recyclerView.f3634u0;
            d(i10, i11, w0Var);
            if (w0Var.d >= 0) {
                z10 = true;
            }
            w0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f3630r0.a();
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
        this.f46485b.f3634u0.f46499a = -1;
        this.f46487f = null;
        this.f46484a = -1;
        this.d = false;
        n0 n0Var = this.f46486c;
        if (n0Var.e == this) {
            n0Var.e = null;
        }
        this.f46486c = null;
        this.f46485b = null;
    }
}
