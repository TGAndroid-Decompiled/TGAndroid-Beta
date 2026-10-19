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
public final class u60 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public t60 f41804a;
    public org.telegram.ui.Components.im0 f41805b;
    public org.telegram.ui.Components.vz f41806c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f41807f;
    public int h;
    public int f41808n;
    public int f41809r;
    public int f41810s;
    public int v;
    public int f41811w;

    public final void U(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ei.o3(8, this, z10)), this.classGuid);
        t60 t60Var = this.f41804a;
        if (t60Var != null) {
            t60Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 1));
        this.f41804a = new t60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20929a7, false));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f41806c = vzVar;
        vzVar.b();
        frameLayout.addView(this.f41806c, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f41805b = im0Var;
        im0Var.setLayoutManager(new s4.b0(1, false));
        this.f41805b.setEmptyView(this.f41806c);
        this.f41805b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41805b, w7.z5.e(-1, -1, 51));
        this.f41805b.setAdapter(this.f41804a);
        this.f41805b.setOnItemClickListener(new i(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f20274id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j10);
                this.f41807f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.e = false;
                t60 t60Var = this.f41804a;
                if (t60Var != null) {
                    t60Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.o8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20987d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20929a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21266s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21322v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21285t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21076i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21108k0, null, null, org.telegram.ui.ActionBar.h6.f20988d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41806c, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21059h6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20949b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41805b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f41808n = 2;
        this.f41809r = 3;
        this.f41810s = 4;
        this.f41811w = 6;
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
        t60 t60Var = this.f41804a;
        if (t60Var != null) {
            t60Var.l();
        }
    }
}
