package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f44474a = new y4(this);
    public final NotificationCenter f44475b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44476c;
    public final int d;
    public final int f44477e;
    public ci.j5 f44478f;
    public boolean f44479g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f44476c = tLObject;
        this.d = i10;
        this.f44477e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
