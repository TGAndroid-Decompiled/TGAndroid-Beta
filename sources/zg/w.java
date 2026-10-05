package zg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class w extends ViewOutlineProvider {
    public final Rect f53536a = new Rect();
    public final RectF f53537b = new RectF();
    public final RectF f53538c = new RectF();
    public final z d;

    public w(z zVar) {
        this.d = zVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        z zVar = this.d;
        float lerp = AndroidUtilities.lerp(zVar.f53553e, AndroidUtilities.dp(8.0f), zVar.f53557j);
        RectF rectF = this.f53537b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = zVar.f53554f;
        float f7 = zVar.f53557j;
        RectF rectF3 = this.f53538c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f53536a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
