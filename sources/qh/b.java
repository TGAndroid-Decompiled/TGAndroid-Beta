package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sr;
public final class b extends View {
    public final le.c f42033a;
    public final Drawable f42034b;
    public final Drawable f42035c;

    public b(Context context) {
        super(context);
        this.f42033a = new le.c(this, sr.h, 320L);
        this.f42034b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f42035c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f42033a.e;
        yf.p.b(canvas, this.f42034b, 1.0f - f7);
        yf.p.b(canvas, this.f42035c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        yf.p.d(this.f42034b, f7, f10, 17);
        yf.p.d(this.f42035c, f7, f10, 17);
    }
}
