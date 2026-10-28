package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ux0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.nm0 f44130a;
    public s4.c0 f44131b;
    public tx0 f44132c;
    public org.telegram.ui.Components.uz d;
    public int e;
    public int f44133f;
    public int h;
    public int f44134n;
    public int f44135r;
    public int f44136s;
    public int v;
    public int f44137w;
    public final boolean f44138x;
    public final int f44139y;

    public ux0() {
        super(null);
        this.f44139y = 1;
        this.f44138x = true;
    }

    public final void V(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false)));
        int i11 = this.f44139y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new am0(26, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(i10, new sx0(this, l4), LocaleController.getString(R.string.Remove), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void W() {
        this.e = 0;
        this.f44133f = -1;
        this.f44134n = -1;
        this.h = -1;
        this.f44137w = -1;
        if (!this.f44138x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f44133f = i10;
            int i12 = this.f44139y;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.e;
                        this.e = i13 + 1;
                        this.f44134n = i13;
                    }
                    int i14 = this.e;
                    this.f44135r = i14;
                    int i15 = i14 + size;
                    this.f44136s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f44137w = i16;
                    }
                } else {
                    this.f44134n = -1;
                    this.f44135r = -1;
                    this.f44136s = -1;
                    this.v = -1;
                    this.f44137w = -1;
                }
            } else {
                throw null;
            }
        }
        tx0 tx0Var = this.f44132c;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23693v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23674u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 2;
        int i11 = this.f44139y;
        if (i11 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        if (i11 == 1) {
            uzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            uzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f44130a = nm0Var;
        nm0Var.u1();
        this.f44130a.setItemSelectorColorProvider(new rx0(this));
        this.f44130a.setSectionsDrawBackground(true);
        this.f44130a.setEmptyView(this.d);
        org.telegram.ui.Components.nm0 nm0Var2 = this.f44130a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f44131b = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        this.f44130a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var3 = this.f44130a;
        tx0 tx0Var = new tx0(this, context);
        this.f44132c = tx0Var;
        nm0Var3.setAdapter(tx0Var);
        org.telegram.ui.Components.nm0 nm0Var4 = this.f44130a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        nm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f44130a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f44130a.setOnItemClickListener(new h(this, 28));
        this.f44130a.setOnItemLongClickListener(new rx0(this));
        if (i11 == 1) {
            this.f44130a.setOnScrollListener(new i3(this, 26));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        W();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.nm0 nm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (nm0Var = this.f44130a) != null) {
                int childCount = nm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f44130a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.f5) {
                        ((org.telegram.ui.Cells.f5) childAt).d(intValue);
                    }
                }
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            W();
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f44130a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(18, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44130a, 16, new Class[]{org.telegram.ui.Cells.f5.class, org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.q4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44130a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23749y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44130a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        if (this.f44139y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f44139y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tx0 tx0Var = this.f44132c;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.d;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
