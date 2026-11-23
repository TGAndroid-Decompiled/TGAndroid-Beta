package org.telegram.utils.twidget;
public final class s implements x, p0 {
    public final int f54934a;
    public final int f54935b;
    public final int f54936c;
    public final int d;
    public final Object f54937e;
    public final Object f54938f;

    public s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.f54934a = i12;
        this.f54937e = obj;
        this.f54935b = i7;
        this.f54936c = i10;
        this.d = i11;
        this.f54938f = obj2;
    }

    @Override
    public void mo26run() {
        ((WidgetEngineBackend) this.f54937e).lambda$canvasRun$8(this.f54935b, this.f54936c, this.d, (int[]) this.f54938f);
    }

    @Override
    public Object run() {
        switch (this.f54934a) {
            case 1:
                x0 x0Var = (x0) this.f54937e;
                x0Var.f54989b.defineImage(this.f54935b, this.f54936c, this.d, x0Var.i1((byte[]) this.f54938f));
                return null;
            default:
                int[] iArr = (int[]) this.f54938f;
                WidgetSandboxBackend widgetSandboxBackend = ((x0) this.f54937e).f54989b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.f54935b, this.f54936c, this.d, iArr);
                return null;
        }
    }
}
