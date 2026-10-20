package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50250a;
    public final m f50251b;

    public g(m mVar, int i10) {
        this.f50250a = i10;
        this.f50251b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50250a) {
            case 0:
                this.f50251b.dismiss();
                return;
            case 1:
                m.R(this.f50251b);
                return;
            default:
                m mVar = this.f50251b;
                mVar.f50379c0.setValueAnimated((int) mVar.f50388l0.getMinimumBid());
                return;
        }
    }
}
