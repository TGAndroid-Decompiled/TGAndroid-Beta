package tg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class t1 {
    public float f49048a;
    public float f49049b;
    public float f49050c;
    public float d;
    public long e;
    public float f49051f;
    public final u1 f49052g;

    public t1(u1 u1Var) {
        this.f49052g = u1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        u1 u1Var = this.f49052g;
        RectF rectF2 = u1Var.f49056a;
        this.e = j10 + u1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = u1Var.f49057b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f49048a = abs;
        this.f49049b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f49049b - rectF2.centerY());
        this.f49050c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f49051f = 0.0f;
    }
}
