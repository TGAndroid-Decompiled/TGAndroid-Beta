package org.telegram.ui;
public final class zp implements Runnable {
    public final int f40847a;
    public final jq f40848b;
    public final long f40849c;

    public zp(jq jqVar, long j10, int i10) {
        this.f40847a = i10;
        this.f40848b = jqVar;
        this.f40849c = j10;
    }

    @Override
    public final void run() {
        switch (this.f40847a) {
            case 0:
                long j10 = this.f40849c;
                jq jqVar = this.f40848b;
                jqVar.f35446n = j10;
                jqVar.f35451r = true;
                jqVar.n0();
                return;
            default:
                jq.Z(this.f40848b, this.f40849c);
                return;
        }
    }
}
