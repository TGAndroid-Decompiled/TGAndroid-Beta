package pf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.x8;

public final class g extends x8 {
    public int A;
    public final k B;
    public int v;

    public float f45800w;

    public long f45801x;

    public int f45802y;

    public g(k kVar, Context context) {
        super(context);
        this.B = kVar;
    }

    @Override
    public final void a() {
        k kVar = this.B;
        Drawable drawable = kVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = kVar.K;
            int i10 = this.f45802y;
            drawable2.setBounds(i10, this.A, bounds.width() + i10, bounds.height() + this.A);
        }
    }

    @Override
    public final void b() {
        k kVar = this.B;
        Drawable drawable = kVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int iDp = (int) (this.f45800w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f45802y = i10;
            int i11 = bounds.top;
            this.A = i11;
            kVar.K.setBounds(i10 + iDp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f45802y + iDp, bounds.height() + AndroidUtilities.dp(1.0f) + this.A);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f45801x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f45801x = jElapsedRealtime;
            if (this.v == 0) {
                float f10 = (j10 / 664.0f) + this.f45800w;
                this.f45800w = f10;
                if (f10 >= 1.0f) {
                    this.v = 1;
                    this.f45800w = 1.0f;
                }
            } else {
                float f11 = this.f45800w - (j10 / 664.0f);
                this.f45800w = f11;
                if (f11 <= 0.0f) {
                    this.v = 0;
                    this.f45800w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
