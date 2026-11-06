package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f57121a = -1;
    public RecyclerView f57122b;
    public n0 f57123c;
    public boolean d;
    public boolean f57124e;
    public View f57125f;
    public final y0 f57126g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f57109f = false;
        obj.f57110g = 0;
        obj.f57105a = 0;
        obj.f57106b = 0;
        obj.f57107c = Integer.MIN_VALUE;
        obj.f57108e = null;
        this.f57126g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        n0 n0Var = this.f57123c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f57122b;
        if (this.f57121a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f57125f == null && this.f57123c != null && (a10 = a(this.f57121a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z9 = false;
        this.d = false;
        View view = this.f57125f;
        y0 y0Var = this.f57126g;
        if (view != null) {
            this.f57122b.getClass();
            if (RecyclerView.S(view) == this.f57121a) {
                View view2 = this.f57125f;
                a1 a1Var = recyclerView.f2867u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f57125f = null;
            }
        }
        if (this.f57124e) {
            a1 a1Var2 = recyclerView.f2867u0;
            d(i7, i10, y0Var);
            if (y0Var.d >= 0) {
                z9 = true;
            }
            y0Var.a(recyclerView);
            if (z9 && this.f57124e) {
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
        if (!this.f57124e) {
            return;
        }
        this.f57124e = false;
        f();
        this.f57122b.f2867u0.f56906a = -1;
        this.f57125f = null;
        this.f57121a = -1;
        this.d = false;
        n0 n0Var = this.f57123c;
        if (n0Var.f57042e == this) {
            n0Var.f57042e = null;
        }
        this.f57123c = null;
        this.f57122b = null;
    }
}
