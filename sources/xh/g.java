package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f49954a;
    public final m f49955b;

    public g(m mVar, int i10) {
        this.f49954a = i10;
        this.f49955b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49954a) {
            case 0:
                this.f49955b.dismiss();
                return;
            case 1:
                m.O(this.f49955b);
                return;
            default:
                m mVar = this.f49955b;
                mVar.f50078c0.setValueAnimated((int) mVar.f50087l0.getMinimumBid());
                return;
        }
    }
}
