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
public final class ze1 extends org.telegram.ui.ActionBar.n2 {
    public xe1 f43722a;
    public org.telegram.ui.Components.im0 f43723b;
    public long f43724c;
    public ArrayList d;
    public HashSet e;

    public static void U(ze1 ze1Var, int i10) {
        ze1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(ze1Var.f43724c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.f43724c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ze1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ci.d6(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f43722a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ye1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f43724c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f20324id))) {
                    arrayList2.add(new ye1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ye1(3, null));
            arrayList2.add(new ye1(4, null));
        }
        arrayList2.add(new ye1(3, null));
        xe1 xe1Var = this.f43722a;
        if (xe1Var != null) {
            xe1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f43723b = new org.telegram.ui.Components.im0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f45944m = false;
        this.f43723b.setItemAnimator(kVar);
        this.f43723b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.im0 im0Var = this.f43723b;
        xe1 xe1Var = new xe1(this);
        this.f43722a = xe1Var;
        im0Var.setAdapter(xe1Var);
        this.f43723b.setOnItemClickListener(new we1(this));
        frameLayout.addView(this.f43723b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43724c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
