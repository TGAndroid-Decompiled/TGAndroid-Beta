package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class w5 extends CameraView {
    public final Path f42540a;
    public final x5 f42541b;

    public w5(x5 x5Var, Context context) {
        super(context, true, false);
        this.f42541b = x5Var;
        this.f42540a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42540a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((n) this.f42541b).C.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
