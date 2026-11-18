package org.telegram.utils.twidget;
public final class s implements x, p0 {
    public final int f54924a;
    public final int f54925b;
    public final int f54926c;
    public final int d;
    public final Object f54927e;
    public final Object f54928f;

    public s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.f54924a = i12;
        this.f54927e = obj;
        this.f54925b = i7;
        this.f54926c = i10;
        this.d = i11;
        this.f54928f = obj2;
    }

    @Override
    public void mo26run() {
        ((WidgetEngineBackend) this.f54927e).lambda$canvasRun$8(this.f54925b, this.f54926c, this.d, (int[]) this.f54928f);
    }

    @Override
    public Object run() {
        switch (this.f54924a) {
            case 1:
                x0 x0Var = (x0) this.f54927e;
                x0Var.f54979b.defineImage(this.f54925b, this.f54926c, this.d, x0Var.i1((byte[]) this.f54928f));
                return null;
            default:
                int[] iArr = (int[]) this.f54928f;
                WidgetSandboxBackend widgetSandboxBackend = ((x0) this.f54927e).f54979b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.f54925b, this.f54926c, this.d, iArr);
                return null;
        }
    }
}
