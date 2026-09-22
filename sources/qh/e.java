package qh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class e {
    public final ImageReceiver f42085a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f42085a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f42085a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
