package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56704a;
    public float f56705b;
    public float f56706c;
    public float d;
    public long f56707e;
    public float f56708f;
    public final n1 f56709g;

    public m1(n1 n1Var) {
        this.f56709g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56709g;
        RectF rectF2 = n1Var.f56718a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21335c;
        this.f56707e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56719b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56704a = abs;
        this.f56705b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56705b - rectF2.centerY());
        this.f56706c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56708f = 0.0f;
    }
}
