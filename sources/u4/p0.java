package u4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class p0 extends ViewGroup.MarginLayoutParams {
    public d1 f55645a;
    public final Rect f55646b;
    public boolean f55647c;
    public boolean d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55646b = new Rect();
        this.f55647c = true;
        this.d = false;
    }

    public final int a() {
        d1 d1Var = this.f55645a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.b();
    }

    public final int b() {
        d1 d1Var = this.f55645a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.c();
    }

    public p0(int i3, int i10) {
        super(i3, i10);
        this.f55646b = new Rect();
        this.f55647c = true;
        this.d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f55646b = new Rect();
        this.f55647c = true;
        this.d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f55646b = new Rect();
        this.f55647c = true;
        this.d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f55646b = new Rect();
        this.f55647c = true;
        this.d = false;
    }
}
