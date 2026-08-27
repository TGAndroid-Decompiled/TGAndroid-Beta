package yf;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.tu0;

public final class s0 {

    public final float f50070a;

    public final float f50071b;

    public final PointF f50072c;
    public final PointF d;

    public final float f50073e;

    public final PointF f50074f;

    public final PointF f50075g;

    public s0(e8.a aVar, Bitmap bitmap, tu0 tu0Var, boolean z10) {
        PointF pointFB = null;
        PointF pointFB2 = null;
        PointF pointFB3 = null;
        PointF pointFB4 = null;
        for (e8.d dVar : aVar.f5349b) {
            PointF pointF = dVar.f5357a;
            int i10 = dVar.f5358b;
            if (i10 == 4) {
                pointFB = b(pointF, bitmap, tu0Var, z10);
            } else if (i10 == 5) {
                pointFB3 = b(pointF, bitmap, tu0Var, z10);
            } else if (i10 == 10) {
                pointFB2 = b(pointF, bitmap, tu0Var, z10);
            } else if (i10 == 11) {
                pointFB4 = b(pointF, bitmap, tu0Var, z10);
            }
        }
        if (pointFB != null && pointFB2 != null) {
            if (pointFB.x < pointFB2.x) {
                PointF pointF2 = pointFB2;
                pointFB2 = pointFB;
                pointFB = pointF2;
            }
            PointF pointF3 = new PointF((pointFB2.x * 0.5f) + (pointFB.x * 0.5f), (pointFB2.y * 0.5f) + (pointFB.y * 0.5f));
            this.d = pointF3;
            float fHypot = (float) Math.hypot(pointFB2.x - pointFB.x, pointFB2.y - pointFB.y);
            this.f50073e = fHypot;
            float degrees = (float) Math.toDegrees(Math.atan2(pointFB2.y - pointFB.y, pointFB2.x - pointFB.x) + 3.141592653589793d);
            this.f50071b = degrees;
            this.f50070a = 2.35f * fHypot;
            float f10 = fHypot * 0.8f;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f50072c = new PointF((((float) Math.cos(radians)) * f10) + pointF3.x, (f10 * ((float) Math.sin(radians))) + pointF3.y);
        }
        if (pointFB3 == null || pointFB4 == null) {
            return;
        }
        if (pointFB3.x < pointFB4.x) {
            PointF pointF4 = pointFB4;
            pointFB4 = pointFB3;
            pointFB3 = pointF4;
        }
        PointF pointF5 = new PointF((pointFB4.x * 0.5f) + (pointFB3.x * 0.5f), (pointFB4.y * 0.5f) + (pointFB3.y * 0.5f));
        this.f50074f = pointF5;
        float f11 = this.f50073e * 0.7f;
        double radians2 = (float) Math.toRadians(this.f50071b + 90.0f);
        this.f50075g = new PointF((((float) Math.cos(radians2)) * f11) + pointF5.x, (f11 * ((float) Math.sin(radians2))) + pointF5.y);
    }

    public static PointF b(PointF pointF, Bitmap bitmap, tu0 tu0Var, boolean z10) {
        return new PointF((tu0Var.f32893a * pointF.x) / (z10 ? bitmap.getHeight() : bitmap.getWidth()), (tu0Var.f32894b * pointF.y) / (z10 ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public final PointF a(int i10) {
        if (i10 == 0) {
            return this.f50072c;
        }
        if (i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f50074f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f50075g;
    }
}
