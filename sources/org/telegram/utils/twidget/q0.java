package org.telegram.utils.twidget;
public final class q0 implements p0, y {
    public final int f55036a;
    public final Object f55037b;
    public final int f55038c;

    public q0(Object obj, int i7, int i10) {
        this.f55036a = i10;
        this.f55037b = obj;
        this.f55038c = i7;
    }

    @Override
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.f55037b).lambda$signal$3(this.f55038c, bArr);
    }

    @Override
    public Object run() {
        switch (this.f55036a) {
            case 0:
                ((x0) this.f55037b).f55105b.deleteFont(this.f55038c);
                return null;
            default:
                ((x0) this.f55037b).f55105b.canvasRelease(this.f55038c);
                return null;
        }
    }
}
