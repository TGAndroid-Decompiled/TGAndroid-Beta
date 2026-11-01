package th;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class s7 extends p7 {
    public final r7 f49462a;
    public final TL_stories.TL_mediaAreaWeather f49463b;
    public View f49464c;
    public final t7 d;

    public s7(t7 t7Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = t7Var;
        this.f49463b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f51455c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        r7 r7Var = new r7(this, org.telegram.messenger.w0.f18945b, org.telegram.messenger.i0.f16171p);
        this.f49462a = r7Var;
        r7Var.setMaxWidth(org.telegram.messenger.i0.f16172q.x);
        r7Var.setIsVideo(false);
        r7Var.d(e20.f15506s0, tLObject.f51455c);
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
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f49463b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20029x * d) / 100.0d;
        double d11 = t7Var.e;
        double d12 = (mediaAreaCoordinates.f20030y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20028w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + t7Var.f49512b), (float) (d12 + t7Var.f49513c));
        r7 r7Var = this.f49462a;
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
        r7 r7Var = this.f49462a;
        if (z10) {
            r7Var.K = true;
            if (r7Var.L) {
                r7Var.f10368s.P();
                return;
            } else {
                r7Var.f10367r.P();
                return;
            }
        }
        r7Var.K = false;
        r7Var.f10367r.R();
        r7Var.f10368s.R();
    }

    @Override
    public final void c(View view) {
        this.f49464c = view;
    }
}
