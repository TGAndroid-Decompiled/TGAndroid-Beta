package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f39205a = new y4(this);
    public final NotificationCenter f39206b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f39207c;
    public final int d;
    public final int e;
    public bi.h6 f39208f;
    public boolean f39209g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f39207c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
