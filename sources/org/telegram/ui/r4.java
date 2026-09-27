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
public final class r4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public q4 f36986a;
    public q4 f36987b;
    public q4 f36988c;
    public q4 d;
    public q4 e;
    public LinearLayout f36989f;
    public final ArrayList h;
    public int f36990n;

    public r4() {
        super(null);
        this.h = new ArrayList();
        this.f36990n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((q4) arrayList.get(i10)).f20583b.f22387f) {
                    return ((q4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f36990n;
            }
        }
    }

    public final void V(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.sr.f28359f);
        TransitionManager.beginDelayedTransition(this.f36989f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((q4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((q4) arrayList.get(i12)).d) {
                        this.f36989f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((q4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
                k6Var.d = true;
                k6Var.e = i10;
                k6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, k6Var);
                this.f36989f.addView((View) k6Var, size);
                X();
                W(k6Var, z10);
                return;
            }
        }
    }

    public final void W(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((q4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((q4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((q4) view).e) > 0) {
            org.telegram.ui.Components.xc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((q4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19147i6, false)));
                ((q4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        zd zdVar = new zd(getParentActivity());
        org.telegram.ui.Components.no0 no0Var = new org.telegram.ui.Components.no0(getParentActivity(), zdVar, this.resourceProvider, true);
        zdVar.setOrientation(1);
        no0Var.addView(zdVar);
        frameLayout.addView(no0Var);
        this.actionBar.setAdaptiveBackground(no0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, this.currentAccount);
        lx0Var.setStickerNum(10);
        frameLayout2.addView(lx0Var, w7.y5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        zdVar.addView(frameLayout2, w7.y5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f36989f = linearLayout;
        linearLayout.setOrientation(1);
        this.f36989f.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        zdVar.addView(this.f36989f, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f36989f.addView(m4Var);
        ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f36986a = k6Var;
        k6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        q4 q4Var = this.f36986a;
        q4Var.e = 0;
        this.f36989f.addView(q4Var);
        ?? k6Var2 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f36987b = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        q4 q4Var2 = this.f36987b;
        q4Var2.e = 1440;
        this.f36989f.addView(q4Var2);
        ?? k6Var3 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f36988c = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        q4 q4Var3 = this.f36988c;
        q4Var3.e = 10080;
        this.f36989f.addView(q4Var3);
        ?? k6Var4 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.d = k6Var4;
        k6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        q4 q4Var4 = this.d;
        q4Var4.e = 44640;
        this.f36989f.addView(q4Var4);
        ?? k6Var5 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.e = k6Var5;
        k6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f20583b.setVisibility(8);
        this.f36989f.addView(this.e);
        q4 q4Var5 = this.f36986a;
        ArrayList arrayList = this.h;
        arrayList.add(q4Var5);
        arrayList.add(this.f36987b);
        arrayList.add(this.f36988c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new o4(this)));
        zdVar.addView(e9Var, w7.y5.n(-1, -2));
        V(this.f36990n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f36990n = globalTTl;
        if (globalTTl < 0) {
            this.f36990n = 0;
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
                if (((q4) arrayList.get(i10)).f20583b.f22387f) {
                    if (((q4) arrayList.get(i10)).e != this.f36990n) {
                        this.f36990n = ((q4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((q4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f36990n);
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
