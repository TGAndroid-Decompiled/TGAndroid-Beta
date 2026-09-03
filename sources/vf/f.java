package vf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class f {
    public Bitmap f45759a;
    public Canvas f45760b;
    public final RectF f45761c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f45762f;
    public boolean f45763g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f45762f = 0;
        this.f45763g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f45762f || this.f45763g) {
            this.f45763g = false;
            this.f45762f = i12;
            this.f45759a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f45760b = new Canvas(this.f45759a);
            RectF rectF = this.f45761c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f45760b.drawColor(j6.v0(j6.f19881d6, this.e));
            this.f45760b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f45759a;
    }
}
