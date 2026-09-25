package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zy extends org.telegram.ui.ActionBar.m2 {
    public wy f40595a;
    public org.telegram.ui.Components.wl0 f40596b;
    public s4.y f40597c;
    public ImageView d;
    public final ArrayList e;
    public yy f40598f;
    public int h;
    public int f40599n;
    public int f40600r;
    public int f40601s;
    public int v;
    public final int f40602w;
    public final int f40603x;
    public z0 f40604y;

    public zy(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f40602w = i10;
        this.f40603x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(zy zyVar, Context context, int i10) {
        ArrayList arrayList = zyVar.e;
        if (i10 == zyVar.h) {
            org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, zyVar.currentAccount, null, 0L, zyVar, null);
            m70Var.Y(new du(zyVar, 5));
            m70Var.Z(arrayList);
            zyVar.showDialog(m70Var);
        }
    }

    public static org.telegram.ui.ActionBar.b5 W(zy zyVar) {
        return zyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(zy zyVar) {
        return zyVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new aj(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f40599n = -1;
            this.f40600r = -1;
        } else {
            int i10 = this.v;
            this.f40599n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f40600r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f40601s = i11;
        wy wyVar = this.f40595a;
        if (wyVar != null) {
            wyVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f40602w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ty(this));
        this.f40595a = new wy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f40596b = wl0Var;
        wl0Var.setLayoutManager(new s4.c0(1, false));
        this.f40596b.setVerticalScrollBarEnabled(false);
        this.f40596b.setAdapter(this.f40595a);
        ((s4.j) this.f40596b.getItemAnimator()).C = false;
        frameLayout.addView(this.f40596b, w7.y5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new xy(this));
        this.f40597c = yVar;
        yVar.e(this.f40596b);
        this.f40596b.setOnItemClickListener(new ai.n6(16, this, context));
        this.f40596b.setOnItemLongClickListener(new vy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19004a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19338s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19393v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19357t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19149i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19181k0, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19024b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40596b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f40604y == null) {
            if (z10) {
                Y();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        qy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
