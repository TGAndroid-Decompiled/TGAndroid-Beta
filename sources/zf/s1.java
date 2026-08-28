package zf;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f50692a;
    public float f50693b;
    public float f50694c;
    public float d;
    public long f50695e;
    public float f50696f;
    public final t1 f50697g;

    public s1(t1 t1Var) {
        this.f50697g = t1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f50697g;
        RectF rectF2 = t1Var.f50699a;
        this.f50695e = j10 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f50700b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f50692a = abs;
        this.f50693b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f50693b - rectF2.centerY());
        this.f50694c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f50696f = 0.0f;
    }
}
