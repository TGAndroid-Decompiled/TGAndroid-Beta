package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class f0 extends androidx.emoji2.text.g {
    public final int d;

    public f0(c0 c0Var, int i10) {
        super(c0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int y3;
        int i10;
        switch (this.d) {
            case 0:
                ((c0) this.f2549b).getClass();
                y3 = p0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((c0) this.f2549b).getClass();
                y3 = p0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y3 + i10;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.f2549b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f47833b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.f2549b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f47833b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.f2549b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f47833b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.f2549b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f47833b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int d(View view) {
        int x9;
        int i10;
        switch (this.d) {
            case 0:
                ((c0) this.f2549b).getClass();
                x9 = p0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((c0) this.f2549b).getClass();
                x9 = p0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
                break;
        }
        return x9 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2549b).f47827m;
            default:
                return ((c0) this.f2549b).f47828n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f2549b;
                i10 = c0Var.f47827m;
                E = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.f2549b;
                i10 = c0Var2.f47828n;
                E = c0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2549b).E();
            default:
                return ((c0) this.f2549b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2549b).f47825k;
            default:
                return ((c0) this.f2549b).f47826l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2549b).f47826l;
            default:
                return ((c0) this.f2549b).f47825k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2549b).D();
            default:
                return ((c0) this.f2549b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f2549b;
                return (c0Var.f47827m - c0Var.D()) - c0Var.E();
            default:
                return ((c0) this.f2549b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2550c;
                ((c0) this.f2549b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f2550c;
                ((c0) this.f2549b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2550c;
                ((c0) this.f2549b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f2550c;
                ((c0) this.f2549b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((c0) this.f2549b).f47819b;
                if (recyclerView != null) {
                    int k10 = recyclerView.e.k();
                    for (int i11 = 0; i11 < k10; i11++) {
                        recyclerView.e.j(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((c0) this.f2549b).f47819b;
                if (recyclerView2 != null) {
                    int k11 = recyclerView2.e.k();
                    for (int i12 = 0; i12 < k11; i12++) {
                        recyclerView2.e.j(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
