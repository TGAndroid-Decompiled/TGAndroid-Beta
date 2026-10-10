package xh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f51302a;
    public final o f51303b;

    public h(o oVar, int i10) {
        this.f51302a = i10;
        this.f51303b = oVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51302a) {
            case 0:
                this.f51303b.dismiss();
                return;
            case 1:
                o.R(this.f51303b);
                return;
            default:
                o oVar = this.f51303b;
                oVar.f51446c0.setValueAnimated((int) oVar.f51455l0.getMinimumBid());
                return;
        }
    }
}
