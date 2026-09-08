package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50315a;
    public final m f50316b;

    public g(m mVar, int i10) {
        this.f50315a = i10;
        this.f50316b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50315a) {
            case 0:
                this.f50316b.dismiss();
                return;
            case 1:
                m.Q(this.f50316b);
                return;
            default:
                m mVar = this.f50316b;
                mVar.f50435c0.setValueAnimated((int) mVar.f50444l0.getMinimumBid());
                return;
        }
    }
}
