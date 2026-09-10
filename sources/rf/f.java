package rf;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class f {
    public final Picture f41451a;
    public final RenderNode f41452b;

    public f(int i10, int i11, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.f41451a = picture;
        callback.run(picture.beginRecording(i10, i11));
        picture.endRecording();
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
            this.f41452b = renderNode;
            renderNode.setPosition(0, 0, i10, i11);
            renderNode.beginRecording().drawPicture(picture);
            renderNode.endRecording();
            return;
        }
        this.f41452b = null;
    }

    public final void a(Canvas canvas, float f7) {
        boolean z10;
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.f41452b;
            if (renderNode != null) {
                renderNode.setAlpha(f7);
                canvas.drawRenderNode(this.f41452b);
                return;
            }
            return;
        }
        Picture picture = this.f41451a;
        if (picture != null && f7 > 0.001f) {
            if (f7 < 0.999f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f7 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawPicture(picture);
            if (z10) {
                canvas2.restore();
            }
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f41452b.discardDisplayList();
        }
    }
}
