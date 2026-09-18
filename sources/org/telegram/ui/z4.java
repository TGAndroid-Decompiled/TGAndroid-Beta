package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f39964a = new y4(this);
    public final NotificationCenter f39965b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f39966c;
    public final int d;
    public final int e;
    public ci.l5 f39967f;
    public boolean f39968g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f39966c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
