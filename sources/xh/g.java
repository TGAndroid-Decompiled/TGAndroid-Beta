package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f45893a;
    public final m f45894b;

    public g(m mVar, int i10) {
        this.f45893a = i10;
        this.f45894b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45893a) {
            case 0:
                this.f45894b.dismiss();
                return;
            case 1:
                m.Q(this.f45894b);
                return;
            default:
                m mVar = this.f45894b;
                mVar.f46009c0.setValueAnimated((int) mVar.f46018l0.getMinimumBid());
                return;
        }
    }
}
