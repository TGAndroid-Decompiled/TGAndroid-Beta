package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50254a;
    public final m f50255b;

    public g(m mVar, int i10) {
        this.f50254a = i10;
        this.f50255b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50254a) {
            case 0:
                this.f50255b.dismiss();
                return;
            case 1:
                m.R(this.f50255b);
                return;
            default:
                m mVar = this.f50255b;
                mVar.f50383c0.setValueAnimated((int) mVar.f50392l0.getMinimumBid());
                return;
        }
    }
}
