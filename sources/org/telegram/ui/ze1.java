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
public class ze1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ug, mg0 {
    public static final HashSet f45154j1 = new HashSet();
    public boolean A;
    public me1 A0;
    public zd1 B;
    public FrameLayout B0;
    public boolean C;
    public v8 C0;
    public boolean D;
    public ChatObject.Call D0;
    public boolean E;
    public le1 E0;
    public TLRPC.ChatFull F;
    public boolean F0;
    public boolean G;
    public org.telegram.ui.Components.pk0 G0;
    public org.telegram.ui.Components.w51 H;
    public fy H0;
    public int I;
    public fy I0;
    public je1 J;
    public boolean J0;
    public be1 K;
    public final AnimationNotificationsLocker K0;
    public ye1 L;
    public op0 L0;
    public org.telegram.ui.ActionBar.g1 M;
    public long M0;
    public org.telegram.ui.ActionBar.g1 N;
    public hh.e N0;
    public org.telegram.ui.ActionBar.g1 O;
    public float O0;
    public org.telegram.ui.ActionBar.g1 P;
    public boolean P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public org.telegram.ui.Components.fs Q0;
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
    public org.telegram.ui.Components.y71 W0;
    public boolean X;
    public View X0;
    public NumberTextView Y;
    public int Y0;
    public org.telegram.ui.ActionBar.w0 Z;
    public int Z0;
    public final long f45155a;
    public org.telegram.ui.ActionBar.w0 f45156a0;
    public int f45157a1;
    public final ArrayList f45158b;
    public org.telegram.ui.ActionBar.w0 f45159b0;
    public final lg.e f45160b1;
    public int f45161c;
    public org.telegram.ui.ActionBar.w0 f45162c0;
    public final qg.d f45163c1;
    public ee1 d;
    public org.telegram.ui.ActionBar.w0 f45164d0;
    public final qg.d f45165d1;
    public n0 f45166e;
    public org.telegram.ui.ActionBar.w0 f45167e0;
    public final lg.a f45168e1;
    public org.telegram.ui.Components.xn f45169f;
    public org.telegram.ui.ActionBar.g1 f45170f0;
    public lg.k f45171f1;
    public org.telegram.ui.ActionBar.g1 f45172g0;
    public final ArrayList f45173g1;
    public org.telegram.ui.Components.u10 h;
    public org.telegram.ui.ActionBar.g1 f45174h0;
    public final RectF f45175h1;
    public org.telegram.ui.ActionBar.w0 f45176i0;
    public final RectF f45177i1;
    public RadialProgressView f45178j0;
    public n31 f45179k0;
    public org.telegram.ui.ActionBar.w0 f45180l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public oe1 f45181n;
    public ve1 f45182n0;
    public boolean f45183o0;
    public final boolean f45184p0;
    public final boolean f45185q0;
    public final ne1 f45186r;
    public final boolean f45187r0;
    public final TopicsController f45188s;
    public final boolean f45189s0;
    public final boolean f45190t0;
    public String f45191u0;
    public af1 v;
    public boolean f45192v0;
    public mw f45193w;
    public HashSet f45194w0;
    public int f45195x;
    public boolean f45196x0;
    public int f45197y;
    public boolean f45198y0;
    public lh.x4 f45199z0;

    public ze1(Bundle bundle) {
        super(bundle);
        this.f45158b = new ArrayList();
        new ArrayList();
        this.f45186r = new ne1(this);
        this.f45195x = 0;
        this.A = true;
        this.C = true;
        this.R = true;
        this.S = 0.0f;
        this.W = new HashSet();
        this.f45196x0 = false;
        this.K0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.O0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f45173g1 = arrayList;
        RectF rectF = new RectF();
        this.f45175h1 = rectF;
        RectF rectF2 = new RectF();
        this.f45177i1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f45155a = j10;
        this.f45184p0 = this.arguments.getBoolean("for_select", false);
        this.f45185q0 = this.arguments.getBoolean("forward_to", false);
        this.f45190t0 = this.arguments.getBoolean("bot_share_to", false);
        this.f45187r0 = this.arguments.getBoolean("quote", false);
        this.f45189s0 = this.arguments.getBoolean("reply_to", false);
        this.f45191u0 = this.arguments.getString("voicechat", null);
        this.f45192v0 = this.arguments.getBoolean("videochat", false);
        this.f45188s = getMessagesController().getTopicsController();
        this.R0 = true ^ org.telegram.messenger.x3.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f45160b1 = new lg.e(false);
            this.f45163c1 = new qg.d(null);
            qg.d dVar = new qg.d(null);
            this.f45165d1 = dVar;
            lg.a aVar = new lg.a(dVar);
            this.f45168e1 = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
            return;
        }
        this.f45160b1 = null;
        this.f45163c1 = null;
        this.f45165d1 = null;
        this.f45168e1 = new lg.a(cVar);
    }

    public static org.telegram.ui.ActionBar.o2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new tn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new tn(bundle);
            }
        }
        return new ze1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.K), MessagesStorage.getInstance(launchActivity.K), bundle);
    }

    public static void I0(org.telegram.ui.tn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze1.I0(org.telegram.ui.tn):void");
    }

    public static boolean U(ze1 ze1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ze1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-ze1Var.f45155a), System.currentTimeMillis()).commit();
        Activity parentActivity = ze1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(ze1Var.g());
        int i10 = org.telegram.ui.Components.c80.f27367r;
        org.telegram.ui.Components.c80.w(parentActivity, ze1Var, org.telegram.ui.Components.tc.a0(ze1Var), isChannelAndNotMegaGroup);
        ze1Var.O0(true);
        return false;
    }

    public static void V(ze1 ze1Var, View view) {
        long j10;
        long j11 = ze1Var.f45155a;
        if (ze1Var.getParentLayout() != null && !((ActionBarLayout) ze1Var.getParentLayout()).y() && (view instanceof we1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((we1) view).J;
            long j12 = -j11;
            boolean isMonoForum = ze1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f22444id;
            }
            long j13 = j10;
            if (ze1Var.f45184p0) {
                af1 af1Var = ze1Var.v;
                if (af1Var != null) {
                    cf1 cf1Var = af1Var.f36542a;
                    Bundle bundle = new Bundle();
                    ff1 ff1Var = cf1Var.f37098a;
                    bundle.putLong("dialog_id", ff1Var.f38145c);
                    bundle.putLong("topic_id", tL_forumTopic.f22444id);
                    bundle.putBoolean("exception", true);
                    t01 t01Var = new t01(bundle, null);
                    t01Var.f42517r = new kl0(26, cf1Var, tL_forumTopic);
                    ff1Var.presentFragment(t01Var);
                }
                fy fyVar = ze1Var.H0;
                if (fyVar != null) {
                    fyVar.O3(j12, j13, true, ze1Var);
                }
            } else if (ze1Var.W.size() > 0) {
                ze1Var.N0(view);
            } else {
                if (ze1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : ze1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof fy) {
                            fy fyVar2 = (fy) o2Var;
                            if (fyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = fyVar2.f38314l2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    ze1Var.M0 = j13;
                    ze1Var.U0(false, false);
                }
                yf.d.m(ze1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(ze1 ze1Var, View view, float f9) {
        if (ze1Var.f45184p0 || ze1Var.getParentLayout() == null || ((ActionBarLayout) ze1Var.getParentLayout()).y()) {
            return false;
        }
        if (!ze1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof we1)) {
            we1 we1Var = (we1) view;
            if (we1Var.S(f9)) {
                ze1Var.M0(we1Var);
                ze1Var.J.I0(true);
                ze1Var.J.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        ze1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(ze1 ze1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = ze1Var.J;
            } else {
                ve1 ve1Var = ze1Var.f45182n0;
                if (ve1Var != null) {
                    viewGroup = ve1Var.Q;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f6) {
                        ((org.telegram.ui.Cells.f6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                        ((org.telegram.ui.Cells.sa) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.l lVar = ze1Var.actionBar;
        if (lVar != null) {
            lVar.D(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            ze1Var.actionBar.E(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            ze1Var.actionBar.E(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            ze1Var.actionBar.F(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
        }
        op0 op0Var = ze1Var.L0;
        if (op0Var != null && Build.VERSION.SDK_INT >= 23) {
            op0Var.setForeground(new ColorDrawable(i0.a.k(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6), 100)));
        }
        ze1Var.P0();
    }

    public static void b0(ze1 ze1Var, boolean z10) {
        float f9;
        boolean z11;
        ax axVar;
        ze1Var.f45183o0 = z10;
        ValueAnimator valueAnimator = ze1Var.U0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ze1Var.U0.cancel();
        }
        if (ze1Var.W0 == null) {
            org.telegram.ui.Components.y71 n10 = ze1Var.f45182n0.n(8, false);
            ze1Var.W0 = n10;
            if (ze1Var.I0 != null) {
                n10.setBackgroundColor(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
            }
            ze1Var.f45166e.addView(ze1Var.W0, i7.f6.c(44.0f, -1));
        }
        float f10 = ze1Var.S;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ze1Var.U0 = ValueAnimator.ofFloat(f10, f9);
        AndroidUtilities.updateViewVisibilityAnimated(ze1Var.f45182n0, false, 1.0f, true);
        fy fyVar = ze1Var.I0;
        if (fyVar != null && (axVar = fyVar.B3) != null) {
            axVar.I = !z10;
        }
        if (!z10 && ze1Var.f45182n0.getVisibility() == 0 && ze1Var.f45182n0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        ze1Var.V0 = z11;
        ze1Var.U0.addUpdateListener(new w01(ze1Var, 17));
        ze1Var.f45182n0.setVisibility(0);
        if (!z10) {
            ze1Var.m0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(ze1Var.getParentActivity(), ze1Var.classGuid);
            ze1Var.Q0(false);
        }
        ze1Var.U0.addListener(new he1(ze1Var, z10, 0));
        ze1Var.U0.setDuration(200L);
        ze1Var.U0.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        ze1Var.U0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.hv0 A() {
        return this.d;
    }

    public final void A0() {
        this.F0 = this.f45188s.isLoading(this.f45155a);
        if (this.f45199z0 != null) {
            ArrayList arrayList = this.f45158b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((pe1) arrayList.get(0)).f41396c != null && ((pe1) arrayList.get(0)).f41396c.f22444id == 1)) {
                this.f45199z0.e(this.F0, this.fragmentBeginToShow);
            }
        }
        je1 je1Var = this.J;
        if (je1Var != null) {
            je1Var.J0(je1Var.u1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f9;
        float f10;
        fy fyVar = this.I0;
        float f11 = 0.0f;
        if (fyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.fs fsVar = fyVar.F1;
            if (fsVar != null) {
                f9 = fsVar.c(dp);
            } else {
                f9 = 0.0f;
            }
            float f12 = f9 + 0.0f;
            org.telegram.ui.Components.fs fsVar2 = this.Q0;
            if (fsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.fs fsVar3 = this.I0.F1;
                if (fsVar3 != null) {
                    f10 = fsVar3.getMetadata().f49521c.f49531a;
                } else {
                    f10 = 0.0f;
                }
                fsVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.fs fsVar4 = this.Q0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.fs fsVar5 = this.I0.F1;
                if (fsVar5 != null) {
                    f11 = fsVar5.getMetadata().f49521c.f49531a;
                }
                f11 = fsVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.fs fsVar6 = this.Q0;
            if (fsVar6 != null) {
                f11 = 0.0f + fsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f45157a1 + this.Y0;
        if (this.R) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.J.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.W.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.J);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f45188s.findTopic(this.f45155a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xx0(3));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    @Override
    public final long H() {
        return 0L;
    }

    public final void H0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f45155a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f45169f.getSharedMediaPreloader());
        profileActivity.K4(this.F);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f45169f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.N4(i10);
        presentFragment(profileActivity);
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.I != i10) {
            this.I = i10;
            org.telegram.ui.Components.w51 w51Var = this.H;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23295q7;
            }
            w51Var.setTextColorKey(i11);
            ImageView imageView = this.S0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ee1 ee1Var = this.d;
        if (ee1Var != null) {
            if (z10) {
                ee1Var.setLayerType(2, null);
                ee1Var.setClipChildren(false);
                ee1Var.setClipToPadding(false);
            } else {
                ee1Var.setLayerType(0, null);
                ee1Var.setClipChildren(true);
                ee1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f9) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.O0 = f9;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            je1 je1Var = this.J;
            if (je1Var != null) {
                float b10 = th.b(1.0f, this.O0, 0.05f, 1.0f);
                je1Var.setPivotX(0.0f);
                je1Var.setPivotY(0.0f);
                je1Var.setScaleX(b10);
                je1Var.setScaleY(b10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(b10);
                this.actionBar.setScaleY(b10);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.p2 p2Var) {
        long j10;
        try {
            p2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = p2Var.J;
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new de1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(joVar.f29768f);
        joVar.f29776o = 1;
        long j11 = this.f45155a;
        long j12 = -j11;
        joVar.d(j12, tL_forumTopic.f22444id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final ze1 f44570b;

                {
                    this.f44570b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ze1 ze1Var = this.f44570b;
                            ze1Var.f45198y0 = true;
                            ze1Var.J0 = true;
                            TopicsController topicsController = ze1Var.f45188s;
                            long j13 = ze1Var.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22444id, !tL_forumTopic2.pinned, ze1Var);
                            ze1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ze1 ze1Var2 = this.f44570b;
                            ze1Var2.J0 = true;
                            TopicsController topicsController2 = ze1Var2.f45188s;
                            long j14 = ze1Var2.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22444id, true ^ tL_forumTopic3.closed);
                            ze1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22444id));
                            ze1 ze1Var3 = this.f44570b;
                            ze1Var3.D0(hashSet, new vd1(ze1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f22444id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new lh.n5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final ze1 f44570b;

                {
                    this.f44570b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ze1 ze1Var = this.f44570b;
                            ze1Var.f45198y0 = true;
                            ze1Var.J0 = true;
                            TopicsController topicsController = ze1Var.f45188s;
                            long j13 = ze1Var.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22444id, !tL_forumTopic2.pinned, ze1Var);
                            ze1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ze1 ze1Var2 = this.f44570b;
                            ze1Var2.J0 = true;
                            TopicsController topicsController2 = ze1Var2.f45188s;
                            long j14 = ze1Var2.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22444id, true ^ tL_forumTopic3.closed);
                            ze1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22444id));
                            ze1 ze1Var3 = this.f44570b;
                            ze1Var3.D0(hashSet, new vd1(ze1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final ze1 f44570b;

                {
                    this.f44570b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ze1 ze1Var = this.f44570b;
                            ze1Var.f45198y0 = true;
                            ze1Var.J0 = true;
                            TopicsController topicsController = ze1Var.f45188s;
                            long j13 = ze1Var.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22444id, !tL_forumTopic2.pinned, ze1Var);
                            ze1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ze1 ze1Var2 = this.f44570b;
                            ze1Var2.J0 = true;
                            TopicsController topicsController2 = ze1Var2.f45188s;
                            long j14 = ze1Var2.f45155a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22444id, true ^ tL_forumTopic3.closed);
                            ze1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22444id));
                            ze1 ze1Var3 = this.f44570b;
                            ze1Var3.D0(hashSet, new vd1(ze1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
        if (this.L0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.L0.setBackground(new BitmapDrawable(createBitmap));
            this.L0.setAlpha(0.0f);
            if (this.L0.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.L0, i7.f6.c(-1.0f, -1));
        }
        tn tnVar = new tn(j7.l1.g(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(p2Var.J.from_id);
        } else {
            j10 = p2Var.J.f22444id;
        }
        yf.d.a(tnVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(tnVar, r32[0]);
    }

    public final void N0(View view) {
        we1 we1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((view instanceof we1) && (tL_forumTopic = (we1Var = (we1) view).J) != null) {
            int i19 = tL_forumTopic.f22444id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.W;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            we1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f45155a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.a0 j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f22718a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.Y = numberTextView;
                    numberTextView.setTextSize(18);
                    this.Y.setTypeface(AndroidUtilities.bold());
                    this.Y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
                    j11.addView(this.Y, i7.f6.m(1.0f, 0, -1, 72, 0, 0));
                    this.Y.setOnTouchListener(new yd1(0));
                    this.Z = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f45156a0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f45159b0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f45162c0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f45164d0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f45167e0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.f45176i0 = h11;
                    this.f45170f0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f45172g0 = this.f45176i0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f45174h0 = this.f45176i0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f45188s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i20++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i23++;
                            } else {
                                i22++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i21++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i20 > 0) {
                    this.f45170f0.setVisibility(0);
                    this.f45170f0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f45170f0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.f45196x0 = false;
                    this.f45159b0.setIcon(R.drawable.msg_unmute);
                    this.f45159b0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.f45196x0 = true;
                    this.f45159b0.setIcon(R.drawable.msg_mute);
                    this.f45159b0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.Z;
                if (i22 == z10 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f45156a0;
                if (i23 == z10 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.Y.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i26++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f22444id == 1) {
                                if (findTopic2.hidden) {
                                    i28++;
                                } else {
                                    i27++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i24++;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f45172g0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f45172g0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f45174h0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f45174h0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f45162c0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f45164d0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f45167e0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w0Var5.setVisibility(i18);
                this.f45176i0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f45178j0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ae));
        this.h.g();
        n31 n31Var = this.f45179k0;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        n31Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8));
        }
        this.f45182n0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.M == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f45155a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f45183o0 && !this.f45184p0 && !this.F0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.G = z11;
        org.telegram.ui.ActionBar.g1 g1Var = this.M;
        if (!z11) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.G, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.W.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X != z10) {
            this.X = z10;
            ne1 ne1Var = this.f45186r;
            ne1Var.q(0, ne1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f9) {
        this.S = f9;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23385v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.y8;
        lVar.C(i0.a.d(this.S, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.S, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.g6.f23348t8), getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8), getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)));
        }
        float f10 = 1.0f - f9;
        this.f45169f.getTitleTextView().setAlpha(f10);
        this.f45169f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.y71 y71Var = this.W0;
        if (y71Var != null) {
            y71Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.W0.setAlpha(f9);
        }
        this.f45182n0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f45182n0.setAlpha(f9);
        if (isInPreviewMode()) {
            this.f45166e.invalidate();
        }
        this.d.invalidate();
        this.J.setAlpha(f10);
        if (this.V0) {
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.S, 0.02f, 0.98f);
            this.J.setScaleX(z10);
            this.J.setScaleY(z10);
        }
    }

    public final void T0() {
        lh.x4 x4Var = this.f45199z0;
        if (x4Var != null && x4Var.f32122e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.ic_ab_other, 0);
            iqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.f45199z0.f32122e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f45155a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.f45199z0.f32122e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        zd1 zd1Var;
        le1 le1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.J0) {
            z10 = true;
        }
        this.J0 = false;
        TopicsController topicsController = this.f45188s;
        long j10 = this.f45155a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f45158b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            le1 le1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f45185q0) {
                arrayList.add(new pe1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.f45194w0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f22444id))) {
                    arrayList.add(new pe1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.R0) {
                arrayList.add(new pe1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.G0.b(size + 4);
                z10 = false;
            }
            this.f45195x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                pe1 pe1Var = (pe1) arrayList.get(i11);
                if (pe1Var != null && (tL_forumTopic = pe1Var.f41396c) != null && tL_forumTopic.hidden) {
                    this.f45195x++;
                }
            }
            je1 je1Var = this.J;
            if (je1Var != null) {
                f2.u0 itemAnimator = je1Var.getItemAnimator();
                if (z10) {
                    le1Var = this.E0;
                } else {
                    le1Var = null;
                }
                if (itemAnimator != le1Var) {
                    je1 je1Var2 = this.J;
                    if (z10) {
                        le1Var2 = this.E0;
                    }
                    je1Var2.setItemAnimator(le1Var2);
                }
            }
            ne1 ne1Var = this.f45186r;
            if (ne1Var != null) {
                ne1Var.E(arrayList2, arrayList);
            }
            if ((this.f45198y0 || size == 0) && (zd1Var = this.B) != null) {
                zd1Var.h1(0, 0);
                this.f45198y0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f45155a;
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
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f9;
        float f10;
        fy fyVar = this.I0;
        if (fyVar != null && fyVar.S) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.Y0 = i10;
        fy fyVar2 = this.I0;
        if (fyVar2 != null && fyVar2.S) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.Z0 = i11;
        ee1 ee1Var = new ee1(this, context);
        this.d = ee1Var;
        this.fragmentView = ee1Var;
        ee1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ie1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final ze1 f43242b;

            {
                this.f43242b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        ze1 ze1Var = this.f43242b;
                        ze1Var.presentFragment(td1.a0(ze1Var.f45155a, 0L));
                        return;
                    case 1:
                        ze1 ze1Var2 = this.f43242b;
                        ze1Var2.getMessagesController().hidePeerSettingsBar(-ze1Var2.f45155a, null, ze1Var2.g());
                        ze1Var2.O0(false);
                        return;
                    case 2:
                        ze1 ze1Var3 = this.f43242b;
                        if (!ze1Var3.f45183o0) {
                            ze1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f43242b.finishPreviewFragment();
                        return;
                    default:
                        fy fyVar3 = this.f43242b.I0;
                        if (fyVar3 != null && (w0Var = fyVar3.f38283f0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        if (this.I0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f45180l0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final ze1 f43242b;

                {
                    this.f43242b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            ze1 ze1Var = this.f43242b;
                            ze1Var.presentFragment(td1.a0(ze1Var.f45155a, 0L));
                            return;
                        case 1:
                            ze1 ze1Var2 = this.f43242b;
                            ze1Var2.getMessagesController().hidePeerSettingsBar(-ze1Var2.f45155a, null, ze1Var2.g());
                            ze1Var2.O0(false);
                            return;
                        case 2:
                            ze1 ze1Var3 = this.f43242b;
                            if (!ze1Var3.f45183o0) {
                                ze1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f43242b.finishPreviewFragment();
                            return;
                        default:
                            fy fyVar3 = this.f43242b.I0;
                            if (fyVar3 != null && (w0Var = fyVar3.f38283f0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f45180l0 = a10;
            a10.F();
            a10.D = new bb(this, 17);
            this.f45180l0.setSearchPaddingStart(56);
            this.f45180l0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f45180l0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, null);
        this.m0 = c3;
        c3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.m0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.N = this.m0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        int i13 = R.raw.boosts;
        this.P = w0Var.d(14, 0, new org.telegram.ui.Components.xi0(i13, AndroidUtilities.dp(24.0f), "" + R.raw.boosts, AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.f23926i0);
        this.M = this.m0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.Q = this.m0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.O = this.m0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, this, false, this.resourceProvider);
        this.f45169f = xnVar;
        xnVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.xn xnVar2 = this.f45169f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        xnVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.xn xnVar3 = this.f45169f;
        long j10 = -this.f45155a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        xnVar3.f34785b = z12;
        xnVar3.setClipChildren(false);
        this.actionBar.addView(this.f45169f, 0, i7.f6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f45184p0) {
            this.f45169f.getAvatarImageView().setOnClickListener(new w7(this, 3));
        }
        this.J = new je1(this, context);
        sg.i iVar = new sg.i(this.d);
        ViewGroup viewGroup = this.d;
        lg.a aVar = this.f45168e1;
        aVar.d = iVar;
        aVar.f15224e = viewGroup;
        je1 je1Var = this.J;
        fy fyVar3 = this.I0;
        if (fyVar3 != null) {
            viewGroup = (ViewGroup) fyVar3.getFragmentView();
        }
        je1 je1Var2 = this.J;
        Objects.requireNonNull(je1Var2);
        this.f45171f1 = new lg.k(je1Var, viewGroup, new t8(je1Var2, 2));
        this.J.C0(new vd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        yf.c c6 = yf.d.c(getParentActivity(), 0.85f, -1, false);
        c6.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c6, 2), 0, 1, 33);
        mw mwVar = new mw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f45193w = mwVar;
        mwVar.b();
        if (this.A) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f45197y = i12;
        mw mwVar2 = this.f45193w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        mwVar2.X = z13;
        le1 le1Var = new le1(this);
        this.J.setHideIfEmpty(false);
        le1Var.f6463m = false;
        le1Var.C = false;
        je1 je1Var3 = this.J;
        this.E0 = le1Var;
        je1Var3.setItemAnimator(le1Var);
        this.J.setOnScrollListener(new ae1(this, 1));
        je1 je1Var4 = this.J;
        je1Var4.U1 = true;
        je1Var4.V1 = 0;
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(je1Var4, true);
        this.G0 = pk0Var;
        this.J.setItemsEnterAnimator(pk0Var);
        this.J.setOnItemClickListener(new d21(this, 8));
        this.J.setOnItemLongClickListener(new wd1(this));
        this.J.setOnScrollListener(new ae1(this, 2));
        je1 je1Var5 = this.J;
        zd1 zd1Var = new zd1(this);
        this.B = zd1Var;
        je1Var5.setLayoutManager(zd1Var);
        new SparseArray();
        new HashMap();
        this.J.setAdapter(this.f45186r);
        this.J.setClipToPadding(false);
        this.J.j(new ae1(this, 0));
        ye1 ye1Var = new ye1(this);
        this.L = ye1Var;
        be1 be1Var = new be1(this, ye1Var);
        this.K = be1Var;
        be1Var.d(this.J);
        this.d.addView(this.J, i7.f6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(getParentActivity(), this.resourceProvider, false);
        this.h = u10Var;
        this.d.addView(u10Var, org.telegram.ui.Components.u10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ze1 f43242b;

            {
                this.f43242b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ze1 ze1Var = this.f43242b;
                        ze1Var.presentFragment(td1.a0(ze1Var.f45155a, 0L));
                        return;
                    case 1:
                        ze1 ze1Var2 = this.f43242b;
                        ze1Var2.getMessagesController().hidePeerSettingsBar(-ze1Var2.f45155a, null, ze1Var2.g());
                        ze1Var2.O0(false);
                        return;
                    case 2:
                        ze1 ze1Var3 = this.f43242b;
                        if (!ze1Var3.f45183o0) {
                            ze1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f43242b.finishPreviewFragment();
                        return;
                    default:
                        fy fyVar32 = this.f43242b.I0;
                        if (fyVar32 != null && (w0Var2 = fyVar32.f38283f0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f33090c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f33090c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f33090c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(24);
        p00Var.setVisibility(8);
        p00Var.f31529w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f41104a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23433y6));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            f9 = 72.0f;
        } else {
            f9 = 32.0f;
        }
        if (z14) {
            f10 = 32.0f;
        } else {
            f10 = 72.0f;
        }
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 81, f9, 0.0f, f10, 32.0f));
        this.f45181n = frameLayout;
        textView.setAlpha(0.0f);
        lh.x4 x4Var = new lh.x4(this, context, p00Var);
        this.f45199z0 = x4Var;
        try {
            x4Var.f32120b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.f45199z0.e(this.F0, this.fragmentBeginToShow);
        this.f45199z0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f45181n.addView(p00Var);
        this.f45181n.addView(this.f45199z0);
        this.d.addView(this.f45181n);
        this.J.setEmptyView(this.f45181n);
        this.f45179k0 = new n31(context, 7);
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(context);
        this.H = w51Var;
        this.f45179k0.addView(w51Var);
        this.d.addView(this.f45179k0, i7.f6.e(-1, 51, 80));
        this.H.setOnClickListener(new ce1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f45178j0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f45178j0.setVisibility(4);
        this.f45179k0.addView(this.f45178j0, i7.f6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.S0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.S0;
        int i14 = org.telegram.ui.ActionBar.g6.f23069de;
        imageView2.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(getThemedColor(i14))));
        this.S0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
        this.S0.setScaleType(ImageView.ScaleType.CENTER);
        this.f45179k0.addView(this.S0, i7.f6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final ze1 f43242b;

            {
                this.f43242b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ze1 ze1Var = this.f43242b;
                        ze1Var.presentFragment(td1.a0(ze1Var.f45155a, 0L));
                        return;
                    case 1:
                        ze1 ze1Var2 = this.f43242b;
                        ze1Var2.getMessagesController().hidePeerSettingsBar(-ze1Var2.f45155a, null, ze1Var2.g());
                        ze1Var2.O0(false);
                        return;
                    case 2:
                        ze1 ze1Var3 = this.f43242b;
                        if (!ze1Var3.f45183o0) {
                            ze1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f43242b.finishPreviewFragment();
                        return;
                    default:
                        fy fyVar32 = this.f43242b.I0;
                        if (fyVar32 != null && (w0Var2 = fyVar32.f38283f0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.setVisibility(8);
        O0(false);
        n0 n0Var = new n0(this, context, 25);
        this.f45166e = n0Var;
        if (this.I0 == null) {
            this.d.addView(n0Var, i7.f6.e(-1, -1, 119));
        }
        ve1 ve1Var = new ve1(this, context);
        this.f45182n0 = ve1Var;
        ve1Var.setVisibility(8);
        this.f45166e.addView(this.f45182n0, i7.f6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ve1 ve1Var2 = this.f45182n0;
        int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
        ve1Var2.setBackgroundColor(getThemedColor(i15));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f45155a, true, null, true, false, 0);
        org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
        this.Q0 = fsVar;
        fsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ng.d c10 = aVar.c(this.Q0, pg.a.m(this.resourceProvider), false);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        this.Q0.setBlurredBackground(c10);
        this.Q0.setOnAnimatedHeightChangedListener(new vd1(this, 0));
        this.d.addView(this.Q0, i7.f6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            hh.e eVar = new hh.e(g10, this);
            this.N0 = eVar;
            this.Q0.addView(eVar.c(), i7.f6.n(-1, 40));
            this.Q0.h(3, this.N0.c());
            this.Q0.g(this.N0.c());
            hh.e eVar2 = this.N0;
            eVar2.f8062m = new wd1(this);
            TLRPC.ChatFull chatFull = this.F;
            eVar2.f8059j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.B0 = frameLayout2;
            this.Q0.addView(frameLayout2);
            this.Q0.h(4, this.B0);
            this.Q0.g(this.B0);
            this.Q0.i(this.B0, true, false);
            v8 v8Var = new v8(this, context, this);
            this.C0 = v8Var;
            this.B0.addView(v8Var);
            this.Q0.setCallFragmentContextView(this.C0);
        }
        FrameLayout.LayoutParams c11 = i7.f6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c11.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c11);
        }
        y0();
        op0 op0Var = new op0(this, context, 7);
        this.L0 = op0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            op0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i15), 100)));
        }
        this.L0.setFocusable(false);
        this.L0.setImportantForAccessibility(2);
        this.L0.setOnClickListener(new View.OnClickListener(this) {
            public final ze1 f43242b;

            {
                this.f43242b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ze1 ze1Var = this.f43242b;
                        ze1Var.presentFragment(td1.a0(ze1Var.f45155a, 0L));
                        return;
                    case 1:
                        ze1 ze1Var2 = this.f43242b;
                        ze1Var2.getMessagesController().hidePeerSettingsBar(-ze1Var2.f45155a, null, ze1Var2.g());
                        ze1Var2.O0(false);
                        return;
                    case 2:
                        ze1 ze1Var3 = this.f43242b;
                        if (!ze1Var3.f45183o0) {
                            ze1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f43242b.finishPreviewFragment();
                        return;
                    default:
                        fy fyVar32 = this.f43242b.I0;
                        if (fyVar32 != null && (w0Var2 = fyVar32.f38283f0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.L0.setFitsSystemWindows(true);
        this.R = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof fy) {
                    fy fyVar4 = (fy) o2Var;
                    if (fyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = fyVar4.f38314l2;
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new rb(this, 5));
        }
        View view = this.fragmentView;
        wd1 wd1Var = new wd1(this);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(view, wd1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f45155a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.F) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f22393id == j10) {
                O0(false);
                hh.e eVar = this.N0;
                if (eVar != null) {
                    eVar.f8059j = chatFull2;
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
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.J.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.B.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.D0 = getMessagesController().getGroupCall(l10.longValue(), false);
                v8 v8Var = this.C0;
                if (v8Var != null) {
                    v8Var.a(!this.fragmentBeginToShow);
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
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.M0 != longValue2) {
                    this.M0 = longValue2;
                    U0(false, false);
                }
            } else if (this.M0 != 0) {
                this.M0 = 0L;
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
        return getMessagesController().getChat(Long.valueOf(this.f45155a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.D0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.jl0 jl0Var;
        rx0 rx0Var = new rx0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        ve1 ve1Var = this.f45182n0;
        if (ve1Var != null && (jl0Var = ve1Var.Q) != null) {
            org.telegram.ui.Cells.s3.a(arrayList, jl0Var);
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User i() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i10;
        if (this.f45183o0) {
            i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23403w8);
        }
        if (i0.a.f(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
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
    public final org.telegram.ui.Components.xn o() {
        return this.f45169f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.W.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f45183o0) {
            if (z10) {
                this.actionBar.v(this.f45180l0.L(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f45155a;
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
        d61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f45154j1;
        if (!hashSet.contains(valueOf)) {
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f45155a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        fy fyVar = this.I0;
        if (fyVar != null && fyVar.B3 != null) {
            fyVar.getActionBar().setSearchAvatarImageView(null);
            this.I0.B3.I = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f45155a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f45155a;
        topicsController.onTopicFragmentResume(j10);
        this.C = false;
        AndroidUtilities.updateVisibleRows(this.J);
        this.C = true;
        setBulletinDelegate(new w8(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f9) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.P0) {
            L0(f9);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ax axVar;
        op0 op0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (op0Var = this.L0) != null) {
            if (op0Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.L0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.K0.unlock();
        if (!z10) {
            if (this.f45184p0 && this.D) {
                removeSelfFromStack();
                fy fyVar = this.H0;
                if (fyVar != null) {
                    fyVar.removeSelfFromStack();
                }
            } else if (this.E) {
                removeSelfFromStack();
                fy fyVar2 = this.I0;
                if (fyVar2 != null && (axVar = fyVar2.B3) != null && axVar.c()) {
                    this.I0.B3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        op0 op0Var = this.L0;
        if (op0Var != null && op0Var.getVisibility() == 0) {
            if (z10) {
                this.L0.setAlpha(1.0f - f9);
            } else {
                this.L0.setAlpha(f9);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.K0.lock();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.P0 = true;
            K0(true);
            return;
        }
        this.P0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void s() {
        this.J.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f9) {
        org.telegram.ui.Components.xn xnVar = this.f45169f;
        if (xnVar != null) {
            xnVar.setAlpha(f9);
            this.m0.setAlpha(f9);
            org.telegram.ui.ActionBar.w0 w0Var = this.f45180l0;
            if (w0Var != null) {
                w0Var.setAlpha(f9);
            }
            this.actionBar.getBackButton().setAlpha(f9);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f9) {
        org.telegram.ui.Components.xn xnVar = this.f45169f;
        if (xnVar != null) {
            xnVar.setAlpha(f9);
            this.f45169f.setTranslationX((1.0f - f9) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        lg.e eVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f9;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f45160b1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.Q0.c(AndroidUtilities.dp(14.0f)));
            fy fyVar = this.I0;
            if (fyVar != null) {
                view = fyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (fyVar != null) {
                lVar = fyVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f45157a1) - AndroidUtilities.dp(8.0f);
            this.f45175h1.set(0.0f, -dp, view.getMeasuredWidth(), lVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f45177i1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            if (this.I0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f45173g1);
            eVar.e(this.f45171f1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final qg.d y() {
        return this.f45165d1;
    }

    public final void y0() {
        zd1 zd1Var;
        TopicsController topicsController = this.f45188s;
        long j10 = this.f45155a;
        if (!topicsController.endIsReached(j10) && (zd1Var = this.B) != null) {
            int N0 = zd1Var.N0();
            if (this.f45158b.isEmpty() || N0 >= this.f45186r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f45155a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.D0;
        if (call != null && ((str = this.f45191u0) != null || this.f45192v0)) {
            org.telegram.ui.Components.voip.h2.m(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f45191u0 = null;
            this.f45192v0 = false;
        } else if (this.f45191u0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            j7.l1.v(R.string.LinkHashExpired, org.telegram.ui.Components.tc.a0(this), R.raw.linkbroken, 36);
            this.f45191u0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
