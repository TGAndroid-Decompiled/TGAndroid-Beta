package yh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f48887a;
    public final n f48888b;

    public h(n nVar, int i10) {
        this.f48887a = i10;
        this.f48888b = nVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48887a) {
            case 0:
                this.f48888b.dismiss();
                return;
            case 1:
                n.R(this.f48888b);
                return;
            default:
                n nVar = this.f48888b;
                nVar.f49008c0.setValueAnimated((int) nVar.f49017l0.getMinimumBid());
                return;
        }
    }
}
