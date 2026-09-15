package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f42825a = -1;
    public RecyclerView f42826b;
    public o0 f42827c;
    public boolean d;
    public boolean e;
    public View f42828f;
    public final x0 f42829g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f42813f = false;
        obj.f42814g = 0;
        obj.f42810a = 0;
        obj.f42811b = 0;
        obj.f42812c = Integer.MIN_VALUE;
        obj.e = null;
        this.f42829g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f42827c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f42826b;
        if (this.f42825a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f42828f == null && this.f42827c != null && (a2 = a(this.f42825a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f42828f;
        x0 x0Var = this.f42829g;
        if (view != null) {
            this.f42826b.getClass();
            if (RecyclerView.S(view) == this.f42825a) {
                View view2 = this.f42828f;
                z0 z0Var = recyclerView.f2858t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f42828f = null;
            }
        }
        if (this.e) {
            z0 z0Var2 = recyclerView.f2858t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f2853q0.a();
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
        this.f42826b.f2858t0.f42833a = -1;
        this.f42828f = null;
        this.f42825a = -1;
        this.d = false;
        o0 o0Var = this.f42827c;
        if (o0Var.e == this) {
            o0Var.e = null;
        }
        this.f42827c = null;
        this.f42826b = null;
    }
}
