package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46149a;
    public final m f46150b;

    public g(m mVar, int i10) {
        this.f46149a = i10;
        this.f46150b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46149a) {
            case 0:
                this.f46150b.dismiss();
                return;
            case 1:
                m.Q(this.f46150b);
                return;
            default:
                m mVar = this.f46150b;
                mVar.f46263c0.setValueAnimated((int) mVar.f46272l0.getMinimumBid());
                return;
        }
    }
}
