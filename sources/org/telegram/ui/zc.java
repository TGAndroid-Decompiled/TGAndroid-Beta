package org.telegram.ui;
public final class zc implements Runnable {
    public final int f45105a;
    public final id f45106b;

    public zc(id idVar, int i9) {
        this.f45105a = i9;
        this.f45106b = idVar;
    }

    @Override
    public final void run() {
        switch (this.f45105a) {
            case 0:
                id idVar = this.f45106b;
                idVar.f39111f0 = true;
                idVar.g0();
                return;
            case 1:
                id idVar2 = this.f45106b;
                idVar2.f39128x = null;
                idVar2.f39129y = null;
                idVar2.f39113h0 = null;
                idVar2.f39114i0 = null;
                idVar2.f39116k0 = null;
                idVar2.f39115j0 = null;
                idVar2.f39117l0 = 0.0d;
                idVar2.d0(false, true);
                idVar2.f39108e.h(null, null, idVar2.f39125s, null);
                idVar2.h.setAnimation(idVar2.F);
                idVar2.F.K(0);
                return;
            case 2:
                this.f45106b.f0(true);
                return;
            default:
                id idVar3 = this.f45106b;
                idVar3.f39111f0 = true;
                if (idVar3.f39127w.length() > 0) {
                    idVar3.c0(idVar3.f39127w.getText().toString());
                }
                idVar3.g0();
                return;
        }
    }
}
