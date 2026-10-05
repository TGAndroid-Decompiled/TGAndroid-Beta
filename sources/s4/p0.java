package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public c1 f46657a;
    public final Rect f46658b;
    public boolean f46659c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46658b = new Rect();
        this.f46659c = true;
        this.d = false;
    }

    public final int a() {
        c1 c1Var = this.f46657a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.b();
    }

    public final int b() {
        c1 c1Var = this.f46657a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.c();
    }

    public p0(int i10, int i11) {
        super(i10, i11);
        this.f46658b = new Rect();
        this.f46659c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f46658b = new Rect();
        this.f46659c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f46658b = new Rect();
        this.f46659c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f46658b = new Rect();
        this.f46659c = true;
        this.d = false;
    }
}
