package rg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f47574a;
    public float f47575b;
    public float f47576c;
    public float d;
    public float e;
    public float f47577f;
    public double f47578g;
    public int h;
    public int f47579i;
    public ByteBuffer f47580j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f47579i) || this.f47580j.position() == this.f47580j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f47580j.position(i10 * 20);
        }
        this.f47580j.putFloat(pointF.x);
        this.f47580j.putFloat(pointF.y);
        this.f47580j.putFloat(f7);
        this.f47580j.putFloat(f10);
        this.f47580j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f47579i || this.f47580j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f47580j != null) {
            return;
        }
        this.f47579i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f47580j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f47580j.position(0);
    }

    public final void d() {
        if (this.f47580j != null) {
            this.f47580j = null;
        }
        int max = Math.max(this.f47579i * 2, 256);
        this.f47579i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f47580j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f47580j.position(0);
    }
}
