package org.telegram.utils.twidget;
public final class o implements x, w {
    public final Object f54353a;

    public o(Object obj) {
        this.f54353a = obj;
    }

    @Override
    public void a(byte[] bArr) {
        WidgetEngineBackend.l((WidgetEngineBackend) this.f54353a, bArr);
    }

    @Override
    public void mo26run() {
        WidgetEngineBackend.b((x) this.f54353a);
    }
}
