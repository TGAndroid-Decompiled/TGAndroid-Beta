package vh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.gr;
public final class n4 {
    public final v f51522a;
    public boolean f51523b;
    public m4 f51524c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f51525f;
    public final org.telegram.ui.Components.t5[] f51526g;
    public final org.telegram.ui.Components.t5[] h;
    public final Paint f51527i;
    public final Path f51528j;

    public n4(v vVar) {
        Paint paint = new Paint(1);
        this.f51527i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f));
        this.f51528j = new Path();
        this.f51522a = vVar;
        gr grVar = gr.f26524g;
        this.d = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 320L, grVar);
        this.e = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.f51525f = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.f51526g = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
        this.h = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
    }

    public final void a(m4 m4Var) {
        if (m4Var != null) {
            this.f51524c = m4Var;
        }
        boolean z10 = false;
        if (m4Var != null) {
            float f7 = m4Var.d;
            float f10 = m4Var.f51496c;
            PointF[] pointFArr = m4Var.f51495b;
            if (!this.f51523b) {
                this.e.e(true, f10);
                this.f51525f.e(true, f7);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f51526g[i10].e(true, pointFArr[i10].x - f10);
                    this.h[i10].e(true, pointFArr[i10].y - f7);
                }
            }
        }
        if (m4Var != null) {
            z10 = true;
        }
        this.f51523b = z10;
        this.f51522a.run();
    }
}
