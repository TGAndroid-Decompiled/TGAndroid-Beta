package ph;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f42478a;
    public final c7 f42479b;

    public u6(c7 c7Var, int i10) {
        this.f42478a = i10;
        this.f42479b = c7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42478a) {
            case 0:
                this.f42479b.U();
                return;
            default:
                this.f42479b.X();
                return;
        }
    }
}
