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
public final class sx0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.mm0 f43613a;
    public s4.c0 f43614b;
    public rx0 f43615c;
    public org.telegram.ui.Components.uz d;
    public int e;
    public int f43616f;
    public int h;
    public int f43617n;
    public int f43618r;
    public int f43619s;
    public int v;
    public int f43620w;
    public final boolean f43621x;
    public final int f43622y;

    public sx0() {
        super(null);
        this.f43622y = 1;
        this.f43621x = true;
    }

    public final void V(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)));
        int i11 = this.f43622y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new yl0(25, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(i10, new qx0(this, l4), LocaleController.getString(R.string.Remove), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void W() {
        this.e = 0;
        this.f43616f = -1;
        this.f43617n = -1;
        this.h = -1;
        this.f43620w = -1;
        if (!this.f43621x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f43616f = i10;
            int i12 = this.f43622y;
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
                        this.f43617n = i13;
                    }
                    int i14 = this.e;
                    this.f43618r = i14;
                    int i15 = i14 + size;
                    this.f43619s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f43620w = i16;
                    }
                } else {
                    this.f43617n = -1;
                    this.f43618r = -1;
                    this.f43619s = -1;
                    this.v = -1;
                    this.f43620w = -1;
                }
            } else {
                throw null;
            }
        }
        rx0 rx0Var = this.f43615c;
        if (rx0Var != null) {
            rx0Var.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23690v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23671u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23518m6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 2;
        int i11 = this.f43622y;
        if (i11 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        if (i11 == 1) {
            uzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            uzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f43613a = mm0Var;
        mm0Var.u1();
        this.f43613a.setItemSelectorColorProvider(new px0(this));
        this.f43613a.setSectionsDrawBackground(true);
        this.f43613a.setEmptyView(this.d);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f43613a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f43614b = c0Var;
        mm0Var2.setLayoutManager(c0Var);
        this.f43613a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f43613a;
        rx0 rx0Var = new rx0(this, context);
        this.f43615c = rx0Var;
        mm0Var3.setAdapter(rx0Var);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f43613a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        mm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f43613a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f43613a.setOnItemClickListener(new h(this, 28));
        this.f43613a.setOnItemLongClickListener(new px0(this));
        if (i11 == 1) {
            this.f43613a.setOnScrollListener(new i3(this, 26));
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
        org.telegram.ui.Components.mm0 mm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (mm0Var = this.f43613a) != null) {
                int childCount = mm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f43613a.getChildAt(i12);
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
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f43613a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(18, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43613a, 16, new Class[]{org.telegram.ui.Cells.f5.class, org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.q4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43613a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23746y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43613a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23538n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.f43622y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f43622y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rx0 rx0Var = this.f43615c;
        if (rx0Var != null) {
            rx0Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.d;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23426h6, false));
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
