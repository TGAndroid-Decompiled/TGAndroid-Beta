package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u41 {
    public TLRPC.User f52527a;
    public String f52528b;

    public static TLRPC.User a(ArrayList arrayList, long j3) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f28641id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.g2 g2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f52527a.f28641id);
        org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).e4(this.f52527a, false, false);
        g2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.b51 r18, final org.telegram.ui.ActionBar.t1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u41.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.b51, org.telegram.ui.ActionBar.t1[], boolean):void");
    }
}
