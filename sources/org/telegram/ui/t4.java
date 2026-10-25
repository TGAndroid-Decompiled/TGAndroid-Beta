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
public final class t4 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public s4 f43668a;
    public s4 f43669b;
    public s4 f43670c;
    public s4 d;
    public s4 e;
    public LinearLayout f43671f;
    public final ArrayList h;
    public int f43672n;
    public org.telegram.ui.Components.gp0 f43673r;

    public t4() {
        super(null);
        this.h = new ArrayList();
        this.f43672n = 0;
    }

    public final int V() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((s4) arrayList.get(i10)).f24605b.f26278f) {
                    return ((s4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f43672n;
            }
        }
    }

    public final void W(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.ds.f27584f);
        TransitionManager.beginDelayedTransition(this.f43671f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((s4) arrayList.get(i11)).e == i10) {
                    X((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((s4) arrayList.get(i12)).d) {
                        this.f43671f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((s4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? o6Var = new org.telegram.ui.Cells.o6(getParentActivity(), null);
                o6Var.d = true;
                o6Var.e = i10;
                o6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, o6Var);
                this.f43671f.addView((View) o6Var, size);
                Y();
                X(o6Var, z10);
                return;
            }
        }
    }

    public final void X(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((s4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((s4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((s4) view).e) > 0) {
            org.telegram.ui.Components.wc.b0(this).R(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void Y() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
                org.telegram.ui.ActionBar.f7.R((View) arrayList.get(i10), org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i12, false)), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.N(i12), null);
                ((s4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.fp0 fp0Var = new org.telegram.ui.Components.fp0(getParentActivity());
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(getParentActivity(), fp0Var, this.resourceProvider, true);
        this.f43673r = gp0Var;
        gp0Var.setDrawBackground(true);
        this.f43673r.setOverScrollMode(0);
        fp0Var.setOrientation(1);
        this.f43673r.addView(fp0Var);
        frameLayout.addView(this.f43673r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, this.currentAccount);
        fy0Var.setStickerNum(10);
        frameLayout2.addView(fy0Var, org.telegram.ui.Components.gb1.i(130, 130, 17));
        frameLayout2.setTag(-33024);
        fp0Var.addView(frameLayout2, org.telegram.ui.Components.gb1.r(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f43671f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, this.f43671f, null);
        fp0Var.addView(this.f43671f, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(getParentActivity());
        q4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f43671f.addView(q4Var);
        ?? o6Var = new org.telegram.ui.Cells.o6(getParentActivity(), null);
        this.f43668a = o6Var;
        o6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        s4 s4Var = this.f43668a;
        s4Var.e = 0;
        this.f43671f.addView(s4Var);
        ?? o6Var2 = new org.telegram.ui.Cells.o6(getParentActivity(), null);
        this.f43669b = o6Var2;
        o6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        s4 s4Var2 = this.f43669b;
        s4Var2.e = 1440;
        this.f43671f.addView(s4Var2);
        ?? o6Var3 = new org.telegram.ui.Cells.o6(getParentActivity(), null);
        this.f43670c = o6Var3;
        o6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        s4 s4Var3 = this.f43670c;
        s4Var3.e = 10080;
        this.f43671f.addView(s4Var3);
        ?? o6Var4 = new org.telegram.ui.Cells.o6(getParentActivity(), null);
        this.d = o6Var4;
        o6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        s4 s4Var4 = this.d;
        s4Var4.e = 44640;
        this.f43671f.addView(s4Var4);
        ?? o6Var5 = new org.telegram.ui.Cells.o6(getParentActivity(), null);
        this.e = o6Var5;
        o6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f24605b.setVisibility(8);
        this.f43671f.addView(this.e);
        s4 s4Var5 = this.f43668a;
        ArrayList arrayList = this.h;
        arrayList.add(s4Var5);
        arrayList.add(this.f43669b);
        arrayList.add(this.f43670c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        Y();
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        i9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new q4(this)));
        fp0Var.addView(i9Var, org.telegram.ui.Components.gb1.r(-1, -2));
        W(this.f43672n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.gp0 getScrollViewForSimpleGlass() {
        return this.f43673r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f43672n = globalTTl;
        if (globalTTl < 0) {
            this.f43672n = 0;
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
                if (((s4) arrayList.get(i10)).f24605b.f26278f) {
                    if (((s4) arrayList.get(i10)).e != this.f43672n) {
                        this.f43672n = ((s4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((s4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f43672n);
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
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
