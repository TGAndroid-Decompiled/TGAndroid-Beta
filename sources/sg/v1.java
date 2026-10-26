package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.mm0;
public final class v1 extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path f48534f3;
    public q0.a f48535g3;

    public v1(Context context) {
        super(context, null);
        this.f48534f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.c0());
        setAdapter(new s4.h0());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer W0(int i10) {
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
        q0.a aVar = this.f48535g3;
        if (aVar != null) {
            Path path = this.f48534f3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f48535g3 != null) {
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
        super.onMeasure(i10, vh.D(16.0f, AndroidUtilities.dp(48.0f) * Math.min(rg.j0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f48535g3 = aVar;
        invalidate();
    }
}
