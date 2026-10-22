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
public final class u11 extends org.telegram.ui.ActionBar.n2 {
    public t11 f41788a;
    public org.telegram.ui.Components.jm0 f41789b;
    public int f41790c;
    public int d;
    public int e;
    public int f41791f;
    public int h;
    public org.telegram.ui.Cells.j3[] f41792n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 27));
        this.f41788a = new t11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f41789b = jm0Var;
        jm0Var.p1();
        this.f41789b.setVerticalScrollBarEnabled(false);
        this.f41789b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f41789b, w7.z5.e(-1, -1, 51));
        this.f41789b.setAdapter(this.f41788a);
        this.actionBar.setAdaptiveBackground(this.f41789b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.j3.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21272s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41789b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f41790c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f41791f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.j3[] j3VarArr = this.f41792n;
            if (i10 < j3VarArr.length) {
                org.telegram.ui.Cells.j3 j3Var = j3VarArr[i10];
                if (j3Var != null) {
                    String obj = j3Var.getTextView().getText().toString();
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
        t11 t11Var = this.f41788a;
        if (t11Var != null) {
            t11Var.l();
        }
    }
}
