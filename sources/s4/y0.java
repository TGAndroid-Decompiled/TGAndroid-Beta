package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f46699a = -1;
    public RecyclerView f46700b;
    public o0 f46701c;
    public boolean d;
    public boolean f46702e;
    public View f46703f;
    public final x0 f46704g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46686f = false;
        obj.f46687g = 0;
        obj.f46682a = 0;
        obj.f46683b = 0;
        obj.f46684c = Integer.MIN_VALUE;
        obj.f46685e = null;
        this.f46704g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f46701c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46700b;
        if (this.f46699a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46703f == null && this.f46701c != null && (a2 = a(this.f46699a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46703f;
        x0 x0Var = this.f46704g;
        if (view != null) {
            this.f46700b.getClass();
            if (RecyclerView.S(view) == this.f46699a) {
                View view2 = this.f46703f;
                z0 z0Var = recyclerView.f3085t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46703f = null;
            }
        }
        if (this.f46702e) {
            z0 z0Var2 = recyclerView.f3085t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.f46702e) {
                this.d = true;
                recyclerView.f3080q0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, x0 x0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, x0 x0Var);

    public final void h() {
        if (!this.f46702e) {
            return;
        }
        this.f46702e = false;
        f();
        this.f46700b.f3085t0.f46708a = -1;
        this.f46703f = null;
        this.f46699a = -1;
        this.d = false;
        o0 o0Var = this.f46701c;
        if (o0Var.f46637e == this) {
            o0Var.f46637e = null;
        }
        this.f46701c = null;
        this.f46700b = null;
    }
}
