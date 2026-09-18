package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class r1 {
    public float f42479a;
    public float f42480b;
    public float f42481c;
    public float d;
    public long e;
    public float f42482f;
    public final s1 f42483g;

    public r1(s1 s1Var) {
        this.f42483g = s1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        s1 s1Var = this.f42483g;
        RectF rectF2 = s1Var.f42494a;
        this.e = j3 + s1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = s1Var.f42495b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f42479a = abs;
        this.f42480b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f42480b - rectF2.centerY());
        this.f42481c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f42482f = 0.0f;
    }
}
