package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class q0 extends ViewGroup.MarginLayoutParams {
    public d1 f47870a;
    public final Rect f47871b;
    public boolean f47872c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47871b = new Rect();
        this.f47872c = true;
        this.d = false;
    }

    public final int a() {
        d1 d1Var = this.f47870a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.b();
    }

    public final int b() {
        d1 d1Var = this.f47870a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.c();
    }

    public q0(int i10, int i11) {
        super(i10, i11);
        this.f47871b = new Rect();
        this.f47872c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f47871b = new Rect();
        this.f47872c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f47871b = new Rect();
        this.f47872c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f47871b = new Rect();
        this.f47872c = true;
        this.d = false;
    }
}
