package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f44476a = new y4(this);
    public final NotificationCenter f44477b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44478c;
    public final int d;
    public final int f44479e;
    public ci.j5 f44480f;
    public boolean f44481g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f44478c = tLObject;
        this.d = i10;
        this.f44479e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
