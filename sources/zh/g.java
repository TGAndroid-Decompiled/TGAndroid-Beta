package zh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f52976a;
    public final m f52977b;

    public g(m mVar, int i10) {
        this.f52976a = i10;
        this.f52977b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52976a) {
            case 0:
                this.f52977b.dismiss();
                return;
            case 1:
                m.Q(this.f52977b);
                return;
            default:
                m mVar = this.f52977b;
                mVar.f53114c0.setValueAnimated((int) mVar.f53123l0.getMinimumBid());
                return;
        }
    }
}
