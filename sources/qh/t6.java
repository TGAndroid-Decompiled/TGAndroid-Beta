package qh;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f46119a;
    public final b7 f46120b;

    public t6(b7 b7Var, int i10) {
        this.f46119a = i10;
        this.f46120b = b7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46119a) {
            case 0:
                this.f46120b.U();
                return;
            default:
                this.f46120b.X();
                return;
        }
    }
}
