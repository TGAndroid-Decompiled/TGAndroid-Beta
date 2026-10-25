package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class q0 extends ViewGroup.MarginLayoutParams {
    public e1 f47829a;
    public final Rect f47830b;
    public boolean f47831c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47830b = new Rect();
        this.f47831c = true;
        this.d = false;
    }

    public final int a() {
        e1 e1Var = this.f47829a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.b();
    }

    public final int b() {
        e1 e1Var = this.f47829a;
        if (e1Var == null) {
            return -1;
        }
        return e1Var.c();
    }

    public q0(int i10, int i11) {
        super(i10, i11);
        this.f47830b = new Rect();
        this.f47831c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f47830b = new Rect();
        this.f47831c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f47830b = new Rect();
        this.f47831c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f47830b = new Rect();
        this.f47831c = true;
        this.d = false;
    }
}
