package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f45063a = new y4(this);
    public final NotificationCenter f45064b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f45065c;
    public final int d;
    public final int f45066e;
    public eg.n0 f45067f;
    public boolean f45068g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f45065c = tLObject;
        this.d = i10;
        this.f45066e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
