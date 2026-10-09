package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51258a;
    public final o f51259b;

    public h(o oVar, int i10) {
        this.f51258a = i10;
        this.f51259b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51258a) {
            case 0:
                this.f51259b.dismiss();
                return;
            case 1:
                o.R(this.f51259b);
                return;
            default:
                o oVar = this.f51259b;
                oVar.f51402c0.setValueAnimated((int) oVar.f51411l0.getMinimumBid());
                return;
        }
    }
}
