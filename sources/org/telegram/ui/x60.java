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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x60 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.g50 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.xj0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.yz X;
    public w60 Y;
    public v60 f45665a;
    public org.telegram.ui.Components.mm0 f45666b;
    public org.telegram.ui.Components.ru f45667c;
    public di.k4 d;
    public fi.f6 e;
    public kd f45668f;
    public AnimatorSet h;
    public ld f45669n;
    public final org.telegram.ui.Components.j9 f45670r;
    public FrameLayout f45671s;
    public org.telegram.ui.Components.j20 v;
    public org.telegram.ui.ActionBar.o1 f45672w;
    public Drawable f45673x;
    public TLRPC.FileLocation f45674y;

    public x60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f45670r = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void V(x60 x60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(x60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void F(float f7) {
        ld ldVar = this.f45669n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        ld ldVar = this.f45669n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Z(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f45668f == null) {
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
                this.f45669n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                kd kdVar = this.f45668f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f45669n, property, 1.0f));
            } else {
                this.f45668f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                kd kdVar2 = this.f45668f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f45669n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new q40(1, this, z10));
            this.h.start();
        } else if (z10) {
            this.f45668f.setAlpha(1.0f);
            this.f45668f.setVisibility(4);
            this.f45669n.setAlpha(1.0f);
            this.f45669n.setVisibility(0);
        } else {
            this.f45668f.setAlpha(1.0f);
            this.f45668f.setVisibility(0);
            this.f45669n.setAlpha(0.0f);
            this.f45669n.setVisibility(4);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23540n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x60.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f45666b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f45666b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f45666b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.k4) {
                            ((org.telegram.ui.Cells.k4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.j20 j20Var = this.v;
            if (j20Var != null) {
                j20Var.f(false, true);
            }
            org.telegram.ui.Components.ru ruVar = this.f45667c;
            if (ruVar != null) {
                ruVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            w60 w60Var = this.Y;
            if (w60Var != null) {
                w60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
            }
            if (this.F != null || this.G != null || this.H != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.f45674y, this.E, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.N.f28423c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f45667c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45666b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23503l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45666b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23521m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45666b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23541n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45667c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45667c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45667c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23484k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45667c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23502l6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45666b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23309ai));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.h(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.f45667c;
        if (ruVar != null && ruVar.e) {
            if (z10) {
                ruVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        x60 x60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(2, true, true);
        this.N = g50Var;
        g50Var.f28421a = this;
        g50Var.f28422b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = c3.h0.j(longArray[i11], this.K, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            Long l4 = (Long) this.K.get(i12);
            if (getMessagesController().getUser(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            x60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.e10(x60Var, arrayList2, arrayList, countDownLatch, 18));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
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
            x60Var = this;
        }
        x60Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.ru ruVar = this.f45667c;
        if (ruVar != null) {
            ruVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ru ruVar = this.f45667c;
        if (ruVar != null) {
            ruVar.r();
        }
        this.N.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ru ruVar = this.f45667c;
        if (ruVar != null) {
            ruVar.s();
        }
        v60 v60Var = this.f45665a;
        if (v60Var != null) {
            v60Var.l();
        }
        this.N.k();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.j20 j20Var = this.v;
            if (j20Var != null) {
                j20Var.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.mm0 mm0Var = this.f45666b;
            if (mm0Var != null) {
                mm0Var.A1();
                if (this.f45666b.getFastScroll() != null) {
                    this.f45666b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.ru ruVar = this.f45667c;
            if (ruVar != null && ruVar.getEditText() != null) {
                this.f45667c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.G6));
                this.f45667c.getEditText().setLineColors(getThemedColor(org.telegram.ui.ActionBar.y6.f23484k6), getThemedColor(org.telegram.ui.ActionBar.y6.f23502l6), getThemedColor(org.telegram.ui.ActionBar.y6.f23581p7));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.mu muVar = this.f45667c.f32325a;
            muVar.requestFocus();
            AndroidUtilities.showKeyboard(muVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.g50 g50Var = this.N;
        if (g50Var != null) {
            g50Var.f28424f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.ru ruVar = this.f45667c;
            if (ruVar != null) {
                ruVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.g50 g50Var = this.N;
        if (g50Var != null && (str = g50Var.f28424f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ru ruVar = this.f45667c;
        if (ruVar != null) {
            String obj = ruVar.getText().toString();
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
    public final void Q() {
    }
}
