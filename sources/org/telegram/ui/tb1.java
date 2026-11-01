package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tb1 extends org.telegram.ui.ActionBar.k2 {
    public rb1 f41611a;
    public org.telegram.ui.Components.uk0 f41612b;
    public long f41613c;
    public ArrayList d;
    public HashSet e;

    public static void Z(tb1 tb1Var, int i10) {
        org.telegram.messenger.qt qtVar = tb1Var.getNotificationsController().f17654g0;
        qtVar.getClass();
        String v = org.telegram.messenger.pt.v(tb1Var.f41613c, i10, true);
        SharedPreferences.Editor edit = qtVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = tb1Var.getMessagesController().i1(tb1Var.f41613c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        tb1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(4));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f41611a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new sb1(1, null));
        ArrayList l4 = getMessagesController().f19234r7.l(-this.f41613c);
        int i10 = 0;
        if (l4 != null) {
            int i11 = 0;
            while (i10 < l4.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).f19846id))) {
                    arrayList2.add(new sb1(2, (TLRPC.TL_forumTopic) l4.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new sb1(3, null));
            arrayList2.add(new sb1(4, null));
        }
        arrayList2.add(new sb1(3, null));
        rb1 rb1Var = this.f41611a;
        if (rb1Var != null) {
            rb1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new z01(this, 7));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747928, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f41612b = uk0Var;
        uk0Var.r1();
        this.f41612b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47938m = false;
        this.f41612b.setItemAnimator(jVar);
        this.f41612b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f41612b;
        rb1 rb1Var = new rb1(this);
        this.f41611a = rb1Var;
        uk0Var2.setAdapter(rb1Var);
        this.f41612b.setOnItemClickListener(new qb1(this));
        frameLayout.addView(this.f41612b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f41612b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41613c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
