package org.telegram.ui;
public final class yc implements Runnable {
    public final int f44834a;
    public final hd f44835b;

    public yc(hd hdVar, int i10) {
        this.f44834a = i10;
        this.f44835b = hdVar;
    }

    @Override
    public final void run() {
        switch (this.f44834a) {
            case 0:
                hd hdVar = this.f44835b;
                hdVar.f38859f0 = true;
                hdVar.h0();
                return;
            case 1:
                hd hdVar2 = this.f44835b;
                hdVar2.f38876x = null;
                hdVar2.f38877y = null;
                hdVar2.f38861h0 = null;
                hdVar2.f38862i0 = null;
                hdVar2.f38864k0 = null;
                hdVar2.f38863j0 = null;
                hdVar2.f38865l0 = 0.0d;
                hdVar2.e0(false, true);
                hdVar2.f38856e.h(null, null, hdVar2.f38873s, null);
                hdVar2.h.setAnimation(hdVar2.F);
                hdVar2.F.K(0);
                return;
            case 2:
                this.f44835b.g0(true);
                return;
            default:
                hd hdVar3 = this.f44835b;
                hdVar3.f38859f0 = true;
                if (hdVar3.f38875w.length() > 0) {
                    hdVar3.d0(hdVar3.f38875w.getText().toString());
                }
                hdVar3.h0();
                return;
        }
    }
}
