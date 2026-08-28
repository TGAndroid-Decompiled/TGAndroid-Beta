package ze;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class f {
    public final Picture f50452a;
    public final RenderNode f50453b;

    public f(int i9, int i10, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.f50452a = picture;
        callback.run(picture.beginRecording(i9, i10));
        picture.endRecording();
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
            this.f50453b = renderNode;
            renderNode.setPosition(0, 0, i9, i10);
            renderNode.beginRecording().drawPicture(picture);
            renderNode.endRecording();
            return;
        }
        this.f50453b = null;
    }

    public final void a(Canvas canvas, float f10) {
        boolean z10;
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.f50453b;
            if (renderNode != null) {
                renderNode.setAlpha(f10);
                canvas.drawRenderNode(this.f50453b);
                return;
            }
            return;
        }
        Picture picture = this.f50452a;
        if (picture != null && f10 > 0.001f) {
            if (f10 < 0.999f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f10 * 255.0f), 31);
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
            this.f50453b.discardDisplayList();
        }
    }
}
