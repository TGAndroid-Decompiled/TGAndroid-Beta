package wf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class f {
    public Bitmap f49554a;
    public Canvas f49555b;
    public final RectF f49556c = new RectF();
    public final Paint d;
    public final g6 f49557e;
    public int f49558f;
    public boolean f49559g;

    public f(g6 g6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f49558f = 0;
        this.f49559g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f49557e = g6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f49558f || this.f49559g) {
            this.f49559g = false;
            this.f49558f = i12;
            this.f49554a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f49555b = new Canvas(this.f49554a);
            RectF rectF = this.f49556c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f49555b.drawColor(k6.v0(k6.f21661d6, this.f49557e));
            this.f49555b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f49554a;
    }
}
