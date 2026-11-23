package org.telegram.ui;
public final class wu implements org.telegram.messenger.nr {
    public final int f53767a;
    public final bx f53768b;

    public wu(bx bxVar, int i7) {
        this.f53767a = i7;
        this.f53768b = bxVar;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        boolean z11;
        switch (this.f53767a) {
            case 0:
                bx bxVar = this.f53768b;
                bxVar.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bxVar.W1 = z10;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", bxVar.W1).commit();
                bxVar.u3(false);
                return;
            default:
                bx bxVar2 = this.f53768b;
                bxVar2.getClass();
                if (i7 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bxVar2.W1 = z11;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", bxVar2.W1).apply();
                bxVar2.u3(false);
                return;
        }
    }
}
