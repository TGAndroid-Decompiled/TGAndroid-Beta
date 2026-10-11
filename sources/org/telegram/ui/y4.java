package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f44283a = new x4(this);
    public final NotificationCenter f44284b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44285c;
    public final int d;
    public final int f44286e;
    public ci.j5 f44287f;
    public boolean f44288g;

    public y4(int i10, TLObject tLObject, int i11) {
        this.f44285c = tLObject;
        this.d = i10;
        this.f44286e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
