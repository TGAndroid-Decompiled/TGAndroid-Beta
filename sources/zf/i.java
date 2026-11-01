package zf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.b9;
public final class i extends b9 {
    public long D;
    public int E;
    public int F;
    public final m G;
    public int f55546x;
    public float f55547y;

    public i(m mVar, Context context) {
        super(context);
        this.G = mVar;
    }

    @Override
    public final void a() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.O;
            int i10 = this.E;
            drawable2.setBounds(i10, this.F, bounds.width() + i10, bounds.height() + this.F);
        }
    }

    @Override
    public final void b() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.f55547y * org.telegram.messenger.i0.L(3.0f));
            int i10 = bounds.left;
            this.E = i10;
            int i11 = bounds.top;
            this.F = i11;
            mVar.O.setBounds(i10 + L, org.telegram.messenger.i0.L(1.0f) + i11, bounds.width() + this.E + L, bounds.height() + org.telegram.messenger.i0.L(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.D;
            if (j10 > 17) {
                j10 = 17;
            }
            this.D = elapsedRealtime;
            if (this.f55546x == 0) {
                float f7 = (((float) j10) / 664.0f) + this.f55547y;
                this.f55547y = f7;
                if (f7 >= 1.0f) {
                    this.f55546x = 1;
                    this.f55547y = 1.0f;
                }
            } else {
                float f10 = this.f55547y - (((float) j10) / 664.0f);
                this.f55547y = f10;
                if (f10 <= 0.0f) {
                    this.f55546x = 0;
                    this.f55547y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
