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
public final class sf1 extends org.telegram.ui.ActionBar.p2 {
    public qf1 f41277a;
    public org.telegram.ui.Components.tl0 f41278b;
    public long f41279c;
    public ArrayList d;
    public HashSet f41280e;

    public static void U(sf1 sf1Var, int i10) {
        sf1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(sf1Var.f41279c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = sf1Var.getMessagesController().getInputPeer(sf1Var.f41279c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        sf1Var.getConnectionsManager().sendRequest(updatenotifysettings, new oh.p5(4));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f41277a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new rf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f41279c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f41280e.contains(Integer.valueOf(topics.get(i10).f20895id))) {
                    arrayList2.add(new rf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new rf1(3, null));
            arrayList2.add(new rf1(4, null));
        }
        arrayList2.add(new rf1(3, null));
        qf1 qf1Var = this.f41277a;
        if (qf1Var != null) {
            qf1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f41278b = new org.telegram.ui.Components.tl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5910m = false;
        this.f41278b.setItemAnimator(lVar);
        this.f41278b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var = this.f41278b;
        qf1 qf1Var = new qf1(this);
        this.f41277a = qf1Var;
        tl0Var.setAdapter(qf1Var);
        this.f41278b.setOnItemClickListener(new pf1(this));
        frameLayout.addView(this.f41278b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41279c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
