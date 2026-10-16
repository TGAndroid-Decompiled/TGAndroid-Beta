package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f43337a;
    public float f43338b;
    public float f43339c;
    public float d;
    public float e;
    public float f43340f;
    public double f43341g;
    public int h;
    public int f43342i;
    public ByteBuffer f43343j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f43342i) || this.f43343j.position() == this.f43343j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f43343j.position(i10 * 20);
        }
        this.f43343j.putFloat(pointF.x);
        this.f43343j.putFloat(pointF.y);
        this.f43343j.putFloat(f7);
        this.f43343j.putFloat(f10);
        this.f43343j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f43342i || this.f43343j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f43343j != null) {
            return;
        }
        this.f43342i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f43343j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f43343j.position(0);
    }

    public final void d() {
        if (this.f43343j != null) {
            this.f43343j = null;
        }
        int max = Math.max(this.f43342i * 2, 256);
        this.f43342i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f43343j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f43343j.position(0);
    }
}
