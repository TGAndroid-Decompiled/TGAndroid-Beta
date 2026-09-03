package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class tx0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.sl0 f41649a;
    public f2.j0 f41650b;
    public sx0 f41651c;
    public org.telegram.ui.Components.oz d;
    public int f41652e;
    public int f41653f;
    public int h;
    public int f41654n;
    public int f41655r;
    public int f41656s;
    public int v;
    public int f41657w;
    public final boolean f41658x;
    public final int f41659y;

    public tx0() {
        super(null);
        this.f41659y = 1;
        this.f41658x = true;
    }

    public final void U(Long l10, View view) {
        boolean z4;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false)));
        int i11 = this.f41659y;
        if (i11 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new pr0(14, this, l10), z4);
        if (i11 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z10, i10, LocaleController.getString(R.string.Remove), true, new rx0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f41652e = 0;
        this.f41653f = -1;
        this.f41654n = -1;
        this.h = -1;
        this.f41657w = -1;
        if (!this.f41658x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f41652e;
            int i11 = i10 + 1;
            this.f41652e = i11;
            this.f41653f = i10;
            int i12 = this.f41659y;
            if (i12 == 1) {
                this.f41652e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f41652e;
                        this.f41652e = i13 + 1;
                        this.f41654n = i13;
                    }
                    int i14 = this.f41652e;
                    this.f41655r = i14;
                    int i15 = i14 + size;
                    this.f41656s = i15;
                    int i16 = i15 + 1;
                    this.f41652e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f41652e = i15 + 2;
                        this.f41657w = i16;
                    }
                } else {
                    this.f41654n = -1;
                    this.f41655r = -1;
                    this.f41656s = -1;
                    this.v = -1;
                    this.f41657w = -1;
                }
            } else {
                throw null;
            }
        }
        sx0 sx0Var = this.f41651c;
        if (sx0Var != null) {
            sx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f41659y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.d = ozVar;
        if (i11 == 1) {
            ozVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            ozVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f41649a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f41649a);
        this.f41649a.setItemSelectorColorProvider(new qx0(this));
        this.f41649a.setEmptyView(this.d);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f41649a;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f41650b = j0Var;
        sl0Var2.setLayoutManager(j0Var);
        this.f41649a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f41649a;
        sx0 sx0Var = new sx0(this, context);
        this.f41651c = sx0Var;
        sl0Var3.setAdapter(sx0Var);
        org.telegram.ui.Components.sl0 sl0Var4 = this.f41649a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        sl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f41649a, k7.c6.c(-1.0f, -1));
        this.f41649a.setOnItemClickListener(new j(this, 27));
        this.f41649a.setOnItemLongClickListener(new qx0(this));
        if (i11 == 1) {
            this.f41649a.setOnScrollListener(new l3(this, 25));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        V();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sl0 sl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (sl0Var = this.f41649a) != null) {
                int childCount = sl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f41649a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).c(intValue);
                    }
                }
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            V();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21644c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21734h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21963u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41649a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21981v6));
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
        if (this.f41659y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f41659y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41649a.setPadding(0, 0, 0, i13);
        this.f41649a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        sx0 sx0Var = this.f41651c;
        if (sx0Var != null) {
            sx0Var.l();
        }
    }
}
