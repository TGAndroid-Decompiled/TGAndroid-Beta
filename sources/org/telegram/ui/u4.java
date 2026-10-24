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
public final class u4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public t4 f42204a;
    public t4 f42205b;
    public t4 f42206c;
    public t4 d;
    public t4 e;
    public LinearLayout f42207f;
    public final ArrayList h;
    public int f42208n;

    public u4() {
        super(null);
        this.h = new ArrayList();
        this.f42208n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((t4) arrayList.get(i10)).f22637b.f24488f) {
                    return ((t4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f42208n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.zr.f33337f);
        TransitionManager.beginDelayedTransition(this.f42207f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((t4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((t4) arrayList.get(i12)).d) {
                        this.f42207f.removeView((View) arrayList.get(i12));
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
                ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
                k6Var.d = true;
                k6Var.e = i10;
                k6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, k6Var);
                this.f42207f.addView((View) k6Var, size);
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
                ((t4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((t4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((t4) view).e) > 0) {
            org.telegram.ui.Components.vc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
                org.telegram.ui.ActionBar.r6.S((View) arrayList.get(i10), org.telegram.ui.ActionBar.k6.h0(x02, org.telegram.ui.ActionBar.k6.x0(null, i12, false)), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        ai.r rVar = new ai.r(getParentActivity());
        org.telegram.ui.Components.ap0 ap0Var = new org.telegram.ui.Components.ap0(getParentActivity(), rVar, this.resourceProvider, true);
        rVar.setOrientation(1);
        ap0Var.addView(rVar);
        frameLayout.addView(ap0Var);
        this.actionBar.setAdaptiveBackground(ap0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.currentAccount);
        wx0Var.setStickerNum(10);
        frameLayout2.addView(wx0Var, w7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        rVar.addView(frameLayout2, w7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f42207f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, this.f42207f, null);
        rVar.addView(this.f42207f, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f42207f.addView(l4Var);
        ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f42204a = k6Var;
        k6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        t4 t4Var = this.f42204a;
        t4Var.e = 0;
        this.f42207f.addView(t4Var);
        ?? k6Var2 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f42205b = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        t4 t4Var2 = this.f42205b;
        t4Var2.e = 1440;
        this.f42207f.addView(t4Var2);
        ?? k6Var3 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f42206c = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        t4 t4Var3 = this.f42206c;
        t4Var3.e = 10080;
        this.f42207f.addView(t4Var3);
        ?? k6Var4 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.d = k6Var4;
        k6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        t4 t4Var4 = this.d;
        t4Var4.e = 44640;
        this.f42207f.addView(t4Var4);
        ?? k6Var5 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.e = k6Var5;
        k6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f22637b.setVisibility(8);
        this.f42207f.addView(this.e);
        t4 t4Var5 = this.f42204a;
        ArrayList arrayList = this.h;
        arrayList.add(t4Var5);
        arrayList.add(this.f42205b);
        arrayList.add(this.f42206c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new r4(this)));
        rVar.addView(e9Var, w7.z5.n(-1, -2));
        V(this.f42208n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f42208n = globalTTl;
        if (globalTTl < 0) {
            this.f42208n = 0;
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
                if (((t4) arrayList.get(i10)).f22637b.f24488f) {
                    if (((t4) arrayList.get(i10)).e != this.f42208n) {
                        this.f42208n = ((t4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((t4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f42208n);
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
