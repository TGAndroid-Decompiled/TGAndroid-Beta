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
public class re1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, mg0 {
    public static final HashSet f41141n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ci.o5 D0;
    public boolean E;
    public fe1 E0;
    public td1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public ee1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.nl0 K0;
    public org.telegram.ui.Components.c71 L;
    public cy L0;
    public int M;
    public cy M0;
    public ce1 N;
    public boolean N0;
    public vd1 O;
    public final AnimationNotificationsLocker O0;
    public qe1 P;
    public v10 P0;
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
    public final long f41142a;
    public final HashSet f41143a0;
    public org.telegram.ui.Components.c91 f41144a1;
    public final ArrayList f41145b;
    public boolean f41146b0;
    public View f41147b1;
    public int f41148c;
    public NumberTextView f41149c0;
    public int f41150c1;
    public yd1 d;
    public org.telegram.ui.ActionBar.u0 f41151d0;
    public int f41152d1;
    public m0 e;
    public org.telegram.ui.ActionBar.u0 f41153e0;
    public int f41154e1;
    public org.telegram.ui.Components.oo f41155f;
    public org.telegram.ui.ActionBar.u0 f41156f0;
    public final bh.f f41157f1;
    public org.telegram.ui.ActionBar.u0 f41158g0;
    public final gh.d f41159g1;
    public org.telegram.ui.Components.h20 h;
    public org.telegram.ui.ActionBar.u0 f41160h0;
    public final gh.d f41161h1;
    public org.telegram.ui.ActionBar.u0 f41162i0;
    public final bh.b f41163i1;
    public org.telegram.ui.ActionBar.e1 f41164j0;
    public bh.l f41165j1;
    public org.telegram.ui.ActionBar.e1 f41166k0;
    public final ArrayList f41167k1;
    public org.telegram.ui.ActionBar.e1 f41168l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final RectF f41169m1;
    public he1 f41170n;
    public RadialProgressView f41171n0;
    public j41 f41172o0;
    public org.telegram.ui.ActionBar.u0 f41173p0;
    public org.telegram.ui.ActionBar.u0 f41174q0;
    public final ge1 f41175r;
    public ne1 f41176r0;
    public final TopicsController f41177s;
    public boolean f41178s0;
    public final boolean f41179t0;
    public final boolean f41180u0;
    public se1 v;
    public final boolean f41181v0;
    public iw f41182w;
    public final boolean f41183w0;
    public int f41184x;
    public final boolean f41185x0;
    public int f41186y;
    public String f41187y0;
    public boolean f41188z0;

    public re1(Bundle bundle) {
        super(bundle);
        this.f41145b = new ArrayList();
        new ArrayList();
        this.f41175r = new ge1(this);
        this.f41184x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f41143a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41167k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f41169m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f41142a = j10;
        this.f41179t0 = this.arguments.getBoolean("for_select", false);
        this.f41180u0 = this.arguments.getBoolean("forward_to", false);
        this.f41185x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f41181v0 = this.arguments.getBoolean("quote", false);
        this.f41183w0 = this.arguments.getBoolean("reply_to", false);
        this.f41187y0 = this.arguments.getString("voicechat", null);
        this.f41188z0 = this.arguments.getBoolean("videochat", false);
        this.f41177s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.g0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f41157f1 = new bh.f(false);
            this.f41159g1 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f41161h1 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f41163i1 = bVar;
            bVar.f4360i = LiteMode.isEnabled(262144);
            return;
        }
        this.f41157f1 = null;
        this.f41159g1 = null;
        this.f41161h1 = null;
        this.f41163i1 = new bh.b(cVar);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new qn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new qn(bundle);
            }
        }
        return new re1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.qn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re1.I0(org.telegram.ui.qn):void");
    }

    public static boolean U(re1 re1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(re1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-re1Var.f41142a), System.currentTimeMillis()).commit();
        Activity parentActivity = re1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(re1Var.g());
        int i10 = org.telegram.ui.Components.a90.f24519r;
        org.telegram.ui.Components.a90.y(parentActivity, re1Var, org.telegram.ui.Components.xc.a0(re1Var), isChannelAndNotMegaGroup);
        re1Var.O0(true);
        return false;
    }

    public static void V(re1 re1Var, View view) {
        long j10;
        long j11 = re1Var.f41142a;
        if (re1Var.getParentLayout() != null && !((ActionBarLayout) re1Var.getParentLayout()).y() && (view instanceof oe1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((oe1) view).N;
            long j12 = -j11;
            boolean isMonoForum = re1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f20325id;
            }
            long j13 = j10;
            if (re1Var.f41179t0) {
                se1 se1Var = re1Var.v;
                if (se1Var != null) {
                    ue1 ue1Var = se1Var.f41446a;
                    Bundle bundle = new Bundle();
                    xe1 xe1Var = ue1Var.f41940a;
                    bundle.putLong("dialog_id", xe1Var.f43198c);
                    bundle.putLong("topic_id", tL_forumTopic.f20325id);
                    bundle.putBoolean("exception", true);
                    z01 z01Var = new z01(bundle, null);
                    z01Var.f43586r = new en0(22, ue1Var, tL_forumTopic);
                    xe1Var.presentFragment(z01Var);
                }
                cy cyVar = re1Var.L0;
                if (cyVar != null) {
                    cyVar.M3(j12, j13, true, re1Var);
                }
            } else if (re1Var.f41143a0.size() > 0) {
                re1Var.N0(view);
            } else {
                if (re1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.n2 n2Var : re1Var.getParentLayout().getFragmentStack()) {
                        if (n2Var instanceof cy) {
                            cy cyVar2 = (cy) n2Var;
                            if (cyVar2.f4()) {
                                MessagesStorage.TopicKey topicKey = cyVar2.f36141p2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    re1Var.Q0 = j13;
                    re1Var.U0(false, false);
                }
                og.d.m(re1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(re1 re1Var, View view, float f7) {
        if (re1Var.f41179t0 || re1Var.getParentLayout() == null || ((ActionBarLayout) re1Var.getParentLayout()).y()) {
            return false;
        }
        if (!re1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof oe1)) {
            oe1 oe1Var = (oe1) view;
            if (oe1Var.S(f7)) {
                re1Var.M0(oe1Var);
                re1Var.N.I0(true);
                re1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        re1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(re1 re1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = re1Var.N;
            } else {
                ne1 ne1Var = re1Var.f41176r0;
                if (ne1Var != null) {
                    viewGroup = ne1Var.U;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = re1Var.actionBar;
        if (kVar != null) {
            kVar.D(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8), true);
            re1Var.actionBar.E(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false, true);
            re1Var.actionBar.E(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true, true);
            re1Var.actionBar.F(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5), true);
        }
        v10 v10Var = re1Var.P0;
        if (v10Var != null) {
            v10Var.setForeground(new ColorDrawable(i0.a.o(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6), 100)));
        }
        re1Var.P0();
    }

    public static void b0(re1 re1Var, boolean z10) {
        float f7;
        boolean z11;
        ww wwVar;
        re1Var.f41178s0 = z10;
        ValueAnimator valueAnimator = re1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            re1Var.Y0.cancel();
        }
        if (re1Var.f41144a1 == null) {
            org.telegram.ui.Components.c91 n10 = re1Var.f41176r0.n(8, false);
            re1Var.f41144a1 = n10;
            if (re1Var.M0 != null) {
                n10.setBackgroundColor(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6));
            }
            re1Var.e.addView(re1Var.f41144a1, w7.z5.c(44.0f, -1));
        }
        float f10 = re1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        re1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(re1Var.f41176r0, false, 1.0f, true);
        cy cyVar = re1Var.M0;
        if (cyVar != null && (wwVar = cyVar.G3) != null) {
            wwVar.M = !z10;
        }
        if (!z10 && re1Var.f41176r0.getVisibility() == 0 && re1Var.f41176r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        re1Var.Z0 = z11;
        re1Var.Y0.addUpdateListener(new c11(re1Var, 15));
        re1Var.f41176r0.setVisibility(0);
        if (!z10) {
            re1Var.f41174q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(re1Var.getParentActivity(), re1Var.classGuid);
            re1Var.Q0(false);
        }
        re1Var.Y0.addListener(new ae1(re1Var, z10, 0));
        re1Var.Y0.setDuration(200L);
        re1Var.Y0.setInterpolator(org.telegram.ui.Components.bs.f25012f);
        re1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.kw0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.f41177s.isLoading(this.f41142a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f41145b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ie1) arrayList.get(0)).f37952c != null && ((ie1) arrayList.get(0)).f37952c.f20325id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ce1 ce1Var = this.N;
        if (ce1Var != null) {
            ce1Var.K0(ce1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        cy cyVar = this.M0;
        float f11 = 0.0f;
        if (cyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.us usVar = cyVar.J1;
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
                    f10 = usVar3.getMetadata().f17399c.f17407a;
                } else {
                    f10 = 0.0f;
                }
                usVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.us usVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.us usVar5 = this.M0.J1;
                if (usVar5 != null) {
                    f11 = usVar5.getMetadata().f17399c.f17407a;
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
        int i11 = this.f41154e1 + this.f41150c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f41143a0.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        b2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f41177s.findTopic(this.f41142a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(13));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7));
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

    public final void H0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f41142a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f41155f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f41155f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.N4(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long I() {
        return 0L;
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.c71 c71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f21225q7;
            }
            c71Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
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
        yd1 yd1Var = this.d;
        if (yd1Var != null) {
            if (z10) {
                yd1Var.setLayerType(2, null);
                yd1Var.setClipChildren(false);
                yd1Var.setClipToPadding(false);
            } else {
                yd1Var.setLayerType(0, null);
                yd1Var.setClipChildren(true);
                yd1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ce1 ce1Var = this.N;
            if (ce1Var != null) {
                float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
                ce1Var.setPivotX(0.0f);
                ce1Var.setPivotY(0.0f);
                ce1Var.setScaleX(D);
                ce1Var.setScaleY(D);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(D);
                this.actionBar.setScaleY(D);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        long j10;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.N;
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new xd1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(zoVar.f33000f);
        zoVar.f33008o = 1;
        long j11 = this.f41142a;
        long j12 = -j11;
        zoVar.d(j12, tL_forumTopic.f20325id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final re1 f41126b;

                {
                    this.f41126b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            re1 re1Var = this.f41126b;
                            re1Var.C0 = true;
                            re1Var.N0 = true;
                            TopicsController topicsController = re1Var.f41177s;
                            long j13 = re1Var.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20325id, !tL_forumTopic2.pinned, re1Var);
                            re1Var.finishPreviewFragment();
                            return;
                        case 1:
                            re1 re1Var2 = this.f41126b;
                            re1Var2.N0 = true;
                            TopicsController topicsController2 = re1Var2.f41177s;
                            long j14 = re1Var2.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20325id, true ^ tL_forumTopic3.closed);
                            re1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20325id));
                            re1 re1Var3 = this.f41126b;
                            re1Var3.D0(hashSet, new pd1(re1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f20325id)) {
            e1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new ci.d6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final re1 f41126b;

                {
                    this.f41126b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            re1 re1Var = this.f41126b;
                            re1Var.C0 = true;
                            re1Var.N0 = true;
                            TopicsController topicsController = re1Var.f41177s;
                            long j13 = re1Var.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20325id, !tL_forumTopic2.pinned, re1Var);
                            re1Var.finishPreviewFragment();
                            return;
                        case 1:
                            re1 re1Var2 = this.f41126b;
                            re1Var2.N0 = true;
                            TopicsController topicsController2 = re1Var2.f41177s;
                            long j14 = re1Var2.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20325id, true ^ tL_forumTopic3.closed);
                            re1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20325id));
                            re1 re1Var3 = this.f41126b;
                            re1Var3.D0(hashSet, new pd1(re1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21208p7));
            e1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7));
            e1Var4.setMinimumWidth(160);
            e1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final re1 f41126b;

                {
                    this.f41126b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            re1 re1Var = this.f41126b;
                            re1Var.C0 = true;
                            re1Var.N0 = true;
                            TopicsController topicsController = re1Var.f41177s;
                            long j13 = re1Var.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f20325id, !tL_forumTopic2.pinned, re1Var);
                            re1Var.finishPreviewFragment();
                            return;
                        case 1:
                            re1 re1Var2 = this.f41126b;
                            re1Var2.N0 = true;
                            TopicsController topicsController2 = re1Var2.f41177s;
                            long j14 = re1Var2.f41142a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f20325id, true ^ tL_forumTopic3.closed);
                            re1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20325id));
                            re1 re1Var3 = this.f41126b;
                            re1Var3.D0(hashSet, new pd1(re1Var3, 3));
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
        qn qnVar = new qn(zf.d0.b(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(r2Var.N.from_id);
        } else {
            j10 = r2Var.N.f20325id;
        }
        og.d.a(qnVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(qnVar, r32[0]);
    }

    public final void N0(View view) {
        oe1 oe1Var;
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
        if ((view instanceof oe1) && (tL_forumTopic = (oe1Var = (oe1) view).N) != null) {
            int i20 = tL_forumTopic.f20325id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f41143a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            oe1Var.V(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f41142a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.y j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f21889a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.f41149c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f41149c0.setTypeface(AndroidUtilities.bold());
                    this.f41149c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21377y8));
                    j11.addView(this.f41149c0, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f41149c0.setOnTouchListener(new sd1(0));
                    this.f41151d0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f41153e0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f41156f0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f41158g0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.u0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f41160h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f41162i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f41164j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f41166k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f41168l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f41177s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i21++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i24++;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i22++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i21 > 0) {
                    this.f41164j0.setVisibility(0);
                    this.f41164j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f41164j0.setVisibility(8);
                }
                if (i22 != 0) {
                    this.B0 = false;
                    this.f41156f0.setIcon(R.drawable.msg_unmute);
                    this.f41156f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f41156f0.setIcon(R.drawable.msg_mute);
                    this.f41156f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f41151d0;
                if (i23 == z10 && i24 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                u0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f41153e0;
                if (i24 == z10 && i23 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                u0Var2.setVisibility(i12);
                this.f41149c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i27++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f20325id == 1) {
                                if (findTopic2.hidden) {
                                    i29++;
                                } else {
                                    i28++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i25++;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f41166k0;
                if (i25 == 0 && i26 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                e1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.e1 e1Var2 = this.f41166k0;
                if (i26 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                e1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.e1 e1Var3 = this.f41168l0;
                if (i26 == 0 && i25 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                e1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.e1 e1Var4 = this.f41168l0;
                if (i25 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                e1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f41158g0;
                if (i27 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                u0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.u0 u0Var4 = this.f41160h0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                u0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f41162i0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i19 = 0;
                } else {
                    i19 = i10;
                }
                u0Var5.setVisibility(i19);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.s();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f41171n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
        this.h.g();
        j41 j41Var = this.f41172o0;
        int i10 = org.telegram.ui.ActionBar.h6.f20987d6;
        j41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21266s8));
        }
        this.f41176r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41142a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f41178s0 && !this.f41179t0 && !this.J0) {
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
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f41143a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f41146b0 != z10) {
            this.f41146b0 = z10;
            ge1 ge1Var = this.f41175r;
            ge1Var.q(0, ge1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21322v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21377y8;
        kVar.C(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.f21285t8), getThemedColor(org.telegram.ui.ActionBar.h6.f21394z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.f21266s8), getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6)));
        }
        float f10 = 1.0f - f7;
        this.f41155f.getTitleTextView().setAlpha(f10);
        this.f41155f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.c91 c91Var = this.f41144a1;
        if (c91Var != null) {
            c91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f41144a1.setAlpha(f7);
        }
        this.f41176r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f41176r0.setAlpha(f7);
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

    public final void T0() {
        ci.o5 o5Var = this.D0;
        if (o5Var != null && o5Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.ic_ab_other, 0);
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f41142a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        td1 td1Var;
        ee1 ee1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f41177s;
        long j10 = this.f41142a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f41145b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ee1 ee1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f41180u0) {
                arrayList.add(new ie1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f20325id))) {
                    arrayList.add(new ie1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new ie1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f41184x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ie1 ie1Var = (ie1) arrayList.get(i11);
                if (ie1Var != null && (tL_forumTopic = ie1Var.f37952c) != null && tL_forumTopic.hidden) {
                    this.f41184x++;
                }
            }
            ce1 ce1Var = this.N;
            if (ce1Var != null) {
                s4.l0 itemAnimator = ce1Var.getItemAnimator();
                if (z10) {
                    ee1Var = this.I0;
                } else {
                    ee1Var = null;
                }
                if (itemAnimator != ee1Var) {
                    ce1 ce1Var2 = this.N;
                    if (z10) {
                        ee1Var2 = this.I0;
                    }
                    ce1Var2.setItemAnimator(ee1Var2);
                }
            }
            ge1 ge1Var = this.f41175r;
            if (ge1Var != null) {
                ge1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (td1Var = this.F) != null) {
                td1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f41142a;
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        cy cyVar = this.M0;
        if (cyVar != null && cyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f41150c1 = i10;
        cy cyVar2 = this.M0;
        if (cyVar2 != null && cyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f41152d1 = i11;
        yd1 yd1Var = new yd1(this, context);
        this.d = yd1Var;
        this.fragmentView = yd1Var;
        yd1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!AndroidUtilities.isTablet() || ((d5Var2 = this.parentLayout) != null && ((ActionBarLayout) d5Var2).f20546b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.e.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new be1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final re1 f39844b;

            {
                this.f39844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        re1 re1Var = this.f39844b;
                        re1Var.presentFragment(nd1.a0(re1Var.f41142a, 0L));
                        return;
                    case 1:
                        re1 re1Var2 = this.f39844b;
                        re1Var2.getMessagesController().hidePeerSettingsBar(-re1Var2.f41142a, null, re1Var2.g());
                        re1Var2.O0(false);
                        return;
                    case 2:
                        re1 re1Var3 = this.f39844b;
                        if (!re1Var3.f41178s0) {
                            re1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f39844b.finishPreviewFragment();
                        return;
                    default:
                        cy cyVar3 = this.f39844b.M0;
                        if (cyVar3 != null && (u0Var = cyVar3.f36111j0) != null) {
                            u0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f41173p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final re1 f39844b;

                {
                    this.f39844b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            re1 re1Var = this.f39844b;
                            re1Var.presentFragment(nd1.a0(re1Var.f41142a, 0L));
                            return;
                        case 1:
                            re1 re1Var2 = this.f39844b;
                            re1Var2.getMessagesController().hidePeerSettingsBar(-re1Var2.f41142a, null, re1Var2.g());
                            re1Var2.O0(false);
                            return;
                        case 2:
                            re1 re1Var3 = this.f39844b;
                            if (!re1Var3.f41178s0) {
                                re1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f39844b.finishPreviewFragment();
                            return;
                        default:
                            cy cyVar3 = this.f39844b.M0;
                            if (cyVar3 != null && (u0Var = cyVar3.f36111j0) != null) {
                                u0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f41173p0 = a10;
            a10.F();
            a10.H = new ig.c2(this, 18);
            this.f41173p0.setSearchPaddingStart(56);
            this.f41173p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f41173p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.h6.Wd));
        }
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f41174q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f41174q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f41174q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.f41174q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.uj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.f41174q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f41174q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f41174q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, this, false, this.resourceProvider);
        this.f41155f = ooVar;
        ooVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.oo ooVar2 = this.f41155f;
        if ((!AndroidUtilities.isTablet() || ((d5Var = this.parentLayout) != null && ((ActionBarLayout) d5Var).f20546b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        ooVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.oo ooVar3 = this.f41155f;
        long j10 = -this.f41142a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ooVar3.f29040b = z12;
        ooVar3.setClipChildren(false);
        this.actionBar.addView(this.f41155f, 0, w7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f41179t0) {
            this.f41155f.getAvatarImageView().setOnClickListener(new b8(this, 3));
        }
        this.N = new ce1(this, context);
        ih.j jVar = new ih.j(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.f41163i1;
        bVar.f4358f = jVar;
        bVar.f4359g = viewGroup;
        ce1 ce1Var = this.N;
        cy cyVar3 = this.M0;
        if (cyVar3 != null) {
            viewGroup = (ViewGroup) cyVar3.getFragmentView();
        }
        ce1 ce1Var2 = this.N;
        Objects.requireNonNull(ce1Var2);
        this.f41165j1 = new bh.l(ce1Var, viewGroup, new x8(ce1Var2, 2));
        this.N.C0(new pd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        iw iwVar = new iw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f41182w = iwVar;
        iwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f41186y = i12;
        iw iwVar2 = this.f41182w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        iwVar2.X = z13;
        ee1 ee1Var = new ee1(this);
        this.N.setHideIfEmpty(false);
        ee1Var.f45946m = false;
        ee1Var.C = false;
        ce1 ce1Var3 = this.N;
        this.I0 = ee1Var;
        ce1Var3.setItemAnimator(ee1Var);
        this.N.setOnScrollListener(new ud1(this, 1));
        ce1 ce1Var4 = this.N;
        ce1Var4.W1 = true;
        ce1Var4.X1 = 0;
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(ce1Var4, true);
        this.K0 = nl0Var;
        this.N.setItemsEnterAnimator(nl0Var);
        this.N.setOnItemClickListener(new f11(this, 10));
        this.N.setOnItemLongClickListener(new qd1(this));
        this.N.setOnScrollListener(new ud1(this, 2));
        ce1 ce1Var5 = this.N;
        td1 td1Var = new td1(this);
        this.F = td1Var;
        ce1Var5.setLayoutManager(td1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f41175r);
        this.N.setClipToPadding(false);
        this.N.j(new ud1(this, 0));
        qe1 qe1Var = new qe1(this);
        this.P = qe1Var;
        vd1 vd1Var = new vd1(this, qe1Var);
        this.O = vd1Var;
        vd1Var.d(this.N);
        this.d.addView(this.N, w7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(getParentActivity(), this.resourceProvider, false);
        this.h = h20Var;
        this.d.addView(h20Var, org.telegram.ui.Components.h20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final re1 f39844b;

            {
                this.f39844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        re1 re1Var = this.f39844b;
                        re1Var.presentFragment(nd1.a0(re1Var.f41142a, 0L));
                        return;
                    case 1:
                        re1 re1Var2 = this.f39844b;
                        re1Var2.getMessagesController().hidePeerSettingsBar(-re1Var2.f41142a, null, re1Var2.g());
                        re1Var2.O0(false);
                        return;
                    case 2:
                        re1 re1Var3 = this.f39844b;
                        if (!re1Var3.f41178s0) {
                            re1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f39844b.finishPreviewFragment();
                        return;
                    default:
                        cy cyVar32 = this.f39844b.M0;
                        if (cyVar32 != null && (u0Var2 = cyVar32.f36111j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f26746c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f26746c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f26746c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(24);
        b10Var.setVisibility(8);
        b10Var.f24770w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f37580a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21375y6));
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
        this.f41170n = frameLayout;
        textView.setAlpha(0.0f);
        ci.o5 o5Var = new ci.o5(this, context, b10Var);
        this.D0 = o5Var;
        try {
            o5Var.f30351b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f41170n.addView(b10Var);
        this.f41170n.addView(this.D0);
        this.d.addView(this.f41170n);
        this.N.setEmptyView(this.f41170n);
        this.f41172o0 = new j41(context, 6);
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context);
        this.L = c71Var;
        this.f41172o0.addView(c71Var);
        this.d.addView(this.f41172o0, w7.z5.e(-1, 51, 80));
        this.L.setOnClickListener(new wd1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41171n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f41171n0.setVisibility(4);
        this.f41172o0.addView(this.f41171n0, w7.z5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.h6.f20993de;
        imageView2.setBackground(org.telegram.ui.ActionBar.x5.c(null, org.telegram.ui.ActionBar.x5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f41172o0.addView(this.W0, w7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final re1 f39844b;

            {
                this.f39844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        re1 re1Var = this.f39844b;
                        re1Var.presentFragment(nd1.a0(re1Var.f41142a, 0L));
                        return;
                    case 1:
                        re1 re1Var2 = this.f39844b;
                        re1Var2.getMessagesController().hidePeerSettingsBar(-re1Var2.f41142a, null, re1Var2.g());
                        re1Var2.O0(false);
                        return;
                    case 2:
                        re1 re1Var3 = this.f39844b;
                        if (!re1Var3.f41178s0) {
                            re1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f39844b.finishPreviewFragment();
                        return;
                    default:
                        cy cyVar32 = this.f39844b.M0;
                        if (cyVar32 != null && (u0Var2 = cyVar32.f36111j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        m0 m0Var = new m0(this, context, 25);
        this.e = m0Var;
        if (this.M0 == null) {
            this.d.addView(m0Var, w7.z5.e(-1, -1, 119));
        }
        ne1 ne1Var = new ne1(this, context);
        this.f41176r0 = ne1Var;
        ne1Var.setVisibility(8);
        this.e.addView(this.f41176r0, w7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ne1 ne1Var2 = this.f41176r0;
        int i14 = org.telegram.ui.ActionBar.h6.f20987d6;
        ne1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f41142a, true, null, true, false, 0);
        org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us(context);
        this.U0 = usVar;
        usVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.c.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new pd1(this, 0));
        this.d.addView(this.U0, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.z5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.f49839m = new qd1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f49836j = chatFull;
            if (chatFull != null) {
                dVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
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
        y0();
        v10 v10Var = new v10(this, context, 10);
        this.P0 = v10Var;
        v10Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final re1 f39844b;

            {
                this.f39844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        re1 re1Var = this.f39844b;
                        re1Var.presentFragment(nd1.a0(re1Var.f41142a, 0L));
                        return;
                    case 1:
                        re1 re1Var2 = this.f39844b;
                        re1Var2.getMessagesController().hidePeerSettingsBar(-re1Var2.f41142a, null, re1Var2.g());
                        re1Var2.O0(false);
                        return;
                    case 2:
                        re1 re1Var3 = this.f39844b;
                        if (!re1Var3.f41178s0) {
                            re1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f39844b.finishPreviewFragment();
                        return;
                    default:
                        cy cyVar32 = this.f39844b.M0;
                        if (cyVar32 != null && (u0Var2 = cyVar32.f36111j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
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
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) it.next();
                if (n2Var instanceof cy) {
                    cy cyVar4 = (cy) n2Var;
                    if (cyVar4.f4()) {
                        MessagesStorage.TopicKey topicKey = cyVar4.f36141p2;
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
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new v3(this, 24));
        }
        View view = this.fragmentView;
        qd1 qd1Var = new qd1(this);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(view, qd1Var);
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
        long j10 = this.f41142a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f20274id == j10) {
                O0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f49836j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
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
        return getMessagesController().getChat(Long.valueOf(this.f41142a));
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
        org.telegram.ui.Components.im0 im0Var;
        zx0 zx0Var = new zx0(8, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20987d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21266s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21322v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21285t8));
        ne1 ne1Var = this.f41176r0;
        if (ne1Var != null && (im0Var = ne1Var.U) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, im0Var);
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
        if (this.f41178s0) {
            i10 = org.telegram.ui.ActionBar.h6.f20987d6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21266s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21341w8);
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
    public final org.telegram.ui.Components.oo o() {
        return this.f41155f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f41143a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f41178s0) {
            if (z10) {
                this.actionBar.w(this.f41173p0.L(false));
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
            kVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41142a;
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
        x51.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f41141n1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f41142a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        cy cyVar = this.M0;
        if (cyVar != null && cyVar.G3 != null) {
            cyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.G3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f41142a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f41142a;
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
            L0(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ww wwVar;
        v10 v10Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (v10Var = this.P0) != null) {
            if (v10Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f41179t0 && this.H) {
                removeSelfFromStack();
                cy cyVar = this.L0;
                if (cyVar != null) {
                    cyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                cy cyVar2 = this.M0;
                if (cyVar2 != null && (wwVar = cyVar2.G3) != null && wwVar.c()) {
                    this.M0.G3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        v10 v10Var = this.P0;
        if (v10Var != null && v10Var.getVisibility() == 0) {
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
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            K0(true);
            return;
        }
        this.T0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f41155f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f41174q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41173p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f41155f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f41155f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final void t() {
        this.N.x0(0);
    }

    public final void x0() {
        bh.f fVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f41157f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            cy cyVar = this.M0;
            if (cyVar != null) {
                view = cyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (cyVar != null) {
                kVar = cyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f41154e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f41169m1;
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
            fVar.g(i10, this.f41167k1);
            fVar.e(this.f41165j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void y0() {
        td1 td1Var;
        TopicsController topicsController = this.f41177s;
        long j10 = this.f41142a;
        if (!topicsController.endIsReached(j10) && (td1Var = this.F) != null) {
            int N0 = td1Var.N0();
            if (this.f41145b.isEmpty() || N0 >= this.f41175r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    @Override
    public final gh.d z() {
        return this.f41161h1;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41142a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f41187y0) != null || this.f41188z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f41187y0 = null;
            this.f41188z0 = false;
        } else if (this.f41187y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.f41187y0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
