package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46150a;
    public final m f46151b;

    public g(m mVar, int i10) {
        this.f46150a = i10;
        this.f46151b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46150a) {
            case 0:
                this.f46151b.dismiss();
                return;
            case 1:
                m.Q(this.f46151b);
                return;
            default:
                m mVar = this.f46151b;
                mVar.f46264c0.setValueAnimated((int) mVar.f46273l0.getMinimumBid());
                return;
        }
    }
}
