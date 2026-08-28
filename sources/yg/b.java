package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import ff.s;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class b extends View {
    public final td.a f50205a;
    public final Drawable f50206b;
    public final Drawable f50207c;

    public b(Context context) {
        super(context);
        this.f50205a = new td.a(this, gr.h, 320L);
        this.f50206b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f50207c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f50205a.f47775e;
        s.b(canvas, this.f50206b, 1.0f - f10);
        s.b(canvas, this.f50207c, f10);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float f10 = i9 / 2.0f;
        float f11 = i10 / 2.0f;
        s.d(this.f50206b, f10, f11, 17);
        s.d(this.f50207c, f10, f11, 17);
    }
}
