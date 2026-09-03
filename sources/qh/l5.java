package qh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class l5 {
    public final w f45642a;
    public boolean f45643b;
    public k5 f45644c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 f45645e;
    public final org.telegram.ui.Components.z5 f45646f;
    public final org.telegram.ui.Components.z5[] f45647g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint f45648i;
    public final Path f45649j;

    public l5(w wVar) {
        Paint paint = new Paint(1);
        this.f45648i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f45649j = new Path();
        this.f45642a = wVar;
        pr prVar = pr.f30169g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, prVar);
        this.f45645e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.f45646f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.f45647g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
    }

    public final void a(k5 k5Var) {
        if (k5Var != null) {
            this.f45644c = k5Var;
        }
        boolean z4 = false;
        if (k5Var != null) {
            float f10 = k5Var.d;
            float f11 = k5Var.f45611c;
            PointF[] pointFArr = k5Var.f45610b;
            if (!this.f45643b) {
                this.f45645e.d(f11, true);
                this.f45646f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f45647g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        if (k5Var != null) {
            z4 = true;
        }
        this.f45643b = z4;
        this.f45642a.run();
    }
}
