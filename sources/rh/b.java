package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
public final class b extends View {
    public final ne.b f45731a;
    public final Drawable f45732b;
    public final Drawable f45733c;

    public b(Context context) {
        super(context);
        this.f45731a = new ne.b(this, bs.h, 320L);
        this.f45732b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f45733c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f45731a.e;
        zf.p.b(canvas, this.f45732b, 1.0f - f7);
        zf.p.b(canvas, this.f45733c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        zf.p.d(this.f45732b, f7, f10, 17);
        zf.p.d(this.f45733c, f7, f10, 17);
    }
}
