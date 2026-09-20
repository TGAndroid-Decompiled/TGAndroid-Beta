package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46168a;
    public final m f46169b;

    public g(m mVar, int i10) {
        this.f46168a = i10;
        this.f46169b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46168a) {
            case 0:
                this.f46169b.dismiss();
                return;
            case 1:
                m.Q(this.f46169b);
                return;
            default:
                m mVar = this.f46169b;
                mVar.f46282c0.setValueAnimated((int) mVar.f46291l0.getMinimumBid());
                return;
        }
    }
}
