package ph;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f42480a;
    public final d7 f42481b;

    public v6(d7 d7Var, int i10) {
        this.f42480a = i10;
        this.f42481b = d7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42480a) {
            case 0:
                this.f42481b.U();
                return;
            default:
                this.f42481b.X();
                return;
        }
    }
}
