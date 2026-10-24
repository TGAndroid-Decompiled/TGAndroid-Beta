package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.lm0;
public final class u1 extends lm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path Y2;
    public q0.a Z2;

    public u1(Context context) {
        super(context, null);
        this.Y2 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.b0());
        setAdapter(new s4.g0());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer X0(int i10) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.customTypefacesLoaded) {
            getAdapter().l();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.Z2;
        if (aVar != null) {
            Path path = this.Y2;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.Z2 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, tl.C(16.0f, AndroidUtilities.dp(48.0f) * Math.min(qg.l0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.Z2 = aVar;
        invalidate();
    }
}
