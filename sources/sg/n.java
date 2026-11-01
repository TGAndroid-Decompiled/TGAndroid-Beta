package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.o5;
public final class n extends o5 {
    public final Bitmap f48430a;

    public n(o oVar) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), Bitmap.Config.ARGB_8888);
        this.f48430a = createBitmap;
        Drawable mutate = oVar.getParentActivity().getResources().getDrawable(2131232749).mutate();
        mutate.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.save();
        canvas.translate(f7, ((i12 + i14) / 2.0f) - org.telegram.messenger.i0.L(12.0f));
        float f10 = this.extraScale;
        canvas.scale(f10, f10, f7 + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        canvas.drawBitmap(this.f48430a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(5.0f) + super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
