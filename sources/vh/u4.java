package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class u4 extends CameraView {
    public final Path f52013a;
    public final v4 f52014b;

    public u4(v4 v4Var, Context context) {
        super(context, true, false);
        this.f52014b = v4Var;
        this.f52013a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f52013a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((n) this.f52014b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
