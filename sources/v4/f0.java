package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class f0 extends androidx.emoji2.text.g {
    public final int d;

    public f0(c0 c0Var, int i7) {
        super(c0Var);
        this.d = i7;
    }

    @Override
    public final int a(View view) {
        int y10;
        int i7;
        switch (this.d) {
            case 0:
                ((c0) this.f2217b).getClass();
                y10 = p0.y(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((c0) this.f2217b).getClass();
                y10 = p0.v(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
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
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.f2217b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f59348b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.f2217b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f59348b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
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
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.f2217b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).f59348b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.f2217b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f59348b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
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
                ((c0) this.f2217b).getClass();
                x10 = p0.x(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((c0) this.f2217b).getClass();
                x10 = p0.z(view);
                i7 = ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i7;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2217b).f59341m;
            default:
                return ((c0) this.f2217b).f59342n;
        }
    }

    @Override
    public final int f() {
        int i7;
        int E;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f2217b;
                i7 = c0Var.f59341m;
                E = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.f2217b;
                i7 = c0Var2.f59342n;
                E = c0Var2.C();
                break;
        }
        return i7 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2217b).E();
            default:
                return ((c0) this.f2217b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2217b).f59339k;
            default:
                return ((c0) this.f2217b).f59340l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2217b).f59340l;
            default:
                return ((c0) this.f2217b).f59339k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((c0) this.f2217b).D();
            default:
                return ((c0) this.f2217b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f2217b;
                return (c0Var.f59341m - c0Var.D()) - c0Var.E();
            default:
                return ((c0) this.f2217b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2218c;
                ((c0) this.f2217b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f2218c;
                ((c0) this.f2217b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f2218c;
                ((c0) this.f2217b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f2218c;
                ((c0) this.f2217b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i7) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((c0) this.f2217b).f59332b;
                if (recyclerView != null) {
                    int z10 = recyclerView.f2767e.z();
                    for (int i10 = 0; i10 < z10; i10++) {
                        recyclerView.f2767e.y(i10).offsetLeftAndRight(i7);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((c0) this.f2217b).f59332b;
                if (recyclerView2 != null) {
                    int z11 = recyclerView2.f2767e.z();
                    for (int i11 = 0; i11 < z11; i11++) {
                        recyclerView2.f2767e.y(i11).offsetTopAndBottom(i7);
                    }
                    return;
                }
                return;
        }
    }
}
