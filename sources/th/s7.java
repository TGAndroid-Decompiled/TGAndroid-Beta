package th;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class s7 extends p7 {
    public final r7 f49448a;
    public final TL_stories.TL_mediaAreaWeather f49449b;
    public View f49450c;
    public final t7 d;

    public s7(t7 t7Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = t7Var;
        this.f49449b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f51440c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        r7 r7Var = new r7(this, org.telegram.messenger.w0.f19025b, org.telegram.messenger.i0.f16025p);
        this.f49448a = r7Var;
        r7Var.setMaxWidth(org.telegram.messenger.i0.f16026q.x);
        r7Var.setIsVideo(false);
        r7Var.d(d20.f15147s0, tLObject.f51440c);
        r7Var.setText(tLObject.a());
        r7Var.e(3, tL_mediaAreaWeather.color);
        r7Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        t7 t7Var = this.d;
        double d = t7Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f49449b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20028x * d) / 100.0d;
        double d11 = t7Var.e;
        double d12 = (mediaAreaCoordinates.f20029y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20027w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + t7Var.f49498b), (float) (d12 + t7Var.f49499c));
        r7 r7Var = this.f49448a;
        float min = Math.min(f10 / ((r7Var.getWidthInternal() - r7Var.getPaddingLeft()) - r7Var.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((r7Var.getHeightInternal() - r7Var.getPaddingTop()) - r7Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - r7Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - r7Var.getPaddingTop());
        r7Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        r7 r7Var = this.f49448a;
        if (z10) {
            r7Var.K = true;
            if (r7Var.L) {
                r7Var.f10367s.P();
                return;
            } else {
                r7Var.f10366r.P();
                return;
            }
        }
        r7Var.K = false;
        r7Var.f10366r.R();
        r7Var.f10367s.R();
    }

    @Override
    public final void c(View view) {
        this.f49450c = view;
    }
}
