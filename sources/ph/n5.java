package ph;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public final class n5 {
    public final w f42045a;
    public boolean f42046b;
    public m5 f42047c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.z5 f42048f;
    public final org.telegram.ui.Components.z5[] f42049g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint f42050i;
    public final Path f42051j;

    public n5(w wVar) {
        Paint paint = new Paint(1);
        this.f42050i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f42051j = new Path();
        this.f42045a = wVar;
        mr mrVar = mr.f27123g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, mrVar);
        this.e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar);
        this.f42048f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar);
        this.f42049g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar)};
    }

    public final void a(m5 m5Var) {
        if (m5Var != null) {
            this.f42047c = m5Var;
        }
        boolean z4 = false;
        if (m5Var != null) {
            float f10 = m5Var.d;
            float f11 = m5Var.f42007c;
            PointF[] pointFArr = m5Var.f42006b;
            if (!this.f42046b) {
                this.e.d(f11, true);
                this.f42048f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f42049g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        if (m5Var != null) {
            z4 = true;
        }
        this.f42046b = z4;
        this.f42045a.run();
    }
}
