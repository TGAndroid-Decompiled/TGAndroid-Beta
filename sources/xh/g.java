package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f49969a;
    public final m f49970b;

    public g(m mVar, int i10) {
        this.f49969a = i10;
        this.f49970b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49969a) {
            case 0:
                this.f49970b.dismiss();
                return;
            case 1:
                m.O(this.f49970b);
                return;
            default:
                m mVar = this.f49970b;
                mVar.f50093c0.setValueAnimated((int) mVar.f50102l0.getMinimumBid());
                return;
        }
    }
}
