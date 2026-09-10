package wh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f44095a;
    public final m f44096b;

    public g(m mVar, int i10) {
        this.f44095a = i10;
        this.f44096b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44095a) {
            case 0:
                this.f44096b.dismiss();
                return;
            case 1:
                m.Q(this.f44096b);
                return;
            default:
                m mVar = this.f44096b;
                mVar.f44216c0.setValueAnimated((int) mVar.f44225l0.getMinimumBid());
                return;
        }
    }
}
