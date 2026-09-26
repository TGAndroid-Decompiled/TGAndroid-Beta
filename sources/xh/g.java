package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46148a;
    public final m f46149b;

    public g(m mVar, int i10) {
        this.f46148a = i10;
        this.f46149b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46148a) {
            case 0:
                this.f46149b.dismiss();
                return;
            case 1:
                m.Q(this.f46149b);
                return;
            default:
                m mVar = this.f46149b;
                mVar.f46262c0.setValueAnimated((int) mVar.f46271l0.getMinimumBid());
                return;
        }
    }
}
