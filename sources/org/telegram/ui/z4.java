package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f44520a = new y4(this);
    public final NotificationCenter f44521b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44522c;
    public final int d;
    public final int f44523e;
    public ci.j5 f44524f;
    public boolean f44525g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f44522c = tLObject;
        this.d = i10;
        this.f44523e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
