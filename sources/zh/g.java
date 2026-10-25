package zh;

import android.view.View;
public final class g implements View.OnClickListener {
    public final int f52973a;
    public final m f52974b;

    public g(m mVar, int i10) {
        this.f52973a = i10;
        this.f52974b = mVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52973a) {
            case 0:
                this.f52974b.dismiss();
                return;
            case 1:
                m.Q(this.f52974b);
                return;
            default:
                m mVar = this.f52974b;
                mVar.f53111c0.setValueAnimated((int) mVar.f53120l0.getMinimumBid());
                return;
        }
    }
}
