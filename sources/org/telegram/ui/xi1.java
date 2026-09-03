package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xi1 extends org.telegram.ui.Components.ql0 {
    public final WallpapersListActivity B;
    public final Context f39997c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f39998f = true;
    public String h;
    public String f39999n;
    public String f40000r;
    public int f40001s;
    public int v;
    public boolean f40002w;
    public String f40003x;
    public sg1 f40004y;

    public xi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.B = wallpapersListActivity;
        this.f39997c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z4) {
        int i10;
        if (str != null && this.f39999n != null) {
            str = android.support.v4.media.a.p(this.f39999n, " ", str, new StringBuilder("#color"));
        }
        sg1 sg1Var = this.f40004y;
        if (sg1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sg1Var);
            this.f40004y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.B;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f39998f = true;
            this.h = null;
            if (this.f40001s != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f40001s, true);
                this.f40001s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z4) {
                arrayList.clear();
                hashMap.clear();
                this.f39998f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                sg1 sg1Var2 = new sg1(5, this, str);
                this.f40004y = sg1Var2;
                AndroidUtilities.runOnUIThread(sg1Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f40001s;
        WallpapersListActivity wallpapersListActivity = this.B;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f40001s, true);
            this.f40001s = 0;
        }
        this.f40003x = str;
        i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z4 && !this.f40002w) {
                this.f40002w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new o(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = vh.w2.e("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        this.f40001s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new lh.s1(this, i20, 8));
        i14 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f40001s;
        i15 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.B.O);
    }

    @Override
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            if (i10 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        Object obj;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.t3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) view;
        WallpapersListActivity wallpapersListActivity = this.B;
        int i12 = i10 * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        int i13 = wallpapersListActivity.O;
        boolean z10 = true;
        if (i12 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 / i13 != ceil - 1) {
            z10 = false;
        }
        yaVar.d(i13, z4, z10);
        for (int i14 = 0; i14 < wallpapersListActivity.O; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            yaVar.e(wallpapersListActivity.v, obj, "", i14);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout yiVar;
        FrameLayout frameLayout;
        Context context = this.f39997c;
        if (i10 != 0) {
            yiVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.t3(context, null);
                }
            } else {
                ?? rb1Var = new rb1(context, 12, null);
                rb1Var.setItemAnimator(null);
                rb1Var.setLayoutAnimation(null);
                k kVar = new k(18);
                rb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                rb1Var.setClipToPadding(false);
                kVar.j1(0);
                rb1Var.setLayoutManager(kVar);
                rb1Var.setAdapter(new eg.g(this, 5));
                rb1Var.setOnItemClickListener(new p21(this, 13));
                frameLayout = rb1Var;
            }
            yiVar = frameLayout;
        } else {
            yiVar = new org.telegram.ui.Components.yi(this, context, 2);
        }
        if (i10 == 1) {
            yiVar.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            yiVar.setLayoutParams(new f2.w0(-1, -2));
        }
        return new f2.l1(yiVar);
    }
}
