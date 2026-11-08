package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class e0 extends androidx.emoji2.text.g {
    public final int d;

    public e0(b0 b0Var, int i7) {
        super(b0Var);
        this.d = i7;
    }

    @Override
    public final int a(View view) {
        int y10;
        int i7;
        switch (this.d) {
            case 0:
                ((b0) this.f2303b).getClass();
                y10 = n0.y(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((b0) this.f2303b).getClass();
                y10 = n0.v(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y10 + i7;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.f2303b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).f57144b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.f2303b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).f57144b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i7;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.f2303b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).f57144b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.f2303b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).f57144b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin;
                break;
        }
        return measuredHeight + i7;
    }

    @Override
    public final int d(View view) {
        int x10;
        int i7;
        switch (this.d) {
            case 0:
                ((b0) this.f2303b).getClass();
                x10 = n0.x(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((b0) this.f2303b).getClass();
                x10 = n0.z(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i7;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((b0) this.f2303b).f57140m;
            default:
                return ((b0) this.f2303b).f57141n;
        }
    }

    @Override
    public final int f() {
        int i7;
        int E;
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f2303b;
                i7 = b0Var.f57140m;
                E = b0Var.E();
                break;
            default:
                b0 b0Var2 = (b0) this.f2303b;
                i7 = b0Var2.f57141n;
                E = b0Var2.C();
                break;
        }
        return i7 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((b0) this.f2303b).E();
            default:
                return ((b0) this.f2303b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((b0) this.f2303b).f57138k;
            default:
                return ((b0) this.f2303b).f57139l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((b0) this.f2303b).f57139l;
            default:
                return ((b0) this.f2303b).f57138k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((b0) this.f2303b).D();
            default:
                return ((b0) this.f2303b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f2303b;
                return (b0Var.f57140m - b0Var.D()) - b0Var.E();
            default:
                return ((b0) this.f2303b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2304c;
                ((b0) this.f2303b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f2304c;
                ((b0) this.f2303b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2304c;
                ((b0) this.f2303b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f2304c;
                ((b0) this.f2303b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i7) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((b0) this.f2303b).f57131b;
                if (recyclerView != null) {
                    int v = recyclerView.f2847e.v();
                    for (int i10 = 0; i10 < v; i10++) {
                        recyclerView.f2847e.u(i10).offsetLeftAndRight(i7);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((b0) this.f2303b).f57131b;
                if (recyclerView2 != null) {
                    int v10 = recyclerView2.f2847e.v();
                    for (int i11 = 0; i11 < v10; i11++) {
                        recyclerView2.f2847e.u(i11).offsetTopAndBottom(i7);
                    }
                    return;
                }
                return;
        }
    }
}
