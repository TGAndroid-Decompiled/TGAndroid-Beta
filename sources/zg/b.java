package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

public final class b extends View {

    public final ud.a f50801a;

    public final Drawable f50802b;

    public final Drawable f50803c;

    public b(Context context) {
        super(context);
        this.f50801a = new ud.a(this, er.h, 320L);
        this.f50802b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f50803c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f50801a.f48497e;
        gf.s.b(canvas, this.f50802b, 1.0f - f10);
        gf.s.b(canvas, this.f50803c, f10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        float f11 = i11 / 2.0f;
        gf.s.d(this.f50802b, f10, f11, 17);
        gf.s.d(this.f50803c, f10, f11, 17);
    }
}
