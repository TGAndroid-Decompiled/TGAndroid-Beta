package s4;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.dz;
public abstract class v {
    public static final l2 f41739b = new l2(1);
    public static final l2 f41740c = new l2(2);
    public int f41741a = -1;

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
        View view = c1Var.f41610a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.i0.f41062a;
            r0.a0.i(view, floatValue);
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
        m0 itemAnimator = recyclerView.getItemAnimator();
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

    public final int i(int i10, int i11, long j3) {
        if (this.f41741a == -1) {
            this.f41741a = AndroidUtilities.dp(20.0f);
        }
        int i12 = this.f41741a;
        float f7 = 1.0f;
        int interpolation = (int) (f41740c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
        if (j3 <= 500) {
            f7 = ((float) j3) / 500.0f;
        }
        int interpolation2 = (int) (f41739b.getInterpolation(f7) * interpolation);
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
        return !(this instanceof dz);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        View view = c1Var.f41610a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.i0.f41062a;
            Float valueOf = Float.valueOf(r0.a0.e(view));
            int childCount = recyclerView.getChildCount();
            float f11 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.i0.f41062a;
                    float e = r0.a0.e(childAt);
                    if (e > f11) {
                        f11 = e;
                    }
                }
            }
            r0.a0.i(view, f11 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f7);
        view.setTranslationY(f10);
    }

    public abstract boolean n(RecyclerView recyclerView, c1 c1Var, c1 c1Var2);

    public void o(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
        View view = c1Var2.f41610a;
        o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof c0) {
            ((c0) layoutManager).b1(c1Var.f41610a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (o0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i10);
            }
            if (o0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i10);
            }
        }
        if (layoutManager.e()) {
            if (o0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i10);
            }
            if (o0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i10);
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
