package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z60 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public y60 f46180a;
    public org.telegram.ui.Components.mm0 f46181b;
    public org.telegram.ui.Components.uz f46182c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f46183f;
    public int h;
    public int f46184n;
    public int f46185r;
    public int f46186s;
    public int v;
    public int f46187w;

    public final void V(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new fi.m3(8, this, z10)), this.classGuid);
        y60 y60Var = this.f46180a;
        if (y60Var != null) {
            y60Var.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 3));
        this.f46180a = new y60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f46182c = uzVar;
        uzVar.b();
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f46181b = mm0Var;
        mm0Var.u1();
        this.f46181b.setSectionsDrawBackground(true);
        this.f46181b.setLayoutManager(new s4.c0(1, false));
        this.f46181b.setEmptyView(this.f46182c);
        this.f46181b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f46181b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        frameLayout.addView(this.f46182c, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f46181b.setAdapter(this.f46180a);
        this.f46181b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f22028id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j10);
                this.f46183f = exportedInvite;
                if (exportedInvite == null) {
                    V(false);
                    return;
                }
                this.e = false;
                y60 y60Var = this.f46180a;
                if (y60Var != null) {
                    y60Var.l();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f46181b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f46182c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f46184n = 2;
        this.f46185r = 3;
        this.f46186s = 4;
        this.f46187w = 6;
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
        y60 y60Var = this.f46180a;
        if (y60Var != null) {
            y60Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.uz uzVar = this.f46182c;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23426h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
