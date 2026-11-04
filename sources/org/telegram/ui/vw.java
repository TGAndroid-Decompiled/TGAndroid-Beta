package org.telegram.ui;
public final class vw implements org.telegram.messenger.x5 {
    public long f50621a;
    public long f50622b;
    public final String f50623c;
    public final ww d;

    public vw(ww wwVar, String str) {
        this.d = wwVar;
        this.f50623c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f50622b = j10;
        this.f50621a = j11;
        this.d.b();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
