package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class u5 extends CameraView {
    public final Path f46169a;
    public final v5 f46170b;

    public u5(v5 v5Var, Context context) {
        super(context, true, false);
        this.f46170b = v5Var;
        this.f46169a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f46169a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((n) this.f46170b).C.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
