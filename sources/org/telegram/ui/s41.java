package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s41 {
    public TLRPC.User f51094a;
    public String f51095b;

    public static TLRPC.User a(ArrayList arrayList, long j3) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f28200id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.e2 e2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f51094a.f28200id);
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).X3(this.f51094a, false, false);
        e2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.z41 r18, final org.telegram.ui.ActionBar.t1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s41.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.z41, org.telegram.ui.ActionBar.t1[], boolean):void");
    }
}
