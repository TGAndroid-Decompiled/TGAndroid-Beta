package org.telegram.utils.twidget;
public final class i implements kvc, xvc {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;
    public final Object f;

    public i(Object obj, int i, int i2, int i3, Object obj2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = obj2;
    }

    @Override
    public final Object run() {
        byte b = this.a;
        Object obj = this.f;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        w wVar = (w) this.e;
        switch (b) {
            case 1:
                wVar.b.defineImage(i3, i2, i, wVar.b((byte[]) obj));
                return null;
            default:
                int[] iArr = (int[]) obj;
                WidgetSandboxBackend widgetSandboxBackend = wVar.b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(i3, i2, i, iArr);
                return null;
        }
    }

    @Override
    public final void mo21run() {
        ((WidgetEngineBackend) this.e).lambda$canvasRun$8(this.b, this.c, this.d, (int[]) this.f);
    }
}
