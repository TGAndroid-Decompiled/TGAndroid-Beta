package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class y0 {
    public int f45934a = -1;
    public RecyclerView f45935b;
    public o0 f45936c;
    public boolean d;
    public boolean f45937e;
    public View f45938f;
    public final x0 f45939g;
    public boolean h;

    public y0() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f45921f = false;
        obj.f45922g = 0;
        obj.f45917a = 0;
        obj.f45918b = 0;
        obj.f45919c = Integer.MIN_VALUE;
        obj.f45920e = null;
        this.f45939g = obj;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.f45936c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f45935b;
        if (this.f45934a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f45938f == null && this.f45936c != null && (a2 = a(this.f45934a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f45938f;
        x0 x0Var = this.f45939g;
        if (view != null) {
            this.f45935b.getClass();
            if (RecyclerView.S(view) == this.f45934a) {
                View view2 = this.f45938f;
                z0 z0Var = recyclerView.f1918t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f45938f = null;
            }
        }
        if (this.f45937e) {
            z0 z0Var2 = recyclerView.f1918t0;
            d(i10, i11, x0Var);
            if (x0Var.d >= 0) {
                z10 = true;
            }
            x0Var.a(recyclerView);
            if (z10 && this.f45937e) {
                this.d = true;
                recyclerView.f1913q0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, x0 x0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, x0 x0Var);

    public final void h() {
        if (!this.f45937e) {
            return;
        }
        this.f45937e = false;
        f();
        this.f45935b.f1918t0.f45943a = -1;
        this.f45938f = null;
        this.f45934a = -1;
        this.d = false;
        o0 o0Var = this.f45936c;
        if (o0Var.f45872e == this) {
            o0Var.f45872e = null;
        }
        this.f45936c = null;
        this.f45935b = null;
    }
}
