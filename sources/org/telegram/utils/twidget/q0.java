package org.telegram.utils.twidget;
public final class q0 implements p0, y {
    public final int f54920a;
    public final Object f54921b;
    public final int f54922c;

    public q0(Object obj, int i7, int i10) {
        this.f54920a = i10;
        this.f54921b = obj;
        this.f54922c = i7;
    }

    @Override
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.f54921b).lambda$signal$3(this.f54922c, bArr);
    }

    @Override
    public Object run() {
        switch (this.f54920a) {
            case 0:
                ((x0) this.f54921b).f54989b.deleteFont(this.f54922c);
                return null;
            default:
                ((x0) this.f54921b).f54989b.canvasRelease(this.f54922c);
                return null;
        }
    }
}
