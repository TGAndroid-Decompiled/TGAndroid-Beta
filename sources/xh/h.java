package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51379a;
    public final o f51380b;

    public h(o oVar, int i10) {
        this.f51379a = i10;
        this.f51380b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51379a) {
            case 0:
                this.f51380b.dismiss();
                return;
            case 1:
                o.R(this.f51380b);
                return;
            default:
                o oVar = this.f51380b;
                oVar.f51523c0.setValueAnimated((int) oVar.f51532l0.getMinimumBid());
                return;
        }
    }
}
