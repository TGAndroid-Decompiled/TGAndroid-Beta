package org.telegram.utils.twidget;
public final class q0 implements p0, y {
    public final int f54951a;
    public final Object f54952b;
    public final int f54953c;

    public q0(Object obj, int i7, int i10) {
        this.f54951a = i10;
        this.f54952b = obj;
        this.f54953c = i7;
    }

    @Override
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.f54952b).lambda$signal$3(this.f54953c, bArr);
    }

    @Override
    public Object run() {
        switch (this.f54951a) {
            case 0:
                ((x0) this.f54952b).f55020b.deleteFont(this.f54953c);
                return null;
            default:
                ((x0) this.f54952b).f55020b.canvasRelease(this.f54953c);
                return null;
        }
    }
}
