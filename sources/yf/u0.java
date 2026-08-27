package yf;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class u0 {

    public float f50089a;

    public float f50090b;

    public float f50091c;
    public float d;

    public float f50092e;

    public float f50093f;

    public double f50094g;
    public int h;

    public int f50095i;

    public ByteBuffer f50096j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i10) {
        if ((i10 != -1 && i10 >= this.f50095i) || this.f50096j.position() == this.f50096j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f50096j.position(i10 * 20);
        }
        this.f50096j.putFloat(pointF.x);
        this.f50096j.putFloat(pointF.y);
        this.f50096j.putFloat(f10);
        this.f50096j.putFloat(f11);
        this.f50096j.putFloat(f12);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f50095i || this.f50096j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f50096j != null) {
            return;
        }
        this.f50095i = 256;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f50096j = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f50096j.position(0);
    }

    public final void d() {
        if (this.f50096j != null) {
            this.f50096j = null;
        }
        int iMax = Math.max(this.f50095i * 2, 256);
        this.f50095i = iMax;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMax * 20);
        this.f50096j = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f50096j.position(0);
    }
}
