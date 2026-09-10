package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;
public final class b extends View {
    public final le.b f40392a;
    public final Drawable f40393b;
    public final Drawable f40394c;

    public b(Context context) {
        super(context);
        this.f40392a = new le.b(this, wr.h, 320L);
        this.f40393b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f40394c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.f40392a.e;
        xf.p.b(canvas, this.f40393b, 1.0f - f7);
        xf.p.b(canvas, this.f40394c, f7);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        xf.p.d(this.f40393b, f7, f10, 17);
        xf.p.d(this.f40394c, f7, f10, 17);
    }
}
