package org.telegram.utils.twidget;
public final class q0 implements p0, y {
    public final int f54955a;
    public final Object f54956b;
    public final int f54957c;

    public q0(Object obj, int i7, int i10) {
        this.f54955a = i10;
        this.f54956b = obj;
        this.f54957c = i7;
    }

    @Override
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.f54956b).lambda$signal$3(this.f54957c, bArr);
    }

    @Override
    public Object run() {
        switch (this.f54955a) {
            case 0:
                ((x0) this.f54956b).f55024b.deleteFont(this.f54957c);
                return null;
            default:
                ((x0) this.f54956b).f55024b.canvasRelease(this.f54957c);
                return null;
        }
    }
}
