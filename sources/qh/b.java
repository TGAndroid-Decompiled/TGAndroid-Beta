package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tr;
public final class b extends View {
    public final le.b f45441a;
    public final Drawable f45442b;
    public final Drawable f45443c;

    public b(Context context) {
        super(context);
        this.f45441a = new le.b(this, tr.h, 320L);
        this.f45442b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f45443c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f45441a.f15434e;
        yf.p.b(canvas, this.f45442b, 1.0f - f7);
        yf.p.b(canvas, this.f45443c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        yf.p.d(this.f45442b, f7, f10, 17);
        yf.p.d(this.f45443c, f7, f10, 17);
    }
}
