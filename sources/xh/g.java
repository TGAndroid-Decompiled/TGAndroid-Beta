package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46147a;
    public final m f46148b;

    public g(m mVar, int i10) {
        this.f46147a = i10;
        this.f46148b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46147a) {
            case 0:
                this.f46148b.dismiss();
                return;
            case 1:
                m.Q(this.f46148b);
                return;
            default:
                m mVar = this.f46148b;
                mVar.f46261c0.setValueAnimated((int) mVar.f46270l0.getMinimumBid());
                return;
        }
    }
}
