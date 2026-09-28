package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public c1 f43066a;
    public final Rect f43067b;
    public boolean f43068c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43067b = new Rect();
        this.f43068c = true;
        this.d = false;
    }

    public final int a() {
        c1 c1Var = this.f43066a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.b();
    }

    public final int b() {
        c1 c1Var = this.f43066a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.c();
    }

    public p0(int i10, int i11) {
        super(i10, i11);
        this.f43067b = new Rect();
        this.f43068c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f43067b = new Rect();
        this.f43068c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f43067b = new Rect();
        this.f43068c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f43067b = new Rect();
        this.f43068c = true;
        this.d = false;
    }
}
