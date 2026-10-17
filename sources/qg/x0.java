package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44720a;
    public float f44721b;
    public float f44722c;
    public float d;
    public float e;
    public float f44723f;
    public double f44724g;
    public int h;
    public int f44725i;
    public ByteBuffer f44726j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44725i) || this.f44726j.position() == this.f44726j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44726j.position(i10 * 20);
        }
        this.f44726j.putFloat(pointF.x);
        this.f44726j.putFloat(pointF.y);
        this.f44726j.putFloat(f7);
        this.f44726j.putFloat(f10);
        this.f44726j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44725i || this.f44726j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44726j != null) {
            return;
        }
        this.f44725i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44726j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44726j.position(0);
    }

    public final void d() {
        if (this.f44726j != null) {
            this.f44726j = null;
        }
        int max = Math.max(this.f44725i * 2, 256);
        this.f44725i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44726j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44726j.position(0);
    }
}
