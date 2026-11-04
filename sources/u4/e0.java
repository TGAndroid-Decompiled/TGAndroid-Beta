package u4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class e0 extends androidx.emoji2.text.g {
    public final int d;

    public e0(b0 b0Var, int i3) {
        super(b0Var);
        this.d = i3;
    }

    @Override
    public final int a(View view) {
        int y9;
        int i3;
        switch (this.d) {
            case 0:
                ((b0) this.f1726b).getClass();
                y9 = o0.y(view);
                i3 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((b0) this.f1726b).getClass();
                y9 = o0.v(view);
                i3 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y9 + i3;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.f1726b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).f55646b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.f1726b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f55646b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i3;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.f1726b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).f55646b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.f1726b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f55646b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin;
                break;
        }
        return measuredHeight + i3;
    }

    @Override
    public final int d(View view) {
        int x10;
        int i3;
        switch (this.d) {
            case 0:
                ((b0) this.f1726b).getClass();
                x10 = o0.x(view);
                i3 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((b0) this.f1726b).getClass();
                x10 = o0.z(view);
                i3 = ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i3;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((b0) this.f1726b).f55639m;
            default:
                return ((b0) this.f1726b).f55640n;
        }
    }

    @Override
    public final int f() {
        int i3;
        int E;
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f1726b;
                i3 = b0Var.f55639m;
                E = b0Var.E();
                break;
            default:
                b0 b0Var2 = (b0) this.f1726b;
                i3 = b0Var2.f55640n;
                E = b0Var2.C();
                break;
        }
        return i3 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((b0) this.f1726b).E();
            default:
                return ((b0) this.f1726b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((b0) this.f1726b).f55637k;
            default:
                return ((b0) this.f1726b).f55638l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((b0) this.f1726b).f55638l;
            default:
                return ((b0) this.f1726b).f55637k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((b0) this.f1726b).D();
            default:
                return ((b0) this.f1726b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f1726b;
                return (b0Var.f55639m - b0Var.D()) - b0Var.E();
            default:
                return ((b0) this.f1726b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1727c;
                ((b0) this.f1726b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f1727c;
                ((b0) this.f1726b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1727c;
                ((b0) this.f1726b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f1727c;
                ((b0) this.f1726b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i3) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((b0) this.f1726b).f55630b;
                if (recyclerView != null) {
                    int o10 = recyclerView.f2279e.o();
                    for (int i10 = 0; i10 < o10; i10++) {
                        recyclerView.f2279e.n(i10).offsetLeftAndRight(i3);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((b0) this.f1726b).f55630b;
                if (recyclerView2 != null) {
                    int o11 = recyclerView2.f2279e.o();
                    for (int i11 = 0; i11 < o11; i11++) {
                        recyclerView2.f2279e.n(i11).offsetTopAndBottom(i3);
                    }
                    return;
                }
                return;
        }
    }
}
