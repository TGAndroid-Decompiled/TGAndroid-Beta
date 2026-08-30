package ph;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class o5 {
    public final w f42047a;
    public boolean f42048b;
    public n5 f42049c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.z5 f42050f;
    public final org.telegram.ui.Components.z5[] f42051g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint f42052i;
    public final Path f42053j;

    public o5(w wVar) {
        Paint paint = new Paint(1);
        this.f42052i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f42053j = new Path();
        this.f42047a = wVar;
        nr nrVar = nr.f27347g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, nrVar);
        this.e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar);
        this.f42050f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar);
        this.f42051g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar)};
    }

    public final void a(n5 n5Var) {
        if (n5Var != null) {
            this.f42049c = n5Var;
        }
        boolean z4 = false;
        if (n5Var != null) {
            float f10 = n5Var.d;
            float f11 = n5Var.f42010c;
            PointF[] pointFArr = n5Var.f42009b;
            if (!this.f42048b) {
                this.e.d(f11, true);
                this.f42050f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f42051g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        if (n5Var != null) {
            z4 = true;
        }
        this.f42048b = z4;
        this.f42047a.run();
    }
}
