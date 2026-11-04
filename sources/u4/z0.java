package u4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f55704a = -1;
    public RecyclerView f55705b;
    public o0 f55706c;
    public boolean d;
    public boolean f55707e;
    public View f55708f;
    public final y0 f55709g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f55692f = false;
        obj.f55693g = 0;
        obj.f55688a = 0;
        obj.f55689b = 0;
        obj.f55690c = Integer.MIN_VALUE;
        obj.f55691e = null;
        this.f55709g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i3) {
        o0 o0Var = this.f55706c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i3);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i3, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f55705b;
        if (this.f55704a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f55708f == null && this.f55706c != null && (a10 = a(this.f55704a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f55708f;
        y0 y0Var = this.f55709g;
        if (view != null) {
            this.f55705b.getClass();
            if (RecyclerView.S(view) == this.f55704a) {
                View view2 = this.f55708f;
                a1 a1Var = recyclerView.f2300v0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f55708f = null;
            }
        }
        if (this.f55707e) {
            a1 a1Var2 = recyclerView.f2300v0;
            d(i3, i10, y0Var);
            if (y0Var.d >= 0) {
                z10 = true;
            }
            y0Var.a(recyclerView);
            if (z10 && this.f55707e) {
                this.d = true;
                recyclerView.f2297s0.a();
            }
        }
    }

    public abstract void d(int i3, int i10, y0 y0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, y0 y0Var);

    public final void h() {
        if (!this.f55707e) {
            return;
        }
        this.f55707e = false;
        f();
        this.f55705b.f2300v0.f55490a = -1;
        this.f55708f = null;
        this.f55704a = -1;
        this.d = false;
        o0 o0Var = this.f55706c;
        if (o0Var.f55632e == this) {
            o0Var.f55632e = null;
        }
        this.f55706c = null;
        this.f55705b = null;
    }
}
