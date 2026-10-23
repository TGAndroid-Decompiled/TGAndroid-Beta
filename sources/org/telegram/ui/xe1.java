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
public final class xe1 extends org.telegram.ui.ActionBar.n2 {
    public ve1 f43206a;
    public org.telegram.ui.Components.jm0 f43207b;
    public long f43208c;
    public ArrayList d;
    public HashSet e;

    public static void U(xe1 xe1Var, int i10) {
        xe1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(xe1Var.f43208c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = xe1Var.getMessagesController().getInputPeer(xe1Var.f43208c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        xe1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ci.e6(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f43206a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new we1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f43208c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f20332id))) {
                    arrayList2.add(new we1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new we1(3, null));
            arrayList2.add(new we1(4, null));
        }
        arrayList2.add(new we1(3, null));
        ve1 ve1Var = this.f43206a;
        if (ve1Var != null) {
            ve1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.e.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f43207b = new org.telegram.ui.Components.jm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f45955m = false;
        this.f43207b.setItemAnimator(kVar);
        this.f43207b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.jm0 jm0Var = this.f43207b;
        ve1 ve1Var = new ve1(this);
        this.f43206a = ve1Var;
        jm0Var.setAdapter(ve1Var);
        this.f43207b.setOnItemClickListener(new ue1(this));
        frameLayout.addView(this.f43207b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43208c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
