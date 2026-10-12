package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51499a;
    public final o f51500b;

    public h(o oVar, int i10) {
        this.f51499a = i10;
        this.f51500b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51499a) {
            case 0:
                this.f51500b.dismiss();
                return;
            case 1:
                o.R(this.f51500b);
                return;
            default:
                o oVar = this.f51500b;
                oVar.f51646c0.setValueAnimated((int) oVar.f51655l0.getMinimumBid());
                return;
        }
    }
}
