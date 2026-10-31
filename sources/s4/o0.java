package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class o0 extends ViewGroup.MarginLayoutParams {
    public c1 f47992a;
    public final Rect f47993b;
    public boolean f47994c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47993b = new Rect();
        this.f47994c = true;
        this.d = false;
    }

    public final int a() {
        c1 c1Var = this.f47992a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.b();
    }

    public final int b() {
        c1 c1Var = this.f47992a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.c();
    }

    public o0(int i10, int i11) {
        super(i10, i11);
        this.f47993b = new Rect();
        this.f47994c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f47993b = new Rect();
        this.f47994c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f47993b = new Rect();
        this.f47994c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f47993b = new Rect();
        this.f47994c = true;
        this.d = false;
    }
}
