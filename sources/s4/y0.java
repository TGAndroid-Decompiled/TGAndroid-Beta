package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f43155a = -1;
    public RecyclerView f43156b;
    public o0 f43157c;
    public boolean d;
    public boolean e;
    public View f43158f;
    public final x0 f43159g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f43143f = false;
        obj.f43144g = 0;
        obj.f43140a = 0;
        obj.f43141b = 0;
        obj.f43142c = Integer.MIN_VALUE;
        obj.e = null;
        this.f43159g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f43157c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f43156b;
        if (this.f43155a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f43158f == null && this.f43157c != null && (a2 = a(this.f43155a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f43158f;
        x0 x0Var = this.f43159g;
        if (view != null) {
            this.f43156b.getClass();
            if (RecyclerView.T(view) == this.f43155a) {
                View view2 = this.f43158f;
                z0 z0Var = recyclerView.f2857t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f43158f = null;
            }
        }
        if (this.e) {
            z0 z0Var2 = recyclerView.f2857t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f2852q0.a();
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
        this.f43156b.f2857t0.f43163a = -1;
        this.f43158f = null;
        this.f43155a = -1;
        this.d = false;
        o0 o0Var = this.f43157c;
        if (o0Var.e == this) {
            o0Var.e = null;
        }
        this.f43157c = null;
        this.f43156b = null;
    }
}
