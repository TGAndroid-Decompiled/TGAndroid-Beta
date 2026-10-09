package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class g0 extends androidx.emoji2.text.g {
    public final int d;

    public g0(d0 d0Var, int i10) {
        super(d0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int y3;
        int i10;
        switch (this.d) {
            case 0:
                ((d0) this.f2598b).getClass();
                y3 = p0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((d0) this.f2598b).getClass();
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
                ((d0) this.f2598b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f47779b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.f2598b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f47779b;
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
                ((d0) this.f2598b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f47779b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.f2598b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f47779b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int d(View view) {
        int x10;
        int i10;
        switch (this.d) {
            case 0:
                ((d0) this.f2598b).getClass();
                x10 = p0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((d0) this.f2598b).getClass();
                x10 = p0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((d0) this.f2598b).f47771m;
            default:
                return ((d0) this.f2598b).f47772n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.f2598b;
                i10 = d0Var.f47771m;
                E = d0Var.E();
                break;
            default:
                d0 d0Var2 = (d0) this.f2598b;
                i10 = d0Var2.f47772n;
                E = d0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((d0) this.f2598b).E();
            default:
                return ((d0) this.f2598b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((d0) this.f2598b).f47769k;
            default:
                return ((d0) this.f2598b).f47770l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((d0) this.f2598b).f47770l;
            default:
                return ((d0) this.f2598b).f47769k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((d0) this.f2598b).D();
            default:
                return ((d0) this.f2598b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.f2598b;
                return (d0Var.f47771m - d0Var.D()) - d0Var.E();
            default:
                return ((d0) this.f2598b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2599c;
                ((d0) this.f2598b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f2599c;
                ((d0) this.f2598b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2599c;
                ((d0) this.f2598b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f2599c;
                ((d0) this.f2598b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((d0) this.f2598b).f47762b;
                if (recyclerView != null) {
                    int D = recyclerView.f3145e.D();
                    for (int i11 = 0; i11 < D; i11++) {
                        recyclerView.f3145e.C(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((d0) this.f2598b).f47762b;
                if (recyclerView2 != null) {
                    int D2 = recyclerView2.f3145e.D();
                    for (int i12 = 0; i12 < D2; i12++) {
                        recyclerView2.f3145e.C(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
