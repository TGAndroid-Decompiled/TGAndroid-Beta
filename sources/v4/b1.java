package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class b1 {
    public int f59066a = -1;
    public RecyclerView f59067b;
    public p0 f59068c;
    public boolean d;
    public boolean f59069e;
    public View f59070f;
    public final a1 f59071g;
    public boolean h;

    public b1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f59058f = false;
        obj.f59059g = 0;
        obj.f59054a = 0;
        obj.f59055b = 0;
        obj.f59056c = Integer.MIN_VALUE;
        obj.f59057e = null;
        this.f59071g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        p0 p0Var = this.f59068c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f59067b;
        if (this.f59066a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f59070f == null && this.f59068c != null && (a10 = a(this.f59066a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f59070f;
        a1 a1Var = this.f59071g;
        if (view != null) {
            this.f59067b.getClass();
            if (RecyclerView.S(view) == this.f59066a) {
                View view2 = this.f59070f;
                c1 c1Var = recyclerView.f2816v0;
                g(view2, a1Var);
                a1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f59070f = null;
            }
        }
        if (this.f59069e) {
            c1 c1Var2 = recyclerView.f2816v0;
            d(i7, i10, a1Var);
            if (a1Var.d >= 0) {
                z10 = true;
            }
            a1Var.a(recyclerView);
            if (z10 && this.f59069e) {
                this.d = true;
                recyclerView.f2813s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, a1 a1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, a1 a1Var);

    public final void h() {
        if (!this.f59069e) {
            return;
        }
        this.f59069e = false;
        f();
        this.f59067b.f2816v0.f59085a = -1;
        this.f59070f = null;
        this.f59066a = -1;
        this.d = false;
        p0 p0Var = this.f59068c;
        if (p0Var.f59209e == this) {
            p0Var.f59209e = null;
        }
        this.f59068c = null;
        this.f59067b = null;
    }
}
