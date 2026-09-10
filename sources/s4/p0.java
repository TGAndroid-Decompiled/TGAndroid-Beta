package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public c1 f41716a;
    public final Rect f41717b;
    public boolean f41718c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41717b = new Rect();
        this.f41718c = true;
        this.d = false;
    }

    public final int a() {
        c1 c1Var = this.f41716a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.b();
    }

    public final int b() {
        c1 c1Var = this.f41716a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.c();
    }

    public p0(int i10, int i11) {
        super(i10, i11);
        this.f41717b = new Rect();
        this.f41718c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f41717b = new Rect();
        this.f41718c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f41717b = new Rect();
        this.f41718c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f41717b = new Rect();
        this.f41718c = true;
        this.d = false;
    }
}
