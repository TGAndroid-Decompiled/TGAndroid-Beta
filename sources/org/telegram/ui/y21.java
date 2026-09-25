package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y21 extends org.telegram.ui.ActionBar.m2 {
    public x21 f40036a;
    public org.telegram.ui.Components.wl0 f40037b;
    public int f40038c;
    public int d;
    public int e;
    public int f40039f;
    public int h;
    public org.telegram.ui.Cells.k3[] f40040n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 24));
        this.f40036a = new x21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f40037b = wl0Var;
        wl0Var.p1();
        this.f40037b.setVerticalScrollBarEnabled(false);
        this.f40037b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f40037b, w7.y5.e(-1, -1, 51));
        this.f40037b.setAdapter(this.f40036a);
        this.actionBar.setAdaptiveBackground(this.f40037b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.k3.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19004a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19338s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19393v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19357t8));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 8388608, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19149i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19181k0, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40037b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f40038c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f40039f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.k3[] k3VarArr = this.f40040n;
            if (i10 < k3VarArr.length) {
                org.telegram.ui.Cells.k3 k3Var = k3VarArr[i10];
                if (k3Var != null) {
                    String obj = k3Var.getTextView().getText().toString();
                    if (!TextUtils.isEmpty(obj)) {
                        edit.putString("quick_reply_msg" + (i10 + 1), obj);
                    } else {
                        edit.remove("quick_reply_msg" + (i10 + 1));
                    }
                }
                i10++;
            } else {
                edit.commit();
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        x21 x21Var = this.f40036a;
        if (x21Var != null) {
            x21Var.l();
        }
    }
}
