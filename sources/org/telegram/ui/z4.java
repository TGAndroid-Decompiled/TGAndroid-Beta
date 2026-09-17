package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f40113a = new y4(this);
    public final NotificationCenter f40114b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f40115c;
    public final int d;
    public final int e;
    public ci.l5 f40116f;
    public boolean f40117g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f40115c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
