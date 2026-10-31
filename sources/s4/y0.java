package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f48045a = -1;
    public RecyclerView f48046b;
    public n0 f48047c;
    public boolean d;
    public boolean e;
    public View f48048f;
    public final x0 f48049g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f48034f = false;
        obj.f48035g = 0;
        obj.f48031a = 0;
        obj.f48032b = 0;
        obj.f48033c = Integer.MIN_VALUE;
        obj.e = null;
        this.f48049g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.f48047c;
        if (n0Var instanceof a0) {
            return ((a0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + a0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f48046b;
        if (this.f48045a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f48048f == null && this.f48047c != null && (a2 = a(this.f48045a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f48048f;
        x0 x0Var = this.f48049g;
        if (view != null) {
            this.f48046b.getClass();
            if (RecyclerView.S(view) == this.f48045a) {
                View view2 = this.f48048f;
                z0 z0Var = recyclerView.f1918u0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f48048f = null;
            }
        }
        if (this.e) {
            z0 z0Var2 = recyclerView.f1918u0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f1914r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, x0 x0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, x0 x0Var);

    public final void h() {
        if (!this.e) {
            return;
        }
        this.e = false;
        f();
        this.f48046b.f1918u0.f48053a = -1;
        this.f48048f = null;
        this.f48045a = -1;
        this.d = false;
        n0 n0Var = this.f48047c;
        if (n0Var.e == this) {
            n0Var.e = null;
        }
        this.f48047c = null;
        this.f48046b = null;
    }
}
