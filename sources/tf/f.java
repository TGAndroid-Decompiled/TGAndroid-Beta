package tf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class f {
    public Bitmap f48228a;
    public Canvas f48229b;
    public final RectF f48230c = new RectF();
    public final Paint d;
    public final c6 f48231e;
    public int f48232f;
    public boolean f48233g;

    public f(c6 c6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f48232f = 0;
        this.f48233g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f48231e = c6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f48232f || this.f48233g) {
            this.f48233g = false;
            this.f48232f = i12;
            this.f48228a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f48229b = new Canvas(this.f48228a);
            RectF rectF = this.f48230c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f48229b.drawColor(g6.v0(g6.f23062d6, this.f48231e));
            this.f48229b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f48228a;
    }
}
