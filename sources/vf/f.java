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
    public Bitmap f45681a;
    public Canvas f45682b;
    public final RectF f45683c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f45684f;
    public boolean f45685g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f45684f = 0;
        this.f45685g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f45684f || this.f45685g) {
            this.f45685g = false;
            this.f45684f = i12;
            this.f45681a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f45682b = new Canvas(this.f45681a);
            RectF rectF = this.f45683c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f45682b.drawColor(j6.v0(j6.f19906d6, this.e));
            this.f45682b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f45681a;
    }
}
