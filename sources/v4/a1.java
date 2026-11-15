package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class a1 {
    public int f58480a = -1;
    public RecyclerView f58481b;
    public o0 f58482c;
    public boolean d;
    public boolean f58483e;
    public View f58484f;
    public final z0 f58485g;
    public boolean h;

    public a1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f58700f = false;
        obj.f58701g = 0;
        obj.f58696a = 0;
        obj.f58697b = 0;
        obj.f58698c = Integer.MIN_VALUE;
        obj.f58699e = null;
        this.f58485g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        o0 o0Var = this.f58482c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.f58481b;
        if (this.f58480a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f58484f == null && this.f58482c != null && (a10 = a(this.f58480a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f58484f;
        z0 z0Var = this.f58485g;
        if (view != null) {
            this.f58481b.getClass();
            if (RecyclerView.S(view) == this.f58480a) {
                View view2 = this.f58484f;
                b1 b1Var = recyclerView.f2822v0;
                g(view2, z0Var);
                z0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f58484f = null;
            }
        }
        if (this.f58483e) {
            b1 b1Var2 = recyclerView.f2822v0;
            d(i7, i10, z0Var);
            if (z0Var.d >= 0) {
                z10 = true;
            }
            z0Var.a(recyclerView);
            if (z10 && this.f58483e) {
                this.d = true;
                recyclerView.f2819s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, z0 z0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, z0 z0Var);

    public final void h() {
        if (!this.f58483e) {
            return;
        }
        this.f58483e = false;
        f();
        this.f58481b.f2822v0.f58500a = -1;
        this.f58484f = null;
        this.f58480a = -1;
        this.d = false;
        o0 o0Var = this.f58482c;
        if (o0Var.f58624e == this) {
            o0Var.f58624e = null;
        }
        this.f58482c = null;
        this.f58481b = null;
    }
}
