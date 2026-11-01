package org.telegram.ui;
public final class qr implements Runnable {
    public final int f40885a;
    public final rr f40886b;

    public qr(rr rrVar, int i10) {
        this.f40885a = i10;
        this.f40886b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f40885a) {
            case 0:
                org.telegram.ui.Components.ii iiVar = this.f40886b.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.ii iiVar2 = this.f40886b.f30217a;
                if (iiVar2 != null) {
                    iiVar2.f31183f3.O(true);
                    return;
                }
                return;
        }
    }
}
