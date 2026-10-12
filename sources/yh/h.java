package yh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f48888a;
    public final n f48889b;

    public h(n nVar, int i10) {
        this.f48888a = i10;
        this.f48889b = nVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48888a) {
            case 0:
                this.f48889b.dismiss();
                return;
            case 1:
                n.R(this.f48889b);
                return;
            default:
                n nVar = this.f48889b;
                nVar.f49009c0.setValueAnimated((int) nVar.f49018l0.getMinimumBid());
                return;
        }
    }
}
