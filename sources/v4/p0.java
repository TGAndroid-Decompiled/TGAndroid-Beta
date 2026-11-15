package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public e1 f58637a;
    public final Rect f58638b;
    public boolean f58639c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58638b = new Rect();
        this.f58639c = true;
        this.d = false;
    }

    public final int a() {
        e1 e1Var = this.f58637a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.b();
    }

    public final int b() {
        e1 e1Var = this.f58637a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.c();
    }

    public p0(int i7, int i10) {
        super(i7, i10);
        this.f58638b = new Rect();
        this.f58639c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f58638b = new Rect();
        this.f58639c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f58638b = new Rect();
        this.f58639c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f58638b = new Rect();
        this.f58639c = true;
        this.d = false;
    }
}
