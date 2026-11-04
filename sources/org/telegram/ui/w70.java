package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w70 implements org.telegram.messenger.lr {
    public final LaunchActivity f50726a;
    public final int f50727b;
    public final uw f50728c;
    public final boolean d;
    public final ArrayList f50729e;
    public final Uri f50730f;
    public final org.telegram.ui.ActionBar.s1 h;

    public w70(LaunchActivity launchActivity, int i3, uw uwVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f50726a = launchActivity;
        this.f50727b = i3;
        this.f50728c = uwVar;
        this.d = z10;
        this.f50729e = arrayList;
        this.f50730f = uri;
        this.h = s1Var;
    }

    @Override
    public final void run(long j10) {
        boolean z10;
        org.telegram.ui.ActionBar.s1 s1Var = this.h;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f50726a;
        boolean z11 = false;
        if (i3 != 0) {
            String str = LaunchActivity.E1;
            Bundle k10 = a1.g.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.hs.f(this.f50727b).k(org.telegram.messenger.hs.f23305t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            wm wmVar = new wm(k10);
            wmVar.L9 = true;
            org.telegram.ui.ActionBar.q4 M = launchActivity.M();
            uw uwVar = this.f50728c;
            if (uwVar == null && !this.d) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (uwVar == null) {
                z11 = true;
            }
            ((ActionBarLayout) M).V(wmVar, z10, z11);
        } else {
            ArrayList arrayList = this.f50729e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, this.f50730f);
            launchActivity.j0(true);
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
