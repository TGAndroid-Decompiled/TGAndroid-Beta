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
    public Bitmap f49518a;
    public Canvas f49519b;
    public final RectF f49520c = new RectF();
    public final Paint d;
    public final g6 f49521e;
    public int f49522f;
    public boolean f49523g;

    public f(g6 g6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f49522f = 0;
        this.f49523g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f49521e = g6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f49522f || this.f49523g) {
            this.f49523g = false;
            this.f49522f = i12;
            this.f49518a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f49519b = new Canvas(this.f49518a);
            RectF rectF = this.f49520c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f49519b.drawColor(k6.v0(k6.f21659d6, this.f49521e));
            this.f49519b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f49518a;
    }
}
