package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class p1 {
    public float f58833a;
    public float f58834b;
    public float f58835c;
    public float d;
    public long f58836e;
    public float f58837f;
    public final q1 f58838g;

    public p1(q1 q1Var) {
        this.f58838g = q1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        q1 q1Var = this.f58838g;
        RectF rectF2 = q1Var.f58846a;
        long j10 = j3 + q1Var.h;
        g5.a aVar = Utilities.f22773c;
        this.f58836e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = q1Var.f58847b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58833a = abs;
        this.f58834b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58834b - rectF2.centerY());
        this.f58835c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58837f = 0.0f;
    }
}
