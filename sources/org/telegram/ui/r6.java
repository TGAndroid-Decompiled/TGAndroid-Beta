package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class r6 implements Utilities.Callback2 {
    public final int f37715a;
    public final Object f37716b;
    public final Object f37717c;
    public final Object d;

    public r6(Object obj, Object obj2, Object obj3, int i10) {
        this.f37715a = i10;
        this.f37716b = obj;
        this.f37717c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f37715a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f37717c;
        Object obj5 = this.f37716b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(cVar);
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 1:
                zn znVar = (zn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                gg ggVar = (gg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = znVar.f40636jb.keySet().iterator();
                    while (it.hasNext() && znVar.f40636jb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    znVar.f40636jb.put(getwebpagepreview.message, webPage);
                }
                ggVar.run(bool, webPage);
                return;
            case 2:
                final qy qyVar = (qy) obj5;
                pd pdVar = (pd) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new gg.c1(qyVar, l10, pdVar, p2Var), new b0(qyVar, d2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                qy qyVar2 = qyVar;
                                if (qyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.E));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, z4, true, null, runnable, new jf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l11 = l10;
                                    qyVar3.getMessagesController().setUserAdminRole(l11.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l11).admin_rights, qyVar3.D.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new jf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                qy qyVar2 = qyVar;
                                if (qyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.E));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, z4, true, null, runnable, new jf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l11 = l10;
                                    qyVar3.getMessagesController().setUserAdminRole(l11.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l11).admin_rights, qyVar3.D.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new jf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new lh.g2(qyVar, d2Var, l10, pdVar, p2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    g3Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f19362id, passkey.f19362id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ie0(18, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
