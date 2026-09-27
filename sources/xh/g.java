package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46217a;
    public final m f46218b;

    public g(m mVar, int i10) {
        this.f46217a = i10;
        this.f46218b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46217a) {
            case 0:
                this.f46218b.dismiss();
                return;
            case 1:
                m.Q(this.f46218b);
                return;
            default:
                m mVar = this.f46218b;
                mVar.f46331c0.setValueAnimated((int) mVar.f46340l0.getMinimumBid());
                return;
        }
    }
}
