package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f48066a = -1;
    public RecyclerView f48067b;
    public p0 f48068c;
    public boolean d;
    public boolean f48069e;
    public View f48070f;
    public final y0 f48071g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f48053f = false;
        obj.f48054g = 0;
        obj.f48049a = 0;
        obj.f48050b = 0;
        obj.f48051c = Integer.MIN_VALUE;
        obj.f48052e = null;
        this.f48071g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.f48068c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f48067b;
        if (this.f48066a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f48070f == null && this.f48068c != null && (a2 = a(this.f48066a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f48070f;
        y0 y0Var = this.f48071g;
        if (view != null) {
            this.f48067b.getClass();
            if (RecyclerView.S(view) == this.f48066a) {
                View view2 = this.f48070f;
                a1 a1Var = recyclerView.f3163u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f48070f = null;
            }
        }
        if (this.f48069e) {
            a1 a1Var2 = recyclerView.f3163u0;
            d(i10, i11, y0Var);
            if (y0Var.d >= 0) {
                z10 = true;
            }
            y0Var.a(recyclerView);
            if (z10 && this.f48069e) {
                this.d = true;
                recyclerView.f3159r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, y0 y0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, y0 y0Var);

    public final void h() {
        if (!this.f48069e) {
            return;
        }
        this.f48069e = false;
        f();
        this.f48067b.f3163u0.f47847a = -1;
        this.f48070f = null;
        this.f48066a = -1;
        this.d = false;
        p0 p0Var = this.f48068c;
        if (p0Var.f48005e == this) {
            p0Var.f48005e = null;
        }
        this.f48068c = null;
        this.f48067b = null;
    }
}
