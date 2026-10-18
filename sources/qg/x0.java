package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44740a;
    public float f44741b;
    public float f44742c;
    public float d;
    public float e;
    public float f44743f;
    public double f44744g;
    public int h;
    public int f44745i;
    public ByteBuffer f44746j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44745i) || this.f44746j.position() == this.f44746j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44746j.position(i10 * 20);
        }
        this.f44746j.putFloat(pointF.x);
        this.f44746j.putFloat(pointF.y);
        this.f44746j.putFloat(f7);
        this.f44746j.putFloat(f10);
        this.f44746j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44745i || this.f44746j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44746j != null) {
            return;
        }
        this.f44745i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44746j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44746j.position(0);
    }

    public final void d() {
        if (this.f44746j != null) {
            this.f44746j = null;
        }
        int max = Math.max(this.f44745i * 2, 256);
        this.f44745i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44746j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44746j.position(0);
    }
}
