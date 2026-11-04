package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s91 extends org.telegram.ui.ActionBar.d2 {
    public q91 f49451a;
    public org.telegram.ui.Components.tj0 f49452b;
    public long f49453c;
    public ArrayList d;
    public HashSet f49454e;

    public static void Z(s91 s91Var, int i3) {
        org.telegram.messenger.ws wsVar = s91Var.getNotificationsController().f25767h0;
        wsVar.getClass();
        String v = org.telegram.messenger.us.v(s91Var.f49453c, i3, true);
        SharedPreferences.Editor edit = wsVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = s91Var.getMessagesController().j1(s91Var.f49453c);
        tL_inputNotifyForumTopic.top_msg_id = i3;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        s91Var.getConnectionsManager().sendRequest(updatenotifysettings, new ei.u5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f49451a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new r91(1, null));
        ArrayList l10 = getMessagesController().f23102q7.l(-this.f49453c);
        int i3 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i3 < l10.size()) {
                if (this.f49454e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i3)).f27053id))) {
                    arrayList2.add(new r91(2, (TLRPC.TL_forumTopic) l10.get(i3)));
                    i10 = 1;
                }
                i3++;
            }
            i3 = i10;
        }
        if (i3 != 0) {
            arrayList2.add(new r91(3, null));
            arrayList2.add(new r91(4, null));
        }
        arrayList2.add(new r91(3, null));
        q91 q91Var = this.f49451a;
        if (q91Var != null) {
            q91Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 17));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747920, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f49452b = tj0Var;
        tj0Var.r1();
        this.f49452b.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.f55567m = false;
        this.f49452b.setItemAnimator(kVar);
        this.f49452b.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f49452b;
        q91 q91Var = new q91(this);
        this.f49451a = q91Var;
        tj0Var2.setAdapter(q91Var);
        this.f49452b.setOnItemClickListener(new p91(this));
        frameLayout.addView(this.f49452b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f49452b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f49453c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
