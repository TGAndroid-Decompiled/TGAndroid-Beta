package sh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class d {
    public final ImageReceiver f55305a = new ImageReceiver(null);

    public void a(View view) {
        ImageReceiver imageReceiver = this.f55305a;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    public void b() {
        this.f55305a.R();
    }

    public abstract void c(Canvas canvas, int i7, int i10);
}
