package rh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class e {
    public final ImageReceiver f45773a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f45773a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f45773a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
