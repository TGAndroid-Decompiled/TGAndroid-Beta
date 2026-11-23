package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class b1 {
    public int f59190a = -1;
    public RecyclerView f59191b;
    public p0 f59192c;
    public boolean d;
    public boolean f59193e;
    public View f59194f;
    public final a1 f59195g;
    public boolean h;

    public b1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f59183f = false;
        obj.f59184g = 0;
        obj.f59179a = 0;
        obj.f59180b = 0;
        obj.f59181c = Integer.MIN_VALUE;
        obj.f59182e = null;
        this.f59195g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        p0 p0Var = this.f59192c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f59191b;
        if (this.f59190a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f59194f == null && this.f59192c != null && (a10 = a(this.f59190a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f59194f;
        a1 a1Var = this.f59195g;
        if (view != null) {
            this.f59191b.getClass();
            if (RecyclerView.S(view) == this.f59190a) {
                View view2 = this.f59194f;
                c1 c1Var = recyclerView.f2788v0;
                g(view2, a1Var);
                a1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f59194f = null;
            }
        }
        if (this.f59193e) {
            c1 c1Var2 = recyclerView.f2788v0;
            d(i7, i10, a1Var);
            if (a1Var.d >= 0) {
                z10 = true;
            }
            a1Var.a(recyclerView);
            if (z10 && this.f59193e) {
                this.d = true;
                recyclerView.f2785s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, a1 a1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, a1 a1Var);

    public final void h() {
        if (!this.f59193e) {
            return;
        }
        this.f59193e = false;
        f();
        this.f59191b.f2788v0.f59210a = -1;
        this.f59194f = null;
        this.f59190a = -1;
        this.d = false;
        p0 p0Var = this.f59192c;
        if (p0Var.f59334e == this) {
            p0Var.f59334e = null;
        }
        this.f59192c = null;
        this.f59191b = null;
    }
}
