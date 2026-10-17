package yh;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f50279a;
    public final n f50280b;

    public h(n nVar, int i10) {
        this.f50279a = i10;
        this.f50280b = nVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50279a) {
            case 0:
                this.f50280b.dismiss();
                return;
            case 1:
                n.R(this.f50280b);
                return;
            default:
                n nVar = this.f50280b;
                nVar.f50408c0.setValueAnimated((int) nVar.f50417l0.getMinimumBid());
                return;
        }
    }
}
