package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.uj0;
public final class j1 extends uj0 implements is {
    public final Path f57398f3;
    public q0.a f57399g3;

    public j1(Context context) {
        super(context, null);
        this.f57398f3 = new Path();
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
        if (i7 == ns.C5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f57399g3;
        if (aVar != null) {
            Path path = this.f57398f3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f57399g3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.e().c(this, ns.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.C5);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i20.B(16.0f, org.telegram.messenger.g0.L(48.0f) * Math.min(sg.a0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f57399g3 = aVar;
        invalidate();
    }
}
