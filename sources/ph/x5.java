package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class x5 extends CameraView {
    public final Path f42558a;
    public final y5 f42559b;

    public x5(y5 y5Var, Context context) {
        super(context, true, false);
        this.f42559b = y5Var;
        this.f42558a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42558a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((n) this.f42559b).C.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
