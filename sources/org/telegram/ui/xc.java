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
    public final int f43338a;
    public final org.telegram.ui.ActionBar.p6 f43339b;
    public final ArrayList f43340c;
    public final u71 d;
    public final org.telegram.ui.Components.zz e;
    public boolean f43341f;
    public final vc h;
    public boolean f43342n;
    public org.telegram.messenger.r20 f43343r;
    public String f43344s;
    public TLRPC.WallPaper f43345w;
    public final HashMap f43346x;
    public final HashMap f43347y;

    public xc(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f43340c = new ArrayList();
        this.f43346x = new HashMap();
        this.f43347y = new HashMap();
        this.f43338a = i10;
        this.f43339b = p6Var;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), p6Var);
        this.e = zzVar;
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        u71 u71Var = new u71(2, activity, p6Var);
        this.d = u71Var;
        u71Var.setClipToPadding(false);
        u71Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f));
        getContext();
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        u71Var.setLayoutManager(a0Var);
        u71Var.setAlpha(0.0f);
        vc vcVar = new vc(this, i10, p6Var);
        this.h = vcVar;
        u71Var.setAdapter(vcVar);
        addView(u71Var, w7.b6.c(130.0f, -1));
        u71Var.setOnItemClickListener(new g(this, 3));
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i10);
        f7.m(true);
        f7.m(false);
        f7.l(true);
        f7.l(false);
        f7.q(new wc(this, i10), true);
        if (!this.f43342n) {
            org.telegram.messenger.i0.Y3(zzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.i0.Y3(zzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f43344s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43340c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43344s, cpVar.a()) && (!TextUtils.isEmpty(str) || !cpVar.f25197a.f21559a)) {
                z11 = false;
            }
            cpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        u71 u71Var = this.d;
        if (i10 >= 0 && !z10 && (u71Var.getLayoutManager() instanceof s4.a0)) {
            ((s4.a0) u71Var.getLayoutManager()).h1(i10, (org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < u71Var.getChildCount(); i12++) {
            View childAt = u71Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.f11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.f11) childAt).g(((org.telegram.ui.Components.cp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f43345w = wallPaper;
        org.telegram.messenger.i0.d0(this.d, new tc(this, 1));
        if (this.f43345w != null) {
            ArrayList arrayList = this.f43340c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.cp) arrayList.get(0)).f25197a.f21559a) && this.f43341f) {
                arrayList.add(0, new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.y3.a(this.f43338a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.r20 r20Var) {
        this.f43343r = r20Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43341f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        vc vcVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43339b;
        if (p6Var != null) {
            r02 = p6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.t6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f43340c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(i10);
            if (cpVar.f25199c != r02) {
                cpVar.f25199c = r02;
                z10 = true;
            }
            i10++;
        }
        u71 u71Var = this.d;
        if (u71Var != null) {
            org.telegram.messenger.i0.d0(u71Var, new tc(this, 0));
            if (z10 && (vcVar = this.h) != null) {
                vcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
