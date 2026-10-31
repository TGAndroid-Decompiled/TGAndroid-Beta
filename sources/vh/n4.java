package vh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.gr;
public final class n4 {
    public final v f51507a;
    public boolean f51508b;
    public m4 f51509c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f51510f;
    public final org.telegram.ui.Components.t5[] f51511g;
    public final org.telegram.ui.Components.t5[] h;
    public final Paint f51512i;
    public final Path f51513j;

    public n4(v vVar) {
        Paint paint = new Paint(1);
        this.f51512i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f));
        this.f51513j = new Path();
        this.f51507a = vVar;
        gr grVar = gr.f26496g;
        this.d = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 320L, grVar);
        this.e = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.f51510f = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.f51511g = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
        this.h = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
    }

    public final void a(m4 m4Var) {
        if (m4Var != null) {
            this.f51509c = m4Var;
        }
        boolean z10 = false;
        if (m4Var != null) {
            float f7 = m4Var.d;
            float f10 = m4Var.f51481c;
            PointF[] pointFArr = m4Var.f51480b;
            if (!this.f51508b) {
                this.e.e(true, f10);
                this.f51510f.e(true, f7);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f51511g[i10].e(true, pointFArr[i10].x - f10);
                    this.h[i10].e(true, pointFArr[i10].y - f7);
                }
            }
        }
        if (m4Var != null) {
            z10 = true;
        }
        this.f51508b = z10;
        this.f51507a.run();
    }
}
