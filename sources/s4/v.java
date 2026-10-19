package s4;

import ai.be;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jy;
public abstract class v {
    public static final be f46040b = new be(2);
    public static final be f46041c = new be(3);
    public int f46042a = -1;

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

    public void a(RecyclerView recyclerView, b1 b1Var) {
        View view = b1Var.f45910a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.i0.f44816a;
            r0.a0.h(view, floatValue);
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

    public abstract int e(RecyclerView recyclerView, b1 b1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i10, int i11, long j10) {
        if (this.f46042a == -1) {
            this.f46042a = AndroidUtilities.dp(20.0f);
        }
        int i12 = this.f46042a;
        float f7 = 1.0f;
        int interpolation = (int) (f46041c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
        if (j10 <= 500) {
            f7 = ((float) j10) / 500.0f;
        }
        int interpolation2 = (int) (f46040b.getInterpolation(f7) * interpolation);
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
        return !(this instanceof jy);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, b1 b1Var, float f7, float f10, int i10, boolean z10) {
        View view = b1Var.f45910a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.i0.f44816a;
            Float valueOf = Float.valueOf(r0.a0.e(view));
            int childCount = recyclerView.getChildCount();
            float f11 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.i0.f44816a;
                    float e = r0.a0.e(childAt);
                    if (e > f11) {
                        f11 = e;
                    }
                }
            }
            r0.a0.h(view, f11 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f7);
        view.setTranslationY(f10);
    }

    public abstract boolean n(RecyclerView recyclerView, b1 b1Var, b1 b1Var2);

    public void o(RecyclerView recyclerView, b1 b1Var, b1 b1Var2, int i10, int i11, int i12) {
        View view = b1Var2.f45910a;
        n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof b0) {
            ((b0) layoutManager).b1(b1Var.f45910a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (n0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i10);
            }
            if (n0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i10);
            }
        }
        if (layoutManager.e()) {
            if (n0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i10);
            }
            if (n0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i10);
            }
        }
    }

    public abstract void q(b1 b1Var);

    public float f(float f7) {
        return f7;
    }

    public float h(float f7) {
        return f7;
    }

    public void p(b1 b1Var, int i10) {
    }
}
