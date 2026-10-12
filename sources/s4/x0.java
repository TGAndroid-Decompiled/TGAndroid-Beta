package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class x0 {
    public int f44979a = -1;
    public RecyclerView f44980b;
    public n0 f44981c;
    public boolean d;
    public boolean e;
    public View f44982f;
    public final w0 f44983g;
    public boolean h;

    public x0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f44977f = false;
        obj.f44978g = 0;
        obj.f44974a = 0;
        obj.f44975b = 0;
        obj.f44976c = Integer.MIN_VALUE;
        obj.e = null;
        this.f44983g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.f44981c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f44980b;
        if (this.f44979a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f44982f == null && this.f44981c != null && (a2 = a(this.f44979a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f44982f;
        w0 w0Var = this.f44983g;
        if (view != null) {
            this.f44980b.getClass();
            if (RecyclerView.S(view) == this.f44979a) {
                View view2 = this.f44982f;
                y0 y0Var = recyclerView.f2013u0;
                g(view2, w0Var);
                w0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f44982f = null;
            }
        }
        if (this.e) {
            y0 y0Var2 = recyclerView.f2013u0;
            d(i10, i11, w0Var);
            if (w0Var.d >= 0) {
                z10 = true;
            }
            w0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f2009r0.a();
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
        this.f44980b.f2013u0.f44994a = -1;
        this.f44982f = null;
        this.f44979a = -1;
        this.d = false;
        n0 n0Var = this.f44981c;
        if (n0Var.e == this) {
            n0Var.e = null;
        }
        this.f44981c = null;
        this.f44980b = null;
    }
}
