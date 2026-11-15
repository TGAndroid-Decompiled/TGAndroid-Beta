package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class n1 {
    public float f58229a;
    public float f58230b;
    public float f58231c;
    public float d;
    public long f58232e;
    public float f58233f;
    public final o1 f58234g;

    public n1(o1 o1Var) {
        this.f58234g = o1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        o1 o1Var = this.f58234g;
        RectF rectF2 = o1Var.f58243a;
        long j10 = j3 + o1Var.h;
        g5.a aVar = Utilities.f22415c;
        this.f58232e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = o1Var.f58244b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58229a = abs;
        this.f58230b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58230b - rectF2.centerY());
        this.f58231c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58233f = 0.0f;
    }
}
