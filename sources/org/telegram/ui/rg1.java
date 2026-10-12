package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rg1 extends org.telegram.ui.ActionBar.m2 {
    public pg1 f39795a;
    public org.telegram.ui.Components.mm0 f39796b;
    public long f39797c;
    public ArrayList d;
    public HashSet e;

    public static void U(rg1 rg1Var, int i10) {
        rg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(rg1Var.f39797c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = rg1Var.getMessagesController().getInputPeer(rg1Var.f39797c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        rg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new bi.g7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f39795a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new qg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f39797c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f19268id))) {
                    arrayList2.add(new qg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new qg1(3, null));
            arrayList2.add(new qg1(4, null));
        }
        arrayList2.add(new qg1(3, null));
        pg1 pg1Var = this.f39795a;
        if (pg1Var != null) {
            pg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f39796b = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f44872m = false;
        this.f39796b.setItemAnimator(kVar);
        this.f39796b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var = this.f39796b;
        pg1 pg1Var = new pg1(this);
        this.f39795a = pg1Var;
        mm0Var.setAdapter(pg1Var);
        this.f39796b.setOnItemClickListener(new og1(this));
        frameLayout.addView(this.f39796b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39797c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
