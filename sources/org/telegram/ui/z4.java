package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f40118a = new y4(this);
    public final NotificationCenter f40119b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f40120c;
    public final int d;
    public final int e;
    public ci.l5 f40121f;
    public boolean f40122g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f40120c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
