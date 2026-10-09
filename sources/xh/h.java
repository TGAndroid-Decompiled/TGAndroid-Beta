package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51256a;
    public final o f51257b;

    public h(o oVar, int i10) {
        this.f51256a = i10;
        this.f51257b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51256a) {
            case 0:
                this.f51257b.dismiss();
                return;
            case 1:
                o.R(this.f51257b);
                return;
            default:
                o oVar = this.f51257b;
                oVar.f51400c0.setValueAnimated((int) oVar.f51409l0.getMinimumBid());
                return;
        }
    }
}
