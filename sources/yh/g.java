package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50697a;
    public final m f50698b;

    public g(m mVar, int i10) {
        this.f50697a = i10;
        this.f50698b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50697a) {
            case 0:
                this.f50698b.dismiss();
                return;
            case 1:
                m.Q(this.f50698b);
                return;
            default:
                m mVar = this.f50698b;
                mVar.f50838c0.setValueAnimated((int) mVar.f50847l0.getMinimumBid());
                return;
        }
    }
}
