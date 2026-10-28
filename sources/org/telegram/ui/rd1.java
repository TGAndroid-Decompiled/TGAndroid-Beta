package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class rd1 extends org.telegram.ui.ActionBar.r2 {
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final y5 I;
    public final o11 J;
    public final jl0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.nm0 f42964a;
    public org.telegram.ui.Components.nm0 f42965b;
    public TextView f42966c;
    public od1 d;
    public qd1 e;
    public final ArrayList f42967f;
    public final ArrayList h;
    public r41 f42968n;
    public org.telegram.ui.Components.uz f42969r;
    public FrameLayout f42970s;
    public int v;
    public final HashSet f42971w;
    public org.telegram.ui.Cells.sa f42972x;
    public ValueAnimator f42973y;

    public rd1(int i10) {
        super(null);
        this.f42967f = new ArrayList();
        this.h = new ArrayList();
        this.f42971w = new HashSet();
        this.H = AndroidUtilities.dp(64.0f);
        this.I = new y5(this, 15);
        this.J = new o11(this, 9);
        this.K = new jl0(this, 23);
        this.arguments = org.telegram.ui.Components.b10.g(i10, "type");
    }

    public final void V() {
        int x02;
        if (this.f42966c != null && ((x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false)) != this.N || this.O != org.telegram.ui.ActionBar.y6.I.q())) {
            this.O = org.telegram.ui.ActionBar.y6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.y6.E1(this.f42966c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.y6.E1(this.f42966c.getBackground(), org.telegram.ui.ActionBar.o6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rd1.W():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23582p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23415g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23524m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new md1(this);
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f42964a = nm0Var;
        nm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f42964a;
        od1 od1Var = new od1(this);
        this.d = od1Var;
        nm0Var2.setAdapter(od1Var);
        this.f42964a.setClipToPadding(false);
        org.telegram.ui.Components.nm0 nm0Var3 = this.f42964a;
        o11 o11Var = this.J;
        nm0Var3.setOnItemClickListener(o11Var);
        org.telegram.ui.Components.nm0 nm0Var4 = this.f42964a;
        jl0 jl0Var = this.K;
        nm0Var4.setOnItemLongClickListener(jl0Var);
        org.telegram.ui.Components.nm0 nm0Var5 = new org.telegram.ui.Components.nm0(context, null);
        this.f42965b = nm0Var5;
        nm0Var5.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var6 = this.f42965b;
        qd1 qd1Var = new qd1(this);
        this.e = qd1Var;
        nm0Var6.setAdapter(qd1Var);
        this.f42965b.setOnItemClickListener(o11Var);
        this.f42965b.setOnItemLongClickListener(jl0Var);
        this.f42965b.setOnScrollListener(new z81(this, 2));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f42969r = uzVar;
        uzVar.setShowAtCenter(true);
        this.f42969r.setText(LocaleController.getString(R.string.NoResult));
        this.f42969r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, org.telegram.ui.Components.kb1.g(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f42964a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42970s = frameLayout2;
        frameLayout2.addView(this.f42965b);
        this.f42970s.addView(this.f42969r);
        this.f42970s.setVisibility(8);
        frameLayout.addView(this.f42970s);
        this.d.l();
        this.E = 0.0f;
        AndroidUtilities.runOnUIThread(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
        org.telegram.ui.ActionBar.f7.i(i10, view, null);
        r41 r41Var = new r41(context, 5);
        this.f42968n = r41Var;
        r41Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f42966c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        this.f42966c.setGravity(17);
        this.f42966c.setTextSize(1, 14.0f);
        this.f42966c.setTypeface(AndroidUtilities.bold());
        this.f42966c.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
        frameLayout.addView(this.f42968n, org.telegram.ui.Components.kb1.i(-1, 64, 80));
        org.telegram.ui.ActionBar.f7.i(i10, this.f42968n, null);
        this.f42968n.addView(this.f42966c, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f42968n.setVisibility(8);
        this.f42966c.setOnClickListener(new v21(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(25, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        int i10 = org.telegram.ui.ActionBar.y6.f23310ai;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42964a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.f23450i7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42964a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.f23467j7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42964a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.f23486k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42964a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42965b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42965b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42965b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42965b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42969r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42966c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42966c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Qh));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V();
            W();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
