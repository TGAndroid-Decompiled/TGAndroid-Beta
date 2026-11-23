package org.telegram.utils.twidget;
public final class s implements x, p0 {
    public final int f55050a;
    public final int f55051b;
    public final int f55052c;
    public final int d;
    public final Object f55053e;
    public final Object f55054f;

    public s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.f55050a = i12;
        this.f55053e = obj;
        this.f55051b = i7;
        this.f55052c = i10;
        this.d = i11;
        this.f55054f = obj2;
    }

    @Override
    public void mo26run() {
        ((WidgetEngineBackend) this.f55053e).lambda$canvasRun$8(this.f55051b, this.f55052c, this.d, (int[]) this.f55054f);
    }

    @Override
    public Object run() {
        switch (this.f55050a) {
            case 1:
                x0 x0Var = (x0) this.f55053e;
                x0Var.f55105b.defineImage(this.f55051b, this.f55052c, this.d, x0Var.i1((byte[]) this.f55054f));
                return null;
            default:
                int[] iArr = (int[]) this.f55054f;
                WidgetSandboxBackend widgetSandboxBackend = ((x0) this.f55053e).f55105b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.f55051b, this.f55052c, this.d, iArr);
                return null;
        }
    }
}
