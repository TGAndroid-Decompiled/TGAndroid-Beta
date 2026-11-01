package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class o0 extends ViewGroup.MarginLayoutParams {
    public c1 f48003a;
    public final Rect f48004b;
    public boolean f48005c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48004b = new Rect();
        this.f48005c = true;
        this.d = false;
    }

    public final int a() {
        c1 c1Var = this.f48003a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.b();
    }

    public final int b() {
        c1 c1Var = this.f48003a;
        if (c1Var == null) {
            return -1;
        }
        return c1Var.c();
    }

    public o0(int i10, int i11) {
        super(i10, i11);
        this.f48004b = new Rect();
        this.f48005c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f48004b = new Rect();
        this.f48005c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f48004b = new Rect();
        this.f48005c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f48004b = new Rect();
        this.f48005c = true;
        this.d = false;
    }
}
