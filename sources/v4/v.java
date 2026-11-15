package v4;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.ui.ex;
public abstract class v {
    public static final c5.c f58661b = new c5.c(3);
    public static final c5.c f58662c = new c5.c(4);
    public int f58663a = -1;

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

    public void a(RecyclerView recyclerView, e1 e1Var) {
        View view = e1Var.f58535a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.i0.f55671a;
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
        m0 itemAnimator = recyclerView.getItemAnimator();
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

    public abstract int e(RecyclerView recyclerView, e1 e1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i7, int i10, long j3) {
        if (this.f58663a == -1) {
            this.f58663a = org.telegram.messenger.g0.L(20.0f);
        }
        int i11 = this.f58663a;
        float f10 = 1.0f;
        int interpolation = (int) (f58662c.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i7)) * ((int) Math.signum(i10)) * i11);
        if (j3 <= 500) {
            f10 = ((float) j3) / 500.0f;
        }
        int interpolation2 = (int) (f58661b.getInterpolation(f10) * interpolation);
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
        return !(this instanceof ex);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, e1 e1Var, float f10, float f11, int i7, boolean z10) {
        View view = e1Var.f58535a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.i0.f55671a;
            Float valueOf = Float.valueOf(r0.a0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.i0.f55671a;
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

    public abstract boolean n(RecyclerView recyclerView, e1 e1Var, e1 e1Var2);

    public void o(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i7, int i10, int i11) {
        View view = e1Var2.f58535a;
        o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof b0) {
            ((b0) layoutManager).b1(e1Var.f58535a, view, i10, i11);
            return;
        }
        if (layoutManager.d()) {
            if (o0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.v0(i7);
            }
            if (o0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.v0(i7);
            }
        }
        if (layoutManager.e()) {
            if (o0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.v0(i7);
            }
            if (o0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.v0(i7);
            }
        }
    }

    public abstract void q(e1 e1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(e1 e1Var, int i7) {
    }
}
