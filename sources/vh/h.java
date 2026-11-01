package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.dc;
public final class h extends ImageView {
    public final float f51236a;
    public final dc f51237b;

    public h(Context context) {
        super(context);
        this.f51237b = new dc(this);
        this.f51236a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f51237b.a(this.f51236a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f51237b.c(z10);
    }
}
