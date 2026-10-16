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
public final class u4 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public t4 f40257a;
    public t4 f40258b;
    public t4 f40259c;
    public t4 d;
    public t4 e;
    public LinearLayout f40260f;
    public final ArrayList h;
    public int f40261n;

    public u4() {
        super(null);
        this.h = new ArrayList();
        this.f40261n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((t4) arrayList.get(i10)).f21160b.f22982f) {
                    return ((t4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f40261n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.es.f24465f);
        TransitionManager.beginDelayedTransition(this.f40260f, transitionSet);
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
                        this.f40260f.removeView((View) arrayList.get(i12));
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
                this.f40260f.addView((View) k6Var, size);
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
            org.telegram.ui.Components.zc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((t4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false)));
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        ee eeVar = new ee(getParentActivity());
        org.telegram.ui.Components.ap0 ap0Var = new org.telegram.ui.Components.ap0(getParentActivity(), eeVar, this.resourceProvider, true);
        eeVar.setOrientation(1);
        ap0Var.addView(eeVar);
        frameLayout.addView(ap0Var);
        this.actionBar.setAdaptiveBackground(ap0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(context, this.currentAccount);
        xx0Var.setStickerNum(10);
        frameLayout2.addView(xx0Var, w7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        eeVar.addView(frameLayout2, w7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f40260f = linearLayout;
        linearLayout.setOrientation(1);
        this.f40260f.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        eeVar.addView(this.f40260f, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f40260f.addView(m4Var);
        ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40257a = k6Var;
        k6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        t4 t4Var = this.f40257a;
        t4Var.e = 0;
        this.f40260f.addView(t4Var);
        ?? k6Var2 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40258b = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        t4 t4Var2 = this.f40258b;
        t4Var2.e = 1440;
        this.f40260f.addView(t4Var2);
        ?? k6Var3 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40259c = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        t4 t4Var3 = this.f40259c;
        t4Var3.e = 10080;
        this.f40260f.addView(t4Var3);
        ?? k6Var4 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.d = k6Var4;
        k6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        t4 t4Var4 = this.d;
        t4Var4.e = 44640;
        this.f40260f.addView(t4Var4);
        ?? k6Var5 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.e = k6Var5;
        k6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f21160b.setVisibility(8);
        this.f40260f.addView(this.e);
        t4 t4Var5 = this.f40257a;
        ArrayList arrayList = this.h;
        arrayList.add(t4Var5);
        arrayList.add(this.f40258b);
        arrayList.add(this.f40259c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new r4(this)));
        eeVar.addView(e9Var, w7.z5.n(-1, -2));
        V(this.f40261n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f40261n = globalTTl;
        if (globalTTl < 0) {
            this.f40261n = 0;
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
                if (((t4) arrayList.get(i10)).f21160b.f22982f) {
                    if (((t4) arrayList.get(i10)).e != this.f40261n) {
                        this.f40261n = ((t4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((t4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f40261n);
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
