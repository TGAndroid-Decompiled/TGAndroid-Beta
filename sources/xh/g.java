package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f45870a;
    public final m f45871b;

    public g(m mVar, int i10) {
        this.f45870a = i10;
        this.f45871b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45870a) {
            case 0:
                this.f45871b.dismiss();
                return;
            case 1:
                m.Q(this.f45871b);
                return;
            default:
                m mVar = this.f45871b;
                mVar.f45986c0.setValueAnimated((int) mVar.f45995l0.getMinimumBid());
                return;
        }
    }
}
