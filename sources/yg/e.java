package yg;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class e {
    public final ImageReceiver f50222a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f50222a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f50222a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i9, int i10);
}
