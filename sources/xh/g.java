package xh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f46256a;
    public final m f46257b;

    public g(m mVar, int i10) {
        this.f46256a = i10;
        this.f46257b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46256a) {
            case 0:
                this.f46257b.dismiss();
                return;
            case 1:
                m.Q(this.f46257b);
                return;
            default:
                m mVar = this.f46257b;
                mVar.f46370c0.setValueAnimated((int) mVar.f46379l0.getMinimumBid());
                return;
        }
    }
}
