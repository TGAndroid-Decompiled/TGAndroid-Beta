package org.telegram.utils.twidget;
public final class s implements x, p0 {
    public final int f54969a;
    public final int f54970b;
    public final int f54971c;
    public final int d;
    public final Object f54972e;
    public final Object f54973f;

    public s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.f54969a = i12;
        this.f54972e = obj;
        this.f54970b = i7;
        this.f54971c = i10;
        this.d = i11;
        this.f54973f = obj2;
    }

    @Override
    public void mo26run() {
        ((WidgetEngineBackend) this.f54972e).lambda$canvasRun$8(this.f54970b, this.f54971c, this.d, (int[]) this.f54973f);
    }

    @Override
    public Object run() {
        switch (this.f54969a) {
            case 1:
                x0 x0Var = (x0) this.f54972e;
                x0Var.f55024b.defineImage(this.f54970b, this.f54971c, this.d, x0Var.i1((byte[]) this.f54973f));
                return null;
            default:
                int[] iArr = (int[]) this.f54973f;
                WidgetSandboxBackend widgetSandboxBackend = ((x0) this.f54972e).f55024b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.f54970b, this.f54971c, this.d, iArr);
                return null;
        }
    }
}
