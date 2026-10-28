package sh;

import ag.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
public final class b extends View {
    public final oe.b f48650a;
    public final Drawable f48651b;
    public final Drawable f48652c;

    public b(Context context) {
        super(context);
        this.f48650a = new oe.b(this, ds.h, 320L);
        this.f48651b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f48652c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f48650a.e;
        v.b(canvas, this.f48651b, 1.0f - f7);
        v.b(canvas, this.f48652c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        v.d(this.f48651b, f7, f10, 17);
        v.d(this.f48652c, f7, f10, 17);
    }
}
