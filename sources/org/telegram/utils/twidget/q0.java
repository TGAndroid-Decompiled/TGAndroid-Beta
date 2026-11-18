package org.telegram.utils.twidget;
public final class q0 implements p0, y {
    public final int f54910a;
    public final Object f54911b;
    public final int f54912c;

    public q0(Object obj, int i7, int i10) {
        this.f54910a = i10;
        this.f54911b = obj;
        this.f54912c = i7;
    }

    @Override
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.f54911b).lambda$signal$3(this.f54912c, bArr);
    }

    @Override
    public Object run() {
        switch (this.f54910a) {
            case 0:
                ((x0) this.f54911b).f54979b.deleteFont(this.f54912c);
                return null;
            default:
                ((x0) this.f54911b).f54979b.canvasRelease(this.f54912c);
                return null;
        }
    }
}
