package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51345a;
    public final o f51346b;

    public h(o oVar, int i10) {
        this.f51345a = i10;
        this.f51346b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51345a) {
            case 0:
                this.f51346b.dismiss();
                return;
            case 1:
                o.R(this.f51346b);
                return;
            default:
                o oVar = this.f51346b;
                oVar.f51489c0.setValueAnimated((int) oVar.f51498l0.getMinimumBid());
                return;
        }
    }
}
