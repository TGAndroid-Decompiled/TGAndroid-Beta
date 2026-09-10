package zh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hj0;
public final class w7 extends v7 {
    public final a7 f49022a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f49023b;
    public final yg.g0 f49024c;
    public final z7 d;

    public w7(z7 z7Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = z7Var;
        a7 a7Var = new a7(null);
        this.f49022a = a7Var;
        yg.g0 g0Var = new yg.g0(null);
        this.f49024c = g0Var;
        this.f49023b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            a7Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            a7Var.a();
        }
        g0Var.f47008i = true;
        g0Var.e(yg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        yg.g0 g0Var = this.f49024c;
        org.telegram.ui.Components.p5 p5Var = g0Var.f47004b;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        } else {
            imageReceiver = g0Var.f47003a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            z7 z7Var = this.d;
            double d = z7Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f49023b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f17432x * d) / 100.0d) + z7Var.f49161b);
            double d10 = z7Var.f49162c;
            double d11 = z7Var.e;
            float f11 = (float) (((mediaAreaCoordinates.f17433y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f17431w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            a7 a7Var = this.f49022a;
            a7Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            a7Var.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (a7Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (a7Var.getBounds().centerX() - height), (int) (a7Var.getBounds().centerY() - height), (int) (a7Var.getBounds().centerX() + height), (int) (a7Var.getBounds().centerY() + height));
            a7Var.c(1.0f);
            a7Var.draw(canvas);
            g0Var.c(rect);
            g0Var.h = f7;
            if (a7Var.f48274a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            g0Var.d(i10);
            g0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f49024c.b(z10);
    }

    @Override
    public final void c(View view) {
        yg.g0 g0Var = this.f49024c;
        if (g0Var.f47006f == view) {
            return;
        }
        if (g0Var.f47007g) {
            g0Var.b(false);
            g0Var.f47006f = view;
            g0Var.b(true);
            return;
        }
        g0Var.f47006f = view;
    }
}
