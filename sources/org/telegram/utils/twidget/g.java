package org.telegram.utils.twidget;
public final class g implements lvc, kvc {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    @Override
    public final void a(byte[] bArr) {
        WidgetEngineBackend.i((WidgetEngineBackend) this.a, bArr);
    }

    @Override
    public final void mo21run() {
        WidgetEngineBackend.m((lvc) this.a);
    }
}
