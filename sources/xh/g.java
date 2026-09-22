package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46189a;
    public final m f46190b;

    public g(m mVar, int i10) {
        this.f46189a = i10;
        this.f46190b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46189a) {
            case 0:
                this.f46190b.dismiss();
                return;
            case 1:
                m.Q(this.f46190b);
                return;
            default:
                m mVar = this.f46190b;
                mVar.f46303c0.setValueAnimated((int) mVar.f46312l0.getMinimumBid());
                return;
        }
    }
}
