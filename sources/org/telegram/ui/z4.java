package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f40089a = new y4(this);
    public final NotificationCenter f40090b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f40091c;
    public final int d;
    public final int e;
    public ci.l5 f40092f;
    public boolean f40093g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f40091c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
