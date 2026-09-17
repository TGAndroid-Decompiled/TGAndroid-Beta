package yh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f50287a;
    public final m f50288b;

    public g(m mVar, int i10) {
        this.f50287a = i10;
        this.f50288b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50287a) {
            case 0:
                this.f50288b.dismiss();
                return;
            case 1:
                m.Q(this.f50288b);
                return;
            default:
                m mVar = this.f50288b;
                mVar.f50407c0.setValueAnimated((int) mVar.f50416l0.getMinimumBid());
                return;
        }
    }
}
