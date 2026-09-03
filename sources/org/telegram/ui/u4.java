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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u4 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public t4 f38689a;
    public t4 f38690b;
    public t4 f38691c;
    public t4 d;
    public t4 e;
    public LinearLayout f38692f;
    public final ArrayList h;
    public int f38693n;

    public u4() {
        super(null);
        this.h = new ArrayList();
        this.f38693n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((t4) arrayList.get(i10)).f21189b.f23122f) {
                    return ((t4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f38693n;
            }
        }
    }

    public final void V(int i10, boolean z4) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.mr.f27122f);
        TransitionManager.beginDelayedTransition(this.f38692f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((t4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z4);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((t4) arrayList.get(i12)).d) {
                        this.f38692f.removeView((View) arrayList.get(i12));
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    } else if (i10 < ((t4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
                i6Var.d = true;
                i6Var.e = i10;
                i6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, i6Var);
                this.f38692f.addView((View) i6Var, size);
                X();
                W(i6Var, z4);
                return;
            }
        }
    }

    public final void W(View view, boolean z4) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((t4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((t4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z4 && (i10 = ((t4) view).e) > 0) {
            org.telegram.ui.Components.qc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((t4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false)));
                ((t4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        dg.u3 u3Var = new dg.u3(getParentActivity());
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(getParentActivity(), u3Var, this.resourceProvider, true);
        u3Var.setOrientation(1);
        do0Var.addView(u3Var);
        frameLayout.addView(do0Var);
        this.actionBar.setAdaptiveBackground(do0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, this.currentAccount);
        ax0Var.setStickerNum(10);
        frameLayout2.addView(ax0Var, k7.b6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        u3Var.addView(frameLayout2, k7.b6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f38692f = linearLayout;
        linearLayout.setOrientation(1);
        this.f38692f.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        u3Var.addView(this.f38692f, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f38692f.addView(l4Var);
        ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f38689a = i6Var;
        i6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        t4 t4Var = this.f38689a;
        t4Var.e = 0;
        this.f38692f.addView(t4Var);
        ?? i6Var2 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f38690b = i6Var2;
        i6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        t4 t4Var2 = this.f38690b;
        t4Var2.e = 1440;
        this.f38692f.addView(t4Var2);
        ?? i6Var3 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f38691c = i6Var3;
        i6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        t4 t4Var3 = this.f38691c;
        t4Var3.e = 10080;
        this.f38692f.addView(t4Var3);
        ?? i6Var4 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.d = i6Var4;
        i6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        t4 t4Var4 = this.d;
        t4Var4.e = 44640;
        this.f38692f.addView(t4Var4);
        ?? i6Var5 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.e = i6Var5;
        i6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f21189b.setVisibility(8);
        this.f38692f.addView(this.e);
        t4 t4Var5 = this.f38689a;
        ArrayList arrayList = this.h;
        arrayList.add(t4Var5);
        arrayList.add(this.f38690b);
        arrayList.add(this.f38691c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        z8Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new r4(this)));
        u3Var.addView(z8Var, k7.b6.n(-1, -2));
        V(this.f38693n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f38693n = globalTTl;
        if (globalTTl < 0) {
            this.f38693n = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((t4) arrayList.get(i10)).f21189b.f23122f) {
                    if (((t4) arrayList.get(i10)).e != this.f38693n) {
                        this.f38693n = ((t4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((t4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f38693n);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                        return;
                    }
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
