package sh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class e {
    public final ImageReceiver f48666a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f48666a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f48666a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
