package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;

public class we1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ng, pg0 {

    public static final HashSet f43718j1 = new HashSet();
    public boolean A;
    public ke1 A0;
    public yd1 B;
    public FrameLayout B0;
    public boolean C;
    public x8 C0;
    public boolean D;
    public ChatObject.Call D0;
    public boolean E;
    public je1 E0;
    public TLRPC.ChatFull F;
    public boolean F0;
    public boolean G;
    public org.telegram.ui.Components.gk0 G0;
    public org.telegram.ui.Components.m51 H;
    public gy H0;
    public int I;
    public gy I0;
    public he1 J;
    public boolean J0;
    public ae1 K;
    public final AnimationNotificationsLocker K0;
    public ve1 L;
    public aj0 L0;
    public org.telegram.ui.ActionBar.f1 M;
    public long M0;
    public org.telegram.ui.ActionBar.f1 N;
    public fh.e N0;
    public org.telegram.ui.ActionBar.f1 O;
    public float O0;
    public org.telegram.ui.ActionBar.f1 P;
    public boolean P0;
    public org.telegram.ui.ActionBar.f1 Q;
    public org.telegram.ui.Components.zr Q0;
    public boolean R;
    public final boolean R0;
    public float S;
    public ImageView S0;
    public TL_stories.TL_premium_boostsStatus T;
    public float T0;
    public long U;
    public ValueAnimator U0;
    public boolean V;
    public boolean V0;
    public final HashSet W;
    public org.telegram.ui.Components.o71 W0;
    public boolean X;
    public View X0;
    public NumberTextView Y;
    public int Y0;
    public org.telegram.ui.ActionBar.v0 Z;
    public int Z0;

    public final long f43719a;

    public org.telegram.ui.ActionBar.v0 f43720a0;

    public int f43721a1;

    public final ArrayList f43722b;

    public org.telegram.ui.ActionBar.v0 f43723b0;

    public final jg.e f43724b1;

    public int f43725c;

    public org.telegram.ui.ActionBar.v0 f43726c0;

    public final og.d f43727c1;
    public de1 d;

    public org.telegram.ui.ActionBar.v0 f43728d0;

    public final og.d f43729d1;

    public n0 f43730e;

    public org.telegram.ui.ActionBar.v0 f43731e0;

    public final jg.a f43732e1;

    public org.telegram.ui.Components.rn f43733f;

    public org.telegram.ui.ActionBar.f1 f43734f0;

    public jg.k f43735f1;

    public org.telegram.ui.ActionBar.f1 f43736g0;

    public final ArrayList f43737g1;
    public org.telegram.ui.Components.m10 h;

    public org.telegram.ui.ActionBar.f1 f43738h0;

    public final RectF f43739h1;

    public org.telegram.ui.ActionBar.v0 f43740i0;

    public final RectF f43741i1;

    public RadialProgressView f43742j0;

    public z71 f43743k0;

    public org.telegram.ui.ActionBar.v0 f43744l0;
    public org.telegram.ui.ActionBar.v0 m0;

    public me1 f43745n;

    public se1 f43746n0;

    public boolean f43747o0;

    public final boolean f43748p0;

    public final boolean f43749q0;

    public final le1 f43750r;

    public final boolean f43751r0;

    public final TopicsController f43752s;

    public final boolean f43753s0;

    public final boolean f43754t0;

    public String f43755u0;
    public xe1 v;

    public boolean f43756v0;

    public nw f43757w;

    public HashSet f43758w0;

    public int f43759x;

    public boolean f43760x0;

    public int f43761y;

    public boolean f43762y0;

    public jh.x4 f43763z0;

    public we1(Bundle bundle) {
        super(bundle);
        this.f43722b = new ArrayList();
        new ArrayList();
        this.f43750r = new le1(this);
        this.f43759x = 0;
        this.A = true;
        this.C = true;
        this.R = true;
        this.S = 0.0f;
        this.W = new HashSet();
        this.f43760x0 = false;
        this.K0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.O0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43737g1 = arrayList;
        RectF rectF = new RectF();
        this.f43739h1 = rectF;
        RectF rectF2 = new RectF();
        this.f43741i1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f43719a = j10;
        this.f43748p0 = this.arguments.getBoolean("for_select", false);
        this.f43749q0 = this.arguments.getBoolean("forward_to", false);
        this.f43754t0 = this.arguments.getBoolean("bot_share_to", false);
        this.f43751r0 = this.arguments.getBoolean("quote", false);
        this.f43753s0 = this.arguments.getBoolean("reply_to", false);
        this.f43755u0 = this.arguments.getString("voicechat", null);
        this.f43756v0 = this.arguments.getBoolean("videochat", false);
        this.f43752s = getMessagesController().getTopicsController();
        this.R0 = true ^ org.telegram.messenger.y1.w("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        og.c cVar = new og.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.f43724b1 = null;
            this.f43727c1 = null;
            this.f43729d1 = null;
            this.f43732e1 = new jg.a(cVar);
            return;
        }
        this.f43724b1 = new jg.e(false);
        this.f43727c1 = new og.d(null);
        og.d dVar = new og.d(null);
        this.f43729d1 = dVar;
        jg.a aVar = new jg.a(dVar);
        this.f43732e1 = aVar;
        aVar.f12944f = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new rn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new rn(bundle);
            }
        }
        return new we1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.K), MessagesStorage.getInstance(launchActivity.K), bundle);
    }

    public static void I0(rn rnVar) {
        if (rnVar.getParentLayout() == null) {
            return;
        }
        if (rnVar.getParentLayout().getFragmentStack().size() <= 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -rnVar.a());
            ((ActionBarLayout) rnVar.getParentLayout()).c(rnVar.getParentLayout().getFragmentStack().size() - 1, new we1(bundle));
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) rnVar.getParentLayout().getFragmentStack().get(rnVar.getParentLayout().getFragmentStack().size() - 2);
            if (!(n2Var instanceof we1) || ((we1) n2Var).f43719a != (-rnVar.a())) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", -rnVar.a());
                ((ActionBarLayout) rnVar.getParentLayout()).c(rnVar.getParentLayout().getFragmentStack().size() - 1, new we1(bundle2));
            }
        }
        rnVar.f42050fa = true;
        rnVar.finishFragment();
    }

    public static boolean U(we1 we1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(we1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-we1Var.f43719a), System.currentTimeMillis()).commit();
        Activity parentActivity = we1Var.getParentActivity();
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(we1Var.g());
        int i10 = org.telegram.ui.Components.t70.f32675r;
        org.telegram.ui.Components.t70.x(parentActivity, we1Var, org.telegram.ui.Components.mc.a0(we1Var), zIsChannelAndNotMegaGroup);
        we1Var.O0(true);
        return false;
    }

    public static void V(we1 we1Var, View view) {
        long j10 = we1Var.f43719a;
        if (we1Var.getParentLayout() == null || ((ActionBarLayout) we1Var.getParentLayout()).y() || !(view instanceof te1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((te1) view).J;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : we1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.f22432id;
        if (we1Var.f43748p0) {
            xe1 xe1Var = we1Var.v;
            if (xe1Var != null) {
                ze1 ze1Var = xe1Var.f44436a;
                Bundle bundle = new Bundle();
                cf1 cf1Var = ze1Var.f45155a;
                bundle.putLong("dialog_id", cf1Var.f37079c);
                bundle.putLong("topic_id", tL_forumTopic.f22432id);
                bundle.putBoolean("exception", true);
                t01 t01Var = new t01(bundle, null);
                t01Var.f42745r = new nl0(26, ze1Var, tL_forumTopic);
                cf1Var.presentFragment(t01Var);
            }
            gy gyVar = we1Var.H0;
            if (gyVar != null) {
                gyVar.O3(j11, peerDialogId, true, we1Var);
                return;
            }
            return;
        }
        if (we1Var.W.size() > 0) {
            we1Var.N0(view);
            return;
        }
        if (we1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.n2 n2Var : we1Var.getParentLayout().getFragmentStack()) {
                if (n2Var instanceof gy) {
                    gy gyVar2 = (gy) n2Var;
                    if (gyVar2.h4()) {
                        MessagesStorage.TopicKey topicKey = gyVar2.f38556l2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            we1Var.M0 = peerDialogId;
            we1Var.U0(false, false);
        }
        wf.c.m(we1Var, j10, tL_forumTopic, 0);
    }

    public static boolean W(we1 we1Var, View view, float f10) {
        if (we1Var.f43748p0 || we1Var.getParentLayout() == null || ((ActionBarLayout) we1Var.getParentLayout()).y()) {
            return false;
        }
        if (!we1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof te1)) {
            te1 te1Var = (te1) view;
            if (te1Var.S(f10)) {
                we1Var.M0(te1Var);
                we1Var.J.I0(true);
                we1Var.J.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        we1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(we1 we1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = we1Var.J;
            } else {
                se1 se1Var = we1Var.f43746n0;
                viewGroup = se1Var != null ? se1Var.Q : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                        ((org.telegram.ui.Cells.sa) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = we1Var.actionBar;
        if (kVar != null) {
            kVar.E(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            we1Var.actionBar.F(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            we1Var.actionBar.F(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            we1Var.actionBar.G(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
        }
        aj0 aj0Var = we1Var.L0;
        if (aj0Var != null && Build.VERSION.SDK_INT >= 23) {
            aj0Var.setForeground(new ColorDrawable(i0.b.k(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), 100)));
        }
        we1Var.P0();
    }

    public static void b0(we1 we1Var, boolean z10) {
        bx bxVar;
        we1Var.f43747o0 = z10;
        ValueAnimator valueAnimator = we1Var.U0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            we1Var.U0.cancel();
        }
        int i10 = 0;
        if (we1Var.W0 == null) {
            org.telegram.ui.Components.o71 o71VarN = we1Var.f43746n0.n(8, false);
            we1Var.W0 = o71VarN;
            if (we1Var.I0 != null) {
                o71VarN.setBackgroundColor(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            }
            we1Var.f43730e.addView(we1Var.W0, h7.z5.c(44.0f, -1));
        }
        we1Var.U0 = ValueAnimator.ofFloat(we1Var.S, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(we1Var.f43746n0, false, 1.0f, true);
        gy gyVar = we1Var.I0;
        if (gyVar != null && (bxVar = gyVar.B3) != null) {
            bxVar.I = !z10;
        }
        we1Var.V0 = !z10 && we1Var.f43746n0.getVisibility() == 0 && we1Var.f43746n0.getAlpha() == 1.0f;
        we1Var.U0.addUpdateListener(new w01(we1Var, 17));
        we1Var.f43746n0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(we1Var.getParentActivity(), we1Var.classGuid);
            we1Var.Q0(false);
        } else {
            we1Var.m0.setVisibility(0);
        }
        we1Var.U0.addListener(new fe1(we1Var, z10, i10));
        we1Var.U0.setDuration(200L);
        we1Var.U0.setInterpolator(org.telegram.ui.Components.er.f28122f);
        we1Var.U0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.F0 = this.f43752s.isLoading(this.f43719a);
        if (this.f43763z0 != null) {
            ArrayList arrayList = this.f43722b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ne1) arrayList.get(0)).f40813c != null && ((ne1) arrayList.get(0)).f40813c.f22432id == 1)) {
                this.f43763z0.e(this.F0, this.fragmentBeginToShow);
            }
        }
        he1 he1Var = this.J;
        if (he1Var != null) {
            he1Var.J0(he1Var.u1());
        }
        Q0(true);
    }

    @Override
    public final org.telegram.ui.Components.zu0 B() {
        return this.d;
    }

    public final void B0() {
        gy gyVar = this.I0;
        float fC = 0.0f;
        if (gyVar != null) {
            int iDp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.zr zrVar = gyVar.F1;
            float fC2 = (zrVar != null ? zrVar.c(iDp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.zr zrVar2 = this.Q0;
            if (zrVar2 != null) {
                float fDp = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.zr zrVar3 = this.I0.F1;
                zrVar2.setTranslationY(fC2 - ((zrVar3 != null ? zrVar3.getMetadata().f48512c.f48522a : 0.0f) * fDp));
                org.telegram.ui.Components.zr zrVar4 = this.Q0;
                int iDp2 = AndroidUtilities.dp(14.0f);
                int iDp3 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.zr zrVar5 = this.I0.F1;
                fC = zrVar4.c(AndroidUtilities.lerp(iDp2, iDp3, zrVar5 != null ? zrVar5.getMetadata().f48512c.f48522a : 0.0f)) + fC2;
            } else {
                fC = fC2;
            }
        } else {
            org.telegram.ui.Components.zr zrVar6 = this.Q0;
            if (zrVar6 != null) {
                fC = 0.0f + zrVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.J.setPadding(0, (int) fC, 0, this.f43721a1 + this.Y0 + (this.R ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.W.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.J);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f43752s.findTopic(this.f43719a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(14));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void H0(boolean z10) {
        TLRPC.Chat chatG;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (chatG = g()) != null && ((chatPhoto = chatG.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f43719a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f43733f.getSharedMediaPreloader());
        profileActivity.K4(this.F);
        profileActivity.N4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f43733f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override
    public final long I() {
        return 0L;
    }

    public final void J0(int i10) {
        if (this.I != i10) {
            this.I = i10;
            this.H.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.g6.Ae : org.telegram.ui.ActionBar.g6.f23284q7);
            this.S0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        de1 de1Var = this.d;
        if (de1Var != null) {
            if (z10) {
                de1Var.setLayerType(2, null);
                de1Var.setClipChildren(false);
                de1Var.setClipToPadding(false);
            } else {
                de1Var.setLayerType(0, null);
                de1Var.setClipChildren(true);
                de1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.O0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        he1 he1Var = this.J;
        if (he1Var != null) {
            float fB = org.telegram.ui.Cells.pa.b(1.0f, this.O0, 0.05f, 1.0f);
            he1Var.setPivotX(0.0f);
            he1Var.setPivotY(0.0f);
            he1Var.setScaleX(fB);
            he1Var.setScaleY(fB);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(fB);
            this.actionBar.setScaleY(fB);
        }
    }

    public final void M0(org.telegram.ui.Cells.p2 p2Var) {
        final int i10 = 0;
        try {
            p2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r10 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = p2Var.J;
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(getParentActivity(), this.currentAccount, r10[0].getSwipeBack(), false, new ce1(this, tL_forumTopic), getResourceProvider());
        int iB = r10[0].b(coVar.f27514f);
        coVar.f27522o = 1;
        long j10 = this.f43719a;
        long j11 = -j10;
        coVar.d(j11, tL_forumTopic.f22432id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                f1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {

                public final we1 f43712b;

                {
                    this.f43712b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            we1 we1Var = this.f43712b;
                            we1Var.f43762y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43752s;
                            long j12 = we1Var.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.f43712b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43752s;
                            long j13 = we1Var2.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43712b;
                            we1Var3.D0(hashSet, new ud1(we1Var3, 3));
                            break;
                    }
                }
            });
            r10[0].addView(f1Var);
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f22432id)) {
            f1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            f1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new jh.l5(this, tL_forumTopic, (Serializable) r10, iB, 6));
        r10[0].addView(f1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                f1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                f1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            f1Var3.setMinimumWidth(160);
            f1Var3.setOnClickListener(new View.OnClickListener(this) {

                public final we1 f43712b;

                {
                    this.f43712b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            we1 we1Var = this.f43712b;
                            we1Var.f43762y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43752s;
                            long j12 = we1Var.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.f43712b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43752s;
                            long j13 = we1Var2.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43712b;
                            we1Var3.D0(hashSet, new ud1(we1Var3, 3));
                            break;
                    }
                }
            });
            r10[0].addView(f1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, true);
            f1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            f1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
            f1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
            f1Var4.setMinimumWidth(160);
            final int i12 = 2;
            f1Var4.setOnClickListener(new View.OnClickListener(this) {

                public final we1 f43712b;

                {
                    this.f43712b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            we1 we1Var = this.f43712b;
                            we1Var.f43762y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43752s;
                            long j12 = we1Var.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.f43712b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43752s;
                            long j13 = we1Var2.f43719a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43712b;
                            we1Var3.D0(hashSet, new ud1(we1Var3, 3));
                            break;
                    }
                }
            });
            r10[0].addView(f1Var4);
        }
        boolean zIsMonoForum = getMessagesController().isMonoForum(j11);
        if (this.L0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.L0.setBackground(new BitmapDrawable(bitmapCreateBitmap));
            this.L0.setAlpha(0.0f);
            if (this.L0.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.L0, h7.z5.c(-1.0f, -1));
        }
        rn rnVar = new rn(com.google.android.recaptcha.internal.a.h(j10, "chat_id"));
        wf.c.a(rnVar, MessagesStorage.TopicKey.of(j11, zIsMonoForum ? DialogObject.getPeerDialogId(p2Var.J.from_id) : p2Var.J.f22432id));
        presentFragmentAsPreviewWithMenu(rnVar, r10[0]);
    }

    public final void N0(View view) {
        te1 te1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        if (!(view instanceof te1) || (tL_forumTopic = (te1Var = (te1) view).J) == null) {
            return;
        }
        int i10 = tL_forumTopic.f22432id;
        Integer numValueOf = Integer.valueOf(i10);
        HashSet hashSet = this.W;
        if (!hashSet.remove(numValueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        te1Var.V(hashSet.contains(Integer.valueOf(i10)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43719a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.s();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
            if (this.inPreviewMode) {
                zVarJ.setBackgroundColor(0);
                zVarJ.f23983a = false;
            }
            NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
            this.Y = numberTextView;
            numberTextView.setTextSize(18);
            this.Y.setTypeface(AndroidUtilities.bold());
            this.Y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8));
            zVarJ.addView(this.Y, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
            this.Y.setOnTouchListener(new xd1(0));
            this.Z = zVarJ.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.f43720a0 = zVarJ.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f43723b0 = zVarJ.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.f43726c0 = zVarJ.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.v0 v0VarH = zVarJ.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.f43728d0 = v0VarH;
            v0VarH.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0VarH2 = zVarJ.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.f43731e0 = v0VarH2;
            v0VarH2.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0VarH3 = zVarJ.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.f43740i0 = v0VarH3;
            this.f43734f0 = v0VarH3.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.f43736g0 = this.f43740i0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.f43738h0 = this.f43740i0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            topicsController = this.f43752s;
            if (!zHasNext) {
                break;
            }
            HashSet hashSet2 = hashSet;
            long jIntValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j10, jIntValue);
            if (tL_forumTopicFindTopic != null) {
                if (tL_forumTopicFindTopic.unread_count != 0) {
                    i11++;
                }
                if (ChatObject.canManageTopics(chat) && !tL_forumTopicFindTopic.hidden) {
                    if (tL_forumTopicFindTopic.pinned) {
                        i14++;
                    } else {
                        i13++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, jIntValue)) {
                i12++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i11 > 0) {
            this.f43734f0.setVisibility(0);
            this.f43734f0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
        } else {
            this.f43734f0.setVisibility(8);
        }
        if (i12 != 0) {
            this.f43760x0 = false;
            this.f43723b0.setIcon(R.drawable.msg_unmute);
            this.f43723b0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            z10 = true;
        } else {
            z10 = true;
            this.f43760x0 = true;
            this.f43723b0.setIcon(R.drawable.msg_mute);
            this.f43723b0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.Z.setVisibility((i13 == z10 && i14 == 0) ? 0 : 8);
        this.f43720a0.setVisibility((i14 == z10 && i13 == 0) ? 0 : 8);
        this.Y.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic tL_forumTopicFindTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (tL_forumTopicFindTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, tL_forumTopicFindTopic2)) {
                    i17++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, tL_forumTopicFindTopic2)) {
                    if (tL_forumTopicFindTopic2.f22432id == 1) {
                        if (tL_forumTopicFindTopic2.hidden) {
                            i19++;
                        } else {
                            i18++;
                        }
                    }
                    if (!tL_forumTopicFindTopic2.hidden) {
                        if (tL_forumTopicFindTopic2.closed) {
                            i15++;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        this.f43736g0.setVisibility((i15 != 0 || i16 <= 0) ? 8 : 0);
        this.f43736g0.setText(LocaleController.getString(i16 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.f43738h0.setVisibility((i16 != 0 || i15 <= 0) ? 8 : 0);
        this.f43738h0.setText(LocaleController.getString(i15 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.f43726c0.setVisibility(i17 == hashSet3.size() ? 0 : 8);
        this.f43728d0.setVisibility((i18 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.f43731e0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.f43740i0.l();
        R0();
    }

    public final void O0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String string;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f43733f == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43719a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        long j11 = -j10;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        if (UserObject.isBotForum(user)) {
            this.f43733f.setUserAvatar(user);
        } else if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                this.f43733f.setChatAvatar(chat2);
            }
        } else {
            this.f43733f.setChatAvatar(chat);
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j11);
        boolean z14 = notificationsSettings.getInt(sb2.toString(), 0) == 2;
        boolean zW = org.telegram.messenger.y1.w("dialog_bar_report", j11, notificationsSettings, false);
        boolean zW2 = org.telegram.messenger.y1.w("dialog_bar_block", j11, notificationsSettings, false);
        long j12 = 0;
        boolean z15 = this.f43748p0;
        if (z15) {
            j12 = 0;
            if (this.f43753s0) {
                this.f43733f.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.f43751r0) {
                this.f43733f.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.f43754t0) {
                this.f43733f.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.f43749q0) {
                this.f43733f.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.f43733f.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.f43744l0.setVisibility(8);
            org.telegram.ui.Components.rn rnVar = this.f43733f;
            if (rnVar != null && rnVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f43733f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.f43744l0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f43733f.n(false);
            this.f43733f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f43733f.setTitle(chat.title);
                this.f43733f.j(null, getMessagesController().isDialogMuted(j11, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j10);
            if (chatFull2 != null && (chatFull = this.F) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.F = chatFull2;
            if (chatFull2 != null) {
                int i16 = chatFull2.participants_count;
                if (i16 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j10));
                    if (chat3 == null) {
                        string = LocaleController.getString(R.string.Loading);
                    } else {
                        string = ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    }
                } else {
                    string = LocaleController.formatPluralString("Members", i16, new Object[0]);
                }
            } else {
                string = LocaleController.getString(R.string.Loading);
            }
            this.f43733f.setSubtitle(string);
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(a9.p.l(j11, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j13 > j12 && System.currentTimeMillis() - j13 < 120000) {
            this.H.a(LocaleController.getString(R.string.ChannelJoinRequestSent), z16);
            this.H.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.f43742j0, false, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.H, true, 0.5f, z16);
            J0(0);
        } else {
            if (chat == null || z15 || !(ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.f22380id))) {
                if (z14 && (zW2 || zW)) {
                    this.H.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
                    this.H.setClickable(true);
                    this.H.setEnabled(true);
                    AndroidUtilities.updateViewVisibilityAnimated(this.f43742j0, false, 0.5f, false);
                    AndroidUtilities.updateViewVisibilityAnimated(this.H, true, 0.5f, false);
                    J0(1);
                } else {
                    z11 = false;
                }
                if (this.R != z11) {
                    this.R = z11;
                    this.f43743k0.animate().setListener(null).cancel();
                    if (z16) {
                        this.f43743k0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new fe1(this, z11, 1));
                    } else {
                        z71 z71Var = this.f43743k0;
                        if (z11) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        z71Var.setVisibility(i15);
                        this.f43743k0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                B0();
                org.telegram.ui.ActionBar.v0 v0Var = this.m0;
                if (z15) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.f1 f1Var = this.N;
                if (ChatObject.canAddUsers(chat)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                f1Var.setVisibility(i11);
                org.telegram.ui.ActionBar.f1 f1Var2 = this.P;
                if (ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.F) || ChatObject.hasAdminRights(chat))) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                f1Var2.setVisibility(i12);
                org.telegram.ui.ActionBar.f1 f1Var3 = this.O;
                if (chat != null || chat.creator || ChatObject.isNotInChat(chat)) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f1Var3.setVisibility(i13);
                org.telegram.ui.ActionBar.f1 f1Var4 = this.Q;
                if (chat != null || chat.creator || ChatObject.hasAdminRights(chat)) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                f1Var4.setVisibility(i14);
                Q0(true);
                this.D0 = getMessagesController().getGroupCall(j10, true);
                z0(false);
            }
            if (getMessagesController().isJoiningChannel(chat.f22380id)) {
                z13 = true;
                z12 = true;
            } else {
                if (chat.join_request) {
                    this.H.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.H.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                z12 = true;
                this.H.setClickable(true);
                this.H.setEnabled(true);
                z13 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.f43742j0, z13, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.H, z13 ^ z12, 0.5f, z16);
            J0(0);
        }
        z11 = true;
        if (this.R != z11) {
            this.R = z11;
            this.f43743k0.animate().setListener(null).cancel();
            if (z16) {
                z71 z71Var2 = this.f43743k0;
                if (z11) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                z71Var2.setVisibility(i15);
                this.f43743k0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
            } else {
                this.f43743k0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new fe1(this, z11, 1));
            }
        }
        B0();
        org.telegram.ui.ActionBar.v0 v0Var2 = this.m0;
        if (z15) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        v0Var2.setVisibility(i10);
        org.telegram.ui.ActionBar.f1 f1Var5 = this.N;
        if (ChatObject.canAddUsers(chat)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        f1Var5.setVisibility(i11);
        org.telegram.ui.ActionBar.f1 f1Var6 = this.P;
        if (ChatObject.isBoostSupported(chat)) {
            i12 = 8;
        } else {
            i12 = 8;
        }
        f1Var6.setVisibility(i12);
        org.telegram.ui.ActionBar.f1 f1Var7 = this.O;
        if (chat != null) {
            i13 = 8;
        } else {
            i13 = 8;
        }
        f1Var7.setVisibility(i13);
        org.telegram.ui.ActionBar.f1 f1Var8 = this.Q;
        if (chat != null) {
            i14 = 8;
        } else {
            i14 = 8;
        }
        f1Var8.setVisibility(i14);
        Q0(true);
        this.D0 = getMessagesController().getGroupCall(j10, true);
        z0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f43742j0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ae));
        this.h.g();
        z71 z71Var = this.f43743k0;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        z71Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
        }
        this.f43746n0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        if (this.M == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43719a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.f43747o0 || this.f43748p0 || this.F0) ? false : true;
        this.G = z11;
        this.M.setVisibility(z11 ? 0 : 8);
        G0(!this.G, z10);
    }

    public final void R0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.W.isEmpty();
        if (this.X != z10) {
            this.X = z10;
            le1 le1Var = this.f43750r;
            le1Var.q(0, le1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f10) {
        this.S = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23425y8;
        kVar.D(i0.b.d(this.S, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.d(this.S, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.d(this.S, getThemedColor(org.telegram.ui.ActionBar.g6.f23341t8), getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.b.d(this.S, getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)));
        }
        float f11 = 1.0f - f10;
        this.f43733f.getTitleTextView().setAlpha(f11);
        this.f43733f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.o71 o71Var = this.W0;
        if (o71Var != null) {
            o71Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.W0.setAlpha(f10);
        }
        this.f43746n0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.f43746n0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f43730e.invalidate();
        }
        this.d.invalidate();
        this.J.setAlpha(f11);
        if (this.V0) {
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.S, 0.02f, 0.98f);
            this.J.setScaleX(fZ);
            this.J.setScaleY(fZ);
        }
    }

    public final void T0() {
        jh.x4 x4Var = this.f43763z0;
        if (x4Var == null || x4Var.f29506e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.ic_ab_other, 0);
        cqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(g(), 15)) {
            this.f43763z0.f29506e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(this.f43719a, 1L);
        if (tL_forumTopicFindTopic != null) {
            string = tL_forumTopicFindTopic.title;
        }
        this.f43763z0.f29506e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void U0(boolean z10, boolean z11) {
        yd1 yd1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.J0) {
            z10 = true;
        }
        this.J0 = false;
        TopicsController topicsController = this.f43752s;
        long j10 = this.f43719a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f43722b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f43749q0) {
                arrayList.add(new ne1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.f43758w0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f22432id))) {
                    arrayList.add(new ne1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.R0) {
                arrayList.add(new ne1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.G0.b(size + 4);
                z10 = false;
            }
            this.f43759x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ne1 ne1Var = (ne1) arrayList.get(i11);
                if (ne1Var != null && (tL_forumTopic = ne1Var.f40813c) != null && tL_forumTopic.hidden) {
                    this.f43759x++;
                }
            }
            he1 he1Var = this.J;
            if (he1Var != null) {
                if (he1Var.getItemAnimator() != (z10 ? this.E0 : null)) {
                    this.J.setItemAnimator(z10 ? this.E0 : null);
                }
            }
            le1 le1Var = this.f43750r;
            if (le1Var != null) {
                le1Var.E(arrayList2, arrayList);
            }
            if ((this.f43762y0 || size == 0) && (yd1Var = this.B) != null) {
                yd1Var.h1(0, 0);
                this.f43762y0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f43719a;
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        gy gyVar = this.I0;
        final int i10 = 0;
        this.Y0 = (gyVar == null || !gyVar.S) ? 0 : AndroidUtilities.dp(72.0f);
        gy gyVar2 = this.I0;
        this.Z0 = (gyVar2 == null || !gyVar2.S) ? 0 : AndroidUtilities.dp(64.0f);
        de1 de1Var = new de1(this, context);
        this.d = de1Var;
        this.fragmentView = de1Var;
        de1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ge1(this, context));
        final int i12 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {

            public final we1 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i12) {
                    case 0:
                        we1 we1Var = this.f42911b;
                        we1Var.presentFragment(sd1.a0(we1Var.f43719a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.f42911b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43719a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.f42911b;
                        if (!we1Var3.f43747o0) {
                            we1Var3.H0(false);
                        }
                        break;
                    case 3:
                        this.f42911b.finishPreviewFragment();
                        break;
                    default:
                        gy gyVar3 = this.f42911b.I0;
                        if (gyVar3 != null && (v0Var = gyVar3.f38525f0) != null) {
                            v0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        int i13 = 17;
        final int i14 = 4;
        if (this.I0 != null) {
            org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
            this.f43744l0 = v0VarA;
            v0VarA.setOnClickListener(new View.OnClickListener(this) {

                public final we1 f42911b;

                {
                    this.f42911b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i14) {
                        case 0:
                            we1 we1Var = this.f42911b;
                            we1Var.presentFragment(sd1.a0(we1Var.f43719a, 0L));
                            break;
                        case 1:
                            we1 we1Var2 = this.f42911b;
                            we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43719a, null, we1Var2.g());
                            we1Var2.O0(false);
                            break;
                        case 2:
                            we1 we1Var3 = this.f42911b;
                            if (!we1Var3.f43747o0) {
                                we1Var3.H0(false);
                            }
                            break;
                        case 3:
                            this.f42911b.finishPreviewFragment();
                            break;
                        default:
                            gy gyVar3 = this.f42911b.I0;
                            if (gyVar3 != null && (v0Var = gyVar3.f38525f0) != null) {
                                v0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.v0 v0VarA2 = zVarN.a(0, R.drawable.outline_header_search);
            this.f43744l0 = v0VarA2;
            v0VarA2.F();
            v0VarA2.D = new db(this, i13);
            this.f43744l0.setSearchPaddingStart(56);
            this.f43744l0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f43744l0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.Wd));
        }
        org.telegram.ui.ActionBar.v0 v0VarC = zVarN.c(0, R.drawable.ic_ab_other, null);
        this.m0 = v0VarC;
        v0VarC.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.m0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.N = this.m0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        this.P = v0Var.d(14, 0, new org.telegram.ui.Components.oi0(R.raw.boosts, AndroidUtilities.dp(24.0f), "" + R.raw.boosts, AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, v0Var.f23865i0);
        int i15 = 3;
        this.M = this.m0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.Q = this.m0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.O = this.m0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, this, false, this.resourceProvider);
        this.f43733f = rnVar;
        rnVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f43733f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.rn rnVar2 = this.f43733f;
        long j10 = -this.f43719a;
        rnVar2.f32212b = j10 < 0;
        rnVar2.setClipChildren(false);
        this.actionBar.addView(this.f43733f, 0, h7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f43748p0) {
            this.f43733f.getAvatarImageView().setOnClickListener(new y7(this, i15));
        }
        this.J = new he1(this, context);
        qg.j jVar = new qg.j(this.d);
        ViewGroup viewGroup = this.d;
        jg.a aVar = this.f43732e1;
        aVar.d = jVar;
        aVar.f12943e = viewGroup;
        he1 he1Var = this.J;
        gy gyVar3 = this.I0;
        if (gyVar3 != null) {
            viewGroup = (ViewGroup) gyVar3.getFragmentView();
        }
        he1 he1Var2 = this.J;
        Objects.requireNonNull(he1Var2);
        this.f43735f1 = new jg.k(he1Var, viewGroup, new v8(he1Var2, i12));
        this.J.C0(new ud1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        wf.b bVarC = wf.c.c(getParentActivity(), 0.85f, -1, false);
        bVarC.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(bVarC, 2), 0, 1, 33);
        nw nwVar = new nw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f43757w = nwVar;
        nwVar.b();
        int i16 = this.A ? 2 : 0;
        this.f43761y = i16;
        this.f43757w.X = i16 != 0;
        je1 je1Var = new je1(this);
        this.J.setHideIfEmpty(false);
        je1Var.f5819m = false;
        je1Var.C = false;
        he1 he1Var3 = this.J;
        this.E0 = je1Var;
        he1Var3.setItemAnimator(je1Var);
        this.J.setOnScrollListener(new zd1(this, i11));
        he1 he1Var4 = this.J;
        he1Var4.U1 = true;
        he1Var4.V1 = 0;
        org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(he1Var4, true);
        this.G0 = gk0Var;
        this.J.setItemsEnterAnimator(gk0Var);
        this.J.setOnItemClickListener(new b21(this, 8));
        this.J.setOnItemLongClickListener(new vd1(this));
        this.J.setOnScrollListener(new zd1(this, i12));
        he1 he1Var5 = this.J;
        yd1 yd1Var = new yd1(this);
        this.B = yd1Var;
        he1Var5.setLayoutManager(yd1Var);
        new SparseArray();
        new HashMap();
        this.J.setAdapter(this.f43750r);
        this.J.setClipToPadding(false);
        this.J.j(new zd1(this, i10));
        ve1 ve1Var = new ve1(this);
        this.L = ve1Var;
        ae1 ae1Var = new ae1(this, ve1Var);
        this.K = ae1Var;
        ae1Var.d(this.J);
        this.d.addView(this.J, h7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(getParentActivity(), this.resourceProvider, false);
        this.h = m10Var;
        this.d.addView(m10Var, org.telegram.ui.Components.m10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {

            public final we1 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i10) {
                    case 0:
                        we1 we1Var = this.f42911b;
                        we1Var.presentFragment(sd1.a0(we1Var.f43719a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.f42911b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43719a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.f42911b;
                        if (!we1Var3.f43747o0) {
                            we1Var3.H0(false);
                        }
                        break;
                    case 3:
                        this.f42911b.finishPreviewFragment();
                        break;
                    default:
                        gy gyVar4 = this.f42911b.I0;
                        if (gyVar4 != null && (v0Var2 = gyVar4.f38525f0) != null) {
                            v0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.h.f30519c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f30519c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f30519c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        h00Var.setViewType(24);
        h00Var.setVisibility(8);
        h00Var.f28887w = true;
        me1 me1Var = new me1(context);
        TextView textView = new TextView(context);
        me1Var.f40465a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        boolean z10 = LocaleController.isRTL;
        me1Var.addView(textView, h7.z5.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.f43745n = me1Var;
        textView.setAlpha(0.0f);
        jh.x4 x4Var = new jh.x4(this, context, h00Var);
        this.f43763z0 = x4Var;
        try {
            x4Var.f29504b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.f43763z0.e(this.F0, this.fragmentBeginToShow);
        this.f43763z0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f43745n.addView(h00Var);
        this.f43745n.addView(this.f43763z0);
        this.d.addView(this.f43745n);
        this.J.setEmptyView(this.f43745n);
        this.f43743k0 = new z71(context, 5);
        org.telegram.ui.Components.m51 m51Var = new org.telegram.ui.Components.m51(context);
        this.H = m51Var;
        this.f43743k0.addView(m51Var);
        this.d.addView(this.f43743k0, h7.z5.e(-1, 51, 80));
        this.H.setOnClickListener(new be1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f43742j0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f43742j0.setVisibility(4);
        this.f43743k0.addView(this.f43742j0, h7.z5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.S0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.S0;
        int i17 = org.telegram.ui.ActionBar.g6.f23061de;
        imageView2.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(getThemedColor(i17))));
        this.S0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.S0.setScaleType(ImageView.ScaleType.CENTER);
        this.f43743k0.addView(this.S0, h7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {

            public final we1 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i11) {
                    case 0:
                        we1 we1Var = this.f42911b;
                        we1Var.presentFragment(sd1.a0(we1Var.f43719a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.f42911b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43719a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.f42911b;
                        if (!we1Var3.f43747o0) {
                            we1Var3.H0(false);
                        }
                        break;
                    case 3:
                        this.f42911b.finishPreviewFragment();
                        break;
                    default:
                        gy gyVar4 = this.f42911b.I0;
                        if (gyVar4 != null && (v0Var2 = gyVar4.f38525f0) != null) {
                            v0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.S0.setVisibility(8);
        O0(false);
        n0 n0Var = new n0(this, context, 25);
        this.f43730e = n0Var;
        if (this.I0 == null) {
            this.d.addView(n0Var, h7.z5.e(-1, -1, 119));
        }
        se1 se1Var = new se1(this, context);
        this.f43746n0 = se1Var;
        se1Var.setVisibility(8);
        this.f43730e.addView(this.f43746n0, h7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        se1 se1Var2 = this.f43746n0;
        int i18 = org.telegram.ui.ActionBar.g6.f23053d6;
        se1Var2.setBackgroundColor(getThemedColor(i18));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f43719a, true, null, true, false, 0);
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.Q0 = zrVar;
        zrVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        lg.d dVarC = aVar.c(this.Q0, ng.c.m(this.resourceProvider), false);
        dVarC.p(AndroidUtilities.dp(24.0f));
        dVarC.o(AndroidUtilities.dp(7.0f));
        this.Q0.setBlurredBackground(dVarC);
        this.Q0.setOnAnimatedHeightChangedListener(new ud1(this, i10));
        this.d.addView(this.Q0, h7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat chatG = g();
        if (chatG != null) {
            fh.e eVar = new fh.e(chatG, this);
            this.N0 = eVar;
            this.Q0.addView(eVar.c(), h7.z5.n(-1, 40));
            this.Q0.h(3, this.N0.c());
            this.Q0.g(this.N0.c());
            fh.e eVar2 = this.N0;
            eVar2.f6115m = new vd1(this);
            TLRPC.ChatFull chatFull = this.F;
            eVar2.f6112j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.B0 = frameLayout;
            this.Q0.addView(frameLayout);
            this.Q0.h(4, this.B0);
            this.Q0.g(this.B0);
            this.Q0.i(this.B0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.C0 = x8Var;
            this.B0.addView(x8Var);
            this.Q0.setCallFragmentContextView(this.C0);
        }
        FrameLayout.LayoutParams layoutParamsC = h7.z5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            layoutParamsC.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, layoutParamsC);
        }
        y0();
        aj0 aj0Var = new aj0(this, context, 9);
        this.L0 = aj0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            aj0Var.setForeground(new ColorDrawable(i0.b.k(getThemedColor(i18), 100)));
        }
        this.L0.setFocusable(false);
        this.L0.setImportantForAccessibility(2);
        final int i19 = 3;
        this.L0.setOnClickListener(new View.OnClickListener(this) {

            public final we1 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i19) {
                    case 0:
                        we1 we1Var = this.f42911b;
                        we1Var.presentFragment(sd1.a0(we1Var.f43719a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.f42911b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43719a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.f42911b;
                        if (!we1Var3.f43747o0) {
                            we1Var3.H0(false);
                        }
                        break;
                    case 3:
                        this.f42911b.finishPreviewFragment();
                        break;
                    default:
                        gy gyVar4 = this.f42911b.I0;
                        if (gyVar4 != null && (v0Var2 = gyVar4.f38525f0) != null) {
                            v0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.L0.setFitsSystemWindows(true);
        this.R = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof gy) {
                    gy gyVar4 = (gy) n2Var;
                    if (gyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = gyVar4.f38556l2;
                        if (topicKey.dialogId == j10) {
                            this.M0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new tb(this, 5));
        }
        View view = this.fragmentView;
        vd1 vd1Var = new vd1(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(view, vd1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f43719a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.F) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f22381id == j10) {
                O0(false);
                fh.e eVar = this.N0;
                if (eVar != null) {
                    eVar.f6112j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if (iIntValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean zCanScrollVertically = this.J.canScrollVertically(-1);
                U0(true, false);
                if (!zCanScrollVertically) {
                    this.B.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.D0 = getMessagesController().getGroupCall(l10.longValue(), false);
                x8 x8Var = this.C0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            long jLongValue = ((Long) objArr[0]).longValue();
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (jLongValue != (-j10) || zBooleanValue) {
                if (this.M0 != 0) {
                    this.M0 = 0L;
                    U0(false, false);
                    return;
                }
                return;
            }
            if (this.M0 != jLongValue2) {
                this.M0 = jLongValue2;
                U0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.f43719a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.D0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.zk0 zk0Var;
        sx0 sx0Var = new sx0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        se1 se1Var = this.f43746n0;
        if (se1Var != null && (zk0Var = se1Var.Q) != null) {
            org.telegram.ui.Cells.s3.a(arrayList, zk0Var);
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User i() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.f43747o0 ? org.telegram.ui.ActionBar.g6.f23053d6 : org.telegram.ui.ActionBar.g6.f23322s8);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23393w8);
        }
        return i0.b.f(themedColor) > 0.699999988079071d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.W.isEmpty()) {
            if (!this.f43747o0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.w(this.f43744l0.L(false));
            }
        } else if (z10) {
            C0();
            return false;
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43719a;
        messagesController.loadFullChat(j10, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        U0(false, false);
        a61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long lValueOf = Long.valueOf(j10);
        HashSet hashSet = f43718j1;
        if (!hashSet.contains(lValueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.K0.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43719a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        gy gyVar = this.I0;
        if (gyVar == null || gyVar.B3 == null) {
            return;
        }
        gyVar.getActionBar().setSearchAvatarImageView(null);
        this.I0.B3.I = true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f43719a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f43719a;
        topicsController.onTopicFragmentResume(j10);
        this.C = false;
        AndroidUtilities.updateVisibleRows(this.J);
        this.C = true;
        setBulletinDelegate(new y8(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.P0) {
            L0(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bx bxVar;
        aj0 aj0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (aj0Var = this.L0) != null) {
            if (aj0Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.L0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.K0.unlock();
        if (z10) {
            return;
        }
        if (this.f43748p0 && this.D) {
            removeSelfFromStack();
            gy gyVar = this.H0;
            if (gyVar != null) {
                gyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.E) {
            removeSelfFromStack();
            gy gyVar2 = this.I0;
            if (gyVar2 == null || (bxVar = gyVar2.B3) == null || !bxVar.c()) {
                return;
            }
            this.I0.B3.a();
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        aj0 aj0Var = this.L0;
        if (aj0Var == null || aj0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.L0.setAlpha(1.0f - f10);
        } else {
            this.L0.setAlpha(f10);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.K0.lock();
    }

    @Override
    public final org.telegram.ui.Components.rn p() {
        return this.f43733f;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.P0 = true;
            K0(true);
        } else {
            this.P0 = false;
            K0(false);
            L0(1.0f);
        }
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.rn rnVar = this.f43733f;
        if (rnVar != null) {
            rnVar.setAlpha(f10);
            this.m0.setAlpha(f10);
            org.telegram.ui.ActionBar.v0 v0Var = this.f43744l0;
            if (v0Var != null) {
                v0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.rn rnVar = this.f43733f;
        if (rnVar != null) {
            rnVar.setAlpha(f10);
            this.f43733f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final void t() {
        this.J.x0(0);
    }

    public final void x0() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f43724b1) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f) + ((int) this.Q0.c(AndroidUtilities.dp(14.0f)));
        gy gyVar = this.I0;
        View view = gyVar != null ? gyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = gyVar != null ? gyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.f43721a1) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.f43739h1.set(0.0f, -iDp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + iDp + iDp2);
        RectF rectF = this.f43741i1;
        rectF.set(0.0f, iDp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.I0 != null ? 2 : 1, this.f43737g1);
        eVar.e(this.f43735f1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void y0() {
        yd1 yd1Var;
        TopicsController topicsController = this.f43752s;
        long j10 = this.f43719a;
        if (topicsController.endIsReached(j10) || (yd1Var = this.B) == null) {
            return;
        }
        int iN0 = yd1Var.N0();
        if (this.f43722b.isEmpty() || iN0 >= this.f43750r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        A0();
    }

    @Override
    public final og.d z() {
        return this.f43729d1;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43719a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.D0;
        if (call != null && ((str = this.f43755u0) != null || this.f43756v0)) {
            org.telegram.ui.Components.voip.e2.m(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43755u0 = null;
            this.f43756v0 = false;
        } else {
            if (this.f43755u0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.y1.q(R.string.LinkHashExpired, org.telegram.ui.Components.mc.a0(this), R.raw.linkbroken, 36);
            this.f43755u0 = null;
        }
    }

    @Override
    public final void q() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
