package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46121a;
    public final m f46122b;

    public g(m mVar, int i10) {
        this.f46121a = i10;
        this.f46122b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46121a) {
            case 0:
                this.f46122b.dismiss();
                return;
            case 1:
                m.Q(this.f46122b);
                return;
            default:
                m mVar = this.f46122b;
                mVar.f46235c0.setValueAnimated((int) mVar.f46244l0.getMinimumBid());
                return;
        }
    }
}
