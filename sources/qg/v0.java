package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f44628a;
    public float f44629b;
    public float f44630c;
    public float d;
    public float f44631e;
    public float f44632f;
    public double f44633g;
    public int h;
    public int f44634i;
    public ByteBuffer f44635j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44634i) || this.f44635j.position() == this.f44635j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44635j.position(i10 * 20);
        }
        this.f44635j.putFloat(pointF.x);
        this.f44635j.putFloat(pointF.y);
        this.f44635j.putFloat(f7);
        this.f44635j.putFloat(f10);
        this.f44635j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44634i || this.f44635j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44635j != null) {
            return;
        }
        this.f44634i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44635j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44635j.position(0);
    }

    public final void d() {
        if (this.f44635j != null) {
            this.f44635j = null;
        }
        int max = Math.max(this.f44634i * 2, 256);
        this.f44634i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44635j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44635j.position(0);
    }
}
