package qh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class m5 {
    public final w f45660a;
    public boolean f45661b;
    public l5 f45662c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 f45663e;
    public final org.telegram.ui.Components.z5 f45664f;
    public final org.telegram.ui.Components.z5[] f45665g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint f45666i;
    public final Path f45667j;

    public m5(w wVar) {
        Paint paint = new Paint(1);
        this.f45666i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f45667j = new Path();
        this.f45660a = wVar;
        pr prVar = pr.f30184g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, prVar);
        this.f45663e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.f45664f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.f45665g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
    }

    public final void a(l5 l5Var) {
        if (l5Var != null) {
            this.f45662c = l5Var;
        }
        boolean z4 = false;
        if (l5Var != null) {
            float f10 = l5Var.d;
            float f11 = l5Var.f45627c;
            PointF[] pointFArr = l5Var.f45626b;
            if (!this.f45661b) {
                this.f45663e.d(f11, true);
                this.f45664f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f45665g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        if (l5Var != null) {
            z4 = true;
        }
        this.f45661b = z4;
        this.f45660a.run();
    }
}
