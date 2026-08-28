package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public TLRPC.FileLocation A;
    public TLRPC.InputFile B;
    public TLRPC.InputFile C;
    public TLRPC.VideoSize D;
    public String E;
    public double F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.e40 J;
    public String K;
    public final int L;
    public final boolean M;
    public org.telegram.ui.Components.mi0 N;
    public final boolean O;
    public String P;
    public final Location Q;
    public int R;
    public int S;
    public org.telegram.ui.Components.bz T;
    public q60 U;
    public p60 f42277a;
    public org.telegram.ui.Components.wk0 f42278b;
    public org.telegram.ui.Components.ut f42279c;
    public ih.d4 d;
    public kh.h6 f42280e;
    public fd f42281f;
    public AnimatorSet h;
    public gd f42282n;
    public final org.telegram.ui.Components.z8 f42283r;
    public FrameLayout f42284s;
    public org.telegram.ui.Components.j10 v;
    public org.telegram.ui.ActionBar.o1 f42285w;
    public Drawable f42286x;
    public TLRPC.FileLocation f42287y;

    public r60(Bundle bundle) {
        super(bundle);
        this.L = bundle.getInt("chatType", 0);
        this.f42283r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.P = bundle.getString("address");
        this.Q = (Location) bundle.getParcelable("location");
        this.O = bundle.getBoolean("forImport", false);
        this.K = bundle.getString("title", null);
        this.M = bundle.getBoolean("canToggleTopics", true);
    }

    public static void T(r60 r60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(r60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void D(float f10) {
        gd gdVar = this.f42282n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.f42282n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String X(int i9) {
        return getMessagesController().getUser((Long) this.G.get(i9)).first_name;
    }

    public final void Y(boolean z10, boolean z11) {
        if (this.f42281f == null) {
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
                this.f42282n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                fd fdVar = this.f42281f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f42282n, property, 1.0f));
            } else {
                this.f42281f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                fd fdVar2 = this.f42281f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f42282n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new n60(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f42281f.setAlpha(1.0f);
            this.f42281f.setVisibility(4);
            this.f42282n.setAlpha(1.0f);
            this.f42282n.setVisibility(0);
        } else {
            this.f42281f.setAlpha(1.0f);
            this.f42281f.setVisibility(0);
            this.f42282n.setAlpha(0.0f);
            this.f42282n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r60.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.updateInterfaces) {
            if (this.f42278b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f42278b.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.f42278b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.chatDidFailCreate) {
            this.R = 0;
            this.I = false;
            org.telegram.ui.Components.j10 j10Var = this.v;
            if (j10Var != null) {
                j10Var.f(false, true);
            }
            org.telegram.ui.Components.ut utVar = this.f42279c;
            if (utVar != null) {
                utVar.setEnabled(true);
            }
        } else if (i9 == NotificationCenter.chatDidCreated) {
            this.R = 0;
            long longValue = ((Long) objArr[0]).longValue();
            q60 q60Var = this.U;
            if (q60Var != null) {
                q60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new qn(bundle), true);
            }
            if (this.B != null || this.C != null || this.D != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.B, this.C, this.D, this.F, this.E, this.f42287y, this.A, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.J.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J.f27911c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f42279c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        org.telegram.ui.Components.ut utVar = this.f42279c;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42278b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42279c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.J.i(i9, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.f42279c;
        if (utVar != null && utVar.f33124e) {
            if (z10) {
                utVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        r60 r60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(2, true, true);
        this.J = e40Var;
        e40Var.f27909a = this;
        e40Var.f27910b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i9 = 0;
        if (longArray != null) {
            this.G = new ArrayList(longArray.length);
            int i10 = 0;
            while (i10 < longArray.length) {
                i10 = aa.d.g(longArray[i10], this.G, i10, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            Long l10 = (Long) this.G.get(i11);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            r60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.no0(r60Var, arrayList2, arrayList, countDownLatch, 10));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        } else {
            r60Var = this;
        }
        r60Var.S = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.J.e();
        if (this.R != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.R, true);
        }
        org.telegram.ui.Components.ut utVar = this.f42279c;
        if (utVar != null) {
            utVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ut utVar = this.f42279c;
        if (utVar != null) {
            utVar.r();
        }
        this.J.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.J.k(i9, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ut utVar = this.f42279c;
        if (utVar != null) {
            utVar.s();
        }
        p60 p60Var = this.f42277a;
        if (p60Var != null) {
            p60Var.l();
        }
        this.J.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.pt ptVar = this.f42279c.f33121a;
            ptVar.requestFocus();
            AndroidUtilities.showKeyboard(ptVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e40 e40Var = this.J;
        if (e40Var != null) {
            e40Var.f27913f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.ut utVar = this.f42279c;
            if (utVar != null) {
                utVar.setText(string);
            } else {
                this.K = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e40 e40Var = this.J;
        if (e40Var != null && (str = e40Var.f27913f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ut utVar = this.f42279c;
        if (utVar != null) {
            String obj = utVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void O() {
    }
}
