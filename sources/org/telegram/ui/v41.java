package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v41 {
    public TLRPC.User f50573a;
    public String f50574b;

    public static TLRPC.User a(ArrayList arrayList, long j3) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f27102id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f50573a.f27102id);
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).X3(this.f50573a, false, false);
        f2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.c51 r18, final org.telegram.ui.ActionBar.u1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v41.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.c51, org.telegram.ui.ActionBar.u1[], boolean):void");
    }
}
