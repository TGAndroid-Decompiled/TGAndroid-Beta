package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50286a;
    public final m f50287b;

    public g(m mVar, int i10) {
        this.f50286a = i10;
        this.f50287b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50286a) {
            case 0:
                this.f50287b.dismiss();
                return;
            case 1:
                m.Q(this.f50287b);
                return;
            default:
                m mVar = this.f50287b;
                mVar.f50406c0.setValueAnimated((int) mVar.f50415l0.getMinimumBid());
                return;
        }
    }
}
