package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.dc;
public final class h extends ImageView {
    public final float f51221a;
    public final dc f51222b;

    public h(Context context) {
        super(context);
        this.f51222b = new dc(this);
        this.f51221a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f51222b.a(this.f51221a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f51222b.c(z10);
    }
}
