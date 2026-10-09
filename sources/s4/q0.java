package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class q0 extends ViewGroup.MarginLayoutParams {
    public d1 f47778a;
    public final Rect f47779b;
    public boolean f47780c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47779b = new Rect();
        this.f47780c = true;
        this.d = false;
    }

    public final int a() {
        d1 d1Var = this.f47778a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.b();
    }

    public final int b() {
        d1 d1Var = this.f47778a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.c();
    }

    public q0(int i10, int i11) {
        super(i10, i11);
        this.f47779b = new Rect();
        this.f47780c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f47779b = new Rect();
        this.f47780c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f47779b = new Rect();
        this.f47780c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f47779b = new Rect();
        this.f47780c = true;
        this.d = false;
    }
}
