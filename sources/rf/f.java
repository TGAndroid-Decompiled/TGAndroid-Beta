package rf;

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

    public Bitmap f46928a;

    public Canvas f46929b;

    public final RectF f46930c = new RectF();
    public final Paint d;

    public final c6 f46931e;

    public int f46932f;

    public boolean f46933g;

    public f(c6 c6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46932f = 0;
        this.f46933g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f46931e = c6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f46932f || this.f46933g) {
            this.f46933g = false;
            this.f46932f = i12;
            this.f46928a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f46929b = new Canvas(this.f46928a);
            RectF rectF = this.f46930c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f46929b.drawColor(g6.v0(g6.f23053d6, this.f46931e));
            this.f46929b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f46928a;
    }
}
