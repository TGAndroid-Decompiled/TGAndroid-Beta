package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

public abstract class z4 {

    public final y4 f45017a = new y4(this);

    public final NotificationCenter f45018b = NotificationCenter.getInstance(UserConfig.selectedAccount);

    public final Object f45019c;
    public final int d;

    public final int f45020e;

    public cg.n0 f45021f;

    public boolean f45022g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.f45019c = tLObject;
        this.d = i10;
        this.f45020e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
