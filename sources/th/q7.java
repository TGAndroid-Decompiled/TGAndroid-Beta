package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ci0;
public final class q7 extends p7 {
    public final u6 f49415a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f49416b;
    public final sg.f0 f49417c;
    public final t7 d;

    public q7(t7 t7Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = t7Var;
        u6 u6Var = new u6(null);
        this.f49415a = u6Var;
        sg.f0 f0Var = new sg.f0(null);
        this.f49417c = f0Var;
        this.f49416b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            u6Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            u6Var.a();
        }
        f0Var.f48343i = true;
        f0Var.e(sg.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        sg.f0 f0Var = this.f49417c;
        org.telegram.ui.Components.f5 f5Var = f0Var.f48339b;
        if (f5Var != null) {
            imageReceiver = f5Var.f26070k;
        } else {
            imageReceiver = f0Var.f48338a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ci0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            t7 t7Var = this.d;
            double d = t7Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f49416b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20029x * d) / 100.0d) + t7Var.f49512b);
            double d10 = t7Var.f49513c;
            double d11 = t7Var.e;
            float f11 = (float) (((mediaAreaCoordinates.f20030y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20028w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            u6 u6Var = this.f49415a;
            u6Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            u6Var.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = org.telegram.messenger.i0.Q;
            float height = (u6Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (u6Var.getBounds().centerX() - height), (int) (u6Var.getBounds().centerY() - height), (int) (u6Var.getBounds().centerX() + height), (int) (u6Var.getBounds().centerY() + height));
            u6Var.c(1.0f);
            u6Var.draw(canvas);
            f0Var.c(rect);
            f0Var.h = f7;
            if (u6Var.f49537a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            f0Var.d(i10);
            f0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f49417c.b(z10);
    }

    @Override
    public final void c(View view) {
        sg.f0 f0Var = this.f49417c;
        if (f0Var.f48341f == view) {
            return;
        }
        if (f0Var.f48342g) {
            f0Var.b(false);
            f0Var.f48341f = view;
            f0Var.b(true);
            return;
        }
        f0Var.f48341f = view;
    }
}
