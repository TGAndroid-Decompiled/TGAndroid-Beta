package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x11 extends org.telegram.ui.ActionBar.o2 {
    public w11 f43451a;
    public org.telegram.ui.Components.lm0 f43452b;
    public int f43453c;
    public int d;
    public int e;
    public int f43454f;
    public int h;
    public org.telegram.ui.Cells.i3[] f43455n;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 27));
        this.f43451a = new w11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f43452b = lm0Var;
        lm0Var.t1();
        this.f43452b.setVerticalScrollBarEnabled(false);
        this.f43452b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f43452b, w7.z5.e(-1, -1, 51));
        this.f43452b.setAdapter(this.f43451a);
        this.actionBar.setAdaptiveBackground(this.f43452b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f43453c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f43454f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.i3[] i3VarArr = this.f43455n;
            if (i10 < i3VarArr.length) {
                org.telegram.ui.Cells.i3 i3Var = i3VarArr[i10];
                if (i3Var != null) {
                    String obj = i3Var.getTextView().getText().toString();
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
        w11 w11Var = this.f43451a;
        if (w11Var != null) {
            w11Var.l();
        }
    }
}
