package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f48058a = -1;
    public RecyclerView f48059b;
    public p0 f48060c;
    public boolean d;
    public boolean f48061e;
    public View f48062f;
    public final y0 f48063g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f48045f = false;
        obj.f48046g = 0;
        obj.f48041a = 0;
        obj.f48042b = 0;
        obj.f48043c = Integer.MIN_VALUE;
        obj.f48044e = null;
        this.f48063g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.f48060c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f48059b;
        if (this.f48058a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f48062f == null && this.f48060c != null && (a2 = a(this.f48058a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f48062f;
        y0 y0Var = this.f48063g;
        if (view != null) {
            this.f48059b.getClass();
            if (RecyclerView.S(view) == this.f48058a) {
                View view2 = this.f48062f;
                a1 a1Var = recyclerView.f3163u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f48062f = null;
            }
        }
        if (this.f48061e) {
            a1 a1Var2 = recyclerView.f3163u0;
            d(i10, i11, y0Var);
            if (y0Var.d >= 0) {
                z10 = true;
            }
            y0Var.a(recyclerView);
            if (z10 && this.f48061e) {
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
        if (!this.f48061e) {
            return;
        }
        this.f48061e = false;
        f();
        this.f48059b.f3163u0.f47839a = -1;
        this.f48062f = null;
        this.f48058a = -1;
        this.d = false;
        p0 p0Var = this.f48060c;
        if (p0Var.f47997e == this) {
            p0Var.f47997e = null;
        }
        this.f48060c = null;
        this.f48059b = null;
    }
}
