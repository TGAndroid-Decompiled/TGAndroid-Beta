package rf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.y8;
public final class h extends y8 {
    public int A;
    public final l B;
    public int v;
    public float f47241w;
    public long f47242x;
    public int f47243y;

    public h(l lVar, Context context) {
        super(context);
        this.B = lVar;
    }

    @Override
    public final void a() {
        l lVar = this.B;
        Drawable drawable = lVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = lVar.K;
            int i10 = this.f47243y;
            drawable2.setBounds(i10, this.A, bounds.width() + i10, bounds.height() + this.A);
        }
    }

    @Override
    public final void b() {
        l lVar = this.B;
        Drawable drawable = lVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f47241w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f47243y = i10;
            int i11 = bounds.top;
            this.A = i11;
            lVar.K.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f47243y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.A);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f47242x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f47242x = elapsedRealtime;
            if (this.v == 0) {
                float f9 = (((float) j10) / 664.0f) + this.f47241w;
                this.f47241w = f9;
                if (f9 >= 1.0f) {
                    this.v = 1;
                    this.f47241w = 1.0f;
                }
            } else {
                float f10 = this.f47241w - (((float) j10) / 664.0f);
                this.f47241w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.f47241w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
