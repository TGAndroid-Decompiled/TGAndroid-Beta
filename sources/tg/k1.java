package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.ek0;
public final class k1 extends ek0 implements gs {
    public final Path f57999f3;
    public q0.a f58000g3;

    public k1(Context context) {
        super(context, null);
        this.f57999f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new v4.b0());
        setAdapter(new v4.h0());
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i7) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.F5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f58000g3;
        if (aVar != null) {
            Path path = this.f57999f3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f58000g3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.e().c(this, ls.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.F5);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, o10.C(16.0f, org.telegram.messenger.g0.L(48.0f) * Math.min(sg.a0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f58000g3 = aVar;
        invalidate();
    }
}
