package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class z4 {
    public final y4 f40059a = new y4(this);
    public final NotificationCenter f40060b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f40061c;
    public final int d;
    public final int e;
    public ci.l5 f40062f;
    public boolean f40063g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f40061c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
