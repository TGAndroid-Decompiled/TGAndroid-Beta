package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class y7 extends View {
    public final boolean f52210a;
    public final Canvas f52211b;
    public final float f52212c;
    public final float d;
    public final float e;
    public final Paint f52213f;
    public final Bitmap h;
    public final Paint f52214n;
    public final float f52215r;
    public final float f52216s;
    public final o8 f52217w;

    public y7(o8 o8Var, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13) {
        super(context);
        this.f52217w = o8Var;
        this.f52210a = z10;
        this.f52211b = canvas;
        this.f52212c = f7;
        this.d = f10;
        this.e = f11;
        this.f52213f = paint;
        this.h = bitmap;
        this.f52214n = paint2;
        this.f52215r = f12;
        this.f52216s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f52210a;
        Paint paint = this.f52214n;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f52212c;
        o8 o8Var = this.f52217w;
        if (z10) {
            float f12 = o8Var.D2;
            if (f12 > 0.0f) {
                this.f52211b.drawCircle(f11, f10, f7 * f12, this.f52213f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f11, f10, (1.0f - o8Var.D2) * f7, paint);
        }
        canvas.save();
        canvas.translate(this.f52215r, this.f52216s);
        o8Var.f51632i1.draw(canvas);
        canvas.restore();
    }
}
