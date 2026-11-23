package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class a1 {
    public int f59055a = -1;
    public RecyclerView f59056b;
    public o0 f59057c;
    public boolean d;
    public boolean f59058e;
    public View f59059f;
    public final z0 f59060g;
    public boolean h;

    public a1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f59275f = false;
        obj.f59276g = 0;
        obj.f59271a = 0;
        obj.f59272b = 0;
        obj.f59273c = Integer.MIN_VALUE;
        obj.f59274e = null;
        this.f59060g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        o0 o0Var = this.f59057c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f59056b;
        if (this.f59055a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f59059f == null && this.f59057c != null && (a10 = a(this.f59055a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f59059f;
        z0 z0Var = this.f59060g;
        if (view != null) {
            this.f59056b.getClass();
            if (RecyclerView.S(view) == this.f59055a) {
                View view2 = this.f59059f;
                b1 b1Var = recyclerView.f2787v0;
                g(view2, z0Var);
                z0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f59059f = null;
            }
        }
        if (this.f59058e) {
            b1 b1Var2 = recyclerView.f2787v0;
            d(i7, i10, z0Var);
            if (z0Var.d >= 0) {
                z10 = true;
            }
            z0Var.a(recyclerView);
            if (z10 && this.f59058e) {
                this.d = true;
                recyclerView.f2784s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, z0 z0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, z0 z0Var);

    public final void h() {
        if (!this.f59058e) {
            return;
        }
        this.f59058e = false;
        f();
        this.f59056b.f2787v0.f59075a = -1;
        this.f59059f = null;
        this.f59055a = -1;
        this.d = false;
        o0 o0Var = this.f59057c;
        if (o0Var.f59199e == this) {
            o0Var.f59199e = null;
        }
        this.f59057c = null;
        this.f59056b = null;
    }
}
