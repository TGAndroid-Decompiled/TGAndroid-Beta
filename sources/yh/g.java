package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50253a;
    public final m f50254b;

    public g(m mVar, int i10) {
        this.f50253a = i10;
        this.f50254b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50253a) {
            case 0:
                this.f50254b.dismiss();
                return;
            case 1:
                m.R(this.f50254b);
                return;
            default:
                m mVar = this.f50254b;
                mVar.f50382c0.setValueAnimated((int) mVar.f50391l0.getMinimumBid());
                return;
        }
    }
}
