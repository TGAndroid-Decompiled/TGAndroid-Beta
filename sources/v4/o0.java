package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class o0 extends ViewGroup.MarginLayoutParams {
    public d1 f57156a;
    public final Rect f57157b;
    public boolean f57158c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57157b = new Rect();
        this.f57158c = true;
        this.d = false;
    }

    public final int a() {
        d1 d1Var = this.f57156a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.b();
    }

    public final int b() {
        d1 d1Var = this.f57156a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.c();
    }

    public o0(int i7, int i10) {
        super(i7, i10);
        this.f57157b = new Rect();
        this.f57158c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f57157b = new Rect();
        this.f57158c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f57157b = new Rect();
        this.f57158c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f57157b = new Rect();
        this.f57158c = true;
        this.d = false;
    }
}
