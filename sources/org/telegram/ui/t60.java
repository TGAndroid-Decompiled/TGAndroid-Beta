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
public final class t60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public TLRPC.FileLocation A;
    public TLRPC.InputFile B;
    public TLRPC.InputFile C;
    public TLRPC.VideoSize D;
    public String E;
    public double F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.s40 J;
    public String K;
    public final int L;
    public final boolean M;
    public org.telegram.ui.Components.xi0 N;
    public final boolean O;
    public String P;
    public final Location Q;
    public int R;
    public int S;
    public org.telegram.ui.Components.kz T;
    public s60 U;
    public r60 f42557a;
    public org.telegram.ui.Components.jl0 f42558b;
    public org.telegram.ui.Components.au f42559c;
    public lh.y3 d;
    public cg.i0 f42560e;
    public ed f42561f;
    public AnimatorSet h;
    public fd f42562n;
    public final org.telegram.ui.Components.e9 f42563r;
    public FrameLayout f42564s;
    public org.telegram.ui.Components.u10 v;
    public org.telegram.ui.ActionBar.o1 f42565w;
    public Drawable f42566x;
    public TLRPC.FileLocation f42567y;

    public t60(Bundle bundle) {
        super(bundle);
        this.L = bundle.getInt("chatType", 0);
        this.f42563r = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.P = bundle.getString("address");
        this.Q = (Location) bundle.getParcelable("location");
        this.O = bundle.getBoolean("forImport", false);
        this.K = bundle.getString("title", null);
        this.M = bundle.getBoolean("canToggleTopics", true);
    }

    public static void U(t60 t60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(t60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void D(float f9) {
        fd fdVar = this.f42562n;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(f9);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        fd fdVar = this.f42562n;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.G.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f42561f == null) {
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
                this.f42562n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                ed edVar = this.f42561f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(edVar, property, 0.0f), ObjectAnimator.ofFloat(this.f42562n, property, 1.0f));
            } else {
                this.f42561f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                ed edVar2 = this.f42561f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(edVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f42562n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new p60(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f42561f.setAlpha(1.0f);
            this.f42561f.setVisibility(4);
            this.f42562n.setAlpha(1.0f);
            this.f42562n.setVisibility(0);
        } else {
            this.f42561f.setAlpha(1.0f);
            this.f42561f.setVisibility(0);
            this.f42562n.setAlpha(0.0f);
            this.f42562n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t60.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f42558b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f42558b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f42558b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.R = 0;
            this.I = false;
            org.telegram.ui.Components.u10 u10Var = this.v;
            if (u10Var != null) {
                u10Var.f(false, true);
            }
            org.telegram.ui.Components.au auVar = this.f42559c;
            if (auVar != null) {
                auVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.R = 0;
            long longValue = ((Long) objArr[0]).longValue();
            s60 s60Var = this.U;
            if (s60Var != null) {
                s60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new tn(bundle), true);
            }
            if (this.B != null || this.C != null || this.D != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.B, this.C, this.D, this.F, this.E, this.f42567y, this.A, null);
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
        if (dialog != this.J.f32471c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f42559c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23207l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23224m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23242n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        org.telegram.ui.Components.au auVar = this.f42559c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.e4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42559c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.J.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.f42559c;
        if (auVar != null && auVar.f26885e) {
            if (z10) {
                auVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        t60 t60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(2, true, true);
        this.J = s40Var;
        s40Var.f32469a = this;
        s40Var.f32470b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.G = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = a4.w.g(longArray[i11], this.G, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.G.size(); i12++) {
            Long l10 = (Long) this.G.get(i12);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            t60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new n20(t60Var, arrayList2, arrayList, countDownLatch, 4));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        } else {
            t60Var = this;
        }
        t60Var.S = getUserConfig().getGlobalTTl() * 60;
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
        org.telegram.ui.Components.au auVar = this.f42559c;
        if (auVar != null) {
            auVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.au auVar = this.f42559c;
        if (auVar != null) {
            auVar.r();
        }
        this.J.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.J.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.au auVar = this.f42559c;
        if (auVar != null) {
            auVar.s();
        }
        r60 r60Var = this.f42557a;
        if (r60Var != null) {
            r60Var.l();
        }
        this.J.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.vt vtVar = this.f42559c.f26882a;
            vtVar.requestFocus();
            AndroidUtilities.showKeyboard(vtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.s40 s40Var = this.J;
        if (s40Var != null) {
            s40Var.f32473f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.au auVar = this.f42559c;
            if (auVar != null) {
                auVar.setText(string);
            } else {
                this.K = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.s40 s40Var = this.J;
        if (s40Var != null && (str = s40Var.f32473f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.au auVar = this.f42559c;
        if (auVar != null) {
            String obj = auVar.getText().toString();
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
    public final void P() {
    }
}
