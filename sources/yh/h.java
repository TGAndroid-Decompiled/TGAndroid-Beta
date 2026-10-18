package yh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f50304a;
    public final n f50305b;

    public h(n nVar, int i10) {
        this.f50304a = i10;
        this.f50305b = nVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50304a) {
            case 0:
                this.f50305b.dismiss();
                return;
            case 1:
                n.R(this.f50305b);
                return;
            default:
                n nVar = this.f50305b;
                nVar.f50433c0.setValueAnimated((int) nVar.f50442l0.getMinimumBid());
                return;
        }
    }
}
