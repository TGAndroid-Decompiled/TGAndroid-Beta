package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f44249a = new x4(this);
    public final NotificationCenter f44250b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f44251c;
    public final int d;
    public final int f44252e;
    public ci.j5 f44253f;
    public boolean f44254g;

    public y4(int i10, TLObject tLObject, int i11) {
        this.f44251c = tLObject;
        this.d = i10;
        this.f44252e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
