package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zr;
public final class b extends View {
    public final ne.b f46163a;
    public final Drawable f46164b;
    public final Drawable f46165c;

    public b(Context context) {
        super(context);
        this.f46163a = new ne.b(this, zr.h, 320L);
        this.f46164b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f46165c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f46163a.e;
        zf.p.b(canvas, this.f46164b, 1.0f - f7);
        zf.p.b(canvas, this.f46165c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        zf.p.d(this.f46164b, f7, f10, 17);
        zf.p.d(this.f46165c, f7, f10, 17);
    }
}
