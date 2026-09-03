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
public class sf1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.rg, wg0 {
    public static final HashSet f38174k1 = new HashSet();
    public nh.y4 A0;
    public boolean B;
    public gf1 B0;
    public te1 C;
    public FrameLayout C0;
    public boolean D;
    public b9 D0;
    public boolean E;
    public ChatObject.Call E0;
    public boolean F;
    public ff1 F0;
    public TLRPC.ChatFull G;
    public boolean G0;
    public boolean H;
    public org.telegram.ui.Components.yk0 H0;
    public org.telegram.ui.Components.i61 I;
    public qy I0;
    public int J;
    public qy J0;
    public df1 K;
    public boolean K0;
    public ve1 L;
    public final AnimationNotificationsLocker L0;
    public rf1 M;
    public nw0 M0;
    public org.telegram.ui.ActionBar.g1 N;
    public long N0;
    public org.telegram.ui.ActionBar.g1 O;
    public jh.e O0;
    public org.telegram.ui.ActionBar.g1 P;
    public float P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public boolean Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public org.telegram.ui.Components.is R0;
    public boolean S;
    public final boolean S0;
    public float T;
    public ImageView T0;
    public TL_stories.TL_premium_boostsStatus U;
    public float U0;
    public long V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final HashSet X;
    public org.telegram.ui.Components.k81 X0;
    public boolean Y;
    public View Y0;
    public NumberTextView Z;
    public int Z0;
    public final long f38175a;
    public org.telegram.ui.ActionBar.w0 f38176a0;
    public int f38177a1;
    public final ArrayList f38178b;
    public org.telegram.ui.ActionBar.w0 f38179b0;
    public int f38180b1;
    public int f38181c;
    public org.telegram.ui.ActionBar.w0 f38182c0;
    public final ng.e f38183c1;
    public ye1 d;
    public org.telegram.ui.ActionBar.w0 f38184d0;
    public final sg.d f38185d1;
    public n0 e;
    public org.telegram.ui.ActionBar.w0 f38186e0;
    public final sg.d f38187e1;
    public org.telegram.ui.Components.yn f38188f;
    public org.telegram.ui.ActionBar.w0 f38189f0;
    public final ng.a f38190f1;
    public org.telegram.ui.ActionBar.g1 f38191g0;
    public ng.k f38192g1;
    public org.telegram.ui.Components.a20 h;
    public org.telegram.ui.ActionBar.g1 f38193h0;
    public final ArrayList f38194h1;
    public org.telegram.ui.ActionBar.g1 f38195i0;
    public final RectF f38196i1;
    public org.telegram.ui.ActionBar.w0 f38197j0;
    public final RectF f38198j1;
    public RadialProgressView f38199k0;
    public h51 f38200l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public if1 f38201n;
    public org.telegram.ui.ActionBar.w0 f38202n0;
    public of1 f38203o0;
    public boolean f38204p0;
    public final boolean f38205q0;
    public final hf1 f38206r;
    public final boolean f38207r0;
    public final TopicsController f38208s;
    public final boolean f38209s0;
    public final boolean f38210t0;
    public final boolean f38211u0;
    public tf1 v;
    public String f38212v0;
    public xw f38213w;
    public boolean f38214w0;
    public int f38215x;
    public HashSet f38216x0;
    public int f38217y;
    public boolean f38218y0;
    public boolean f38219z0;

    public sf1(Bundle bundle) {
        super(bundle);
        this.f38178b = new ArrayList();
        new ArrayList();
        this.f38206r = new hf1(this);
        this.f38215x = 0;
        this.B = true;
        this.D = true;
        this.S = true;
        this.T = 0.0f;
        this.X = new HashSet();
        this.f38218y0 = false;
        this.L0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.P0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f38194h1 = arrayList;
        RectF rectF = new RectF();
        this.f38196i1 = rectF;
        RectF rectF2 = new RectF();
        this.f38198j1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f38175a = j10;
        this.f38205q0 = this.arguments.getBoolean("for_select", false);
        this.f38207r0 = this.arguments.getBoolean("forward_to", false);
        this.f38211u0 = this.arguments.getBoolean("bot_share_to", false);
        this.f38209s0 = this.arguments.getBoolean("quote", false);
        this.f38210t0 = this.arguments.getBoolean("reply_to", false);
        this.f38212v0 = this.arguments.getString("voicechat", null);
        this.f38214w0 = this.arguments.getBoolean("videochat", false);
        this.f38208s = getMessagesController().getTopicsController();
        this.S0 = true ^ org.telegram.messenger.y3.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f38183c1 = new ng.e(false);
            this.f38185d1 = new sg.d(null);
            sg.d dVar = new sg.d(null);
            this.f38187e1 = dVar;
            ng.a aVar = new ng.a(dVar);
            this.f38190f1 = aVar;
            aVar.f14952f = LiteMode.isEnabled(262144);
            return;
        }
        this.f38183c1 = null;
        this.f38185d1 = null;
        this.f38187e1 = null;
        this.f38190f1 = new ng.a(cVar);
    }

    public static org.telegram.ui.ActionBar.p2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new zn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new zn(bundle);
            }
        }
        return new sf1(bundle);
    }

    public static org.telegram.ui.ActionBar.p2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.L), MessagesStorage.getInstance(launchActivity.L), bundle);
    }

    public static void I0(org.telegram.ui.zn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sf1.I0(org.telegram.ui.zn):void");
    }

    public static boolean U(sf1 sf1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(sf1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-sf1Var.f38175a), System.currentTimeMillis()).commit();
        Activity parentActivity = sf1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(sf1Var.g());
        int i10 = org.telegram.ui.Components.i80.f25638r;
        org.telegram.ui.Components.i80.w(parentActivity, sf1Var, org.telegram.ui.Components.qc.a0(sf1Var), isChannelAndNotMegaGroup);
        sf1Var.O0(true);
        return false;
    }

    public static void V(sf1 sf1Var, View view) {
        long j10;
        long j11 = sf1Var.f38175a;
        if (sf1Var.getParentLayout() != null && !((ActionBarLayout) sf1Var.getParentLayout()).y() && (view instanceof pf1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pf1) view).K;
            long j12 = -j11;
            boolean isMonoForum = sf1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f19211id;
            }
            long j13 = j10;
            if (sf1Var.f38205q0) {
                tf1 tf1Var = sf1Var.v;
                if (tf1Var != null) {
                    vf1 vf1Var = tf1Var.f38509a;
                    Bundle bundle = new Bundle();
                    yf1 yf1Var = vf1Var.f39087a;
                    bundle.putLong("dialog_id", yf1Var.f40268c);
                    bundle.putLong("topic_id", tL_forumTopic.f19211id);
                    bundle.putBoolean("exception", true);
                    l11 l11Var = new l11(bundle, null);
                    l11Var.f35623r = new vl0(25, vf1Var, tL_forumTopic);
                    yf1Var.presentFragment(l11Var);
                }
                qy qyVar = sf1Var.I0;
                if (qyVar != null) {
                    qyVar.O3(j12, j13, true, sf1Var);
                }
            } else if (sf1Var.X.size() > 0) {
                sf1Var.N0(view);
            } else {
                if (sf1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.p2 p2Var : sf1Var.getParentLayout().getFragmentStack()) {
                        if (p2Var instanceof qy) {
                            qy qyVar2 = (qy) p2Var;
                            if (qyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = qyVar2.f37583m2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    sf1Var.N0 = j13;
                    sf1Var.U0(false, false);
                }
                ag.f.m(sf1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(sf1 sf1Var, View view, float f10) {
        if (sf1Var.f38205q0 || sf1Var.getParentLayout() == null || ((ActionBarLayout) sf1Var.getParentLayout()).y()) {
            return false;
        }
        if (!sf1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof pf1)) {
            pf1 pf1Var = (pf1) view;
            if (pf1Var.S(f10)) {
                sf1Var.M0(pf1Var);
                sf1Var.K.I0(true);
                sf1Var.K.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        sf1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(sf1 sf1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = sf1Var.K;
            } else {
                of1 of1Var = sf1Var.f38203o0;
                if (of1Var != null) {
                    viewGroup = of1Var.R;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g6) {
                        ((org.telegram.ui.Cells.g6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.ua) {
                        ((org.telegram.ui.Cells.ua) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = sf1Var.actionBar;
        if (kVar != null) {
            kVar.D(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            sf1Var.actionBar.E(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            sf1Var.actionBar.E(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            sf1Var.actionBar.F(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        nw0 nw0Var = sf1Var.M0;
        if (nw0Var != null && Build.VERSION.SDK_INT >= 23) {
            nw0Var.setForeground(new ColorDrawable(i0.a.k(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6), 100)));
        }
        sf1Var.P0();
    }

    public static void b0(sf1 sf1Var, boolean z4) {
        float f10;
        boolean z10;
        lx lxVar;
        sf1Var.f38204p0 = z4;
        ValueAnimator valueAnimator = sf1Var.V0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            sf1Var.V0.cancel();
        }
        if (sf1Var.X0 == null) {
            org.telegram.ui.Components.k81 n10 = sf1Var.f38203o0.n(8, false);
            sf1Var.X0 = n10;
            if (sf1Var.J0 != null) {
                n10.setBackgroundColor(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
            }
            sf1Var.e.addView(sf1Var.X0, k7.b6.c(44.0f, -1));
        }
        float f11 = sf1Var.T;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        sf1Var.V0 = ValueAnimator.ofFloat(f11, f10);
        AndroidUtilities.updateViewVisibilityAnimated(sf1Var.f38203o0, false, 1.0f, true);
        qy qyVar = sf1Var.J0;
        if (qyVar != null && (lxVar = qyVar.C3) != null) {
            lxVar.J = !z4;
        }
        if (!z4 && sf1Var.f38203o0.getVisibility() == 0 && sf1Var.f38203o0.getAlpha() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        sf1Var.W0 = z10;
        sf1Var.V0.addUpdateListener(new o11(sf1Var, 17));
        sf1Var.f38203o0.setVisibility(0);
        if (!z4) {
            sf1Var.f38202n0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(sf1Var.getParentActivity(), sf1Var.classGuid);
            sf1Var.Q0(false);
        }
        sf1Var.V0.addListener(new bf1(sf1Var, z4, 0));
        sf1Var.V0.setDuration(200L);
        sf1Var.V0.setInterpolator(org.telegram.ui.Components.mr.f27122f);
        sf1Var.V0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.qv0 A() {
        return this.d;
    }

    public final void A0() {
        this.G0 = this.f38208s.isLoading(this.f38175a);
        if (this.A0 != null) {
            ArrayList arrayList = this.f38178b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((jf1) arrayList.get(0)).f35268c != null && ((jf1) arrayList.get(0)).f35268c.f19211id == 1)) {
                this.A0.e(this.G0, this.fragmentBeginToShow);
            }
        }
        df1 df1Var = this.K;
        if (df1Var != null) {
            df1Var.J0(df1Var.t1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f10;
        float f11;
        qy qyVar = this.J0;
        float f12 = 0.0f;
        if (qyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.is isVar = qyVar.G1;
            if (isVar != null) {
                f10 = isVar.c(dp);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.is isVar2 = this.R0;
            if (isVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.is isVar3 = this.J0.G1;
                if (isVar3 != null) {
                    f11 = isVar3.getMetadata().f46973c.f46981a;
                } else {
                    f11 = 0.0f;
                }
                isVar2.setTranslationY(f13 - (f11 * dp2));
                org.telegram.ui.Components.is isVar4 = this.R0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.is isVar5 = this.J0.G1;
                if (isVar5 != null) {
                    f12 = isVar5.getMetadata().f46973c.f46981a;
                }
                f12 = isVar4.c(AndroidUtilities.lerp(dp3, dp4, f12)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.is isVar6 = this.R0;
            if (isVar6 != null) {
                f12 = 0.0f + isVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f38180b1 + this.Z0;
        if (this.S) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.K.setPadding(0, (int) f12, 0, i11 + i10);
    }

    public final void C0() {
        this.X.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.K);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f38208s.findTopic(this.f38175a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(8));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void G0(boolean z4, boolean z10) {
        boolean z11 = true;
        this.h.e(!z4, (this.fragmentBeginToShow && z10) ? false : false);
    }

    @Override
    public final long H() {
        return 0L;
    }

    public final void H0(boolean z4) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z4 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z4 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f38175a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f38188f.getSharedMediaPreloader());
        profileActivity.K4(this.G);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f38188f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z4) {
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
        if (this.J != i10) {
            this.J = i10;
            org.telegram.ui.Components.i61 i61Var = this.I;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20116q7;
            }
            i61Var.setTextColorKey(i11);
            ImageView imageView = this.T0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            O0(false);
        }
    }

    public final void K0(boolean z4) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            if (z4) {
                ye1Var.setLayerType(2, null);
                ye1Var.setClipChildren(false);
                ye1Var.setClipToPadding(false);
            } else {
                ye1Var.setLayerType(0, null);
                ye1Var.setClipChildren(true);
                ye1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.P0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            df1 df1Var = this.K;
            if (df1Var != null) {
                float c3 = ai.c(1.0f, this.P0, 0.05f, 1.0f);
                df1Var.setPivotX(0.0f);
                df1Var.setPivotY(0.0f);
                df1Var.setScaleX(c3);
                df1Var.setScaleY(c3);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(c3);
                this.actionBar.setScaleY(c3);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.q2 q2Var) {
        long j10;
        try {
            q2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = q2Var.K;
        org.telegram.ui.Components.ko koVar = new org.telegram.ui.Components.ko(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new xe1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(koVar.f26363f);
        koVar.f26371o = 1;
        long j11 = this.f38175a;
        long j12 = -j11;
        koVar.d(j12, tL_forumTopic.f19211id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final sf1 f37820b;

                {
                    this.f37820b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            sf1 sf1Var = this.f37820b;
                            sf1Var.f38219z0 = true;
                            sf1Var.K0 = true;
                            TopicsController topicsController = sf1Var.f38208s;
                            long j13 = sf1Var.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19211id, !tL_forumTopic2.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            sf1 sf1Var2 = this.f37820b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController2 = sf1Var2.f38208s;
                            long j14 = sf1Var2.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19211id, true ^ tL_forumTopic3.closed);
                            sf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19211id));
                            sf1 sf1Var3 = this.f37820b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f19211id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new nh.o5(this, tL_forumTopic, (Serializable) r32, b10, 6));
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
                public final sf1 f37820b;

                {
                    this.f37820b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            sf1 sf1Var = this.f37820b;
                            sf1Var.f38219z0 = true;
                            sf1Var.K0 = true;
                            TopicsController topicsController = sf1Var.f38208s;
                            long j13 = sf1Var.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19211id, !tL_forumTopic2.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            sf1 sf1Var2 = this.f37820b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController2 = sf1Var2.f38208s;
                            long j14 = sf1Var2.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19211id, true ^ tL_forumTopic3.closed);
                            sf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19211id));
                            sf1 sf1Var3 = this.f37820b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final sf1 f37820b;

                {
                    this.f37820b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            sf1 sf1Var = this.f37820b;
                            sf1Var.f38219z0 = true;
                            sf1Var.K0 = true;
                            TopicsController topicsController = sf1Var.f38208s;
                            long j13 = sf1Var.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19211id, !tL_forumTopic2.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            sf1 sf1Var2 = this.f37820b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController2 = sf1Var2.f38208s;
                            long j14 = sf1Var2.f38175a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19211id, true ^ tL_forumTopic3.closed);
                            sf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19211id));
                            sf1 sf1Var3 = this.f37820b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
        if (this.M0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.M0.setBackground(new BitmapDrawable(createBitmap));
            this.M0.setAlpha(0.0f);
            if (this.M0.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.M0, k7.b6.c(-1.0f, -1));
        }
        zn znVar = new zn(kf.k0.g(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(q2Var.K.from_id);
        } else {
            j10 = q2Var.K.f19211id;
        }
        ag.f.a(znVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(znVar, r32[0]);
    }

    public final void N0(View view) {
        pf1 pf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((view instanceof pf1) && (tL_forumTopic = (pf1Var = (pf1) view).K) != null) {
            int i19 = tL_forumTopic.f19211id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.X;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            pf1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f38175a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f20747a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.Z = numberTextView;
                    numberTextView.setTextSize(18);
                    this.Z.setTypeface(AndroidUtilities.bold());
                    this.Z.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20258y8));
                    j11.addView(this.Z, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
                    this.Z.setOnTouchListener(new se1(0));
                    this.f38176a0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f38179b0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f38182c0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f38184d0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f38186e0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h9 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f38189f0 = h9;
                    h9.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.f38197j0 = h10;
                    this.f38191g0 = h10.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f38193h0 = this.f38197j0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f38195i0 = this.f38197j0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
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
                    topicsController = this.f38208s;
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
                    this.f38191g0.setVisibility(0);
                    this.f38191g0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f38191g0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.f38218y0 = false;
                    this.f38182c0.setIcon(R.drawable.msg_unmute);
                    this.f38182c0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z4 = true;
                } else {
                    z4 = true;
                    this.f38218y0 = true;
                    this.f38182c0.setIcon(R.drawable.msg_mute);
                    this.f38182c0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f38176a0;
                if (i22 == z4 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f38179b0;
                if (i23 == z4 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.Z.a(hashSet3.size(), z4);
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
                            if (findTopic2.f19211id == 1) {
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
                org.telegram.ui.ActionBar.g1 g1Var = this.f38193h0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f38193h0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f38195i0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f38195i0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f38184d0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f38186e0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f38189f0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w0Var5.setVisibility(i18);
                this.f38197j0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sf1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f38199k0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        h51 h51Var = this.f38200l0;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        h51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20151s8));
        }
        this.f38203o0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z4) {
        boolean z10;
        if (this.N == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f38175a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f38204p0 && !this.f38205q0 && !this.G0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        org.telegram.ui.ActionBar.g1 g1Var = this.N;
        if (!z10) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.H, z4);
    }

    public final void R0() {
        boolean z4;
        if (ChatObject.canManageTopics(g()) && !this.X.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.Y != z4) {
            this.Y = z4;
            hf1 hf1Var = this.f38206r;
            hf1Var.q(0, hf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        return false;
    }

    public final void S0(float f10) {
        this.T = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20202v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20258y8;
        kVar.C(i0.a.d(this.T, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.T, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.f20167t8), getThemedColor(org.telegram.ui.ActionBar.j6.f20275z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.f20151s8), getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6)));
        }
        float f11 = 1.0f - f10;
        this.f38188f.getTitleTextView().setAlpha(f11);
        this.f38188f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.k81 k81Var = this.X0;
        if (k81Var != null) {
            k81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.X0.setAlpha(f10);
        }
        this.f38203o0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.f38203o0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.K.setAlpha(f11);
        if (this.W0) {
            float w10 = e2.c.w(1.0f, this.T, 0.02f, 0.98f);
            this.K.setScaleX(w10);
            this.K.setScaleY(w10);
        }
    }

    public final void T0() {
        nh.y4 y4Var = this.A0;
        if (y4Var != null && y4Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.ic_ab_other, 0);
            lqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.A0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f38175a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.A0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z4, boolean z10) {
        te1 te1Var;
        ff1 ff1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z4 && this.K0) {
            z4 = true;
        }
        this.K0 = false;
        TopicsController topicsController = this.f38208s;
        long j10 = this.f38175a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f38178b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ff1 ff1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f38207r0) {
                arrayList.add(new jf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.f38216x0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f19211id))) {
                    arrayList.add(new jf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.S0) {
                arrayList.add(new jf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z10 && size2 > size) {
                this.H0.b(size + 4);
                z4 = false;
            }
            this.f38215x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                jf1 jf1Var = (jf1) arrayList.get(i11);
                if (jf1Var != null && (tL_forumTopic = jf1Var.f35268c) != null && tL_forumTopic.hidden) {
                    this.f38215x++;
                }
            }
            df1 df1Var = this.K;
            if (df1Var != null) {
                f2.t0 itemAnimator = df1Var.getItemAnimator();
                if (z4) {
                    ff1Var = this.F0;
                } else {
                    ff1Var = null;
                }
                if (itemAnimator != ff1Var) {
                    df1 df1Var2 = this.K;
                    if (z4) {
                        ff1Var2 = this.F0;
                    }
                    df1Var2.setItemAnimator(ff1Var2);
                }
            }
            hf1 hf1Var = this.f38206r;
            if (hf1Var != null) {
                hf1Var.E(arrayList2, arrayList);
            }
            if ((this.f38219z0 || size == 0) && (te1Var = this.C) != null) {
                te1Var.h1(0, 0);
                this.f38219z0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f38175a;
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        qy qyVar = this.J0;
        if (qyVar != null && qyVar.T) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.Z0 = i10;
        qy qyVar2 = this.J0;
        if (qyVar2 != null && qyVar2.T) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f38177a1 = i11;
        ye1 ye1Var = new ye1(this, context);
        this.d = ye1Var;
        this.fragmentView = ye1Var;
        ye1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z4 = true;
        } else {
            z4 = false;
        }
        kVar.setOccupyStatusBar(z4);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final sf1 f36771b;

            {
                this.f36771b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        sf1 sf1Var = this.f36771b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.f38175a, 0L));
                        return;
                    case 1:
                        sf1 sf1Var2 = this.f36771b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.f38175a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        return;
                    case 2:
                        sf1 sf1Var3 = this.f36771b;
                        if (!sf1Var3.f38204p0) {
                            sf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36771b.finishPreviewFragment();
                        return;
                    default:
                        qy qyVar3 = this.f36771b.J0;
                        if (qyVar3 != null && (w0Var = qyVar3.f37553g0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.J0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final sf1 f36771b;

                {
                    this.f36771b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            sf1 sf1Var = this.f36771b;
                            sf1Var.presentFragment(ne1.a0(sf1Var.f38175a, 0L));
                            return;
                        case 1:
                            sf1 sf1Var2 = this.f36771b;
                            sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.f38175a, null, sf1Var2.g());
                            sf1Var2.O0(false);
                            return;
                        case 2:
                            sf1 sf1Var3 = this.f36771b;
                            if (!sf1Var3.f38204p0) {
                                sf1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f36771b.finishPreviewFragment();
                            return;
                        default:
                            qy qyVar3 = this.f36771b.J0;
                            if (qyVar3 != null && (w0Var = qyVar3.f37553g0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a10;
            a10.F();
            a10.E = new hb(this, 17);
            this.m0.setSearchPaddingStart(56);
            this.m0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.m0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f38202n0 = c3;
        c3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f38202n0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.O = this.f38202n0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f38202n0;
        this.Q = w0Var.d(14, 0, new org.telegram.ui.Components.gj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.f20635j0);
        this.N = this.f38202n0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.R = this.f38202n0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.P = this.f38202n0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, this, false, this.resourceProvider);
        this.f38188f = ynVar;
        ynVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.yn ynVar2 = this.f38188f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        ynVar2.setOccupyStatusBar(z10);
        org.telegram.ui.Components.yn ynVar3 = this.f38188f;
        long j10 = -this.f38175a;
        if (j10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ynVar3.f31057b = z11;
        ynVar3.setClipChildren(false);
        this.actionBar.addView(this.f38188f, 0, k7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f38205q0) {
            this.f38188f.getAvatarImageView().setOnClickListener(new c8(this, 3));
        }
        this.K = new df1(this, context);
        ug.i iVar = new ug.i(this.d);
        ViewGroup viewGroup = this.d;
        ng.a aVar = this.f38190f1;
        aVar.d = iVar;
        aVar.e = viewGroup;
        df1 df1Var = this.K;
        qy qyVar3 = this.J0;
        if (qyVar3 != null) {
            viewGroup = (ViewGroup) qyVar3.getFragmentView();
        }
        df1 df1Var2 = this.K;
        Objects.requireNonNull(df1Var2);
        this.f38192g1 = new ng.k(df1Var, viewGroup, new z8(df1Var2, 2));
        this.K.C0(new pe1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ag.e c10 = ag.f.c(getParentActivity(), 0.85f, -1, false);
        c10.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
        xw xwVar = new xw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f38213w = xwVar;
        xwVar.b();
        if (this.B) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f38217y = i12;
        xw xwVar2 = this.f38213w;
        if (i12 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        xwVar2.X = z12;
        ff1 ff1Var = new ff1(this);
        this.K.setHideIfEmpty(false);
        ff1Var.f5807m = false;
        ff1Var.C = false;
        df1 df1Var3 = this.K;
        this.F0 = ff1Var;
        df1Var3.setItemAnimator(ff1Var);
        this.K.setOnScrollListener(new ue1(this, 1));
        df1 df1Var4 = this.K;
        df1Var4.V1 = true;
        df1Var4.W1 = 0;
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(df1Var4, true);
        this.H0 = yk0Var;
        this.K.setItemsEnterAnimator(yk0Var);
        this.K.setOnItemClickListener(new p21(this, 9));
        this.K.setOnItemLongClickListener(new qe1(this));
        this.K.setOnScrollListener(new ue1(this, 2));
        df1 df1Var5 = this.K;
        te1 te1Var = new te1(this);
        this.C = te1Var;
        df1Var5.setLayoutManager(te1Var);
        new SparseArray();
        new HashMap();
        this.K.setAdapter(this.f38206r);
        this.K.setClipToPadding(false);
        this.K.j(new ue1(this, 0));
        rf1 rf1Var = new rf1(this);
        this.M = rf1Var;
        ve1 ve1Var = new ve1(this, rf1Var);
        this.L = ve1Var;
        ve1Var.d(this.K);
        this.d.addView(this.K, k7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.K.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(getParentActivity(), this.resourceProvider, false);
        this.h = a20Var;
        this.d.addView(a20Var, org.telegram.ui.Components.a20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final sf1 f36771b;

            {
                this.f36771b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        sf1 sf1Var = this.f36771b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.f38175a, 0L));
                        return;
                    case 1:
                        sf1 sf1Var2 = this.f36771b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.f38175a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        return;
                    case 2:
                        sf1 sf1Var3 = this.f36771b;
                        if (!sf1Var3.f38204p0) {
                            sf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36771b.finishPreviewFragment();
                        return;
                    default:
                        qy qyVar32 = this.f36771b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.f37553g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f23293c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f23293c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f23293c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(24);
        u00Var.setVisibility(8);
        u00Var.f29071w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f34921a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20256y6));
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z13) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f38201n = frameLayout;
        textView.setAlpha(0.0f);
        nh.y4 y4Var = new nh.y4(this, context, u00Var);
        this.A0 = y4Var;
        try {
            y4Var.f31483b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.A0.e(this.G0, this.fragmentBeginToShow);
        this.A0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f38201n.addView(u00Var);
        this.f38201n.addView(this.A0);
        this.d.addView(this.f38201n);
        this.K.setEmptyView(this.f38201n);
        this.f38200l0 = new h51(context, 6);
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context);
        this.I = i61Var;
        this.f38200l0.addView(i61Var);
        this.d.addView(this.f38200l0, k7.b6.e(-1, 51, 80));
        this.I.setOnClickListener(new we1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38199k0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f38199k0.setVisibility(4);
        this.f38200l0.addView(this.f38199k0, k7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.T0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.T0;
        int i13 = org.telegram.ui.ActionBar.j6.f19889de;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i13))));
        this.T0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.T0.setScaleType(ImageView.ScaleType.CENTER);
        this.f38200l0.addView(this.T0, k7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final sf1 f36771b;

            {
                this.f36771b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        sf1 sf1Var = this.f36771b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.f38175a, 0L));
                        return;
                    case 1:
                        sf1 sf1Var2 = this.f36771b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.f38175a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        return;
                    case 2:
                        sf1 sf1Var3 = this.f36771b;
                        if (!sf1Var3.f38204p0) {
                            sf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36771b.finishPreviewFragment();
                        return;
                    default:
                        qy qyVar32 = this.f36771b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.f37553g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.setVisibility(8);
        O0(false);
        n0 n0Var = new n0(this, context, 25);
        this.e = n0Var;
        if (this.J0 == null) {
            this.d.addView(n0Var, k7.b6.e(-1, -1, 119));
        }
        of1 of1Var = new of1(this, context);
        this.f38203o0 = of1Var;
        of1Var.setVisibility(8);
        this.e.addView(this.f38203o0, k7.b6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        of1 of1Var2 = this.f38203o0;
        int i14 = org.telegram.ui.ActionBar.j6.f19881d6;
        of1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f38175a, true, null, true, false, 0);
        org.telegram.ui.Components.is isVar = new org.telegram.ui.Components.is(context);
        this.R0 = isVar;
        isVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        pg.b c11 = aVar.c(this.R0, rg.b.n(this.resourceProvider), false);
        c11.p(AndroidUtilities.dp(24.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        this.R0.setBlurredBackground(c11);
        this.R0.setOnAnimatedHeightChangedListener(new pe1(this, 0));
        this.d.addView(this.R0, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            jh.e eVar = new jh.e(g10, this);
            this.O0 = eVar;
            this.R0.addView(eVar.c(), k7.b6.n(-1, 40));
            this.R0.h(3, this.O0.c());
            this.R0.g(this.O0.c());
            jh.e eVar2 = this.O0;
            eVar2.f9409m = new qe1(this);
            TLRPC.ChatFull chatFull = this.G;
            eVar2.f9406j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.C0 = frameLayout2;
            this.R0.addView(frameLayout2);
            this.R0.h(4, this.C0);
            this.R0.g(this.C0);
            this.R0.i(this.C0, true, false);
            b9 b9Var = new b9(this, context, this);
            this.D0 = b9Var;
            this.C0.addView(b9Var);
            this.R0.setCallFragmentContextView(this.D0);
        }
        FrameLayout.LayoutParams c12 = k7.b6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        y0();
        nw0 nw0Var = new nw0(this, context, 5);
        this.M0 = nw0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            nw0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        }
        this.M0.setFocusable(false);
        this.M0.setImportantForAccessibility(2);
        this.M0.setOnClickListener(new View.OnClickListener(this) {
            public final sf1 f36771b;

            {
                this.f36771b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        sf1 sf1Var = this.f36771b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.f38175a, 0L));
                        return;
                    case 1:
                        sf1 sf1Var2 = this.f36771b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.f38175a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        return;
                    case 2:
                        sf1 sf1Var3 = this.f36771b;
                        if (!sf1Var3.f38204p0) {
                            sf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36771b.finishPreviewFragment();
                        return;
                    default:
                        qy qyVar32 = this.f36771b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.f37553g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.M0.setFitsSystemWindows(true);
        this.S = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) it.next();
                if (p2Var instanceof qy) {
                    qy qyVar4 = (qy) p2Var;
                    if (qyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = qyVar4.f37583m2;
                        if (topicKey.dialogId == j10) {
                            this.N0 = topicKey.topicId;
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new xb(this, 5));
        }
        View view = this.fragmentView;
        qe1 qe1Var = new qe1(this);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(view, qe1Var);
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
        long j10 = this.f38175a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.G) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19160id == j10) {
                O0(false);
                jh.e eVar = this.O0;
                if (eVar != null) {
                    eVar.f9406j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
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
                boolean canScrollVertically = this.K.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.C.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.E0 = getMessagesController().getGroupCall(l10.longValue(), false);
                b9 b9Var = this.D0;
                if (b9Var != null) {
                    b9Var.a(!this.fragmentBeginToShow);
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
                if (this.N0 != longValue2) {
                    this.N0 = longValue2;
                    U0(false, false);
                }
            } else if (this.N0 != 0) {
                this.N0 = 0L;
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
        return getMessagesController().getChat(Long.valueOf(this.f38175a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.E0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.rl0 rl0Var;
        jy0 jy0Var = new jy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        of1 of1Var = this.f38203o0;
        if (of1Var != null && (rl0Var = of1Var.R) != null) {
            org.telegram.ui.Cells.t3.a(arrayList, rl0Var);
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
        if (this.f38204p0) {
            i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20221w8);
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
    public final org.telegram.ui.Components.yn o() {
        return this.f38188f;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.X.isEmpty()) {
            if (z4) {
                C0();
                return false;
            }
        } else if (this.f38204p0) {
            if (z4) {
                this.actionBar.v(this.m0.L(false));
            }
        } else {
            return super.onBackPressed(z4);
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
        long j10 = this.f38175a;
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
        x61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f38174k1;
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
        this.L0.unlock();
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f38175a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        qy qyVar = this.J0;
        if (qyVar != null && qyVar.C3 != null) {
            qyVar.getActionBar().setSearchAvatarImageView(null);
            this.J0.C3.J = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f38175a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f38175a;
        topicsController.onTopicFragmentResume(j10);
        this.D = false;
        AndroidUtilities.updateVisibleRows(this.K);
        this.D = true;
        setBulletinDelegate(new c9(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z4, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.Q0) {
            L0(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        lx lxVar;
        nw0 nw0Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && (nw0Var = this.M0) != null) {
            if (nw0Var.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.M0.setBackground(null);
        }
        if (z4) {
            z0(false);
        }
        this.L0.unlock();
        if (!z4) {
            if (this.f38205q0 && this.E) {
                removeSelfFromStack();
                qy qyVar = this.I0;
                if (qyVar != null) {
                    qyVar.removeSelfFromStack();
                }
            } else if (this.F) {
                removeSelfFromStack();
                qy qyVar2 = this.J0;
                if (qyVar2 != null && (lxVar = qyVar2.C3) != null && lxVar.c()) {
                    this.J0.C3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        nw0 nw0Var = this.M0;
        if (nw0Var != null && nw0Var.getVisibility() == 0) {
            if (z4) {
                this.M0.setAlpha(1.0f - f10);
            } else {
                this.M0.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.L0.lock();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.Q0 = true;
            K0(true);
            return;
        }
        this.Q0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void s() {
        this.K.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.yn ynVar = this.f38188f;
        if (ynVar != null) {
            ynVar.setAlpha(f10);
            this.f38202n0.setAlpha(f10);
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var != null) {
                w0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.yn ynVar = this.f38188f;
        if (ynVar != null) {
            ynVar.setAlpha(f10);
            this.f38188f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ng.e eVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f38183c1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.R0.c(AndroidUtilities.dp(14.0f)));
            qy qyVar = this.J0;
            if (qyVar != null) {
                view = qyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (qyVar != null) {
                kVar = qyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f38180b1) - AndroidUtilities.dp(8.0f);
            this.f38196i1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f38198j1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.J0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f38194h1);
            eVar.e(this.f38192g1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final sg.d y() {
        return this.f38187e1;
    }

    public final void y0() {
        te1 te1Var;
        TopicsController topicsController = this.f38208s;
        long j10 = this.f38175a;
        if (!topicsController.endIsReached(j10) && (te1Var = this.C) != null) {
            int N0 = te1Var.N0();
            if (this.f38178b.isEmpty() || N0 >= this.f38206r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    public final void z0(boolean z4) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f38175a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.E0;
        if (call != null && ((str = this.f38212v0) != null || this.f38214w0)) {
            org.telegram.ui.Components.voip.f2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f38212v0 = null;
            this.f38214w0 = false;
        } else if (this.f38212v0 != null && z4 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            kf.k0.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(this), R.raw.linkbroken, 36);
            this.f38212v0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i10, int i11, boolean z4, int i12, boolean z10, int i13) {
    }
}
