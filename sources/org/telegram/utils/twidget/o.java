package org.telegram.utils.twidget;
public final class o implements x, w {
    public final Object f52927a;

    public o(Object obj) {
        this.f52927a = obj;
    }

    @Override
    public void a(byte[] bArr) {
        WidgetEngineBackend.l((WidgetEngineBackend) this.f52927a, bArr);
    }

    @Override
    public void run() {
        WidgetEngineBackend.b((x) this.f52927a);
    }
}
