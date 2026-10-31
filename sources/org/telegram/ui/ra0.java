package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class ra0 extends v50 {
    public ra0(ua0 ua0Var, Bundle bundle) {
        super(bundle);
    }

    public static void y0(ra0 ra0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.vp.r1(ra0Var.currentAccount).V3(updates.users, false);
            org.telegram.messenger.vp.r1(ra0Var.currentAccount).P3(updates.chats, false);
            ArrayList z02 = org.telegram.messenger.vp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            while (i10 < size) {
                Object obj = z02.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.I1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f19810id = groupCall.f19803id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, ra0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.vp.r1(ra0Var.currentAccount).V3(groupcall.users, false);
            org.telegram.messenger.vp.r1(ra0Var.currentAccount).P3(groupcall.chats, false);
            if (LaunchActivity.I1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f19810id = groupCall2.f19803id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, ra0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            ua0.d().f0(tL_error, false);
        }
    }

    @Override
    public final void r0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User Z1 = getMessagesController().Z1((Long) hashSet.iterator().next());
            TLRPC.UserFull a2 = getMessagesController().a2(Z1.f19942id);
            if (a2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f19935id = getMessagesController().n1(Z1.f19942id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new org.telegram.ui.Components.t20(19, this, Z1));
                return;
            }
            org.telegram.ui.Components.voip.m1.m(Z1, false, a2.video_calls_available, getParentActivity(), a2, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f14519b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new org.telegram.ui.Components.t20(20, this, hashSet));
        }
        finishFragment();
    }
}
