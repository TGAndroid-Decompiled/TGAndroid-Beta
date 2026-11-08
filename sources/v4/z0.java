package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f57212a = -1;
    public RecyclerView f57213b;
    public n0 f57214c;
    public boolean d;
    public boolean f57215e;
    public View f57216f;
    public final y0 f57217g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f57200f = false;
        obj.f57201g = 0;
        obj.f57196a = 0;
        obj.f57197b = 0;
        obj.f57198c = Integer.MIN_VALUE;
        obj.f57199e = null;
        this.f57217g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        n0 n0Var = this.f57214c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f57213b;
        if (this.f57212a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f57216f == null && this.f57214c != null && (a10 = a(this.f57212a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z9 = false;
        this.d = false;
        View view = this.f57216f;
        y0 y0Var = this.f57217g;
        if (view != null) {
            this.f57213b.getClass();
            if (RecyclerView.S(view) == this.f57212a) {
                View view2 = this.f57216f;
                a1 a1Var = recyclerView.f2867u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f57216f = null;
            }
        }
        if (this.f57215e) {
            a1 a1Var2 = recyclerView.f2867u0;
            d(i7, i10, y0Var);
            if (y0Var.d >= 0) {
                z9 = true;
            }
            y0Var.a(recyclerView);
            if (z9 && this.f57215e) {
                this.d = true;
                recyclerView.f2863r0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, y0 y0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, y0 y0Var);

    public final void h() {
        if (!this.f57215e) {
            return;
        }
        this.f57215e = false;
        f();
        this.f57213b.f2867u0.f56997a = -1;
        this.f57216f = null;
        this.f57212a = -1;
        this.d = false;
        n0 n0Var = this.f57214c;
        if (n0Var.f57133e == this) {
            n0Var.f57133e = null;
        }
        this.f57214c = null;
        this.f57213b = null;
    }
}
