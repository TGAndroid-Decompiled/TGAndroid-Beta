package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class x0 {
    public int f46051a = -1;
    public RecyclerView f46052b;
    public n0 f46053c;
    public boolean d;
    public boolean e;
    public View f46054f;
    public final w0 f46055g;
    public boolean h;

    public x0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46049f = false;
        obj.f46050g = 0;
        obj.f46046a = 0;
        obj.f46047b = 0;
        obj.f46048c = Integer.MIN_VALUE;
        obj.e = null;
        this.f46055g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.f46053c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46052b;
        if (this.f46051a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46054f == null && this.f46053c != null && (a2 = a(this.f46051a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46054f;
        w0 w0Var = this.f46055g;
        if (view != null) {
            this.f46052b.getClass();
            if (RecyclerView.S(view) == this.f46051a) {
                View view2 = this.f46054f;
                y0 y0Var = recyclerView.f3629u0;
                g(view2, w0Var);
                w0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46054f = null;
            }
        }
        if (this.e) {
            y0 y0Var2 = recyclerView.f3629u0;
            d(i10, i11, w0Var);
            if (w0Var.d >= 0) {
                z10 = true;
            }
            w0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f3625r0.a();
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
        this.f46052b.f3629u0.f46066a = -1;
        this.f46054f = null;
        this.f46051a = -1;
        this.d = false;
        n0 n0Var = this.f46053c;
        if (n0Var.e == this) {
            n0Var.e = null;
        }
        this.f46053c = null;
        this.f46052b = null;
    }
}
