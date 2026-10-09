package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class z0 {
    public int f47827a = -1;
    public RecyclerView f47828b;
    public p0 f47829c;
    public boolean d;
    public boolean f47830e;
    public View f47831f;
    public final y0 f47832g;
    public boolean h;

    public z0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f47814f = false;
        obj.f47815g = 0;
        obj.f47810a = 0;
        obj.f47811b = 0;
        obj.f47812c = Integer.MIN_VALUE;
        obj.f47813e = null;
        this.f47832g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.f47829c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f47828b;
        if (this.f47827a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f47831f == null && this.f47829c != null && (a2 = a(this.f47827a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f47831f;
        y0 y0Var = this.f47832g;
        if (view != null) {
            this.f47828b.getClass();
            if (RecyclerView.S(view) == this.f47827a) {
                View view2 = this.f47831f;
                a1 a1Var = recyclerView.f3165u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f47831f = null;
            }
        }
        if (this.f47830e) {
            a1 a1Var2 = recyclerView.f3165u0;
            d(i10, i11, y0Var);
            if (y0Var.d >= 0) {
                z10 = true;
            }
            y0Var.a(recyclerView);
            if (z10 && this.f47830e) {
                this.d = true;
                recyclerView.f3161r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, y0 y0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, y0 y0Var);

    public final void h() {
        if (!this.f47830e) {
            return;
        }
        this.f47830e = false;
        f();
        this.f47828b.f3165u0.f47608a = -1;
        this.f47831f = null;
        this.f47827a = -1;
        this.d = false;
        p0 p0Var = this.f47829c;
        if (p0Var.f47766e == this) {
            p0Var.f47766e = null;
        }
        this.f47829c = null;
        this.f47828b = null;
    }
}
