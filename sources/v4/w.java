package v4;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.ui.ix;
public abstract class w {
    public static final c5.c f59289b = new c5.c(3);
    public static final c5.c f59290c = new c5.c(4);
    public int f59291a = -1;

    public static int c(int i7, int i10) {
        int i11;
        int i12 = i7 & 789516;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 << 2;
        } else {
            int i14 = i12 << 1;
            i13 |= (-789517) & i14;
            i11 = (i14 & 789516) << 2;
        }
        return i13 | i11;
    }

    public static int l(int i7, int i10) {
        int i11 = i10 | i7;
        return (i7 << 16) | (i10 << 8) | i11;
    }

    public void a(RecyclerView recyclerView, f1 f1Var) {
        View view = f1Var.f59165a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.i0.f56289a;
            r0.a0.h(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i7, int i10) {
        int i11;
        int i12 = i7 & 3158064;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 >> 2;
        } else {
            int i14 = i12 >> 1;
            i13 |= (-3158065) & i14;
            i11 = (i14 & 3158064) >> 2;
        }
        return i13 | i11;
    }

    public long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        n0 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i7 == 8) {
                return 200L;
            }
            return 250L;
        } else if (i7 == 8) {
            return itemAnimator.j();
        } else {
            return itemAnimator.d;
        }
    }

    public abstract int e(RecyclerView recyclerView, f1 f1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i7, int i10, long j3) {
        if (this.f59291a == -1) {
            this.f59291a = org.telegram.messenger.g0.L(20.0f);
        }
        int i11 = this.f59291a;
        float f10 = 1.0f;
        int interpolation = (int) (f59290c.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i7)) * ((int) Math.signum(i10)) * i11);
        if (j3 <= 500) {
            f10 = ((float) j3) / 500.0f;
        }
        int interpolation2 = (int) (f59289b.getInterpolation(f10) * interpolation);
        if (interpolation2 == 0) {
            if (i10 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public boolean j() {
        return true;
    }

    public boolean k() {
        return !(this instanceof ix);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, f1 f1Var, float f10, float f11, int i7, boolean z10) {
        View view = f1Var.f59165a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.i0.f56289a;
            Float valueOf = Float.valueOf(r0.a0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.i0.f56289a;
                    float e10 = r0.a0.e(childAt);
                    if (e10 > f12) {
                        f12 = e10;
                    }
                }
            }
            r0.a0.h(view, f12 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public abstract boolean n(RecyclerView recyclerView, f1 f1Var, f1 f1Var2);

    public void o(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
        View view = f1Var2.f59165a;
        p0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof c0) {
            ((c0) layoutManager).b1(f1Var.f59165a, view, i10, i11);
            return;
        }
        if (layoutManager.d()) {
            if (p0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.v0(i7);
            }
            if (p0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.v0(i7);
            }
        }
        if (layoutManager.e()) {
            if (p0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.v0(i7);
            }
            if (p0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.v0(i7);
            }
        }
    }

    public abstract void q(f1 f1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(f1 f1Var, int i7) {
    }
}
