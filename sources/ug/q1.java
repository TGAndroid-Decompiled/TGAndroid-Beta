package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class q1 {
    public float f58833a;
    public float f58834b;
    public float f58835c;
    public float d;
    public long f58836e;
    public float f58837f;
    public final r1 f58838g;

    public q1(r1 r1Var) {
        this.f58838g = r1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        r1 r1Var = this.f58838g;
        RectF rectF2 = r1Var.f58852a;
        long j10 = j3 + r1Var.h;
        g5.a aVar = Utilities.f22778c;
        this.f58836e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = r1Var.f58853b;
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
