package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f45820a;
    public final m f45821b;

    public g(m mVar, int i10) {
        this.f45820a = i10;
        this.f45821b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45820a) {
            case 0:
                this.f45821b.dismiss();
                return;
            case 1:
                m.Q(this.f45821b);
                return;
            default:
                m mVar = this.f45821b;
                mVar.f45934c0.setValueAnimated((int) mVar.f45943l0.getMinimumBid());
                return;
        }
    }
}
