package sh;

import ag.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
public final class b extends View {
    public final oe.b f48615a;
    public final Drawable f48616b;
    public final Drawable f48617c;

    public b(Context context) {
        super(context);
        this.f48615a = new oe.b(this, ds.h, 320L);
        this.f48616b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f48617c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f48615a.e;
        v.b(canvas, this.f48616b, 1.0f - f7);
        v.b(canvas, this.f48617c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        v.d(this.f48616b, f7, f10, 17);
        v.d(this.f48617c, f7, f10, 17);
    }
}
