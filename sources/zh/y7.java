package zh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class y7 extends v7 {
    public final x7 f49125a;
    public final TL_stories.TL_mediaAreaWeather f49126b;
    public View f49127c;
    public final z7 d;

    public y7(z7 z7Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = z7Var;
        this.f49126b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f2573c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        x7 x7Var = new x7(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f49125a = x7Var;
        x7Var.setMaxWidth(AndroidUtilities.displaySize.x);
        x7Var.setIsVideo(false);
        x7Var.d(UserConfig.selectedAccount, tLObject.f2573c);
        x7Var.setText(tLObject.a());
        x7Var.e(3, tL_mediaAreaWeather.color);
        x7Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        z7 z7Var = this.d;
        double d = z7Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f49126b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f17432x * d) / 100.0d;
        double d11 = z7Var.e;
        double d12 = (mediaAreaCoordinates.f17433y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f17431w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + z7Var.f49161b), (float) (d12 + z7Var.f49162c));
        x7 x7Var = this.f49125a;
        float min = Math.min(f10 / ((x7Var.getWidthInternal() - x7Var.getPaddingLeft()) - x7Var.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((x7Var.getHeightInternal() - x7Var.getPaddingTop()) - x7Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - x7Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - x7Var.getPaddingTop());
        x7Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        x7 x7Var = this.f49125a;
        if (z10) {
            x7Var.K = true;
            if (x7Var.L) {
                x7Var.f40288s.onAttachedToWindow();
                return;
            } else {
                x7Var.f40287r.onAttachedToWindow();
                return;
            }
        }
        x7Var.K = false;
        x7Var.f40287r.onDetachedFromWindow();
        x7Var.f40288s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f49127c = view;
    }
}
