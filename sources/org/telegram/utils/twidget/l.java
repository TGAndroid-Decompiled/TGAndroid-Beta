package org.telegram.utils.twidget;
public final class l implements lxc, yxc {
    public final byte a;
    public final byte[] b;
    public final Object c;

    public l(Object obj, byte[] bArr, byte b) {
        this.a = b;
        this.c = obj;
        this.b = bArr;
    }

    @Override
    public final void mo19run() {
        byte b = this.a;
        byte[] bArr = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((mxc) obj).a(bArr);
                return;
            default:
                ((WidgetEngineBackend) obj).lambda$send$11(bArr);
                return;
        }
    }

    @Override
    public final Object run() {
        w wVar = (w) this.c;
        wVar.b.selectableText(wVar.b(this.b));
        return null;
    }
}
