package org.telegram.ui;
public final class xu implements org.telegram.messenger.or {
    public final int f53935a;
    public final cx f53936b;

    public xu(cx cxVar, int i7) {
        this.f53935a = i7;
        this.f53936b = cxVar;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        boolean z11;
        switch (this.f53935a) {
            case 0:
                cx cxVar = this.f53936b;
                cxVar.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cxVar.W1 = z10;
                org.telegram.messenger.np.h1().edit().putBoolean("askAboutContacts", cxVar.W1).commit();
                cxVar.u3(false);
                return;
            default:
                cx cxVar2 = this.f53936b;
                cxVar2.getClass();
                if (i7 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cxVar2.W1 = z11;
                org.telegram.messenger.np.h1().edit().putBoolean("askAboutContacts", cxVar2.W1).apply();
                cxVar2.u3(false);
                return;
        }
    }
}
