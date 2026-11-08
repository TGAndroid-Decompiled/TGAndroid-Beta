package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56705a;
    public float f56706b;
    public float f56707c;
    public float d;
    public long f56708e;
    public float f56709f;
    public final n1 f56710g;

    public m1(n1 n1Var) {
        this.f56710g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56710g;
        RectF rectF2 = n1Var.f56719a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21335c;
        this.f56708e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56720b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56705a = abs;
        this.f56706b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56706b - rectF2.centerY());
        this.f56707c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56709f = 0.0f;
    }
}
