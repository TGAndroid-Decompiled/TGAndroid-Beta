package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class q0 extends ViewGroup.MarginLayoutParams {
    public f1 f59261a;
    public final Rect f59262b;
    public boolean f59263c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59262b = new Rect();
        this.f59263c = true;
        this.d = false;
    }

    public final int a() {
        f1 f1Var = this.f59261a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.b();
    }

    public final int b() {
        f1 f1Var = this.f59261a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.c();
    }

    public q0(int i7, int i10) {
        super(i7, i10);
        this.f59262b = new Rect();
        this.f59263c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f59262b = new Rect();
        this.f59263c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f59262b = new Rect();
        this.f59263c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f59262b = new Rect();
        this.f59263c = true;
        this.d = false;
    }
}
