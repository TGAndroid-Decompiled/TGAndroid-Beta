package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f46691a = -1;
    public RecyclerView f46692b;
    public o0 f46693c;
    public boolean d;
    public boolean f46694e;
    public View f46695f;
    public final x0 f46696g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46678f = false;
        obj.f46679g = 0;
        obj.f46674a = 0;
        obj.f46675b = 0;
        obj.f46676c = Integer.MIN_VALUE;
        obj.f46677e = null;
        this.f46696g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f46693c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46692b;
        if (this.f46691a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46695f == null && this.f46693c != null && (a2 = a(this.f46691a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46695f;
        x0 x0Var = this.f46696g;
        if (view != null) {
            this.f46692b.getClass();
            if (RecyclerView.S(view) == this.f46691a) {
                View view2 = this.f46695f;
                z0 z0Var = recyclerView.f3085t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46695f = null;
            }
        }
        if (this.f46694e) {
            z0 z0Var2 = recyclerView.f3085t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.f46694e) {
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
        if (!this.f46694e) {
            return;
        }
        this.f46694e = false;
        f();
        this.f46692b.f3085t0.f46700a = -1;
        this.f46695f = null;
        this.f46691a = -1;
        this.d = false;
        o0 o0Var = this.f46693c;
        if (o0Var.f46629e == this) {
            o0Var.f46629e = null;
        }
        this.f46693c = null;
        this.f46692b = null;
    }
}
