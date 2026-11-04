package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.tj0;
public final class i1 extends tj0 implements cs {
    public final Path f56063f3;
    public q0.a f56064g3;

    public i1(Context context) {
        super(context, null);
        this.f56063f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new u4.b0());
        setAdapter(new u4.h0());
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i3) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.C5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f56064g3;
        if (aVar != null) {
            Path path = this.f56063f3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f56064g3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.C5);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, org.telegram.messenger.camera.q.B(16.0f, org.telegram.messenger.g0.L(48.0f) * Math.min(tg.b0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f56064g3 = aVar;
        invalidate();
    }
}
