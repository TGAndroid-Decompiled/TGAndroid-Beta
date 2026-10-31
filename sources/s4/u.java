package s4;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.gy;
public abstract class u {
    public static final p2 f48013b = new p2(2);
    public static final p2 f48014c = new p2(3);
    public int f48015a = -1;

    public static int c(int i10, int i11) {
        int i12;
        int i13 = i10 & 789516;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 << 2;
        } else {
            int i15 = i13 << 1;
            i14 |= (-789517) & i15;
            i12 = (i15 & 789516) << 2;
        }
        return i14 | i12;
    }

    public static int l(int i10, int i11) {
        int i12 = i11 | i10;
        return (i10 << 16) | (i11 << 8) | i12;
    }

    public void a(RecyclerView recyclerView, c1 c1Var) {
        View view = c1Var.f47898a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.h0.f46123a;
            r0.z.h(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i10, int i11) {
        int i12;
        int i13 = i10 & 3158064;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 >> 2;
        } else {
            int i15 = i13 >> 1;
            i14 |= (-3158065) & i15;
            i12 = (i15 & 3158064) >> 2;
        }
        return i14 | i12;
    }

    public long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        l0 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i10 == 8) {
                return 200L;
            }
            return 250L;
        } else if (i10 == 8) {
            return itemAnimator.j();
        } else {
            return itemAnimator.d;
        }
    }

    public abstract int e(RecyclerView recyclerView, c1 c1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i10, int i11, long j10) {
        if (this.f48015a == -1) {
            this.f48015a = org.telegram.messenger.i0.L(20.0f);
        }
        int i12 = this.f48015a;
        float f7 = 1.0f;
        int interpolation = (int) (f48014c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
        if (j10 <= 500) {
            f7 = ((float) j10) / 500.0f;
        }
        int interpolation2 = (int) (f48013b.getInterpolation(f7) * interpolation);
        if (interpolation2 == 0) {
            if (i11 <= 0) {
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
        return !(this instanceof gy);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        View view = c1Var.f47898a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.h0.f46123a;
            Float valueOf = Float.valueOf(r0.z.e(view));
            int childCount = recyclerView.getChildCount();
            float f11 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.h0.f46123a;
                    float e = r0.z.e(childAt);
                    if (e > f11) {
                        f11 = e;
                    }
                }
            }
            r0.z.h(view, f11 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f7);
        view.setTranslationY(f10);
    }

    public abstract boolean n(RecyclerView recyclerView, c1 c1Var, c1 c1Var2);

    public void o(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
        View view = c1Var2.f47898a;
        n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof a0) {
            ((a0) layoutManager).b1(c1Var.f47898a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (n0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.v0(i10);
            }
            if (n0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.v0(i10);
            }
        }
        if (layoutManager.e()) {
            if (n0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.v0(i10);
            }
            if (n0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.v0(i10);
            }
        }
    }

    public abstract void q(c1 c1Var);

    public float f(float f7) {
        return f7;
    }

    public float h(float f7) {
        return f7;
    }

    public void p(c1 c1Var, int i10) {
    }
}
