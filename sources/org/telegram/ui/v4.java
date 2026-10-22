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
public final class v4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public u4 f42108a;
    public u4 f42109b;
    public u4 f42110c;
    public u4 d;
    public u4 e;
    public LinearLayout f42111f;
    public final ArrayList h;
    public int f42112n;

    public v4() {
        super(null);
        this.h = new ArrayList();
        this.f42112n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((u4) arrayList.get(i10)).f22488b.f24344f) {
                    return ((u4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f42112n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.bs.f25024f);
        TransitionManager.beginDelayedTransition(this.f42111f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((u4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((u4) arrayList.get(i12)).d) {
                        this.f42111f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((u4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.e = i10;
                j6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f42111f.addView((View) j6Var, size);
                X();
                W(j6Var, z10);
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
                ((u4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((u4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((u4) view).e) > 0) {
            org.telegram.ui.Components.xc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((u4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false)));
                ((u4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        ai.r rVar = new ai.r(getParentActivity());
        org.telegram.ui.Components.xo0 xo0Var = new org.telegram.ui.Components.xo0(getParentActivity(), rVar, this.resourceProvider, true);
        rVar.setOrientation(1);
        xo0Var.addView(rVar);
        frameLayout.addView(xo0Var);
        this.actionBar.setAdaptiveBackground(xo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, this.currentAccount);
        ux0Var.setStickerNum(10);
        frameLayout2.addView(ux0Var, w7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        rVar.addView(frameLayout2, w7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f42111f = linearLayout;
        linearLayout.setOrientation(1);
        this.f42111f.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        rVar.addView(this.f42111f, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f42111f.addView(l4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f42108a = j6Var;
        j6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        u4 u4Var = this.f42108a;
        u4Var.e = 0;
        this.f42111f.addView(u4Var);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f42109b = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        u4 u4Var2 = this.f42109b;
        u4Var2.e = 1440;
        this.f42111f.addView(u4Var2);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f42110c = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        u4 u4Var3 = this.f42110c;
        u4Var3.e = 10080;
        this.f42111f.addView(u4Var3);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        u4 u4Var4 = this.d;
        u4Var4.e = 44640;
        this.f42111f.addView(u4Var4);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.e = j6Var5;
        j6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f22488b.setVisibility(8);
        this.f42111f.addView(this.e);
        u4 u4Var5 = this.f42108a;
        ArrayList arrayList = this.h;
        arrayList.add(u4Var5);
        arrayList.add(this.f42109b);
        arrayList.add(this.f42110c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        d9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new s4(this)));
        rVar.addView(d9Var, w7.z5.n(-1, -2));
        V(this.f42112n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f42112n = globalTTl;
        if (globalTTl < 0) {
            this.f42112n = 0;
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
                if (((u4) arrayList.get(i10)).f22488b.f24344f) {
                    if (((u4) arrayList.get(i10)).e != this.f42112n) {
                        this.f42112n = ((u4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((u4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f42112n);
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
