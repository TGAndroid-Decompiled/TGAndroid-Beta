package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class t1 {
    public float f45359a;
    public float f45360b;
    public float f45361c;
    public float d;
    public long e;
    public float f45362f;
    public final u1 f45363g;

    public t1(u1 u1Var) {
        this.f45363g = u1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        u1 u1Var = this.f45363g;
        RectF rectF2 = u1Var.f45367a;
        this.e = j10 + u1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = u1Var.f45368b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f45359a = abs;
        this.f45360b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f45360b - rectF2.centerY());
        this.f45361c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f45362f = 0.0f;
    }
}
