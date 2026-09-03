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
public final class yy extends org.telegram.ui.ActionBar.p2 {
    public vy f43729a;
    public org.telegram.ui.Components.sl0 f43730b;
    public f2.f0 f43731c;
    public ImageView d;
    public final ArrayList f43732e;
    public xy f43733f;
    public int h;
    public int f43734n;
    public int f43735r;
    public int f43736s;
    public int v;
    public final int f43737w;
    public final int f43738x;
    public a1 f43739y;

    public yy(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f43732e = arrayList;
        this.f43737w = i10;
        this.f43738x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(yy yyVar, Context context, int i10) {
        ArrayList arrayList = yyVar.f43732e;
        if (i10 == yyVar.h) {
            org.telegram.ui.Components.e70 e70Var = new org.telegram.ui.Components.e70(context, yyVar.currentAccount, null, 0L, yyVar, null);
            e70Var.Y(new gu(yyVar, 5));
            e70Var.Z(arrayList);
            yyVar.showDialog(e70Var);
        }
    }

    public static org.telegram.ui.ActionBar.f5 W(yy yyVar) {
        return yyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 X(yy yyVar) {
        return yyVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new zi(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.f43732e;
        if (arrayList.isEmpty()) {
            this.f43734n = -1;
            this.f43735r = -1;
        } else {
            int i10 = this.v;
            this.f43734n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f43735r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f43736s = i11;
        vy vyVar = this.f43729a;
        if (vyVar != null) {
            vyVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f43737w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new sy(this));
        this.f43729a = new vy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f43730b = sl0Var;
        sl0Var.setLayoutManager(new f2.j0(1, false));
        this.f43730b.setVerticalScrollBarEnabled(false);
        this.f43730b.setAdapter(this.f43729a);
        ((f2.l) this.f43730b.getItemAnimator()).C = false;
        frameLayout.addView(this.f43730b, k7.c6.c(-1.0f, -1));
        f2.f0 f0Var = new f2.f0(new wy(this));
        this.f43731c = f0Var;
        f0Var.d(this.f43730b);
        this.f43730b.setOnItemClickListener(new hg.v0(16, this, context));
        this.f43730b.setOnItemLongClickListener(new uy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 16, new Class[]{org.telegram.ui.Cells.o8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.f21896q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43730b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f43739y == null) {
            if (z4) {
                Y();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        py.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
