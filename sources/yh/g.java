package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50316a;
    public final m f50317b;

    public g(m mVar, int i10) {
        this.f50316a = i10;
        this.f50317b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50316a) {
            case 0:
                this.f50317b.dismiss();
                return;
            case 1:
                m.Q(this.f50317b);
                return;
            default:
                m mVar = this.f50317b;
                mVar.f50436c0.setValueAnimated((int) mVar.f50445l0.getMinimumBid());
                return;
        }
    }
}
