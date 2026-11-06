package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;
public final class j1 extends pj0 implements ls {
    public final Path f55704e3;
    public q0.a f55705f3;

    public j1(Context context) {
        super(context, null);
        this.f55704e3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new v4.b0());
        setAdapter(new v4.g0());
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i7) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.C5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f55705f3;
        if (aVar != null) {
            Path path = this.f55704e3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f55705f3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.C5);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.camera.q.B(16.0f, org.telegram.messenger.g0.L(48.0f) * Math.min(sg.b0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f55705f3 = aVar;
        invalidate();
    }
}
