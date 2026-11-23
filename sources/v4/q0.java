package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class q0 extends ViewGroup.MarginLayoutParams {
    public f1 f59265a;
    public final Rect f59266b;
    public boolean f59267c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59266b = new Rect();
        this.f59267c = true;
        this.d = false;
    }

    public final int a() {
        f1 f1Var = this.f59265a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.b();
    }

    public final int b() {
        f1 f1Var = this.f59265a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.c();
    }

    public q0(int i7, int i10) {
        super(i7, i10);
        this.f59266b = new Rect();
        this.f59267c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f59266b = new Rect();
        this.f59267c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f59266b = new Rect();
        this.f59267c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f59266b = new Rect();
        this.f59267c = true;
        this.d = false;
    }
}
