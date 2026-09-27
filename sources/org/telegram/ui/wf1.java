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
public class wf1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ch, ah0 {
    public static final HashSet f39286n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ai.d7 D0;
    public boolean E;
    public kf1 E0;
    public ye1 F;
    public FrameLayout F0;
    public boolean G;
    public b9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public jf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.dl0 K0;
    public org.telegram.ui.Components.v61 L;
    public ty L0;
    public int M;
    public ty M0;
    public hf1 N;
    public boolean N0;
    public af1 O;
    public final AnimationNotificationsLocker O0;
    public vf1 P;
    public q50 P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public wh.d R0;
    public org.telegram.ui.ActionBar.g1 S;
    public float S0;
    public org.telegram.ui.ActionBar.g1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.g1 U;
    public org.telegram.ui.Components.ms U0;
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
    public final long f39287a;
    public final HashSet f39288a0;
    public org.telegram.ui.Components.x81 f39289a1;
    public final ArrayList f39290b;
    public boolean f39291b0;
    public View f39292b1;
    public int f39293c;
    public NumberTextView f39294c0;
    public int f39295c1;
    public df1 d;
    public org.telegram.ui.ActionBar.w0 f39296d0;
    public int f39297d1;
    public l0 e;
    public org.telegram.ui.ActionBar.w0 f39298e0;
    public int f39299e1;
    public org.telegram.ui.Components.go f39300f;
    public org.telegram.ui.ActionBar.w0 f39301f0;
    public final ah.i f39302f1;
    public org.telegram.ui.ActionBar.w0 f39303g0;
    public final fh.d f39304g1;
    public org.telegram.ui.Components.b20 h;
    public org.telegram.ui.ActionBar.w0 f39305h0;
    public final fh.d f39306h1;
    public org.telegram.ui.ActionBar.w0 f39307i0;
    public final ah.c f39308i1;
    public org.telegram.ui.ActionBar.g1 f39309j0;
    public ah.n f39310j1;
    public org.telegram.ui.ActionBar.g1 f39311k0;
    public final ArrayList f39312k1;
    public org.telegram.ui.ActionBar.g1 f39313l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.w0 m0;
    public final RectF f39314m1;
    public mf1 f39315n;
    public RadialProgressView f39316n0;
    public n41 f39317o0;
    public org.telegram.ui.ActionBar.w0 f39318p0;
    public org.telegram.ui.ActionBar.w0 f39319q0;
    public final lf1 f39320r;
    public sf1 f39321r0;
    public final TopicsController f39322s;
    public boolean f39323s0;
    public final boolean f39324t0;
    public final boolean f39325u0;
    public xf1 v;
    public final boolean f39326v0;
    public ww f39327w;
    public final boolean f39328w0;
    public int f39329x;
    public final boolean f39330x0;
    public int f39331y;
    public String f39332y0;
    public boolean f39333z0;

    public wf1(Bundle bundle) {
        super(bundle);
        this.f39290b = new ArrayList();
        new ArrayList();
        this.f39320r = new lf1(this);
        this.f39329x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f39288a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f39312k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f39314m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f39287a = j3;
        this.f39324t0 = this.arguments.getBoolean("for_select", false);
        this.f39325u0 = this.arguments.getBoolean("forward_to", false);
        this.f39330x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f39326v0 = this.arguments.getBoolean("quote", false);
        this.f39328w0 = this.arguments.getBoolean("reply_to", false);
        this.f39332y0 = this.arguments.getString("voicechat", null);
        this.f39333z0 = this.arguments.getBoolean("videochat", false);
        this.f39322s = getMessagesController().getTopicsController();
        this.V0 = !org.telegram.messenger.l0.u("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f39302f1 = new ah.i();
            this.f39304g1 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f39306h1 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f39308i1 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            return;
        }
        this.f39302f1 = null;
        this.f39304g1 = null;
        this.f39306h1 = null;
        this.f39308i1 = new ah.c(cVar);
    }

    public static org.telegram.ui.ActionBar.o2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new xn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new xn(bundle);
            }
        }
        return new wf1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.xn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf1.I0(org.telegram.ui.xn):void");
    }

    public static boolean U(wf1 wf1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wf1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-wf1Var.f39287a), System.currentTimeMillis()).commit();
        Activity parentActivity = wf1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(wf1Var.g());
        int i10 = org.telegram.ui.Components.t80.f28512r;
        org.telegram.ui.Components.t80.w(parentActivity, wf1Var, org.telegram.ui.Components.xc.a0(wf1Var), isChannelAndNotMegaGroup);
        wf1Var.O0(true);
        return false;
    }

    public static void V(wf1 wf1Var, View view) {
        long j3;
        long j10 = wf1Var.f39287a;
        if (wf1Var.getParentLayout() != null && !((ActionBarLayout) wf1Var.getParentLayout()).y() && (view instanceof tf1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((tf1) view).N;
            long j11 = -j10;
            boolean isMonoForum = wf1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f18381id;
            }
            long j12 = j3;
            if (wf1Var.f39324t0) {
                xf1 xf1Var = wf1Var.v;
                if (xf1Var != null) {
                    zf1 zf1Var = xf1Var.f39640a;
                    Bundle bundle = new Bundle();
                    cg1 cg1Var = zf1Var.f40497a;
                    bundle.putLong("dialog_id", cg1Var.f32718c);
                    bundle.putLong("topic_id", tL_forumTopic.f18381id);
                    bundle.putBoolean("exception", true);
                    p11 p11Var = new p11(bundle, null);
                    p11Var.f36297r = new gs0(18, zf1Var, tL_forumTopic);
                    cg1Var.presentFragment(p11Var);
                }
                ty tyVar = wf1Var.L0;
                if (tyVar != null) {
                    tyVar.X3(j11, j12, true, wf1Var);
                }
            } else if (wf1Var.f39288a0.size() > 0) {
                wf1Var.N0(view);
            } else {
                if (wf1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : wf1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof ty) {
                            ty tyVar2 = (ty) o2Var;
                            if (tyVar2.q4()) {
                                MessagesStorage.TopicKey topicKey = tyVar2.f38031p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    wf1Var.Q0 = j12;
                    wf1Var.U0(false, false);
                }
                ng.d.m(wf1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(wf1 wf1Var, View view, float f7) {
        if (wf1Var.f39324t0 || wf1Var.getParentLayout() == null || ((ActionBarLayout) wf1Var.getParentLayout()).y()) {
            return false;
        }
        if (!wf1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof tf1)) {
            tf1 tf1Var = (tf1) view;
            if (tf1Var.S(f7)) {
                wf1Var.M0(tf1Var);
                wf1Var.N.J0(true);
                wf1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        wf1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(wf1 wf1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = wf1Var.N;
            } else {
                sf1 sf1Var = wf1Var.f39321r0;
                if (sf1Var != null) {
                    viewGroup = sf1Var.V;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.l lVar = wf1Var.actionBar;
        if (lVar != null) {
            lVar.F(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8), true);
            wf1Var.actionBar.G(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false, true);
            wf1Var.actionBar.G(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true, true);
            wf1Var.actionBar.H(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5), true);
        }
        q50 q50Var = wf1Var.P0;
        if (q50Var != null && Build.VERSION.SDK_INT >= 23) {
            q50Var.setForeground(new ColorDrawable(i0.a.k(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6), 100)));
        }
        wf1Var.P0();
    }

    public static void b0(wf1 wf1Var, boolean z10) {
        float f7;
        boolean z11;
        kx kxVar;
        wf1Var.f39323s0 = z10;
        ValueAnimator valueAnimator = wf1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            wf1Var.Y0.cancel();
        }
        if (wf1Var.f39289a1 == null) {
            org.telegram.ui.Components.x81 n10 = wf1Var.f39321r0.n(8, false);
            wf1Var.f39289a1 = n10;
            if (wf1Var.M0 != null) {
                n10.setBackgroundColor(wf1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
            }
            wf1Var.e.addView(wf1Var.f39289a1, w7.y5.c(44.0f, -1));
        }
        float f10 = wf1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        wf1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(wf1Var.f39321r0, false, 1.0f, true);
        ty tyVar = wf1Var.M0;
        if (tyVar != null && (kxVar = tyVar.F3) != null) {
            kxVar.M = !z10;
        }
        if (!z10 && wf1Var.f39321r0.getVisibility() == 0 && wf1Var.f39321r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        wf1Var.Z0 = z11;
        wf1Var.Y0.addUpdateListener(new b21(wf1Var, 16));
        wf1Var.f39321r0.setVisibility(0);
        if (!z10) {
            wf1Var.f39319q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(wf1Var.getParentActivity(), wf1Var.classGuid);
            wf1Var.Q0(false);
        }
        wf1Var.Y0.addListener(new ff1(wf1Var, z10, 0));
        wf1Var.Y0.setDuration(200L);
        wf1Var.Y0.setInterpolator(org.telegram.ui.Components.sr.f28359f);
        wf1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f39322s.isLoading(this.f39287a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f39290b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((nf1) arrayList.get(0)).f35983c != null && ((nf1) arrayList.get(0)).f35983c.f18381id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        hf1 hf1Var = this.N;
        if (hf1Var != null) {
            hf1Var.L0(hf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        ty tyVar = this.M0;
        float f11 = 0.0f;
        if (tyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ms msVar = tyVar.J1;
            if (msVar != null) {
                f7 = msVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.ms msVar2 = this.U0;
            if (msVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ms msVar3 = this.M0.J1;
                if (msVar3 != null) {
                    f10 = msVar3.getMetadata().f14218c.f14226a;
                } else {
                    f10 = 0.0f;
                }
                msVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.ms msVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ms msVar5 = this.M0.J1;
                if (msVar5 != null) {
                    f11 = msVar5.getMetadata().f14218c.f14226a;
                }
                f11 = msVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.ms msVar6 = this.U0;
            if (msVar6 != null) {
                f11 = 0.0f + msVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f39299e1 + this.f39295c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f39288a0.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f39322s.findTopic(this.f39287a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(27));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
        }
    }

    @Override
    public final boolean G() {
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
        bundle.putLong("chat_id", this.f39287a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f39300f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f39300f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.v61 v61Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f19297q7;
            }
            v61Var.setTextColorKey(i11);
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
        df1 df1Var = this.d;
        if (df1Var != null) {
            if (z10) {
                df1Var.setLayerType(2, null);
                df1Var.setClipChildren(false);
                df1Var.setClipToPadding(false);
            } else {
                df1Var.setLayerType(0, null);
                df1Var.setClipChildren(true);
                df1Var.setClipToPadding(true);
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
            hf1 hf1Var = this.N;
            if (hf1Var != null) {
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
                hf1Var.setPivotX(0.0f);
                hf1Var.setPivotY(0.0f);
                hf1Var.setScaleX(b10);
                hf1Var.setScaleY(b10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(b10);
                this.actionBar.setScaleY(b10);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.s2 s2Var) {
        long j3;
        try {
            s2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = s2Var.N;
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new cf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(roVar.f28048f);
        roVar.f28056o = 1;
        long j10 = this.f39287a;
        long j11 = -j10;
        roVar.d(j11, tL_forumTopic.f18381id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final wf1 f38925b;

                {
                    this.f38925b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            wf1 wf1Var = this.f38925b;
                            wf1Var.C0 = true;
                            wf1Var.N0 = true;
                            TopicsController topicsController = wf1Var.f39322s;
                            long j12 = wf1Var.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18381id, !tL_forumTopic2.pinned, wf1Var);
                            wf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            wf1 wf1Var2 = this.f38925b;
                            wf1Var2.N0 = true;
                            TopicsController topicsController2 = wf1Var2.f39322s;
                            long j13 = wf1Var2.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18381id, true ^ tL_forumTopic3.closed);
                            wf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18381id));
                            wf1 wf1Var3 = this.f38925b;
                            wf1Var3.D0(hashSet, new ue1(wf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f18381id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new ai.t7(this, tL_forumTopic, (Serializable) r32, b10, 6));
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
                public final wf1 f38925b;

                {
                    this.f38925b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            wf1 wf1Var = this.f38925b;
                            wf1Var.C0 = true;
                            wf1Var.N0 = true;
                            TopicsController topicsController = wf1Var.f39322s;
                            long j12 = wf1Var.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18381id, !tL_forumTopic2.pinned, wf1Var);
                            wf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            wf1 wf1Var2 = this.f38925b;
                            wf1Var2.N0 = true;
                            TopicsController topicsController2 = wf1Var2.f39322s;
                            long j13 = wf1Var2.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18381id, true ^ tL_forumTopic3.closed);
                            wf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18381id));
                            wf1 wf1Var3 = this.f38925b;
                            wf1Var3.D0(hashSet, new ue1(wf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19278p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final wf1 f38925b;

                {
                    this.f38925b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            wf1 wf1Var = this.f38925b;
                            wf1Var.C0 = true;
                            wf1Var.N0 = true;
                            TopicsController topicsController = wf1Var.f39322s;
                            long j12 = wf1Var.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18381id, !tL_forumTopic2.pinned, wf1Var);
                            wf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            wf1 wf1Var2 = this.f38925b;
                            wf1Var2.N0 = true;
                            TopicsController topicsController2 = wf1Var2.f39322s;
                            long j13 = wf1Var2.f39287a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18381id, true ^ tL_forumTopic3.closed);
                            wf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18381id));
                            wf1 wf1Var3 = this.f38925b;
                            wf1Var3.D0(hashSet, new ue1(wf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.y5.c(-1.0f, -1));
        }
        xn xnVar = new xn(v7.k0.e(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(s2Var.N.from_id);
        } else {
            j3 = s2Var.N.f18381id;
        }
        ng.d.a(xnVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(xnVar, r32[0]);
    }

    public final void N0(View view) {
        tf1 tf1Var;
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
        if ((view instanceof tf1) && (tL_forumTopic = (tf1Var = (tf1) view).N) != null) {
            int i19 = tL_forumTopic.f18381id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.f39288a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            tf1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f39287a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.a0 k10 = this.actionBar.k(null);
                    if (this.inPreviewMode) {
                        k10.setBackgroundColor(0);
                        k10.f18659a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(k10.getContext());
                    this.f39294c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f39294c0.setTypeface(AndroidUtilities.bold());
                    this.f39294c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19444y8));
                    k10.addView(this.f39294c0, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f39294c0.setOnTouchListener(new xe1(0));
                    this.f39296d0 = k10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f39298e0 = k10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f39301f0 = k10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f39303g0 = k10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = k10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f39305h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = k10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f39307i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = k10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f39309j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f39311k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f39313l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.P(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f39322s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, intValue);
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
                    if (getMessagesController().isDialogMuted(-j3, intValue)) {
                        i21++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i20 > 0) {
                    this.f39309j0.setVisibility(0);
                    this.f39309j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f39309j0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.B0 = false;
                    this.f39301f0.setIcon(R.drawable.msg_unmute);
                    this.f39301f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f39301f0.setIcon(R.drawable.msg_mute);
                    this.f39301f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f39296d0;
                if (i22 == z10 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f39298e0;
                if (i23 == z10 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.f39294c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j3, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i26++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f18381id == 1) {
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
                org.telegram.ui.ActionBar.g1 g1Var = this.f39311k0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f39311k0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f39313l0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f39313l0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f39303g0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f39305h0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f39307i0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w0Var5.setVisibility(i18);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.s();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f39316n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ae));
        this.h.g();
        n41 n41Var = this.f39317o0;
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        n41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19337s8));
        }
        this.f39321r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f39287a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f39323s0 && !this.f39324t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.g1 g1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f39288a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f39291b0 != z10) {
            this.f39291b0 = z10;
            lf1 lf1Var = this.f39320r;
            lf1Var.q(0, lf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f19392v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19444y8;
        lVar.E(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.E(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.i6.f19356t8), getThemedColor(org.telegram.ui.ActionBar.i6.f19463z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.i6.f19337s8), getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6)));
        }
        float f10 = 1.0f - f7;
        this.f39300f.getTitleTextView().setAlpha(f10);
        this.f39300f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.x81 x81Var = this.f39289a1;
        if (x81Var != null) {
            x81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f39289a1.setAlpha(f7);
        }
        this.f39321r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f39321r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    public final void T0() {
        ai.d7 d7Var = this.D0;
        if (d7Var != null && d7Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.ic_ab_other, 0);
            qqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f39287a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        ye1 ye1Var;
        jf1 jf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f39322s;
        long j3 = this.f39287a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f39290b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            jf1 jf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f39325u0) {
                arrayList.add(new nf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f18381id))) {
                    arrayList.add(new nf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new nf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f39329x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                nf1 nf1Var = (nf1) arrayList.get(i11);
                if (nf1Var != null && (tL_forumTopic = nf1Var.f35983c) != null && tL_forumTopic.hidden) {
                    this.f39329x++;
                }
            }
            hf1 hf1Var = this.N;
            if (hf1Var != null) {
                s4.m0 itemAnimator = hf1Var.getItemAnimator();
                if (z10) {
                    jf1Var = this.I0;
                } else {
                    jf1Var = null;
                }
                if (itemAnimator != jf1Var) {
                    hf1 hf1Var2 = this.N;
                    if (z10) {
                        jf1Var2 = this.I0;
                    }
                    hf1Var2.setItemAnimator(jf1Var2);
                }
            }
            lf1 lf1Var = this.f39320r;
            if (lf1Var != null) {
                lf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (ye1Var = this.F) != null) {
                ye1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f39287a;
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
        ty tyVar = this.M0;
        if (tyVar != null && tyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f39295c1 = i10;
        ty tyVar2 = this.M0;
        if (tyVar2 != null && tyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f39297d1 = i11;
        df1 df1Var = new df1(this, context);
        this.d = df1Var;
        this.fragmentView = df1Var;
        df1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
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
        hg.k0.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new gf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 f37767b;

            {
                this.f37767b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        wf1 wf1Var = this.f37767b;
                        wf1Var.presentFragment(se1.a0(wf1Var.f39287a, 0L));
                        return;
                    case 1:
                        wf1 wf1Var2 = this.f37767b;
                        wf1Var2.getMessagesController().hidePeerSettingsBar(-wf1Var2.f39287a, null, wf1Var2.g());
                        wf1Var2.O0(false);
                        return;
                    case 2:
                        wf1 wf1Var3 = this.f37767b;
                        if (!wf1Var3.f39323s0) {
                            wf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37767b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar3 = this.f37767b.M0;
                        if (tyVar3 != null && (w0Var = tyVar3.f38002j0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a0 o9 = this.actionBar.o();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = o9.a(0, R.drawable.outline_header_search);
            this.f39318p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final wf1 f37767b;

                {
                    this.f37767b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            wf1 wf1Var = this.f37767b;
                            wf1Var.presentFragment(se1.a0(wf1Var.f39287a, 0L));
                            return;
                        case 1:
                            wf1 wf1Var2 = this.f37767b;
                            wf1Var2.getMessagesController().hidePeerSettingsBar(-wf1Var2.f39287a, null, wf1Var2.g());
                            wf1Var2.O0(false);
                            return;
                        case 2:
                            wf1 wf1Var3 = this.f37767b;
                            if (!wf1Var3.f39323s0) {
                                wf1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f37767b.finishPreviewFragment();
                            return;
                        default:
                            ty tyVar3 = this.f37767b.M0;
                            if (tyVar3 != null && (w0Var = tyVar3.f38002j0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = o9.a(0, R.drawable.outline_header_search);
            this.f39318p0 = a10;
            a10.F();
            a10.H = new hg.d2(this, 19);
            this.f39318p0.setSearchPaddingStart(56);
            this.f39318p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f39318p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.i6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c10 = o9.c(0, R.drawable.ic_ab_other, null);
        this.f39319q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f39319q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f39319q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f39319q0;
        this.T = w0Var.d(14, 0, new org.telegram.ui.Components.kj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.m0);
        this.Q = this.f39319q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f39319q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f39319q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(context, this, false, this.resourceProvider);
        this.f39300f = goVar;
        goVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.go goVar2 = this.f39300f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        goVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.go goVar3 = this.f39300f;
        long j3 = -this.f39287a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        goVar3.f24607b = z12;
        goVar3.setClipChildren(false);
        this.actionBar.addView(this.f39300f, 0, w7.y5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f39324t0) {
            this.f39300f.getAvatarImageView().setOnClickListener(new b8(this, 3));
        }
        this.N = new hf1(this, context);
        hh.k kVar = new hh.k(this.d);
        ViewGroup viewGroup = this.d;
        ah.c cVar = this.f39308i1;
        cVar.f425f = kVar;
        cVar.f426g = viewGroup;
        hf1 hf1Var = this.N;
        ty tyVar3 = this.M0;
        if (tyVar3 != null) {
            viewGroup = (ViewGroup) tyVar3.getFragmentView();
        }
        hf1 hf1Var2 = this.N;
        Objects.requireNonNull(hf1Var2);
        this.f39310j1 = new ah.n(hf1Var, viewGroup, new us(hf1Var2, 2));
        this.N.D0(new ue1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ng.c c11 = ng.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        ww wwVar = new ww(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f39327w = wwVar;
        wwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f39331y = i12;
        ww wwVar2 = this.f39327w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        wwVar2.X = z13;
        jf1 jf1Var = new jf1(this);
        this.N.setHideIfEmpty(false);
        jf1Var.f43040m = false;
        jf1Var.C = false;
        hf1 hf1Var3 = this.N;
        this.I0 = jf1Var;
        hf1Var3.setItemAnimator(jf1Var);
        this.N.setOnScrollListener(new ze1(this, 1));
        hf1 hf1Var4 = this.N;
        hf1Var4.Y1 = true;
        hf1Var4.Z1 = 0;
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(hf1Var4, true);
        this.K0 = dl0Var;
        this.N.setItemsEnterAnimator(dl0Var);
        this.N.setOnItemClickListener(new t21(this, 10));
        this.N.setOnItemLongClickListener(new ve1(this));
        this.N.setOnScrollListener(new ze1(this, 2));
        hf1 hf1Var5 = this.N;
        ye1 ye1Var = new ye1(this);
        this.F = ye1Var;
        hf1Var5.setLayoutManager(ye1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f39320r);
        this.N.setClipToPadding(false);
        this.N.j(new ze1(this, 0));
        vf1 vf1Var = new vf1(this);
        this.P = vf1Var;
        af1 af1Var = new af1(this, vf1Var);
        this.O = af1Var;
        af1Var.e(this.N);
        this.d.addView(this.N, w7.y5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.b20 b20Var = new org.telegram.ui.Components.b20(getParentActivity(), this.resourceProvider, false);
        this.h = b20Var;
        this.d.addView(b20Var, org.telegram.ui.Components.b20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 f37767b;

            {
                this.f37767b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        wf1 wf1Var = this.f37767b;
                        wf1Var.presentFragment(se1.a0(wf1Var.f39287a, 0L));
                        return;
                    case 1:
                        wf1 wf1Var2 = this.f37767b;
                        wf1Var2.getMessagesController().hidePeerSettingsBar(-wf1Var2.f39287a, null, wf1Var2.g());
                        wf1Var2.O0(false);
                        return;
                    case 2:
                        wf1 wf1Var3 = this.f37767b;
                        if (!wf1Var3.f39323s0) {
                            wf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37767b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f37767b.M0;
                        if (tyVar32 != null && (w0Var2 = tyVar32.f38002j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f22881c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f22881c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f22881c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        v00Var.setViewType(24);
        v00Var.setVisibility(8);
        v00Var.f28982w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f35685a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.qq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.qq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19442y6));
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
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f39315n = frameLayout;
        textView.setAlpha(0.0f);
        ai.d7 d7Var = new ai.d7(this, context, v00Var);
        this.D0 = d7Var;
        try {
            d7Var.f25879b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f39315n.addView(v00Var);
        this.f39315n.addView(this.D0);
        this.d.addView(this.f39315n);
        this.N.setEmptyView(this.f39315n);
        this.f39317o0 = new n41(context, 7);
        org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(context);
        this.L = v61Var;
        this.f39317o0.addView(v61Var);
        this.d.addView(this.f39317o0, w7.y5.e(-1, 51, 80));
        this.L.setOnClickListener(new bf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39316n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f39316n0.setVisibility(4);
        this.f39317o0.addView(this.f39316n0, w7.y5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.i6.f19065de;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f39317o0.addView(this.W0, w7.y5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 f37767b;

            {
                this.f37767b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        wf1 wf1Var = this.f37767b;
                        wf1Var.presentFragment(se1.a0(wf1Var.f39287a, 0L));
                        return;
                    case 1:
                        wf1 wf1Var2 = this.f37767b;
                        wf1Var2.getMessagesController().hidePeerSettingsBar(-wf1Var2.f39287a, null, wf1Var2.g());
                        wf1Var2.O0(false);
                        return;
                    case 2:
                        wf1 wf1Var3 = this.f37767b;
                        if (!wf1Var3.f39323s0) {
                            wf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37767b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f37767b.M0;
                        if (tyVar32 != null && (w0Var2 = tyVar32.f38002j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        l0 l0Var = new l0(this, context, 24);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.y5.e(-1, -1, 119));
        }
        sf1 sf1Var = new sf1(this, context);
        this.f39321r0 = sf1Var;
        sf1Var.setVisibility(8);
        this.e.addView(this.f39321r0, w7.y5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        sf1 sf1Var2 = this.f39321r0;
        int i14 = org.telegram.ui.ActionBar.i6.f19057d6;
        sf1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f39287a, true, null, true, false, 0);
        org.telegram.ui.Components.ms msVar = new org.telegram.ui.Components.ms(context);
        this.U0 = msVar;
        msVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ch.d c12 = cVar.c(this.U0, eh.b.o(this.resourceProvider), false);
        c12.w(AndroidUtilities.dp(24.0f));
        c12.v(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new ue1(this, 0));
        this.d.addView(this.U0, w7.y5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            wh.d dVar = new wh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.y5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            wh.d dVar2 = this.R0;
            dVar2.f45407m = new ve1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f45404j = chatFull;
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
            b9 b9Var = new b9(this, context, this);
            this.G0 = b9Var;
            this.F0.addView(b9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.y5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        y0();
        q50 q50Var = new q50(this, context, 10);
        this.P0 = q50Var;
        if (Build.VERSION.SDK_INT >= 23) {
            q50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        }
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 f37767b;

            {
                this.f37767b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        wf1 wf1Var = this.f37767b;
                        wf1Var.presentFragment(se1.a0(wf1Var.f39287a, 0L));
                        return;
                    case 1:
                        wf1 wf1Var2 = this.f37767b;
                        wf1Var2.getMessagesController().hidePeerSettingsBar(-wf1Var2.f39287a, null, wf1Var2.g());
                        wf1Var2.O0(false);
                        return;
                    case 2:
                        wf1 wf1Var3 = this.f37767b;
                        if (!wf1Var3.f39323s0) {
                            wf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37767b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f37767b.M0;
                        if (tyVar32 != null && (w0Var2 = tyVar32.f38002j0) != null) {
                            w0Var2.performClick();
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof ty) {
                    ty tyVar4 = (ty) o2Var;
                    if (tyVar4.q4()) {
                        MessagesStorage.TopicKey topicKey = tyVar4.f38031p2;
                        if (topicKey.dialogId == j3) {
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
            getMessagesController().getBoostsController().getBoostsStats(j3, new u3(this, 26));
        }
        View view = this.fragmentView;
        ve1 ve1Var = new ve1(this);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(view, ve1Var);
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
        long j3 = this.f39287a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f18330id == j3) {
                O0(false);
                wh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f45404j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j3 == ((Long) objArr[0]).longValue()) {
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
                getMessagesController().getTopicsController().sortTopics(j3, false);
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
            if (j3 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                b9 b9Var = this.G0;
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
            if (longValue == (-j3) && !booleanValue) {
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
        return getMessagesController().getChat(Long.valueOf(this.f39287a));
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
        org.telegram.ui.Components.yl0 yl0Var;
        qy0 qy0Var = new qy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        sf1 sf1Var = this.f39321r0;
        if (sf1Var != null && (yl0Var = sf1Var.V) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, yl0Var);
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
        if (this.f39323s0) {
            i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f19337s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f19410w8);
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
    public final boolean m() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.go n() {
        return this.f39300f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f39288a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f39323s0) {
            if (z10) {
                this.actionBar.w(this.f39318p0.L(false));
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
            lVar.h();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.f39287a;
        messagesController.loadFullChat(j3, 0, true);
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
        c71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f39286n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j3);
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f39287a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        ty tyVar = this.M0;
        if (tyVar != null && tyVar.F3 != null) {
            tyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f39287a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f39287a;
        topicsController.onTopicFragmentResume(j3);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new c9(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j3)) {
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
        kx kxVar;
        q50 q50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (q50Var = this.P0) != null) {
            if (q50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f39324t0 && this.H) {
                removeSelfFromStack();
                ty tyVar = this.L0;
                if (tyVar != null) {
                    tyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                ty tyVar2 = this.M0;
                if (tyVar2 != null && (kxVar = tyVar2.F3) != null && kxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        q50 q50Var = this.P0;
        if (q50Var != null && q50Var.getVisibility() == 0) {
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
    public final void r() {
        this.N.y0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.go goVar = this.f39300f;
        if (goVar != null) {
            goVar.setAlpha(f7);
            this.f39319q0.setAlpha(f7);
            org.telegram.ui.ActionBar.w0 w0Var = this.f39318p0;
            if (w0Var != null) {
                w0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.go goVar = this.f39300f;
        if (goVar != null) {
            goVar.setAlpha(f7);
            this.f39300f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final fh.d x() {
        return this.f39306h1;
    }

    public final void x0() {
        ah.i iVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f39302f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            ty tyVar = this.M0;
            if (tyVar != null) {
                view = tyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (tyVar != null) {
                lVar = tyVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f39299e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), lVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f39314m1;
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
            iVar.g(i10, this.f39312k1);
            iVar.e(this.f39310j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final org.telegram.ui.Components.cw0 y() {
        return this.d;
    }

    public final void y0() {
        ye1 ye1Var;
        TopicsController topicsController = this.f39322s;
        long j3 = this.f39287a;
        if (!topicsController.endIsReached(j3) && (ye1Var = this.F) != null) {
            int N0 = ye1Var.N0();
            if (this.f39290b.isEmpty() || N0 >= this.f39320r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f39287a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f39332y0) != null || this.f39333z0)) {
            org.telegram.ui.Components.voip.g2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f39332y0 = null;
            this.f39333z0 = false;
        } else if (this.f39332y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.l0.o(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.f39332y0 = null;
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
