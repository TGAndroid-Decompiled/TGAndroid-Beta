package xf;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f49392a;
    public float f49393b;
    public float f49394c;
    public float d;
    public float f49395e;
    public float f49396f;
    public double f49397g;
    public int h;
    public int f49398i;
    public ByteBuffer f49399j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i9) {
        if ((i9 != -1 && i9 >= this.f49398i) || this.f49399j.position() == this.f49399j.limit()) {
            d();
            return false;
        }
        if (i9 != -1) {
            this.f49399j.position(i9 * 20);
        }
        this.f49399j.putFloat(pointF.x);
        this.f49399j.putFloat(pointF.y);
        this.f49399j.putFloat(f10);
        this.f49399j.putFloat(f11);
        this.f49399j.putFloat(f12);
        return true;
    }

    public final void b(int i9) {
        int i10 = this.h + i9;
        if (i10 > this.f49398i || this.f49399j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f49399j != null) {
            return;
        }
        this.f49398i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f49399j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f49399j.position(0);
    }

    public final void d() {
        if (this.f49399j != null) {
            this.f49399j = null;
        }
        int max = Math.max(this.f49398i * 2, 256);
        this.f49398i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f49399j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f49399j.position(0);
    }
}
