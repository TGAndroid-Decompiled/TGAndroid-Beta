package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class o0 extends ViewGroup.MarginLayoutParams {
    public b1 f44942a;
    public final Rect f44943b;
    public boolean f44944c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44943b = new Rect();
        this.f44944c = true;
        this.d = false;
    }

    public final int a() {
        b1 b1Var = this.f44942a;
        if (b1Var == null) {
            return -1;
        }
        return b1Var.b();
    }

    public final int b() {
        b1 b1Var = this.f44942a;
        if (b1Var == null) {
            return -1;
        }
        return b1Var.c();
    }

    public o0(int i10, int i11) {
        super(i10, i11);
        this.f44943b = new Rect();
        this.f44944c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f44943b = new Rect();
        this.f44944c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f44943b = new Rect();
        this.f44944c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f44943b = new Rect();
        this.f44944c = true;
        this.d = false;
    }
}
