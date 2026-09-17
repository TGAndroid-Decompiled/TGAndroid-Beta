package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f42847a = -1;
    public RecyclerView f42848b;
    public o0 f42849c;
    public boolean d;
    public boolean e;
    public View f42850f;
    public final x0 f42851g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f42835f = false;
        obj.f42836g = 0;
        obj.f42832a = 0;
        obj.f42833b = 0;
        obj.f42834c = Integer.MIN_VALUE;
        obj.e = null;
        this.f42851g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f42849c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f42848b;
        if (this.f42847a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f42850f == null && this.f42849c != null && (a2 = a(this.f42847a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f42850f;
        x0 x0Var = this.f42851g;
        if (view != null) {
            this.f42848b.getClass();
            if (RecyclerView.T(view) == this.f42847a) {
                View view2 = this.f42850f;
                z0 z0Var = recyclerView.f2863t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f42850f = null;
            }
        }
        if (this.e) {
            z0 z0Var2 = recyclerView.f2863t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f2858q0.a();
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
        this.f42848b.f2863t0.f42855a = -1;
        this.f42850f = null;
        this.f42847a = -1;
        this.d = false;
        o0 o0Var = this.f42849c;
        if (o0Var.e == this) {
            o0Var.e = null;
        }
        this.f42849c = null;
        this.f42848b = null;
    }
}
