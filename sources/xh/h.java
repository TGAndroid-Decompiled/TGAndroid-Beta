package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51491a;
    public final o f51492b;

    public h(o oVar, int i10) {
        this.f51491a = i10;
        this.f51492b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51491a) {
            case 0:
                this.f51492b.dismiss();
                return;
            case 1:
                o.R(this.f51492b);
                return;
            default:
                o oVar = this.f51492b;
                oVar.f51638c0.setValueAnimated((int) oVar.f51647l0.getMinimumBid());
                return;
        }
    }
}
