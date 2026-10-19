package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50245a;
    public final m f50246b;

    public g(m mVar, int i10) {
        this.f50245a = i10;
        this.f50246b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50245a) {
            case 0:
                this.f50246b.dismiss();
                return;
            case 1:
                m.R(this.f50246b);
                return;
            default:
                m mVar = this.f50246b;
                mVar.f50374c0.setValueAnimated((int) mVar.f50383l0.getMinimumBid());
                return;
        }
    }
}
