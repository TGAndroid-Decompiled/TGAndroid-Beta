package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
public final class e0 extends TextView {
    public int f48900a;
    public final li.k f48901b;

    public e0(Context context) {
        super(context);
        this.f48900a = -1;
        this.f48901b = new li.k(23);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48900a < 0) {
            int i10 = 0;
            if (getLayout() != null) {
                i10 = (int) getLayout().getLineWidth(0);
            }
            this.f48900a = i10;
        }
        if (this.f48900a > org.telegram.messenger.i0.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getWidth() - org.telegram.messenger.i0.L(15.0f), 0.0f, getWidth(), getHeight());
            this.f48901b.o(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), Integer.MIN_VALUE), i11);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f48900a = -1;
    }
}
