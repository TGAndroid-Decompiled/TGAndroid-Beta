package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class a1 {
    public int f47715a = -1;
    public RecyclerView f47716b;
    public p0 f47717c;
    public boolean d;
    public boolean e;
    public View f47718f;
    public final z0 f47719g;
    public boolean h;

    public a1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f47909f = false;
        obj.f47910g = 0;
        obj.f47906a = 0;
        obj.f47907b = 0;
        obj.f47908c = Integer.MIN_VALUE;
        obj.e = null;
        this.f47719g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.f47717c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f47716b;
        if (this.f47715a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f47718f == null && this.f47717c != null && (a2 = a(this.f47715a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f47718f;
        z0 z0Var = this.f47719g;
        if (view != null) {
            this.f47716b.getClass();
            if (RecyclerView.S(view) == this.f47715a) {
                View view2 = this.f47718f;
                b1 b1Var = recyclerView.f3080u0;
                g(view2, z0Var);
                z0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f47718f = null;
            }
        }
        if (this.e) {
            b1 b1Var2 = recyclerView.f3080u0;
            d(i10, i11, z0Var);
            if (z0Var.d >= 0) {
                z10 = true;
            }
            z0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.f3076r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, z0 z0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, z0 z0Var);

    public final void h() {
        if (!this.e) {
            return;
        }
        this.e = false;
        f();
        this.f47716b.f3080u0.f47729a = -1;
        this.f47718f = null;
        this.f47715a = -1;
        this.d = false;
        p0 p0Var = this.f47717c;
        if (p0Var.e == this) {
            p0Var.e = null;
        }
        this.f47717c = null;
        this.f47716b = null;
    }
}
