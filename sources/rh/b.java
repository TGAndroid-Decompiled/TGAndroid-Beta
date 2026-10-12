package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es;
public final class b extends View {
    public final ne.b f44649a;
    public final Drawable f44650b;
    public final Drawable f44651c;

    public b(Context context) {
        super(context);
        this.f44649a = new ne.b(this, es.h, 320L);
        this.f44650b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f44651c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f44649a.e;
        zf.q.b(canvas, this.f44650b, 1.0f - f7);
        zf.q.b(canvas, this.f44651c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        zf.q.d(this.f44650b, f7, f10, 17);
        zf.q.d(this.f44651c, f7, f10, 17);
    }
}
