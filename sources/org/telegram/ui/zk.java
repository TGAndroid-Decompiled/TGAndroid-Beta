package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class zk implements MessagesStorage.IntCallback {
    public final sn f44117a;

    public zk(sn snVar) {
        this.f44117a = snVar;
    }

    @Override
    public final void run(int i10) {
        this.f44117a.L9(i10);
    }
}
