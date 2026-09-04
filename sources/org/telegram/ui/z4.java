package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f43283a = new y4(this);
    public final NotificationCenter f43284b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f43285c;
    public final int d;
    public final int f43286e;
    public di.l5 f43287f;
    public boolean f43288g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f43285c = tLObject;
        this.d = i10;
        this.f43286e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
