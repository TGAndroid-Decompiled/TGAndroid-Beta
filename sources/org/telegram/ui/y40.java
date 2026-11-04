package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y40 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public org.telegram.ui.Components.f30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.ch0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.jy Y;
    public x40 Z;
    public w40 f52180a;
    public org.telegram.ui.Components.tj0 f52181b;
    public org.telegram.ui.Components.jt f52182c;
    public ei.d4 d;
    public gi.n5 f52183e;
    public xc f52184f;
    public AnimatorSet h;
    public yc f52185n;
    public final org.telegram.ui.Components.u8 f52186r;
    public FrameLayout f52187s;
    public org.telegram.ui.Components.l00 f52188w;
    public org.telegram.ui.ActionBar.f1 f52189x;
    public Drawable f52190y;

    public y40(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.f52186r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Z(y40 y40Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.qr.a0(y40Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void H(float f10) {
        yc ycVar = this.f52185n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.f52185n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y40.createView(android.content.Context):android.view.View");
    }

    public final String d0(int i3) {
        return getMessagesController().a2((Long) this.L.get(i3)).first_name;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23292r) {
            if (this.f52181b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i11 = org.telegram.messenger.hp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f52181b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f52181b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.l00 l00Var = this.f52188w;
            if (l00Var != null) {
                l00Var.f(false, true);
            }
            org.telegram.ui.Components.jt jtVar = this.f52182c;
            if (jtVar != null) {
                jtVar.setEnabled(true);
            }
        } else if (i3 == org.telegram.messenger.hs.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            x40 x40Var = this.Z;
            if (x40Var != null) {
                x40Var.d(this, longValue);
            } else {
                org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.f23305t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wm(bundle), true);
            }
            if (this.G != null || this.H != null || this.I != null) {
                getMessagesController().B(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.O.f33683c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f52184f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z11) {
            this.h = new AnimatorSet();
            if (z10) {
                this.f52185n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                xc xcVar = this.f52184f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f52185n, property, 1.0f));
            } else {
                this.f52184f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                xc xcVar2 = this.f52184f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f52185n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new u40(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f52184f.setAlpha(1.0f);
            this.f52184f.setVisibility(4);
            this.f52185n.setAlpha(1.0f);
            this.f52185n.setVisibility(0);
        } else {
            this.f52184f.setAlpha(1.0f);
            this.f52184f.setVisibility(0);
            this.f52185n.setAlpha(0.0f);
            this.f52185n.setVisibility(4);
        }
    }

    @Override
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f52182c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52181b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52181b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52181b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52182c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52182c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52182c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52182c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52181b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.O.h(i3, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.f52182c;
        if (jtVar != null && jtVar.f35191e) {
            if (z10) {
                jtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        y40 y40Var;
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.S);
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(2, true, true);
        this.O = f30Var;
        f30Var.f33681a = this;
        f30Var.f33682b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i3 = 0;
            while (i3 < longArray.length) {
                i3 = a1.g.h(i3, 1, longArray[i3], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            Long l10 = (Long) this.L.get(i10);
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            y40Var = this;
            org.telegram.messenger.qr.a0(this.currentAccount).f24934a.c(new org.telegram.ui.Components.v60(y40Var, arrayList2, arrayList, countDownLatch, 16));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                getMessagesController().X3((TLRPC.User) obj, true, false);
            }
        } else {
            y40Var = this;
        }
        y40Var.X = getUserConfig().f22852q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.jt jtVar = this.f52182c;
        if (jtVar != null) {
            jtVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.jt jtVar = this.f52182c;
        if (jtVar != null) {
            jtVar.r();
        }
        this.O.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.O.j(i3, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.f52182c;
        if (jtVar != null) {
            jtVar.s();
        }
        w40 w40Var = this.f52180a;
        if (w40Var != null) {
            w40Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.l00 l00Var = this.f52188w;
            if (l00Var != null) {
                l00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.tj0 tj0Var = this.f52181b;
            if (tj0Var != null) {
                tj0Var.x1();
                if (this.f52181b.getFastScroll() != null) {
                    this.f52181b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.jt jtVar = this.f52182c;
            if (jtVar != null && jtVar.getEditText() != null) {
                this.f52182c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                this.f52182c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.k6.f28007k6), getThemedColor(org.telegram.ui.ActionBar.k6.f28026l6), getThemedColor(org.telegram.ui.ActionBar.k6.f28102p7));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.dt dtVar = this.f52182c.f35188a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.O;
        if (f30Var != null) {
            f30Var.f33685f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.jt jtVar = this.f52182c;
            if (jtVar != null) {
                jtVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.O;
        if (f30Var != null && (str = f30Var.f33685f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.jt jtVar = this.f52182c;
        if (jtVar != null) {
            String obj = jtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }
}
