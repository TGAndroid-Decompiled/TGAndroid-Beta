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
public final class s4 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public r4 f41008a;
    public r4 f41009b;
    public r4 f41010c;
    public r4 d;
    public r4 f41011e;
    public LinearLayout f41012f;
    public final ArrayList h;
    public int f41013n;

    public s4() {
        super(null);
        this.h = new ArrayList();
        this.f41013n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((r4) arrayList.get(i10)).f23027b.f25008f) {
                    return ((r4) arrayList.get(i10)).f40749e;
                }
                i10++;
            } else {
                return this.f41013n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.pr.f30168f);
        TransitionManager.beginDelayedTransition(this.f41012f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((r4) arrayList.get(i11)).f40749e == i10) {
                    W((View) arrayList.get(i11), z4);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((r4) arrayList.get(i12)).d) {
                        this.f41012f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((r4) arrayList.get(i13)).f40749e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.f40749e = i10;
                j6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f41012f.addView((View) j6Var, size);
                X();
                W(j6Var, z4);
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
                ((r4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((r4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z4 && (i10 = ((r4) view).f40749e) > 0) {
            org.telegram.ui.Components.qc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((r4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false)));
                ((r4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
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
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        eg.s3 s3Var = new eg.s3(getParentActivity());
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0(getParentActivity(), s3Var, this.resourceProvider, true);
        s3Var.setOrientation(1);
        eo0Var.addView(s3Var);
        frameLayout.addView(eo0Var);
        this.actionBar.setAdaptiveBackground(eo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, this.currentAccount);
        ax0Var.setStickerNum(10);
        frameLayout2.addView(ax0Var, k7.c6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        s3Var.addView(frameLayout2, k7.c6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f41012f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41012f.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        s3Var.addView(this.f41012f, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f41012f.addView(m4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41008a = j6Var;
        j6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        r4 r4Var = this.f41008a;
        r4Var.f40749e = 0;
        this.f41012f.addView(r4Var);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41009b = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        r4 r4Var2 = this.f41009b;
        r4Var2.f40749e = 1440;
        this.f41012f.addView(r4Var2);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41010c = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        r4 r4Var3 = this.f41010c;
        r4Var3.f40749e = 10080;
        this.f41012f.addView(r4Var3);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        r4 r4Var4 = this.d;
        r4Var4.f40749e = 44640;
        this.f41012f.addView(r4Var4);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41011e = j6Var5;
        j6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f41011e.f23027b.setVisibility(8);
        this.f41012f.addView(this.f41011e);
        r4 r4Var5 = this.f41008a;
        ArrayList arrayList = this.h;
        arrayList.add(r4Var5);
        arrayList.add(this.f41009b);
        arrayList.add(this.f41010c);
        arrayList.add(this.d);
        arrayList.add(this.f41011e);
        X();
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        a9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new p4(this)));
        s3Var.addView(a9Var, k7.c6.n(-1, -2));
        V(this.f41013n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f41013n = globalTTl;
        if (globalTTl < 0) {
            this.f41013n = 0;
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
                if (((r4) arrayList.get(i10)).f23027b.f25008f) {
                    if (((r4) arrayList.get(i10)).f40749e != this.f41013n) {
                        this.f41013n = ((r4) arrayList.get(i10)).f40749e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((r4) arrayList.get(i10)).f40749e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f41013n);
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
