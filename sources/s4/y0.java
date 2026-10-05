package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f46706a = -1;
    public RecyclerView f46707b;
    public o0 f46708c;
    public boolean d;
    public boolean f46709e;
    public View f46710f;
    public final x0 f46711g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f46693f = false;
        obj.f46694g = 0;
        obj.f46689a = 0;
        obj.f46690b = 0;
        obj.f46691c = Integer.MIN_VALUE;
        obj.f46692e = null;
        this.f46711g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f46708c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f46707b;
        if (this.f46706a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f46710f == null && this.f46708c != null && (a2 = a(this.f46706a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f46710f;
        x0 x0Var = this.f46711g;
        if (view != null) {
            this.f46707b.getClass();
            if (RecyclerView.S(view) == this.f46706a) {
                View view2 = this.f46710f;
                z0 z0Var = recyclerView.f3085t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f46710f = null;
            }
        }
        if (this.f46709e) {
            z0 z0Var2 = recyclerView.f3085t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.f46709e) {
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
        if (!this.f46709e) {
            return;
        }
        this.f46709e = false;
        f();
        this.f46707b.f3085t0.f46715a = -1;
        this.f46710f = null;
        this.f46706a = -1;
        this.d = false;
        o0 o0Var = this.f46708c;
        if (o0Var.f46644e == this) {
            o0Var.f46644e = null;
        }
        this.f46708c = null;
        this.f46707b = null;
    }
}
