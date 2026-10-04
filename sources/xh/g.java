package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f49962a;
    public final m f49963b;

    public g(m mVar, int i10) {
        this.f49962a = i10;
        this.f49963b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49962a) {
            case 0:
                this.f49963b.dismiss();
                return;
            case 1:
                m.O(this.f49963b);
                return;
            default:
                m mVar = this.f49963b;
                mVar.f50086c0.setValueAnimated((int) mVar.f50095l0.getMinimumBid());
                return;
        }
    }
}
