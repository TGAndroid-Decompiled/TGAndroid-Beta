package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class e0 extends androidx.emoji2.text.g {
    public final int d;

    public e0(b0 b0Var, int i10) {
        super(b0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int y3;
        int i10;
        switch (this.d) {
            case 0:
                ((b0) this.f3096b).getClass();
                y3 = n0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((b0) this.f3096b).getClass();
                y3 = n0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).bottomMargin;
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
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.f3096b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).f46025b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.f3096b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).f46025b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
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
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.f3096b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).f46025b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.f3096b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).f46025b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin;
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
                ((b0) this.f3096b).getClass();
                x10 = n0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((b0) this.f3096b).getClass();
                x10 = n0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((b0) this.f3096b).f46021m;
            default:
                return ((b0) this.f3096b).f46022n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f3096b;
                i10 = b0Var.f46021m;
                E = b0Var.E();
                break;
            default:
                b0 b0Var2 = (b0) this.f3096b;
                i10 = b0Var2.f46022n;
                E = b0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((b0) this.f3096b).E();
            default:
                return ((b0) this.f3096b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((b0) this.f3096b).f46019k;
            default:
                return ((b0) this.f3096b).f46020l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((b0) this.f3096b).f46020l;
            default:
                return ((b0) this.f3096b).f46019k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((b0) this.f3096b).D();
            default:
                return ((b0) this.f3096b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.f3096b;
                return (b0Var.f46021m - b0Var.D()) - b0Var.E();
            default:
                return ((b0) this.f3096b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f3097c;
                ((b0) this.f3096b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f3097c;
                ((b0) this.f3096b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f3097c;
                ((b0) this.f3096b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f3097c;
                ((b0) this.f3096b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((b0) this.f3096b).f46013b;
                if (recyclerView != null) {
                    int D = recyclerView.e.D();
                    for (int i11 = 0; i11 < D; i11++) {
                        recyclerView.e.C(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((b0) this.f3096b).f46013b;
                if (recyclerView2 != null) {
                    int D2 = recyclerView2.e.D();
                    for (int i12 = 0; i12 < D2; i12++) {
                        recyclerView2.e.C(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
