package qh;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f46099a;
    public final a7 f46100b;

    public s6(a7 a7Var, int i10) {
        this.f46099a = i10;
        this.f46100b = a7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46099a) {
            case 0:
                this.f46100b.U();
                return;
            default:
                this.f46100b.X();
                return;
        }
    }
}
