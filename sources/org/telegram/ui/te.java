package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class te implements Runnable {
    public final int f41821a;
    public final un f41822b;
    public final String f41823c;

    public te(un unVar, String str, int i10) {
        this.f41821a = i10;
        this.f41822b = unVar;
        this.f41823c = str;
    }

    @Override
    public final void run() {
        int i10 = this.f41821a;
        String str = this.f41823c;
        un unVar = this.f41822b;
        switch (i10) {
            case 0:
                un.F0(unVar, str);
                return;
            case 1:
                un.x0(unVar, str);
                return;
            case 2:
                h4.d(str, unVar.currentAccount, unVar.l1, null, unVar.f42477xa);
                return;
            case 3:
                if (str != null) {
                    unVar.getClass();
                    if (str.length() != 0) {
                        unVar.getMessagesController().x4(str, unVar.f42243f);
                        return;
                    }
                }
                unVar.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/start", unVar.f42297j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                unVar.Ba(str);
                return;
            case 5:
                unVar.ta(str, false);
                return;
            case 6:
                Activity parentActivity = unVar.getParentActivity();
                gf.f.r(parentActivity, "tel:" + str);
                return;
            case 7:
                org.telegram.messenger.i0.g(str);
                org.telegram.messenger.z20.r(null, 2131747311, org.telegram.ui.Components.cc.a0(unVar));
                return;
            case 8:
                un.I0(unVar, str);
                return;
            case 9:
                Activity parentActivity2 = unVar.getParentActivity();
                gf.f.r(parentActivity2, "tel:" + str);
                return;
            case 10:
                org.telegram.messenger.i0.g(str);
                org.telegram.messenger.z20.r(null, 2131747311, org.telegram.ui.Components.cc.a0(unVar));
                return;
            case 11:
                unVar.getClass();
                unVar.presentFragment(new org.telegram.ui.Wallet.r9(str));
                return;
            case 12:
                String str2 = unVar.getMessagesController().I6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = unVar.getParentActivity();
                StringBuilder t10 = a1.g.t(str2);
                t10.append(Uri.encode(str));
                gf.f.t(parentActivity3, t10.toString());
                return;
            default:
                Activity parentActivity4 = unVar.getParentActivity();
                gf.f.r(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
