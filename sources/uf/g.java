package uf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a9;
public final class g extends a9 {
    public int B;
    public final k C;
    public int v;
    public float f48567w;
    public long f48568x;
    public int f48569y;

    public g(k kVar, Context context) {
        super(context);
        this.C = kVar;
    }

    @Override
    public final void a() {
        k kVar = this.C;
        Drawable drawable = kVar.L;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = kVar.L;
            int i10 = this.f48569y;
            drawable2.setBounds(i10, this.B, bounds.width() + i10, bounds.height() + this.B);
        }
    }

    @Override
    public final void b() {
        k kVar = this.C;
        Drawable drawable = kVar.L;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f48567w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f48569y = i10;
            int i11 = bounds.top;
            this.B = i11;
            kVar.L.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f48569y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.B);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f48568x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f48568x = elapsedRealtime;
            if (this.v == 0) {
                float f10 = (((float) j10) / 664.0f) + this.f48567w;
                this.f48567w = f10;
                if (f10 >= 1.0f) {
                    this.v = 1;
                    this.f48567w = 1.0f;
                }
            } else {
                float f11 = this.f48567w - (((float) j10) / 664.0f);
                this.f48567w = f11;
                if (f11 <= 0.0f) {
                    this.v = 0;
                    this.f48567w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
