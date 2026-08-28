package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public s60 f42869a;
    public org.telegram.ui.Components.wk0 f42870b;
    public org.telegram.ui.Components.yy f42871c;
    public long d;
    public boolean f42872e;
    public TLRPC.TL_chatInviteExported f42873f;
    public int h;
    public int f42874n;
    public int f42875r;
    public int f42876s;
    public int v;
    public int f42877w;

    public final void T(boolean z10) {
        this.f42872e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new kh.o3(8, this, z10)), this.classGuid);
        s60 s60Var = this.f42869a;
        if (s60Var != null) {
            s60Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 23));
        this.f42869a = new s60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f42871c = yyVar;
        yyVar.b();
        frameLayout.addView(this.f42871c, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f42870b = wk0Var;
        wk0Var.setLayoutManager(new f2.m0(1, false));
        this.f42870b.setEmptyView(this.f42871c);
        this.f42870b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f42870b, g7.e6.e(-1, -1, 51));
        this.f42870b.setAdapter(this.f42869a);
        this.f42870b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        long j10 = this.d;
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f22381id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j10);
                this.f42873f = exportedInvite;
                if (exportedInvite == null) {
                    T(false);
                    return;
                }
                this.f42872e = false;
                s60 s60Var = this.f42869a;
                if (s60Var != null) {
                    s60Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.n8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42871c, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42870b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f42872e = true;
        this.h = 1;
        this.f42874n = 2;
        this.f42875r = 3;
        this.f42876s = 4;
        this.f42877w = 6;
        this.v = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s60 s60Var = this.f42869a;
        if (s60Var != null) {
            s60Var.l();
        }
    }
}
