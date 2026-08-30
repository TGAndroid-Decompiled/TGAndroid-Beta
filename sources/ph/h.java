package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.rc;
public final class h extends ImageView {
    public final float f41701a;
    public final rc f41702b;

    public h(Context context) {
        super(context);
        this.f41702b = new rc(this);
        this.f41701a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f41702b.a(this.f41701a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f41702b.c(z4);
    }
}
