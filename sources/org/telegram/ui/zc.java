package org.telegram.ui;

public final class zc implements Runnable {

    public final int f45131a;

    public final id f45132b;

    public zc(id idVar, int i10) {
        this.f45131a = i10;
        this.f45132b = idVar;
    }

    @Override
    public final void run() {
        switch (this.f45131a) {
            case 0:
                id idVar = this.f45132b;
                idVar.f39039f0 = true;
                idVar.h0();
                break;
            case 1:
                id idVar2 = this.f45132b;
                idVar2.f39056x = null;
                idVar2.f39057y = null;
                idVar2.f39041h0 = null;
                idVar2.f39042i0 = null;
                idVar2.f39044k0 = null;
                idVar2.f39043j0 = null;
                idVar2.f39045l0 = 0.0d;
                idVar2.e0(false, true);
                idVar2.f39036e.h(null, null, idVar2.f39053s, null);
                idVar2.h.setAnimation(idVar2.F);
                idVar2.F.K(0);
                break;
            case 2:
                this.f45132b.g0(true);
                break;
            default:
                id idVar3 = this.f45132b;
                idVar3.f39039f0 = true;
                if (idVar3.f39055w.length() > 0) {
                    idVar3.d0(idVar3.f39055w.getText().toString());
                }
                idVar3.h0();
                break;
        }
    }
}
