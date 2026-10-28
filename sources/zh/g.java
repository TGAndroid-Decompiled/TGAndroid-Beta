package zh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f53034a;
    public final m f53035b;

    public g(m mVar, int i10) {
        this.f53034a = i10;
        this.f53035b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53034a) {
            case 0:
                this.f53035b.dismiss();
                return;
            case 1:
                m.Q(this.f53035b);
                return;
            default:
                m mVar = this.f53035b;
                mVar.f53172c0.setValueAnimated((int) mVar.f53181l0.getMinimumBid());
                return;
        }
    }
}
