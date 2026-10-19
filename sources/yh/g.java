package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50243a;
    public final m f50244b;

    public g(m mVar, int i10) {
        this.f50243a = i10;
        this.f50244b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50243a) {
            case 0:
                this.f50244b.dismiss();
                return;
            case 1:
                m.R(this.f50244b);
                return;
            default:
                m mVar = this.f50244b;
                mVar.f50372c0.setValueAnimated((int) mVar.f50381l0.getMinimumBid());
                return;
        }
    }
}
