package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50244a;
    public final m f50245b;

    public g(m mVar, int i10) {
        this.f50244a = i10;
        this.f50245b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50244a) {
            case 0:
                this.f50245b.dismiss();
                return;
            case 1:
                m.R(this.f50245b);
                return;
            default:
                m mVar = this.f50245b;
                mVar.f50373c0.setValueAnimated((int) mVar.f50382l0.getMinimumBid());
                return;
        }
    }
}
