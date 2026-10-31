package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vb1 extends org.telegram.ui.ActionBar.k2 {
    public tb1 f42697a;
    public org.telegram.ui.Components.tk0 f42698b;
    public long f42699c;
    public ArrayList d;
    public HashSet e;

    public static void Y(vb1 vb1Var, int i10) {
        org.telegram.messenger.pt ptVar = vb1Var.getNotificationsController().f17321g0;
        ptVar.getClass();
        String v = org.telegram.messenger.ot.v(vb1Var.f42699c, i10, true);
        SharedPreferences.Editor edit = ptVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = vb1Var.getMessagesController().i1(vb1Var.f42699c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        vb1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(4));
    }

    public final void Z() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f42697a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ub1(1, null));
        ArrayList l4 = getMessagesController().f18891r7.l(-this.f42699c);
        int i10 = 0;
        if (l4 != null) {
            int i11 = 0;
            while (i10 < l4.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).f19845id))) {
                    arrayList2.add(new ub1(2, (TLRPC.TL_forumTopic) l4.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ub1(3, null));
            arrayList2.add(new ub1(4, null));
        }
        arrayList2.add(new ub1(3, null));
        tb1 tb1Var = this.f42697a;
        if (tb1Var != null) {
            tb1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 7));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747928, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f42698b = tk0Var;
        tk0Var.r1();
        this.f42698b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47927m = false;
        this.f42698b.setItemAnimator(jVar);
        this.f42698b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.f42698b;
        tb1 tb1Var = new tb1(this);
        this.f42697a = tb1Var;
        tk0Var2.setAdapter(tb1Var);
        this.f42698b.setOnItemClickListener(new sb1(this));
        frameLayout.addView(this.f42698b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f42698b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42699c = this.arguments.getLong("dialog_id");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
