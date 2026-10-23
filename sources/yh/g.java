package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50698a;
    public final m f50699b;

    public g(m mVar, int i10) {
        this.f50698a = i10;
        this.f50699b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50698a) {
            case 0:
                this.f50699b.dismiss();
                return;
            case 1:
                m.Q(this.f50699b);
                return;
            default:
                m mVar = this.f50699b;
                mVar.f50839c0.setValueAnimated((int) mVar.f50848l0.getMinimumBid());
                return;
        }
    }
}
