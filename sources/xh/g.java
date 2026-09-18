package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f45898a;
    public final m f45899b;

    public g(m mVar, int i10) {
        this.f45898a = i10;
        this.f45899b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45898a) {
            case 0:
                this.f45899b.dismiss();
                return;
            case 1:
                m.Q(this.f45899b);
                return;
            default:
                m mVar = this.f45899b;
                mVar.f46014c0.setValueAnimated((int) mVar.f46023l0.getMinimumBid());
                return;
        }
    }
}
