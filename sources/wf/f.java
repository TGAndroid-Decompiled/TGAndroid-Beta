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
    public Bitmap f49517a;
    public Canvas f49518b;
    public final RectF f49519c = new RectF();
    public final Paint d;
    public final g6 f49520e;
    public int f49521f;
    public boolean f49522g;

    public f(g6 g6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f49521f = 0;
        this.f49522g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f49520e = g6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f49521f || this.f49522g) {
            this.f49522g = false;
            this.f49521f = i12;
            this.f49517a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f49518b = new Canvas(this.f49517a);
            RectF rectF = this.f49519c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f49518b.drawColor(k6.v0(k6.f21659d6, this.f49520e));
            this.f49518b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f49517a;
    }
}
