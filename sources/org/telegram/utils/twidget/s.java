package org.telegram.utils.twidget;
public final class s implements x, p0 {
    public final int f54965a;
    public final int f54966b;
    public final int f54967c;
    public final int d;
    public final Object f54968e;
    public final Object f54969f;

    public s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.f54965a = i12;
        this.f54968e = obj;
        this.f54966b = i7;
        this.f54967c = i10;
        this.d = i11;
        this.f54969f = obj2;
    }

    @Override
    public void mo26run() {
        ((WidgetEngineBackend) this.f54968e).lambda$canvasRun$8(this.f54966b, this.f54967c, this.d, (int[]) this.f54969f);
    }

    @Override
    public Object run() {
        switch (this.f54965a) {
            case 1:
                x0 x0Var = (x0) this.f54968e;
                x0Var.f55020b.defineImage(this.f54966b, this.f54967c, this.d, x0Var.i1((byte[]) this.f54969f));
                return null;
            default:
                int[] iArr = (int[]) this.f54969f;
                WidgetSandboxBackend widgetSandboxBackend = ((x0) this.f54968e).f55020b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.f54966b, this.f54967c, this.d, iArr);
                return null;
        }
    }
}
