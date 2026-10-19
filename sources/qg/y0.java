package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class y0 {
    public float f44703a;
    public float f44704b;
    public float f44705c;
    public float d;
    public float e;
    public float f44706f;
    public double f44707g;
    public int h;
    public int f44708i;
    public ByteBuffer f44709j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44708i) || this.f44709j.position() == this.f44709j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44709j.position(i10 * 20);
        }
        this.f44709j.putFloat(pointF.x);
        this.f44709j.putFloat(pointF.y);
        this.f44709j.putFloat(f7);
        this.f44709j.putFloat(f10);
        this.f44709j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44708i || this.f44709j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44709j != null) {
            return;
        }
        this.f44708i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44709j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44709j.position(0);
    }

    public final void d() {
        if (this.f44709j != null) {
            this.f44709j = null;
        }
        int max = Math.max(this.f44708i * 2, 256);
        this.f44708i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44709j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44709j.position(0);
    }
}
