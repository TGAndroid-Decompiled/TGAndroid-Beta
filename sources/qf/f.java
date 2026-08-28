package qf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class f {
    public Bitmap f46169a;
    public Canvas f46170b;
    public final RectF f46171c = new RectF();
    public final Paint d;
    public final b6 f46172e;
    public int f46173f;
    public boolean f46174g;

    public f(b6 b6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46173f = 0;
        this.f46174g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f46172e = b6Var;
    }

    public final Bitmap a(int i9, int i10) {
        int i11 = (i9 + i10) << 10;
        if (i11 != this.f46173f || this.f46174g) {
            this.f46174g = false;
            this.f46173f = i11;
            this.f46169a = Bitmap.createBitmap(i10, i9, Bitmap.Config.ARGB_8888);
            this.f46170b = new Canvas(this.f46169a);
            RectF rectF = this.f46171c;
            rectF.set(0.0f, 0.0f, i10, i9);
            this.f46170b.drawColor(f6.v0(f6.f23001d6, this.f46172e));
            this.f46170b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f46169a;
    }
}
