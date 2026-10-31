package org.telegram.ui;
public final class qr implements Runnable {
    public final int f41037a;
    public final rr f41038b;

    public qr(rr rrVar, int i10) {
        this.f41037a = i10;
        this.f41038b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f41037a) {
            case 0:
                org.telegram.ui.Components.ii iiVar = this.f41038b.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.ii iiVar2 = this.f41038b.f29837a;
                if (iiVar2 != null) {
                    iiVar2.f30819f3.O(true);
                    return;
                }
                return;
        }
    }
}
