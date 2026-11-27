package org.telegram.utils.twidget;
public final class g implements a0d, zzc {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    @Override
    public final void a(byte[] bArr) {
        WidgetEngineBackend.k((WidgetEngineBackend) this.a, bArr);
    }

    @Override
    public final void mo20run() {
        WidgetEngineBackend.m((a0d) this.a);
    }
}
