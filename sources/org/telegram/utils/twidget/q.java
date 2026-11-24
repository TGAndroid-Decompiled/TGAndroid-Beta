package org.telegram.utils.twidget;
public final class q implements xvc, lvc {
    public final byte a;
    public final Object b;
    public final int c;

    public q(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
    }

    @Override
    public final void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$signal$3(this.c, bArr);
    }

    @Override
    public final Object run() {
        byte b = this.a;
        int i = this.c;
        w wVar = (w) this.b;
        switch (b) {
            case 0:
                wVar.b.deleteFont(i);
                return null;
            default:
                wVar.b.canvasRelease(i);
                return null;
        }
    }
}
