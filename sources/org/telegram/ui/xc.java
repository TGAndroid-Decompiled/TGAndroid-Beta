package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class xc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final int f43535a;
    public final org.telegram.ui.ActionBar.p6 f43536b;
    public final ArrayList f43537c;
    public final w71 d;
    public final org.telegram.ui.Components.zz e;
    public boolean f43538f;
    public final vc h;
    public boolean f43539n;
    public org.telegram.messenger.q20 f43540r;
    public String f43541s;
    public TLRPC.WallPaper f43542w;
    public final HashMap f43543x;
    public final HashMap f43544y;

    public xc(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f43537c = new ArrayList();
        this.f43543x = new HashMap();
        this.f43544y = new HashMap();
        this.f43535a = i10;
        this.f43536b = p6Var;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), p6Var);
        this.e = zzVar;
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        w71 w71Var = new w71(2, activity, p6Var);
        this.d = w71Var;
        w71Var.setClipToPadding(false);
        w71Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f));
        getContext();
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        w71Var.setLayoutManager(a0Var);
        w71Var.setAlpha(0.0f);
        vc vcVar = new vc(this, i10, p6Var);
        this.h = vcVar;
        w71Var.setAdapter(vcVar);
        addView(w71Var, w7.b6.c(130.0f, -1));
        w71Var.setOnItemClickListener(new g(this, 3));
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i10);
        f7.m(true);
        f7.m(false);
        f7.l(true);
        f7.l(false);
        f7.q(new wc(this, i10), true);
        if (!this.f43539n) {
            org.telegram.messenger.i0.Y3(zzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.i0.Y3(zzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f43541s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43537c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43541s, cpVar.a()) && (!TextUtils.isEmpty(str) || !cpVar.f25123a.f21558a)) {
                z11 = false;
            }
            cpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        w71 w71Var = this.d;
        if (i10 >= 0 && !z10 && (w71Var.getLayoutManager() instanceof s4.a0)) {
            ((s4.a0) w71Var.getLayoutManager()).h1(i10, (org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < w71Var.getChildCount(); i12++) {
            View childAt = w71Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.e11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.e11) childAt).g(((org.telegram.ui.Components.cp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f43542w = wallPaper;
        org.telegram.messenger.i0.d0(this.d, new tc(this, 1));
        if (this.f43542w != null) {
            ArrayList arrayList = this.f43537c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.cp) arrayList.get(0)).f25123a.f21558a) && this.f43538f) {
                arrayList.add(0, new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.y3.a(this.f43535a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.q20 q20Var) {
        this.f43540r = q20Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43538f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        vc vcVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43536b;
        if (p6Var != null) {
            r02 = p6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.t6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f43537c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i10);
            if (cpVar.f25125c != r02) {
                cpVar.f25125c = r02;
                z10 = true;
            }
            i10++;
        }
        w71 w71Var = this.d;
        if (w71Var != null) {
            org.telegram.messenger.i0.d0(w71Var, new tc(this, 0));
            if (z10 && (vcVar = this.h) != null) {
                vcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
