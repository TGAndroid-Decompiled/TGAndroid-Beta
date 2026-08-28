package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.wk0;
public final class t1 extends wk0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path T2;
    public q0.a U2;

    public t1(Context context) {
        super(context, null);
        this.T2 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new f2.m0());
        setAdapter(new f2.r0());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer W0(int i9) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.customTypefacesLoaded) {
            getAdapter().l();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.U2;
        if (aVar != null) {
            Path path = this.T2;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.U2 != null) {
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, ll.C(16.0f, AndroidUtilities.dp(48.0f) * Math.min(xf.i0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.U2 = aVar;
        invalidate();
    }
}
