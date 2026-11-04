package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r4 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public q4 f49024a;
    public q4 f49025b;
    public q4 f49026c;
    public q4 d;
    public q4 f49027e;
    public LinearLayout f49028f;
    public final ArrayList h;
    public int f49029n;
    public org.telegram.ui.Components.km0 f49030r;

    public r4() {
        super(null);
        this.h = new ArrayList();
        this.f49029n = 0;
    }

    public final int Z() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 < arrayList.size()) {
                if (((q4) arrayList.get(i3)).f29346b.f31589f) {
                    return ((q4) arrayList.get(i3)).f48748e;
                }
                i3++;
            } else {
                return this.f49029n;
            }
        }
    }

    public final void a0(int i3, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f40452f);
        TransitionManager.beginDelayedTransition(this.f49028f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((q4) arrayList.get(i10)).f48748e == i3) {
                    b0((View) arrayList.get(i10), z10);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((q4) arrayList.get(i11)).d) {
                        this.f49028f.removeView((View) arrayList.get(i11));
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (i3 < ((q4) arrayList.get(i12)).f48748e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
                h6Var.d = true;
                h6Var.f48748e = i3;
                h6Var.c(org.telegram.messenger.bd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.bd.c0(i3 * 60)), false, true);
                arrayList.add(size, h6Var);
                this.f49028f.addView((View) h6Var, size);
                c0();
                b0(h6Var, z10);
                return;
            }
        }
    }

    public final void b0(View view, boolean z10) {
        int i3;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == view) {
                ((q4) arrayList.get(i10)).a(true, this.fragmentBeginToShow);
            } else {
                ((q4) arrayList.get(i10)).a(false, this.fragmentBeginToShow);
            }
            i10++;
        }
        if (z10 && (i3 = ((q4) view).f48748e) > 0) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.bd.c0(i3 * 60)), org.telegram.ui.Components.fc.a0(this), 2131624020, 36);
        }
    }

    public final void c0() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 < arrayList.size()) {
                int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
                org.telegram.ui.ActionBar.r6.R((View) arrayList.get(i3), org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), null);
                ((q4) arrayList.get(i3)).setOnClickListener(new a(this, 3));
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(getParentActivity());
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(getParentActivity(), jm0Var, this.resourceProvider, true);
        this.f49030r = km0Var;
        km0Var.setDrawBackground(true);
        this.f49030r.setOverScrollMode(0);
        jm0Var.setOrientation(1);
        this.f49030r.addView(jm0Var);
        frameLayout.addView(this.f49030r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, this.currentAccount);
        av0Var.setStickerNum(10);
        frameLayout2.addView(av0Var, b8.mf.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        jm0Var.addView(frameLayout2, b8.mf.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f49028f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this.f49028f, null);
        jm0Var.addView(this.f49028f, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.bd.M0(2131748595, null));
        this.f49028f.addView(n4Var);
        ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f49024a = h6Var;
        h6Var.c(org.telegram.messenger.bd.M0(2131745371, null), false, true);
        q4 q4Var = this.f49024a;
        q4Var.f48748e = 0;
        this.f49028f.addView(q4Var);
        ?? h6Var2 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f49025b = h6Var2;
        h6Var2.c(org.telegram.messenger.bd.M0(2131753875, null), false, true);
        q4 q4Var2 = this.f49025b;
        q4Var2.f48748e = 1440;
        this.f49028f.addView(q4Var2);
        ?? h6Var3 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f49026c = h6Var3;
        h6Var3.c(org.telegram.messenger.bd.M0(2131753873, null), false, true);
        q4 q4Var3 = this.f49026c;
        q4Var3.f48748e = 10080;
        this.f49028f.addView(q4Var3);
        ?? h6Var4 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.d = h6Var4;
        h6Var4.c(org.telegram.messenger.bd.M0(2131753874, null), false, true);
        q4 q4Var4 = this.d;
        q4Var4.f48748e = 44640;
        this.f49028f.addView(q4Var4);
        ?? h6Var5 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f49027e = h6Var5;
        h6Var5.c(org.telegram.messenger.bd.M0(2131745544, null), false, false);
        this.f49027e.f29346b.setVisibility(8);
        this.f49028f.addView(this.f49027e);
        q4 q4Var5 = this.f49024a;
        ArrayList arrayList = this.h;
        arrayList.add(q4Var5);
        arrayList.add(this.f49025b);
        arrayList.add(this.f49026c);
        arrayList.add(this.d);
        arrayList.add(this.f49027e);
        c0();
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        y8Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131749544, null), new o4(this, 0)));
        jm0Var.addView(y8Var, b8.mf.o(-1, -2));
        a0(this.f49029n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.f49030r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3 = getUserConfig().f22852q0;
        this.f49029n = i3;
        if (i3 < 0) {
            this.f49029n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23304s5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23304s5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 < arrayList.size()) {
                if (((q4) arrayList.get(i3)).f29346b.f31589f) {
                    if (((q4) arrayList.get(i3)).f48748e != this.f49029n) {
                        this.f49029n = ((q4) arrayList.get(i3)).f48748e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((q4) arrayList.get(i3)).f48748e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f22852q0 = this.f49029n;
                        org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.f23304s5, new Object[0]);
                        return;
                    }
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
    }
}
