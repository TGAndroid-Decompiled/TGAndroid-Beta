package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46134a;
    public final m f46135b;

    public g(m mVar, int i10) {
        this.f46134a = i10;
        this.f46135b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46134a) {
            case 0:
                this.f46135b.dismiss();
                return;
            case 1:
                m.Q(this.f46135b);
                return;
            default:
                m mVar = this.f46135b;
                mVar.f46248c0.setValueAnimated((int) mVar.f46257l0.getMinimumBid());
                return;
        }
    }
}
