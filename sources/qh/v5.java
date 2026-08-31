package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class v5 extends CameraView {
    public final Path f46193a;
    public final w5 f46194b;

    public v5(w5 w5Var, Context context) {
        super(context, true, false);
        this.f46194b = w5Var;
        this.f46193a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f46193a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((n) this.f46194b).C.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
