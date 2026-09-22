package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f45866a;
    public final m f45867b;

    public g(m mVar, int i10) {
        this.f45866a = i10;
        this.f45867b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45866a) {
            case 0:
                this.f45867b.dismiss();
                return;
            case 1:
                m.Q(this.f45867b);
                return;
            default:
                m mVar = this.f45867b;
                mVar.f45982c0.setValueAnimated((int) mVar.f45991l0.getMinimumBid());
                return;
        }
    }
}
