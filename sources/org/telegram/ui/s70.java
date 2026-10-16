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
public final class s70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public r70 f39705a;
    public org.telegram.ui.Components.mm0 f39706b;
    public org.telegram.ui.Components.yz f39707c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f39708f;
    public int h;
    public int f39709n;
    public int f39710r;
    public int f39711s;
    public int v;
    public int f39712w;

    public final void U(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.s3(8, this, z10)), this.classGuid);
        r70 r70Var = this.f39705a;
        if (r70Var != null) {
            r70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 0));
        this.f39705a = new r70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f39707c = yzVar;
        yzVar.b();
        frameLayout.addView(this.f39707c, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39706b = mm0Var;
        mm0Var.setLayoutManager(new s4.b0(1, false));
        this.f39706b.setEmptyView(this.f39707c);
        this.f39706b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f39706b, w7.z5.e(-1, -1, 51));
        this.f39706b.setAdapter(this.f39705a);
        this.f39706b.setOnItemClickListener(new i(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f18917id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j10);
                this.f39708f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.e = false;
                r70 r70Var = this.f39705a;
                if (r70Var != null) {
                    r70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39707c, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f19673h6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39706b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f39709n = 2;
        this.f39710r = 3;
        this.f39711s = 4;
        this.f39712w = 6;
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
        r70 r70Var = this.f39705a;
        if (r70Var != null) {
            r70Var.l();
        }
    }
}
