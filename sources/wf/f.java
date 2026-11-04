package wf;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.u10;
public final class f {
    public final Picture f57583a;
    public final RenderNode f57584b;

    public f(int i3, int i10, u10 u10Var) {
        Picture picture = new Picture();
        this.f57583a = picture;
        u10Var.a(picture.beginRecording(i3, i10));
        picture.endRecording();
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
            this.f57584b = renderNode;
            renderNode.setPosition(0, 0, i3, i10);
            renderNode.beginRecording().drawPicture(picture);
            renderNode.endRecording();
            return;
        }
        this.f57584b = null;
    }

    public final void a(Canvas canvas, float f10) {
        boolean z10;
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.f57584b;
            if (renderNode != null) {
                renderNode.setAlpha(f10);
                canvas.drawRenderNode(this.f57584b);
                return;
            }
            return;
        }
        Picture picture = this.f57583a;
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
            this.f57584b.discardDisplayList();
        }
    }
}
