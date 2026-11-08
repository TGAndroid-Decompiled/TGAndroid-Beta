package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f57213a = -1;
    public RecyclerView f57214b;
    public n0 f57215c;
    public boolean d;
    public boolean f57216e;
    public View f57217f;
    public final y0 f57218g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f57201f = false;
        obj.f57202g = 0;
        obj.f57197a = 0;
        obj.f57198b = 0;
        obj.f57199c = Integer.MIN_VALUE;
        obj.f57200e = null;
        this.f57218g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        n0 n0Var = this.f57215c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f57214b;
        if (this.f57213a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f57217f == null && this.f57215c != null && (a10 = a(this.f57213a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z9 = false;
        this.d = false;
        View view = this.f57217f;
        y0 y0Var = this.f57218g;
        if (view != null) {
            this.f57214b.getClass();
            if (RecyclerView.S(view) == this.f57213a) {
                View view2 = this.f57217f;
                a1 a1Var = recyclerView.f2867u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f57217f = null;
            }
        }
        if (this.f57216e) {
            a1 a1Var2 = recyclerView.f2867u0;
            d(i7, i10, y0Var);
            if (y0Var.d >= 0) {
                z9 = true;
            }
            y0Var.a(recyclerView);
            if (z9 && this.f57216e) {
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
        if (!this.f57216e) {
            return;
        }
        this.f57216e = false;
        f();
        this.f57214b.f2867u0.f56998a = -1;
        this.f57217f = null;
        this.f57213a = -1;
        this.d = false;
        n0 n0Var = this.f57215c;
        if (n0Var.f57134e == this) {
            n0Var.f57134e = null;
        }
        this.f57215c = null;
        this.f57214b = null;
    }
}
