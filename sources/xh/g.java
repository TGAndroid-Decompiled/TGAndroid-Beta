package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f49953a;
    public final m f49954b;

    public g(m mVar, int i10) {
        this.f49953a = i10;
        this.f49954b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49953a) {
            case 0:
                this.f49954b.dismiss();
                return;
            case 1:
                m.O(this.f49954b);
                return;
            default:
                m mVar = this.f49954b;
                mVar.f50077c0.setValueAnimated((int) mVar.f50086l0.getMinimumBid());
                return;
        }
    }
}
