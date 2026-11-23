package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public e1 f59212a;
    public final Rect f59213b;
    public boolean f59214c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59213b = new Rect();
        this.f59214c = true;
        this.d = false;
    }

    public final int a() {
        e1 e1Var = this.f59212a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.b();
    }

    public final int b() {
        e1 e1Var = this.f59212a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.c();
    }

    public p0(int i7, int i10) {
        super(i7, i10);
        this.f59213b = new Rect();
        this.f59214c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f59213b = new Rect();
        this.f59214c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f59213b = new Rect();
        this.f59214c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f59213b = new Rect();
        this.f59214c = true;
        this.d = false;
    }
}
