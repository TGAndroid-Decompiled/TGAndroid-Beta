package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.em;
import org.telegram.ui.Components.vl0;
public final class t1 extends vl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path X2;
    public q0.a Y2;

    public t1(Context context) {
        super(context, null);
        this.X2 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.c0());
        setAdapter(new s4.h0());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i10) {
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
        q0.a aVar = this.Y2;
        if (aVar != null) {
            Path path = this.X2;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.Y2 != null) {
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
        super.onMeasure(i10, em.C(16.0f, AndroidUtilities.dp(48.0f) * Math.min(og.m0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.Y2 = aVar;
        invalidate();
    }
}
