package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class y0 {
    public float f44701a;
    public float f44702b;
    public float f44703c;
    public float d;
    public float e;
    public float f44704f;
    public double f44705g;
    public int h;
    public int f44706i;
    public ByteBuffer f44707j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44706i) || this.f44707j.position() == this.f44707j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44707j.position(i10 * 20);
        }
        this.f44707j.putFloat(pointF.x);
        this.f44707j.putFloat(pointF.y);
        this.f44707j.putFloat(f7);
        this.f44707j.putFloat(f10);
        this.f44707j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44706i || this.f44707j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44707j != null) {
            return;
        }
        this.f44706i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44707j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44707j.position(0);
    }

    public final void d() {
        if (this.f44707j != null) {
            this.f44707j = null;
        }
        int max = Math.max(this.f44706i * 2, 256);
        this.f44706i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44707j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44707j.position(0);
    }
}
