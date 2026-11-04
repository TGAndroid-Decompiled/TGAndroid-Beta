package tg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f55261a;
    public float f55262b;
    public float f55263c;
    public float d;
    public float f55264e;
    public float f55265f;
    public double f55266g;
    public int h;
    public int f55267i;
    public ByteBuffer f55268j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i3) {
        if ((i3 != -1 && i3 >= this.f55267i) || this.f55268j.position() == this.f55268j.limit()) {
            d();
            return false;
        }
        if (i3 != -1) {
            this.f55268j.position(i3 * 20);
        }
        this.f55268j.putFloat(pointF.x);
        this.f55268j.putFloat(pointF.y);
        this.f55268j.putFloat(f10);
        this.f55268j.putFloat(f11);
        this.f55268j.putFloat(f12);
        return true;
    }

    public final void b(int i3) {
        int i10 = this.h + i3;
        if (i10 > this.f55267i || this.f55268j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f55268j != null) {
            return;
        }
        this.f55267i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f55268j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55268j.position(0);
    }

    public final void d() {
        if (this.f55268j != null) {
            this.f55268j = null;
        }
        int max = Math.max(this.f55267i * 2, 256);
        this.f55267i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f55268j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55268j.position(0);
    }
}
