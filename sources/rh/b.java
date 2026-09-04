package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class b extends View {
    public final le.b f45600a;
    public final Drawable f45601b;
    public final Drawable f45602c;

    public b(Context context) {
        super(context);
        this.f45600a = new le.b(this, pr.h, 320L);
        this.f45601b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f45602c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f45600a.f15368e;
        yf.p.b(canvas, this.f45601b, 1.0f - f7);
        yf.p.b(canvas, this.f45602c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        yf.p.d(this.f45601b, f7, f10, 17);
        yf.p.d(this.f45602c, f7, f10, 17);
    }
}
