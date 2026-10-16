package rh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class e {
    public final ImageReceiver f44424a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f44424a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f44424a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
