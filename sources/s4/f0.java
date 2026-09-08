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
                ((c0) this.f1355b).getClass();
                y3 = o0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((c0) this.f1355b).getClass();
                y3 = o0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).bottomMargin;
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
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.f1355b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).f45886b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.f1355b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f45886b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
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
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.f1355b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).f45886b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.f1355b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f45886b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin;
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
                ((c0) this.f1355b).getClass();
                x10 = o0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((c0) this.f1355b).getClass();
                x10 = o0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((c0) this.f1355b).f45879m;
            default:
                return ((c0) this.f1355b).f45880n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f1355b;
                i10 = c0Var.f45879m;
                E = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.f1355b;
                i10 = c0Var2.f45880n;
                E = c0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((c0) this.f1355b).E();
            default:
                return ((c0) this.f1355b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((c0) this.f1355b).f45877k;
            default:
                return ((c0) this.f1355b).f45878l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((c0) this.f1355b).f45878l;
            default:
                return ((c0) this.f1355b).f45877k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((c0) this.f1355b).D();
            default:
                return ((c0) this.f1355b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.f1355b;
                return (c0Var.f45879m - c0Var.D()) - c0Var.E();
            default:
                return ((c0) this.f1355b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1356c;
                ((c0) this.f1355b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f1356c;
                ((c0) this.f1355b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1356c;
                ((c0) this.f1355b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f1356c;
                ((c0) this.f1355b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((c0) this.f1355b).f45870b;
                if (recyclerView != null) {
                    int y3 = recyclerView.f1899e.y();
                    for (int i11 = 0; i11 < y3; i11++) {
                        recyclerView.f1899e.x(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((c0) this.f1355b).f45870b;
                if (recyclerView2 != null) {
                    int y10 = recyclerView2.f1899e.y();
                    for (int i12 = 0; i12 < y10; i12++) {
                        recyclerView2.f1899e.x(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
