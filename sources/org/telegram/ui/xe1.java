package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
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
public class xe1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.zg, pg0 {
    public static final HashSet f43544q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ci.n5 D0;
    public boolean E;
    public ke1 E0;
    public yd1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public je1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.ql0 K0;
    public org.telegram.ui.Components.j71 L;
    public ey L0;
    public int M;
    public ey M0;
    public he1 N;
    public boolean N0;
    public ae1 O;
    public final AnimationNotificationsLocker O0;
    public we1 P;
    public e50 P0;
    public org.telegram.ui.ActionBar.e1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.e1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.e1 S;
    public float S0;
    public org.telegram.ui.ActionBar.e1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.e1 U;
    public org.telegram.ui.Components.ss U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long f43545a;
    public final HashSet f43546a0;
    public org.telegram.ui.Components.k91 f43547a1;
    public final ArrayList f43548b;
    public boolean f43549b0;
    public boolean f43550b1;
    public int f43551c;
    public NumberTextView f43552c0;
    public View f43553c1;
    public de1 d;
    public org.telegram.ui.ActionBar.u0 f43554d0;
    public int f43555d1;
    public l0 e;
    public org.telegram.ui.ActionBar.u0 f43556e0;
    public int f43557e1;
    public org.telegram.ui.Components.mo f43558f;
    public org.telegram.ui.ActionBar.u0 f43559f0;
    public int f43560f1;
    public org.telegram.ui.ActionBar.u0 f43561g0;
    public final bh.f f43562g1;
    public org.telegram.ui.Components.f20 h;
    public org.telegram.ui.ActionBar.u0 f43563h0;
    public final gh.d f43564h1;
    public org.telegram.ui.ActionBar.u0 f43565i0;
    public final gh.d f43566i1;
    public org.telegram.ui.ActionBar.e1 f43567j0;
    public final gh.c f43568j1;
    public org.telegram.ui.ActionBar.e1 f43569k0;
    public final bh.b f43570k1;
    public org.telegram.ui.ActionBar.e1 f43571l0;
    public bh.l l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final ArrayList f43572m1;
    public me1 f43573n;
    public RadialProgressView f43574n0;
    public final RectF f43575n1;
    public m41 f43576o0;
    public final RectF f43577o1;
    public org.telegram.ui.ActionBar.u0 f43578p0;
    public int f43579p1;
    public org.telegram.ui.ActionBar.u0 f43580q0;
    public final le1 f43581r;
    public se1 f43582r0;
    public final TopicsController f43583s;
    public boolean f43584s0;
    public final boolean f43585t0;
    public final boolean f43586u0;
    public ye1 v;
    public final boolean f43587v0;
    public kw f43588w;
    public final boolean f43589w0;
    public int f43590x;
    public final boolean f43591x0;
    public int f43592y;
    public String f43593y0;
    public boolean f43594z0;

    public xe1(Bundle bundle) {
        super(bundle);
        this.f43548b = new ArrayList();
        new ArrayList();
        this.f43581r = new le1(this);
        this.f43590x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f43546a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43572m1 = arrayList;
        RectF rectF = new RectF();
        this.f43575n1 = rectF;
        RectF rectF2 = new RectF();
        this.f43577o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f43545a = j10;
        this.f43585t0 = this.arguments.getBoolean("for_select", false);
        this.f43586u0 = this.arguments.getBoolean("forward_to", false);
        this.f43591x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f43587v0 = this.arguments.getBoolean("quote", false);
        this.f43589w0 = this.arguments.getBoolean("reply_to", false);
        this.f43593y0 = this.arguments.getString("voicechat", null);
        this.f43594z0 = this.arguments.getBoolean("videochat", false);
        this.f43583s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.v0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        this.f43568j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f43562g1 = new bh.f(false);
            this.f43564h1 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f43566i1 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f43570k1 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            return;
        }
        this.f43562g1 = null;
        this.f43564h1 = null;
        this.f43566i1 = null;
        this.f43570k1 = new bh.b(cVar);
    }

    public static org.telegram.ui.ActionBar.o2 D0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new sn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new sn(bundle);
            }
        }
        return new xe1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 E0(LaunchActivity launchActivity, Bundle bundle) {
        return D0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void H0(org.telegram.ui.sn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe1.H0(org.telegram.ui.sn):void");
    }

    public static boolean U(xe1 xe1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xe1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-xe1Var.f43545a), System.currentTimeMillis()).commit();
        Activity parentActivity = xe1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(xe1Var.g());
        int i10 = org.telegram.ui.Components.z80.f33173s;
        org.telegram.ui.Components.z80.x(parentActivity, xe1Var, org.telegram.ui.Components.vc.a0(xe1Var), isChannelAndNotMegaGroup);
        xe1Var.N0(true);
        return false;
    }

    public static void V(xe1 xe1Var, View view) {
        long j10;
        long j11 = xe1Var.f43545a;
        if (xe1Var.getParentLayout() != null && !((ActionBarLayout) xe1Var.getParentLayout()).x() && (view instanceof te1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((te1) view).N;
            long j12 = -j11;
            boolean isMonoForum = xe1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f20396id;
            }
            long j13 = j10;
            if (xe1Var.f43585t0) {
                ye1 ye1Var = xe1Var.v;
                if (ye1Var != null) {
                    af1 af1Var = ye1Var.f43837a;
                    Bundle bundle = new Bundle();
                    df1 df1Var = af1Var.f35752a;
                    bundle.putLong("dialog_id", df1Var.f36621c);
                    bundle.putLong("topic_id", tL_forumTopic.f20396id);
                    bundle.putBoolean("exception", true);
                    c11 c11Var = new c11(bundle, null);
                    c11Var.f36181r = new pl0(24, af1Var, tL_forumTopic);
                    df1Var.presentFragment(c11Var);
                }
                ey eyVar = xe1Var.L0;
                if (eyVar != null) {
                    eyVar.M3(j12, j13, true, xe1Var);
                }
            } else if (xe1Var.f43546a0.size() > 0) {
                xe1Var.M0(view);
            } else {
                if (xe1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : xe1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof ey) {
                            ey eyVar2 = (ey) o2Var;
                            if (eyVar2.f4()) {
                                MessagesStorage.TopicKey topicKey = eyVar2.f37090p2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    xe1Var.Q0 = j13;
                    xe1Var.U0(false, false);
                }
                og.d.m(xe1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(xe1 xe1Var, View view, float f7) {
        if (xe1Var.f43585t0 || xe1Var.getParentLayout() == null || ((ActionBarLayout) xe1Var.getParentLayout()).x()) {
            return false;
        }
        if (!xe1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof te1)) {
            te1 te1Var = (te1) view;
            if (te1Var.R(f7)) {
                xe1Var.L0(te1Var);
                xe1Var.N.I0(true);
                xe1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        xe1Var.M0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void a0(xe1 xe1Var, boolean z10) {
        float f7;
        boolean z11;
        yw ywVar;
        xe1Var.f43584s0 = z10;
        ValueAnimator valueAnimator = xe1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            xe1Var.Y0.cancel();
        }
        if (xe1Var.f43547a1 == null) {
            org.telegram.ui.Components.k91 n10 = xe1Var.f43582r0.n(8, false);
            xe1Var.f43547a1 = n10;
            if (xe1Var.M0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, n10, xe1Var.getResourceProvider());
            }
            xe1Var.e.addView(xe1Var.f43547a1, w7.z5.c(44.0f, -1));
        }
        float f10 = xe1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        xe1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(xe1Var.f43582r0, false, 1.0f, true);
        ey eyVar = xe1Var.M0;
        if (eyVar != null && (ywVar = eyVar.G3) != null) {
            ywVar.M = !z10;
        }
        if (!z10 && xe1Var.f43582r0.getVisibility() == 0 && xe1Var.f43582r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        xe1Var.Z0 = z11;
        xe1Var.Y0.addUpdateListener(new f11(xe1Var, 15));
        xe1Var.f43582r0.setVisibility(0);
        if (!z10) {
            xe1Var.f43580q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(xe1Var.getParentActivity(), xe1Var.classGuid);
            xe1Var.P0(false);
        }
        xe1Var.Y0.addListener(new fe1(xe1Var, z10, 0));
        xe1Var.Y0.setDuration(200L);
        xe1Var.Y0.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        xe1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.nw0 A() {
        return this.d;
    }

    public final void A0() {
        int i10;
        float f7;
        float f10;
        ey eyVar = this.M0;
        float f11 = 0.0f;
        if (eyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ss ssVar = eyVar.J1;
            if (ssVar != null) {
                f7 = ssVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.ss ssVar2 = this.U0;
            if (ssVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ss ssVar3 = this.M0.J1;
                if (ssVar3 != null) {
                    f10 = ssVar3.getMetadata().f17462c.f17470a;
                } else {
                    f10 = 0.0f;
                }
                ssVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.ss ssVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ss ssVar5 = this.M0.J1;
                if (ssVar5 != null) {
                    f11 = ssVar5.getMetadata().f17462c.f17470a;
                }
                f11 = ssVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.ss ssVar6 = this.U0;
            if (ssVar6 != null) {
                f11 = 0.0f + ssVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f43560f1 + this.f43555d1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void B0() {
        this.f43546a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        Q0();
    }

    public final void C0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f43583s.findTopic(this.f43545a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(23));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, getResourceProvider());
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void F0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void G0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f43545a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f43558f.getSharedMediaPreloader());
        profileActivity.M4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f43558f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.Q4(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long I() {
        return 0L;
    }

    public final void I0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.j71 j71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21422q7;
            }
            j71Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            N0(false);
        }
    }

    public final void J0(boolean z10) {
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

    public final void K0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            he1 he1Var = this.N;
            if (he1Var != null) {
                float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
                he1Var.setPivotX(0.0f);
                he1Var.setPivotY(0.0f);
                he1Var.setScaleX(D);
                he1Var.setScaleY(D);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(D);
                this.actionBar.setScaleY(D);
            }
        }
    }

    public final void L0(org.telegram.ui.Cells.q2 q2Var) {
        long j10;
        try {
            q2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = q2Var.N;
        org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new ce1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(xoVar.f32668f);
        xoVar.f32676o = 1;
        long j11 = this.f43545a;
        long j12 = -j11;
        xoVar.e(j12, tL_forumTopic.f20396id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.j(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.j(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final xe1 f43007b;

                {
                    this.f43007b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            xe1 xe1Var = this.f43007b;
                            xe1Var.C0 = true;
                            xe1Var.N0 = true;
                            TopicsController topicsController = xe1Var.f43583s;
                            long j13 = xe1Var.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20396id, !tL_forumTopic2.pinned, xe1Var);
                            xe1Var.finishPreviewFragment();
                            return;
                        case 1:
                            xe1 xe1Var2 = this.f43007b;
                            xe1Var2.N0 = true;
                            TopicsController topicsController2 = xe1Var2.f43583s;
                            long j14 = xe1Var2.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20396id, true ^ tL_forumTopic3.closed);
                            xe1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20396id));
                            xe1 xe1Var3 = this.f43007b;
                            xe1Var3.C0(hashSet, new ud1(xe1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f20396id)) {
            e1Var2.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.j(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new ci.c6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.j(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.j(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final xe1 f43007b;

                {
                    this.f43007b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            xe1 xe1Var = this.f43007b;
                            xe1Var.C0 = true;
                            xe1Var.N0 = true;
                            TopicsController topicsController = xe1Var.f43583s;
                            long j13 = xe1Var.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20396id, !tL_forumTopic2.pinned, xe1Var);
                            xe1Var.finishPreviewFragment();
                            return;
                        case 1:
                            xe1 xe1Var2 = this.f43007b;
                            xe1Var2.N0 = true;
                            TopicsController topicsController2 = xe1Var2.f43583s;
                            long j14 = xe1Var2.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20396id, true ^ tL_forumTopic3.closed);
                            xe1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20396id));
                            xe1 xe1Var3 = this.f43007b;
                            xe1Var3.C0(hashSet, new ud1(xe1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.j(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.c(org.telegram.ui.ActionBar.k6.f21422q7, org.telegram.ui.ActionBar.k6.f21405p7);
            e1Var4.setMinimumWidth(160);
            e1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final xe1 f43007b;

                {
                    this.f43007b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            xe1 xe1Var = this.f43007b;
                            xe1Var.C0 = true;
                            xe1Var.N0 = true;
                            TopicsController topicsController = xe1Var.f43583s;
                            long j13 = xe1Var.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20396id, !tL_forumTopic2.pinned, xe1Var);
                            xe1Var.finishPreviewFragment();
                            return;
                        case 1:
                            xe1 xe1Var2 = this.f43007b;
                            xe1Var2.N0 = true;
                            TopicsController topicsController2 = xe1Var2.f43583s;
                            long j14 = xe1Var2.f43545a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20396id, true ^ tL_forumTopic3.closed);
                            xe1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20396id));
                            xe1 xe1Var3 = this.f43007b;
                            xe1Var3.C0(hashSet, new ud1(xe1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.z5.c(-1.0f, -1));
        }
        sn snVar = new sn(si.o0.e(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(q2Var.N.from_id);
        } else {
            j10 = q2Var.N.f20396id;
        }
        og.d.a(snVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(snVar, r32[0]);
    }

    public final void M0(View view) {
        te1 te1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if ((view instanceof te1) && (tL_forumTopic = (te1Var = (te1) view).N) != null) {
            int i20 = tL_forumTopic.f20396id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f43546a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            te1Var.U(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f43545a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.y i21 = this.actionBar.i(null);
                    if (this.inPreviewMode) {
                        i21.setBackgroundColor(0);
                        i21.f21964a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(i21.getContext());
                    this.f43552c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f43552c0.setTypeface(AndroidUtilities.bold());
                    this.f43552c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
                    i21.addView(this.f43552c0, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f43552c0.setOnTouchListener(new xd1(0));
                    this.f43554d0 = i21.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f43556e0 = i21.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f43559f0 = i21.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f43561g0 = i21.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.u0 h = i21.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f43563h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h10 = i21.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f43565i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h11 = i21.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f43567j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f43569k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f43571l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.N(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f43583s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i22++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i25++;
                            } else {
                                i24++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i23++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i22 > 0) {
                    this.f43567j0.setVisibility(0);
                    this.f43567j0.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f43567j0.setVisibility(8);
                }
                if (i23 != 0) {
                    this.B0 = false;
                    this.f43559f0.setIcon(R.drawable.msg_unmute);
                    this.f43559f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f43559f0.setIcon(R.drawable.msg_mute);
                    this.f43559f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f43554d0;
                if (i24 == z10 && i25 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                u0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f43556e0;
                if (i25 == z10 && i24 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                u0Var2.setVisibility(i12);
                this.f43552c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i28++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f20396id == 1) {
                                if (findTopic2.hidden) {
                                    i30++;
                                } else {
                                    i29++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i26++;
                                } else {
                                    i27++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f43569k0;
                if (i26 == 0 && i27 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                e1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.e1 e1Var2 = this.f43569k0;
                if (i27 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                e1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.e1 e1Var3 = this.f43571l0;
                if (i27 == 0 && i26 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                e1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.e1 e1Var4 = this.f43571l0;
                if (i26 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                e1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f43561g0;
                if (i28 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                u0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.u0 u0Var4 = this.f43563h0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                u0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f43565i0;
                if (i30 == 1 && hashSet3.size() == 1) {
                    i19 = 0;
                } else {
                    i19 = i10;
                }
                u0Var5.setVisibility(i19);
                this.m0.l();
                Q0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void N0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe1.N0(boolean):void");
    }

    public final void O0() {
        RadialProgressView radialProgressView = this.f43574n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ae));
        this.h.updateColors();
        m41 m41Var = this.f43576o0;
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        m41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8));
        }
        this.f43582r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void P0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43545a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f43584s0 && !this.f43585t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.e1 e1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        e1Var.setVisibility(i10);
        F0(!this.K, z10);
    }

    public final void Q0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f43546a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43549b0 != z10) {
            this.f43549b0 = z10;
            le1 le1Var = this.f43581r;
            le1Var.q(0, le1Var.h());
        }
    }

    public final void R0(float f7) {
        this.W = f7;
        S0();
        this.f43550b1 = true;
        float f10 = 1.0f - f7;
        this.f43558f.getTitleTextView().setAlpha(f10);
        this.f43558f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.k91 k91Var = this.f43547a1;
        if (k91Var != null) {
            k91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f43547a1.setAlpha(f7);
        }
        this.f43582r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f43582r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21519v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21574y8;
        kVar.B(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.B(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.f21482t8), getThemedColor(org.telegram.ui.ActionBar.k6.f21591z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8), getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6)));
        }
    }

    public final void T0() {
        ci.n5 n5Var = this.D0;
        if (n5Var != null && n5Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(R.drawable.ic_ab_other, 0);
            vqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43545a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        yd1 yd1Var;
        je1 je1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f43583s;
        long j10 = this.f43545a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f43548b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            je1 je1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f43586u0) {
                arrayList.add(new ne1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f20396id))) {
                    arrayList.add(new ne1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new ne1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f43590x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ne1 ne1Var = (ne1) arrayList.get(i11);
                if (ne1Var != null && (tL_forumTopic = ne1Var.f39813c) != null && tL_forumTopic.hidden) {
                    this.f43590x++;
                }
            }
            he1 he1Var = this.N;
            if (he1Var != null) {
                s4.l0 itemAnimator = he1Var.getItemAnimator();
                if (z10) {
                    je1Var = this.I0;
                } else {
                    je1Var = null;
                }
                if (itemAnimator != je1Var) {
                    he1 he1Var2 = this.N;
                    if (z10) {
                        je1Var2 = this.I0;
                    }
                    he1Var2.setItemAnimator(je1Var2);
                }
            }
            le1 le1Var = this.f43581r;
            if (le1Var != null) {
                le1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (yd1Var = this.F) != null) {
                yd1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        z0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f43545a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
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
        float f7;
        float f10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        ey eyVar = this.M0;
        if (eyVar != null && eyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f43555d1 = i10;
        ey eyVar2 = this.M0;
        if (eyVar2 != null && eyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f43557e1 = i11;
        de1 de1Var = new de1(this, context);
        this.d = de1Var;
        this.fragmentView = de1Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, de1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!AndroidUtilities.isTablet() || ((h5Var2 = this.parentLayout) != null && ((ActionBarLayout) h5Var2).f20617b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ge1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final xe1 f42011b;

            {
                this.f42011b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        xe1 xe1Var = this.f42011b;
                        if (!xe1Var.f43584s0) {
                            xe1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        xe1 xe1Var2 = this.f42011b;
                        xe1Var2.getMessagesController().hidePeerSettingsBar(-xe1Var2.f43545a, null, xe1Var2.g());
                        xe1Var2.N0(false);
                        return;
                    case 2:
                        this.f42011b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar3 = this.f42011b.M0;
                        if (eyVar3 != null && (u0Var = eyVar3.f37060j0) != null) {
                            u0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        xe1 xe1Var3 = this.f42011b;
                        xe1Var3.presentFragment(sd1.a0(xe1Var3.f43545a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
            this.f43578p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final xe1 f42011b;

                {
                    this.f42011b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            xe1 xe1Var = this.f42011b;
                            if (!xe1Var.f43584s0) {
                                xe1Var.G0(false);
                                return;
                            }
                            return;
                        case 1:
                            xe1 xe1Var2 = this.f42011b;
                            xe1Var2.getMessagesController().hidePeerSettingsBar(-xe1Var2.f43545a, null, xe1Var2.g());
                            xe1Var2.N0(false);
                            return;
                        case 2:
                            this.f42011b.finishPreviewFragment();
                            return;
                        case 3:
                            ey eyVar3 = this.f42011b.M0;
                            if (eyVar3 != null && (u0Var = eyVar3.f37060j0) != null) {
                                u0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            xe1 xe1Var3 = this.f42011b;
                            xe1Var3.presentFragment(sd1.a0(xe1Var3.f43545a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = m10.a(0, R.drawable.outline_header_search);
            this.f43578p0 = a10;
            a10.F();
            a10.H = new ig.b2(this, 18);
            this.f43578p0.setSearchPaddingStart(56);
            this.f43578p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f43578p0.getSearchField();
            org.telegram.ui.ActionBar.r6.W(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, getResourceProvider());
            org.telegram.ui.ActionBar.r6.x(searchField, org.telegram.ui.ActionBar.k6.Wd, getResourceProvider());
        }
        org.telegram.ui.ActionBar.u0 c10 = m10.c(0, R.drawable.ic_ab_other, null);
        this.f43580q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f43580q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f43580q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.f43580q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.xj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.f43580q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f43580q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f43580q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.mo moVar = new org.telegram.ui.Components.mo(context, this, false, this.resourceProvider);
        this.f43558f = moVar;
        moVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.mo moVar2 = this.f43558f;
        if ((!AndroidUtilities.isTablet() || ((h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).f20617b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        moVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.mo moVar3 = this.f43558f;
        long j10 = -this.f43545a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        moVar3.f28632b = z12;
        moVar3.setClipChildren(false);
        this.actionBar.addView(this.f43558f, 0, w7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f43585t0) {
            this.f43558f.getAvatarImageView().setOnClickListener(new b8(this, 3));
        }
        this.N = new he1(this, context);
        ih.k kVar2 = new ih.k(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.f43570k1;
        bVar.f4365f = kVar2;
        bVar.f4366g = viewGroup;
        he1 he1Var = this.N;
        ey eyVar3 = this.M0;
        if (eyVar3 != null) {
            viewGroup = (ViewGroup) eyVar3.getFragmentView();
        }
        he1 he1Var2 = this.N;
        Objects.requireNonNull(he1Var2);
        this.l1 = new bh.l(he1Var, viewGroup, new cy0(he1Var2, 1));
        this.N.C0(new ud1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f43588w = kwVar;
        kwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f43592y = i12;
        kw kwVar2 = this.f43588w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        kwVar2.X = z13;
        je1 je1Var = new je1(this);
        this.N.setHideIfEmpty(false);
        je1Var.f46376m = false;
        je1Var.C = false;
        he1 he1Var3 = this.N;
        this.I0 = je1Var;
        he1Var3.setItemAnimator(je1Var);
        this.N.setOnScrollListener(new zd1(this, 1));
        he1 he1Var4 = this.N;
        he1Var4.W1 = true;
        he1Var4.X1 = 0;
        org.telegram.ui.Components.ql0 ql0Var = new org.telegram.ui.Components.ql0(he1Var4, true);
        this.K0 = ql0Var;
        this.N.setItemsEnterAnimator(ql0Var);
        this.N.setOnItemClickListener(new i11(this, 10));
        this.N.setOnItemLongClickListener(new vd1(this));
        this.N.setOnScrollListener(new zd1(this, 2));
        he1 he1Var5 = this.N;
        yd1 yd1Var = new yd1(this);
        this.F = yd1Var;
        he1Var5.setLayoutManager(yd1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f43581r);
        this.N.setClipToPadding(false);
        this.N.j(new zd1(this, 0));
        we1 we1Var = new we1(this);
        this.P = we1Var;
        ae1 ae1Var = new ae1(this, we1Var);
        this.O = ae1Var;
        ae1Var.d(this.N);
        this.d.addView(this.N, w7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(getParentActivity(), this.resourceProvider, false);
        this.h = f20Var;
        this.d.addView(f20Var, org.telegram.ui.Components.f20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final xe1 f42011b;

            {
                this.f42011b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        xe1 xe1Var = this.f42011b;
                        if (!xe1Var.f43584s0) {
                            xe1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        xe1 xe1Var2 = this.f42011b;
                        xe1Var2.getMessagesController().hidePeerSettingsBar(-xe1Var2.f43545a, null, xe1Var2.g());
                        xe1Var2.N0(false);
                        return;
                    case 2:
                        this.f42011b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42011b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37060j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        xe1 xe1Var3 = this.f42011b;
                        xe1Var3.presentFragment(sd1.a0(xe1Var3.f43545a, 0L));
                        return;
                }
            }
        });
        this.h.f26170c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f26170c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f26170c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        z00Var.setViewType(24);
        z00Var.setVisibility(8);
        z00Var.f33104w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f39576a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.vq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.vq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21572y6, getResourceProvider());
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            f7 = 72.0f;
        } else {
            f7 = 32.0f;
        }
        if (z14) {
            f10 = 32.0f;
        } else {
            f10 = 72.0f;
        }
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f43573n = frameLayout;
        textView.setAlpha(0.0f);
        ci.n5 n5Var = new ci.n5(this, context, z00Var);
        this.D0 = n5Var;
        try {
            n5Var.f32067b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f43573n.addView(z00Var);
        this.f43573n.addView(this.D0);
        this.d.addView(this.f43573n);
        this.N.setEmptyView(this.f43573n);
        this.f43576o0 = new m41(context, 6);
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context);
        this.L = j71Var;
        this.f43576o0.addView(j71Var);
        this.d.addView(this.f43576o0, w7.z5.e(-1, 51, 80));
        this.L.setOnClickListener(new be1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f43574n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f43574n0.setVisibility(4);
        this.f43576o0.addView(this.f43574n0, w7.z5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.k6.f21190de;
        imageView2.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(getThemedColor(i13))));
        org.telegram.ui.ActionBar.r6.t(this.W0, i13, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f43576o0.addView(this.W0, w7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final xe1 f42011b;

            {
                this.f42011b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        xe1 xe1Var = this.f42011b;
                        if (!xe1Var.f43584s0) {
                            xe1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        xe1 xe1Var2 = this.f42011b;
                        xe1Var2.getMessagesController().hidePeerSettingsBar(-xe1Var2.f43545a, null, xe1Var2.g());
                        xe1Var2.N0(false);
                        return;
                    case 2:
                        this.f42011b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42011b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37060j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        xe1 xe1Var3 = this.f42011b;
                        xe1Var3.presentFragment(sd1.a0(xe1Var3.f43545a, 0L));
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        N0(false);
        l0 l0Var = new l0(this, context, 25);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.z5.e(-1, -1, 119));
        }
        se1 se1Var = new se1(this, context);
        this.f43582r0 = se1Var;
        se1Var.setVisibility(8);
        this.e.addView(this.f43582r0, w7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        se1 se1Var2 = this.f43582r0;
        int i14 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i14, se1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f43545a, true, null, true, false, 0);
        org.telegram.ui.Components.ss ssVar = new org.telegram.ui.Components.ss(context);
        this.U0 = ssVar;
        ssVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.c.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new ud1(this, 0));
        this.d.addView(this.U0, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), w7.z5.n(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            xh.d dVar2 = this.R0;
            dVar2.f50287m = new vd1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f50284j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.F0 = frameLayout2;
            this.U0.addView(frameLayout2);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            a9 a9Var = new a9(this, context, this);
            this.G0 = a9Var;
            this.F0.addView(a9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.z5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        x0();
        e50 e50Var = new e50(this, context, 9);
        this.P0 = e50Var;
        e50Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final xe1 f42011b;

            {
                this.f42011b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        xe1 xe1Var = this.f42011b;
                        if (!xe1Var.f43584s0) {
                            xe1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        xe1 xe1Var2 = this.f42011b;
                        xe1Var2.getMessagesController().hidePeerSettingsBar(-xe1Var2.f43545a, null, xe1Var2.g());
                        xe1Var2.N0(false);
                        return;
                    case 2:
                        this.f42011b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42011b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37060j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        xe1 xe1Var3 = this.f42011b;
                        xe1Var3.presentFragment(sd1.a0(xe1Var3.f43545a, 0L));
                        return;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof ey) {
                    ey eyVar4 = (ey) o2Var;
                    if (eyVar4.f4()) {
                        MessagesStorage.TopicKey topicKey = eyVar4.f37090p2;
                        if (topicKey.dialogId == j10) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        N0(false);
        O0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new u3(this, 24));
        }
        View view = this.fragmentView;
        vd1 vd1Var = new vd1(this);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(view, vd1Var);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f43545a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f20345id == j10) {
                N0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f50284j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                y0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            N0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    x0();
                }
                z0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                N0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                a9 a9Var = this.G0;
                if (a9Var != null) {
                    a9Var.a(!this.fragmentBeginToShow);
                }
                y0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            N0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    U0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
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
        return getMessagesController().getChat(Long.valueOf(this.f43545a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        se1 se1Var = this.f43582r0;
        if (se1Var != null && se1Var.U != null) {
            int i10 = org.telegram.ui.Cells.u3.h;
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
        if (this.f43584s0) {
            i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21463s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21538w8);
        }
        if (i0.a.h(themedColor) > 0.699999988079071d) {
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
    public final boolean onBackPressed(boolean z10) {
        if (!this.f43546a0.isEmpty()) {
            if (z10) {
                B0();
                return false;
            }
        } else if (this.f43584s0) {
            if (z10) {
                this.actionBar.v(this.f43578p0.L(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.g(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43545a;
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
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f43544q1;
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
        this.O0.unlock();
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43545a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        ey eyVar = this.M0;
        if (eyVar != null && eyVar.G3 != null) {
            eyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.G3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f43545a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f43545a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new b9(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            K0(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        gh.c cVar = this.f43568j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.a6.b(getThemedColor(org.telegram.ui.ActionBar.k6.f21190de))) != this.f43579p1) {
            this.f43579p1 = b10;
            org.telegram.ui.ActionBar.k6.E1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
        }
        e50 e50Var = this.P0;
        if (e50Var != null && (e50Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6), 100));
        }
        O0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            }
            kw kwVar = this.f43588w;
            if (kwVar != null) {
                kwVar.i();
            }
            if (this.actionBar != null && this.f43550b1) {
                S0();
            }
            NumberTextView numberTextView = this.f43552c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f43578p0;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f43578p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Wd));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        yw ywVar;
        e50 e50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (e50Var = this.P0) != null) {
            if (e50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            y0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f43585t0 && this.H) {
                removeSelfFromStack();
                ey eyVar = this.L0;
                if (eyVar != null) {
                    eyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                ey eyVar2 = this.M0;
                if (eyVar2 != null && (ywVar = eyVar2.G3) != null && ywVar.c()) {
                    this.M0.G3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        e50 e50Var = this.P0;
        if (e50Var != null && e50Var.getVisibility() == 0) {
            if (z10) {
                this.P0.setAlpha(1.0f - f7);
            } else {
                this.P0.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override
    public final org.telegram.ui.Components.mo p() {
        return this.f43558f;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            J0(true);
            return;
        }
        this.T0 = false;
        J0(false);
        K0(1.0f);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.mo moVar = this.f43558f;
        if (moVar != null) {
            moVar.setAlpha(f7);
            this.f43580q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.f43578p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.mo moVar = this.f43558f;
        if (moVar != null) {
            moVar.setAlpha(f7);
            this.f43558f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final void t() {
        this.N.x0(0);
    }

    public final void w0() {
        bh.f fVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f43562g1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            ey eyVar = this.M0;
            if (eyVar != null) {
                view = eyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (eyVar != null) {
                kVar = eyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f43560f1) - AndroidUtilities.dp(8.0f);
            this.f43575n1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f43577o1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f43572m1);
            fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void x0() {
        yd1 yd1Var;
        TopicsController topicsController = this.f43583s;
        long j10 = this.f43545a;
        if (!topicsController.endIsReached(j10) && (yd1Var = this.F) != null) {
            int N0 = yd1Var.N0();
            if (this.f43548b.isEmpty() || N0 >= this.f43581r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            z0();
        }
    }

    public final void y0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43545a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f43593y0) != null || this.f43594z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43593y0 = null;
            this.f43594z0 = false;
        } else if (this.f43593y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.v0.p(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(this), R.raw.linkbroken, 36);
            this.f43593y0 = null;
        }
    }

    @Override
    public final gh.d z() {
        return this.f43566i1;
    }

    public final void z0() {
        this.J0 = this.f43583s.isLoading(this.f43545a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f43548b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ne1) arrayList.get(0)).f39813c != null && ((ne1) arrayList.get(0)).f39813c.f20396id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        he1 he1Var = this.N;
        if (he1Var != null) {
            he1Var.K0(he1Var.z1());
        }
        P0(true);
    }

    @Override
    public final void q() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
