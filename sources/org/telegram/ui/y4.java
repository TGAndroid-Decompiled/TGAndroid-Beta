package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f44711a = new x4(this);
    public final NotificationCenter f44712b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44713c;
    public final int d;
    public final int f44714e;
    public bg.r0 f44715f;
    public boolean f44716g;

    public y4(int i9, TLObject tLObject, int i10) {
        this.f44713c = tLObject;
        this.d = i9;
        this.f44714e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
