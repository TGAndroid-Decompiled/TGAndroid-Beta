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
public class ye1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, qg0 {
    public static final HashSet f43791q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ci.n5 D0;
    public boolean E;
    public le1 E0;
    public zd1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public ke1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rl0 K0;
    public org.telegram.ui.Components.k71 L;
    public ey L0;
    public int M;
    public ey M0;
    public ie1 N;
    public boolean N0;
    public be1 O;
    public final AnimationNotificationsLocker O0;
    public xe1 P;
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
    public org.telegram.ui.Components.us U0;
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
    public final long f43792a;
    public final HashSet f43793a0;
    public org.telegram.ui.Components.k91 f43794a1;
    public final ArrayList f43795b;
    public boolean f43796b0;
    public boolean f43797b1;
    public int f43798c;
    public NumberTextView f43799c0;
    public View f43800c1;
    public ee1 d;
    public org.telegram.ui.ActionBar.u0 f43801d0;
    public int f43802d1;
    public l0 e;
    public org.telegram.ui.ActionBar.u0 f43803e0;
    public int f43804e1;
    public org.telegram.ui.Components.oo f43805f;
    public org.telegram.ui.ActionBar.u0 f43806f0;
    public int f43807f1;
    public org.telegram.ui.ActionBar.u0 f43808g0;
    public final bh.f f43809g1;
    public org.telegram.ui.Components.h20 h;
    public org.telegram.ui.ActionBar.u0 f43810h0;
    public final gh.d f43811h1;
    public org.telegram.ui.ActionBar.u0 f43812i0;
    public final gh.d f43813i1;
    public org.telegram.ui.ActionBar.e1 f43814j0;
    public final gh.c f43815j1;
    public org.telegram.ui.ActionBar.e1 f43816k0;
    public final bh.b f43817k1;
    public org.telegram.ui.ActionBar.e1 f43818l0;
    public bh.l l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final ArrayList f43819m1;
    public ne1 f43820n;
    public RadialProgressView f43821n0;
    public final RectF f43822n1;
    public n41 f43823o0;
    public final RectF f43824o1;
    public org.telegram.ui.ActionBar.u0 f43825p0;
    public int f43826p1;
    public org.telegram.ui.ActionBar.u0 f43827q0;
    public final me1 f43828r;
    public te1 f43829r0;
    public final TopicsController f43830s;
    public boolean f43831s0;
    public final boolean f43832t0;
    public final boolean f43833u0;
    public ze1 v;
    public final boolean f43834v0;
    public kw f43835w;
    public final boolean f43836w0;
    public int f43837x;
    public final boolean f43838x0;
    public int f43839y;
    public String f43840y0;
    public boolean f43841z0;

    public ye1(Bundle bundle) {
        super(bundle);
        this.f43795b = new ArrayList();
        new ArrayList();
        this.f43828r = new me1(this);
        this.f43837x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f43793a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43819m1 = arrayList;
        RectF rectF = new RectF();
        this.f43822n1 = rectF;
        RectF rectF2 = new RectF();
        this.f43824o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f43792a = j10;
        this.f43832t0 = this.arguments.getBoolean("for_select", false);
        this.f43833u0 = this.arguments.getBoolean("forward_to", false);
        this.f43838x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f43834v0 = this.arguments.getBoolean("quote", false);
        this.f43836w0 = this.arguments.getBoolean("reply_to", false);
        this.f43840y0 = this.arguments.getString("voicechat", null);
        this.f43841z0 = this.arguments.getBoolean("videochat", false);
        this.f43830s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.v0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        this.f43815j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f43809g1 = new bh.f(false);
            this.f43811h1 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f43813i1 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f43817k1 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            return;
        }
        this.f43809g1 = null;
        this.f43811h1 = null;
        this.f43813i1 = null;
        this.f43817k1 = new bh.b(cVar);
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
        return new ye1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 E0(LaunchActivity launchActivity, Bundle bundle) {
        return D0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void H0(org.telegram.ui.sn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye1.H0(org.telegram.ui.sn):void");
    }

    public static boolean U(ye1 ye1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ye1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-ye1Var.f43792a), System.currentTimeMillis()).commit();
        Activity parentActivity = ye1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(ye1Var.g());
        int i10 = org.telegram.ui.Components.b90.f25000s;
        org.telegram.ui.Components.b90.x(parentActivity, ye1Var, org.telegram.ui.Components.xc.a0(ye1Var), isChannelAndNotMegaGroup);
        ye1Var.N0(true);
        return false;
    }

    public static void V(ye1 ye1Var, View view) {
        long j10;
        long j11 = ye1Var.f43792a;
        if (ye1Var.getParentLayout() != null && !((ActionBarLayout) ye1Var.getParentLayout()).x() && (view instanceof ue1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ue1) view).N;
            long j12 = -j11;
            boolean isMonoForum = ye1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f20395id;
            }
            long j13 = j10;
            if (ye1Var.f43832t0) {
                ze1 ze1Var = ye1Var.v;
                if (ze1Var != null) {
                    bf1 bf1Var = ze1Var.f44130a;
                    Bundle bundle = new Bundle();
                    ef1 ef1Var = bf1Var.f36074a;
                    bundle.putLong("dialog_id", ef1Var.f36962c);
                    bundle.putLong("topic_id", tL_forumTopic.f20395id);
                    bundle.putBoolean("exception", true);
                    d11 d11Var = new d11(bundle, null);
                    d11Var.f36476r = new ql0(24, bf1Var, tL_forumTopic);
                    ef1Var.presentFragment(d11Var);
                }
                ey eyVar = ye1Var.L0;
                if (eyVar != null) {
                    eyVar.M3(j12, j13, true, ye1Var);
                }
            } else if (ye1Var.f43793a0.size() > 0) {
                ye1Var.M0(view);
            } else {
                if (ye1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : ye1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof ey) {
                            ey eyVar2 = (ey) o2Var;
                            if (eyVar2.f4()) {
                                MessagesStorage.TopicKey topicKey = eyVar2.f37115p2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    ye1Var.Q0 = j13;
                    ye1Var.U0(false, false);
                }
                og.d.m(ye1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(ye1 ye1Var, View view, float f7) {
        if (ye1Var.f43832t0 || ye1Var.getParentLayout() == null || ((ActionBarLayout) ye1Var.getParentLayout()).x()) {
            return false;
        }
        if (!ye1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof ue1)) {
            ue1 ue1Var = (ue1) view;
            if (ue1Var.R(f7)) {
                ye1Var.L0(ue1Var);
                ye1Var.N.I0(true);
                ye1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        ye1Var.M0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void a0(ye1 ye1Var, boolean z10) {
        float f7;
        boolean z11;
        yw ywVar;
        ye1Var.f43831s0 = z10;
        ValueAnimator valueAnimator = ye1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ye1Var.Y0.cancel();
        }
        if (ye1Var.f43794a1 == null) {
            org.telegram.ui.Components.k91 n10 = ye1Var.f43829r0.n(8, false);
            ye1Var.f43794a1 = n10;
            if (ye1Var.M0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, n10, ye1Var.getResourceProvider());
            }
            ye1Var.e.addView(ye1Var.f43794a1, w7.z5.c(44.0f, -1));
        }
        float f10 = ye1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ye1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(ye1Var.f43829r0, false, 1.0f, true);
        ey eyVar = ye1Var.M0;
        if (eyVar != null && (ywVar = eyVar.G3) != null) {
            ywVar.M = !z10;
        }
        if (!z10 && ye1Var.f43829r0.getVisibility() == 0 && ye1Var.f43829r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        ye1Var.Z0 = z11;
        ye1Var.Y0.addUpdateListener(new g11(ye1Var, 15));
        ye1Var.f43829r0.setVisibility(0);
        if (!z10) {
            ye1Var.f43827q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(ye1Var.getParentActivity(), ye1Var.classGuid);
            ye1Var.P0(false);
        }
        ye1Var.Y0.addListener(new ge1(ye1Var, z10, 0));
        ye1Var.Y0.setDuration(200L);
        ye1Var.Y0.setInterpolator(org.telegram.ui.Components.bs.f25133f);
        ye1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.ow0 A() {
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
            org.telegram.ui.Components.us usVar = eyVar.J1;
            if (usVar != null) {
                f7 = usVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.us usVar2 = this.U0;
            if (usVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.us usVar3 = this.M0.J1;
                if (usVar3 != null) {
                    f10 = usVar3.getMetadata().f17462c.f17470a;
                } else {
                    f10 = 0.0f;
                }
                usVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.us usVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.us usVar5 = this.M0.J1;
                if (usVar5 != null) {
                    f11 = usVar5.getMetadata().f17462c.f17470a;
                }
                f11 = usVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.us usVar6 = this.U0;
            if (usVar6 != null) {
                f11 = 0.0f + usVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f43807f1 + this.f43802d1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void B0() {
        this.f43793a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        Q0();
    }

    public final void C0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f43830s.findTopic(this.f43792a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(23));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, getResourceProvider());
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
        bundle.putLong("chat_id", this.f43792a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f43805f.getSharedMediaPreloader());
        profileActivity.M4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f43805f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.k71 k71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21421q7;
            }
            k71Var.setTextColorKey(i11);
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

    public final void K0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ie1 ie1Var = this.N;
            if (ie1Var != null) {
                float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
                ie1Var.setPivotX(0.0f);
                ie1Var.setPivotY(0.0f);
                ie1Var.setScaleX(D);
                ie1Var.setScaleY(D);
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
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new de1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(zoVar.f33304f);
        zoVar.f33312o = 1;
        long j11 = this.f43792a;
        long j12 = -j11;
        zoVar.e(j12, tL_forumTopic.f20395id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.j(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.j(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final ye1 f43584b;

                {
                    this.f43584b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ye1 ye1Var = this.f43584b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            TopicsController topicsController = ye1Var.f43830s;
                            long j13 = ye1Var.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20395id, !tL_forumTopic2.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ye1 ye1Var2 = this.f43584b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController2 = ye1Var2.f43830s;
                            long j14 = ye1Var2.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20395id, true ^ tL_forumTopic3.closed);
                            ye1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20395id));
                            ye1 ye1Var3 = this.f43584b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f20395id)) {
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
                public final ye1 f43584b;

                {
                    this.f43584b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ye1 ye1Var = this.f43584b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            TopicsController topicsController = ye1Var.f43830s;
                            long j13 = ye1Var.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20395id, !tL_forumTopic2.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ye1 ye1Var2 = this.f43584b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController2 = ye1Var2.f43830s;
                            long j14 = ye1Var2.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20395id, true ^ tL_forumTopic3.closed);
                            ye1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20395id));
                            ye1 ye1Var3 = this.f43584b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.j(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.c(org.telegram.ui.ActionBar.k6.f21421q7, org.telegram.ui.ActionBar.k6.f21404p7);
            e1Var4.setMinimumWidth(160);
            e1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final ye1 f43584b;

                {
                    this.f43584b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ye1 ye1Var = this.f43584b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            TopicsController topicsController = ye1Var.f43830s;
                            long j13 = ye1Var.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20395id, !tL_forumTopic2.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ye1 ye1Var2 = this.f43584b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController2 = ye1Var2.f43830s;
                            long j14 = ye1Var2.f43792a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20395id, true ^ tL_forumTopic3.closed);
                            ye1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20395id));
                            ye1 ye1Var3 = this.f43584b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
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
            j10 = q2Var.N.f20395id;
        }
        og.d.a(snVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(snVar, r32[0]);
    }

    public final void M0(View view) {
        ue1 ue1Var;
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
        if ((view instanceof ue1) && (tL_forumTopic = (ue1Var = (ue1) view).N) != null) {
            int i20 = tL_forumTopic.f20395id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f43793a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            ue1Var.U(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f43792a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.y i21 = this.actionBar.i(null);
                    if (this.inPreviewMode) {
                        i21.setBackgroundColor(0);
                        i21.f21963a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(i21.getContext());
                    this.f43799c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f43799c0.setTypeface(AndroidUtilities.bold());
                    this.f43799c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21573y8));
                    i21.addView(this.f43799c0, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f43799c0.setOnTouchListener(new yd1(0));
                    this.f43801d0 = i21.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f43803e0 = i21.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f43806f0 = i21.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f43808g0 = i21.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.u0 h = i21.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f43810h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h10 = i21.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f43812i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h11 = i21.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f43814j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f43816k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f43818l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
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
                    topicsController = this.f43830s;
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
                    this.f43814j0.setVisibility(0);
                    this.f43814j0.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f43814j0.setVisibility(8);
                }
                if (i23 != 0) {
                    this.B0 = false;
                    this.f43806f0.setIcon(R.drawable.msg_unmute);
                    this.f43806f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f43806f0.setIcon(R.drawable.msg_mute);
                    this.f43806f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f43801d0;
                if (i24 == z10 && i25 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                u0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f43803e0;
                if (i25 == z10 && i24 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                u0Var2.setVisibility(i12);
                this.f43799c0.a(hashSet3.size(), z10);
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
                            if (findTopic2.f20395id == 1) {
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
                org.telegram.ui.ActionBar.e1 e1Var = this.f43816k0;
                if (i26 == 0 && i27 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                e1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.e1 e1Var2 = this.f43816k0;
                if (i27 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                e1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.e1 e1Var3 = this.f43818l0;
                if (i27 == 0 && i26 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                e1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.e1 e1Var4 = this.f43818l0;
                if (i26 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                e1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f43808g0;
                if (i28 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                u0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.u0 u0Var4 = this.f43810h0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                u0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f43812i0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye1.N0(boolean):void");
    }

    public final void O0() {
        RadialProgressView radialProgressView = this.f43821n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ae));
        this.h.updateColors();
        n41 n41Var = this.f43823o0;
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        n41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8));
        }
        this.f43829r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void P0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43792a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f43831s0 && !this.f43832t0 && !this.J0) {
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
        if (ChatObject.canManageTopics(g()) && !this.f43793a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43796b0 != z10) {
            this.f43796b0 = z10;
            me1 me1Var = this.f43828r;
            me1Var.q(0, me1Var.h());
        }
    }

    public final void R0(float f7) {
        this.W = f7;
        S0();
        this.f43797b1 = true;
        float f10 = 1.0f - f7;
        this.f43805f.getTitleTextView().setAlpha(f10);
        this.f43805f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.k91 k91Var = this.f43794a1;
        if (k91Var != null) {
            k91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f43794a1.setAlpha(f7);
        }
        this.f43829r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f43829r0.setAlpha(f7);
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21518v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21573y8;
        kVar.B(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.B(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.f21481t8), getThemedColor(org.telegram.ui.ActionBar.k6.f21590z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8), getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6)));
        }
    }

    public final void T0() {
        ci.n5 n5Var = this.D0;
        if (n5Var != null && n5Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.ic_ab_other, 0);
            xqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43792a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        zd1 zd1Var;
        ke1 ke1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f43830s;
        long j10 = this.f43792a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f43795b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ke1 ke1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f43833u0) {
                arrayList.add(new oe1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f20395id))) {
                    arrayList.add(new oe1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new oe1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f43837x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                oe1 oe1Var = (oe1) arrayList.get(i11);
                if (oe1Var != null && (tL_forumTopic = oe1Var.f40146c) != null && tL_forumTopic.hidden) {
                    this.f43837x++;
                }
            }
            ie1 ie1Var = this.N;
            if (ie1Var != null) {
                s4.l0 itemAnimator = ie1Var.getItemAnimator();
                if (z10) {
                    ke1Var = this.I0;
                } else {
                    ke1Var = null;
                }
                if (itemAnimator != ke1Var) {
                    ie1 ie1Var2 = this.N;
                    if (z10) {
                        ke1Var2 = this.I0;
                    }
                    ie1Var2.setItemAnimator(ke1Var2);
                }
            }
            me1 me1Var = this.f43828r;
            if (me1Var != null) {
                me1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (zd1Var = this.F) != null) {
                zd1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        z0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f43792a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
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
        this.f43802d1 = i10;
        ey eyVar2 = this.M0;
        if (eyVar2 != null && eyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f43804e1 = i11;
        ee1 ee1Var = new ee1(this, context);
        this.d = ee1Var;
        this.fragmentView = ee1Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, ee1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!AndroidUtilities.isTablet() || ((h5Var2 = this.parentLayout) != null && ((ActionBarLayout) h5Var2).f20616b)) && !this.inPreviewMode) {
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
        this.actionBar.setActionBarMenuOnItemClick(new he1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final ye1 f42389b;

            {
                this.f42389b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        ye1 ye1Var = this.f42389b;
                        if (!ye1Var.f43831s0) {
                            ye1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        ye1 ye1Var2 = this.f42389b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.f43792a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        return;
                    case 2:
                        this.f42389b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar3 = this.f42389b.M0;
                        if (eyVar3 != null && (u0Var = eyVar3.f37085j0) != null) {
                            u0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        ye1 ye1Var3 = this.f42389b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.f43792a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
            this.f43825p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final ye1 f42389b;

                {
                    this.f42389b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            ye1 ye1Var = this.f42389b;
                            if (!ye1Var.f43831s0) {
                                ye1Var.G0(false);
                                return;
                            }
                            return;
                        case 1:
                            ye1 ye1Var2 = this.f42389b;
                            ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.f43792a, null, ye1Var2.g());
                            ye1Var2.N0(false);
                            return;
                        case 2:
                            this.f42389b.finishPreviewFragment();
                            return;
                        case 3:
                            ey eyVar3 = this.f42389b.M0;
                            if (eyVar3 != null && (u0Var = eyVar3.f37085j0) != null) {
                                u0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            ye1 ye1Var3 = this.f42389b;
                            ye1Var3.presentFragment(td1.a0(ye1Var3.f43792a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = m10.a(0, R.drawable.outline_header_search);
            this.f43825p0 = a10;
            a10.F();
            a10.H = new ig.b2(this, 18);
            this.f43825p0.setSearchPaddingStart(56);
            this.f43825p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f43825p0.getSearchField();
            org.telegram.ui.ActionBar.r6.W(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, getResourceProvider());
            org.telegram.ui.ActionBar.r6.x(searchField, org.telegram.ui.ActionBar.k6.Wd, getResourceProvider());
        }
        org.telegram.ui.ActionBar.u0 c10 = m10.c(0, R.drawable.ic_ab_other, null);
        this.f43827q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f43827q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f43827q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.f43827q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.yj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.f43827q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f43827q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f43827q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, this, false, this.resourceProvider);
        this.f43805f = ooVar;
        ooVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.oo ooVar2 = this.f43805f;
        if ((!AndroidUtilities.isTablet() || ((h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).f20616b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        ooVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.oo ooVar3 = this.f43805f;
        long j10 = -this.f43792a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ooVar3.f29250b = z12;
        ooVar3.setClipChildren(false);
        this.actionBar.addView(this.f43805f, 0, w7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f43832t0) {
            this.f43805f.getAvatarImageView().setOnClickListener(new b8(this, 3));
        }
        this.N = new ie1(this, context);
        ih.k kVar2 = new ih.k(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.f43817k1;
        bVar.f4365f = kVar2;
        bVar.f4366g = viewGroup;
        ie1 ie1Var = this.N;
        ey eyVar3 = this.M0;
        if (eyVar3 != null) {
            viewGroup = (ViewGroup) eyVar3.getFragmentView();
        }
        ie1 ie1Var2 = this.N;
        Objects.requireNonNull(ie1Var2);
        this.l1 = new bh.l(ie1Var, viewGroup, new dy0(ie1Var2, 1));
        this.N.C0(new vd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f43835w = kwVar;
        kwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f43839y = i12;
        kw kwVar2 = this.f43835w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        kwVar2.X = z13;
        ke1 ke1Var = new ke1(this);
        this.N.setHideIfEmpty(false);
        ke1Var.f46377m = false;
        ke1Var.C = false;
        ie1 ie1Var3 = this.N;
        this.I0 = ke1Var;
        ie1Var3.setItemAnimator(ke1Var);
        this.N.setOnScrollListener(new ae1(this, 1));
        ie1 ie1Var4 = this.N;
        ie1Var4.W1 = true;
        ie1Var4.X1 = 0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(ie1Var4, true);
        this.K0 = rl0Var;
        this.N.setItemsEnterAnimator(rl0Var);
        this.N.setOnItemClickListener(new j11(this, 10));
        this.N.setOnItemLongClickListener(new wd1(this));
        this.N.setOnScrollListener(new ae1(this, 2));
        ie1 ie1Var5 = this.N;
        zd1 zd1Var = new zd1(this);
        this.F = zd1Var;
        ie1Var5.setLayoutManager(zd1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f43828r);
        this.N.setClipToPadding(false);
        this.N.j(new ae1(this, 0));
        xe1 xe1Var = new xe1(this);
        this.P = xe1Var;
        be1 be1Var = new be1(this, xe1Var);
        this.O = be1Var;
        be1Var.d(this.N);
        this.d.addView(this.N, w7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(getParentActivity(), this.resourceProvider, false);
        this.h = h20Var;
        this.d.addView(h20Var, org.telegram.ui.Components.h20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ye1 f42389b;

            {
                this.f42389b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        ye1 ye1Var = this.f42389b;
                        if (!ye1Var.f43831s0) {
                            ye1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        ye1 ye1Var2 = this.f42389b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.f43792a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        return;
                    case 2:
                        this.f42389b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42389b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37085j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        ye1 ye1Var3 = this.f42389b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.f43792a, 0L));
                        return;
                }
            }
        });
        this.h.f26768c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f26768c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f26768c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(24);
        b10Var.setVisibility(8);
        b10Var.f24923w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f39858a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21571y6, getResourceProvider());
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
        this.f43820n = frameLayout;
        textView.setAlpha(0.0f);
        ci.n5 n5Var = new ci.n5(this, context, b10Var);
        this.D0 = n5Var;
        try {
            n5Var.f32371b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f43820n.addView(b10Var);
        this.f43820n.addView(this.D0);
        this.d.addView(this.f43820n);
        this.N.setEmptyView(this.f43820n);
        this.f43823o0 = new n41(context, 6);
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context);
        this.L = k71Var;
        this.f43823o0.addView(k71Var);
        this.d.addView(this.f43823o0, w7.z5.e(-1, 51, 80));
        this.L.setOnClickListener(new ce1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f43821n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f43821n0.setVisibility(4);
        this.f43823o0.addView(this.f43821n0, w7.z5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.k6.f21189de;
        imageView2.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(getThemedColor(i13))));
        org.telegram.ui.ActionBar.r6.t(this.W0, i13, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f43823o0.addView(this.W0, w7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final ye1 f42389b;

            {
                this.f42389b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        ye1 ye1Var = this.f42389b;
                        if (!ye1Var.f43831s0) {
                            ye1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        ye1 ye1Var2 = this.f42389b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.f43792a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        return;
                    case 2:
                        this.f42389b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42389b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37085j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        ye1 ye1Var3 = this.f42389b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.f43792a, 0L));
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
        te1 te1Var = new te1(this, context);
        this.f43829r0 = te1Var;
        te1Var.setVisibility(8);
        this.e.addView(this.f43829r0, w7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        te1 te1Var2 = this.f43829r0;
        int i14 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.r6.i(i14, te1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f43792a, true, null, true, false, 0);
        org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us(context);
        this.U0 = usVar;
        usVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.c.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new vd1(this, 0));
        this.d.addView(this.U0, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), w7.z5.n(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            xh.d dVar2 = this.R0;
            dVar2.f50288m = new wd1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f50285j = chatFull;
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
            public final ye1 f42389b;

            {
                this.f42389b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        ye1 ye1Var = this.f42389b;
                        if (!ye1Var.f43831s0) {
                            ye1Var.G0(false);
                            return;
                        }
                        return;
                    case 1:
                        ye1 ye1Var2 = this.f42389b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.f43792a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        return;
                    case 2:
                        this.f42389b.finishPreviewFragment();
                        return;
                    case 3:
                        ey eyVar32 = this.f42389b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.f37085j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        ye1 ye1Var3 = this.f42389b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.f43792a, 0L));
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
                        MessagesStorage.TopicKey topicKey = eyVar4.f37115p2;
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
        wd1 wd1Var = new wd1(this);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(view, wd1Var);
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
        long j10 = this.f43792a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f20344id == j10) {
                N0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f50285j = chatFull2;
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
        return getMessagesController().getChat(Long.valueOf(this.f43792a));
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
        te1 te1Var = this.f43829r0;
        if (te1Var != null && te1Var.U != null) {
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
        if (this.f43831s0) {
            i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21462s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21537w8);
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
        if (!this.f43793a0.isEmpty()) {
            if (z10) {
                B0();
                return false;
            }
        } else if (this.f43831s0) {
            if (z10) {
                this.actionBar.v(this.f43825p0.L(false));
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
        long j10 = this.f43792a;
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
        b61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f43791q1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43792a));
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
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f43792a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f43792a;
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
        gh.c cVar = this.f43815j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.a6.b(getThemedColor(org.telegram.ui.ActionBar.k6.f21189de))) != this.f43826p1) {
            this.f43826p1 = b10;
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
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6), 100));
        }
        O0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
            }
            kw kwVar = this.f43835w;
            if (kwVar != null) {
                kwVar.i();
            }
            if (this.actionBar != null && this.f43797b1) {
                S0();
            }
            NumberTextView numberTextView = this.f43799c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21573y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f43825p0;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f43825p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Wd));
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
            if (this.f43832t0 && this.H) {
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
    public final org.telegram.ui.Components.oo p() {
        return this.f43805f;
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
        org.telegram.ui.Components.oo ooVar = this.f43805f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f43827q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.f43825p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f43805f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f43805f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
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
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f43809g1) != null) {
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
            int measuredHeight = (view.getMeasuredHeight() - this.f43807f1) - AndroidUtilities.dp(8.0f);
            this.f43822n1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f43824o1;
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
            fVar.g(i10, this.f43819m1);
            fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void x0() {
        zd1 zd1Var;
        TopicsController topicsController = this.f43830s;
        long j10 = this.f43792a;
        if (!topicsController.endIsReached(j10) && (zd1Var = this.F) != null) {
            int N0 = zd1Var.N0();
            if (this.f43795b.isEmpty() || N0 >= this.f43828r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            z0();
        }
    }

    public final void y0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43792a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f43840y0) != null || this.f43841z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43840y0 = null;
            this.f43841z0 = false;
        } else if (this.f43840y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.v0.p(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.f43840y0 = null;
        }
    }

    @Override
    public final gh.d z() {
        return this.f43813i1;
    }

    public final void z0() {
        this.J0 = this.f43830s.isLoading(this.f43792a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f43795b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((oe1) arrayList.get(0)).f40146c != null && ((oe1) arrayList.get(0)).f40146c.f20395id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ie1 ie1Var = this.N;
        if (ie1Var != null) {
            ie1Var.K0(ie1Var.z1());
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
