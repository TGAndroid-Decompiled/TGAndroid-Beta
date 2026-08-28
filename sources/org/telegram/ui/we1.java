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
public class we1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.rg, mg0 {
    public static final HashSet f43740j1 = new HashSet();
    public boolean A;
    public je1 A0;
    public xd1 B;
    public FrameLayout B0;
    public boolean C;
    public w8 C0;
    public boolean D;
    public ChatObject.Call D0;
    public boolean E;
    public ie1 E0;
    public TLRPC.ChatFull F;
    public boolean F0;
    public boolean G;
    public org.telegram.ui.Components.dk0 G0;
    public org.telegram.ui.Components.k51 H;
    public dy H0;
    public int I;
    public dy I0;
    public ge1 J;
    public boolean J0;
    public zd1 K;
    public final AnimationNotificationsLocker K0;
    public ve1 L;
    public yi0 L0;
    public org.telegram.ui.ActionBar.g1 M;
    public long M0;
    public org.telegram.ui.ActionBar.g1 N;
    public eh.e N0;
    public org.telegram.ui.ActionBar.g1 O;
    public float O0;
    public org.telegram.ui.ActionBar.g1 P;
    public boolean P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public org.telegram.ui.Components.bs Q0;
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
    public org.telegram.ui.Components.m71 W0;
    public boolean X;
    public View X0;
    public NumberTextView Y;
    public int Y0;
    public org.telegram.ui.ActionBar.w0 Z;
    public int Z0;
    public final long f43741a;
    public org.telegram.ui.ActionBar.w0 f43742a0;
    public int f43743a1;
    public final ArrayList f43744b;
    public org.telegram.ui.ActionBar.w0 f43745b0;
    public final ig.e f43746b1;
    public int f43747c;
    public org.telegram.ui.ActionBar.w0 f43748c0;
    public final ng.d f43749c1;
    public ce1 d;
    public org.telegram.ui.ActionBar.w0 f43750d0;
    public final ng.d f43751d1;
    public m0 f43752e;
    public org.telegram.ui.ActionBar.w0 f43753e0;
    public final ig.a f43754e1;
    public org.telegram.ui.Components.tn f43755f;
    public org.telegram.ui.ActionBar.g1 f43756f0;
    public ig.k f43757f1;
    public org.telegram.ui.ActionBar.g1 f43758g0;
    public final ArrayList f43759g1;
    public org.telegram.ui.Components.j10 h;
    public org.telegram.ui.ActionBar.g1 f43760h0;
    public final RectF f43761h1;
    public org.telegram.ui.ActionBar.w0 f43762i0;
    public final RectF f43763i1;
    public RadialProgressView f43764j0;
    public b81 f43765k0;
    public org.telegram.ui.ActionBar.w0 f43766l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public le1 f43767n;
    public re1 f43768n0;
    public boolean f43769o0;
    public final boolean f43770p0;
    public final boolean f43771q0;
    public final ke1 f43772r;
    public final boolean f43773r0;
    public final TopicsController f43774s;
    public final boolean f43775s0;
    public final boolean f43776t0;
    public String f43777u0;
    public ye1 v;
    public boolean f43778v0;
    public kw f43779w;
    public HashSet f43780w0;
    public int f43781x;
    public boolean f43782x0;
    public int f43783y;
    public boolean f43784y0;
    public ih.b5 f43785z0;

    public we1(Bundle bundle) {
        super(bundle);
        this.f43744b = new ArrayList();
        new ArrayList();
        this.f43772r = new ke1(this);
        this.f43781x = 0;
        this.A = true;
        this.C = true;
        this.R = true;
        this.S = 0.0f;
        this.W = new HashSet();
        this.f43782x0 = false;
        this.K0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.O0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43759g1 = arrayList;
        RectF rectF = new RectF();
        this.f43761h1 = rectF;
        RectF rectF2 = new RectF();
        this.f43763i1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f43741a = j10;
        this.f43770p0 = this.arguments.getBoolean("for_select", false);
        this.f43771q0 = this.arguments.getBoolean("forward_to", false);
        this.f43776t0 = this.arguments.getBoolean("bot_share_to", false);
        this.f43773r0 = this.arguments.getBoolean("quote", false);
        this.f43775s0 = this.arguments.getBoolean("reply_to", false);
        this.f43777u0 = this.arguments.getString("voicechat", null);
        this.f43778v0 = this.arguments.getBoolean("videochat", false);
        this.f43774s = getMessagesController().getTopicsController();
        this.R0 = true ^ org.telegram.messenger.l0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f43746b1 = new ig.e(false);
            this.f43749c1 = new ng.d(null);
            ng.d dVar = new ng.d(null);
            this.f43751d1 = dVar;
            ig.a aVar = new ig.a(dVar);
            this.f43754e1 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            return;
        }
        this.f43746b1 = null;
        this.f43749c1 = null;
        this.f43751d1 = null;
        this.f43754e1 = new ig.a(cVar);
    }

    public static org.telegram.ui.ActionBar.o2 D0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
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
        return new we1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 E0(LaunchActivity launchActivity, Bundle bundle) {
        return D0(MessagesController.getInstance(launchActivity.K), MessagesStorage.getInstance(launchActivity.K), bundle);
    }

    public static void H0(org.telegram.ui.qn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.we1.H0(org.telegram.ui.qn):void");
    }

    public static boolean T(we1 we1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(we1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-we1Var.f43741a), System.currentTimeMillis()).commit();
        Activity parentActivity = we1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(we1Var.g());
        int i9 = org.telegram.ui.Components.p70.f31565r;
        org.telegram.ui.Components.p70.w(parentActivity, we1Var, org.telegram.ui.Components.oc.a0(we1Var), isChannelAndNotMegaGroup);
        we1Var.O0(true);
        return false;
    }

    public static void U(we1 we1Var, View view) {
        long j10;
        long j11 = we1Var.f43741a;
        if (we1Var.getParentLayout() != null && !((ActionBarLayout) we1Var.getParentLayout()).y() && (view instanceof se1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((se1) view).J;
            long j12 = -j11;
            boolean isMonoForum = we1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f22432id;
            }
            long j13 = j10;
            if (we1Var.f43770p0) {
                ye1 ye1Var = we1Var.v;
                if (ye1Var != null) {
                    af1 af1Var = ye1Var.f44850a;
                    Bundle bundle = new Bundle();
                    df1 df1Var = af1Var.f36475a;
                    bundle.putLong("dialog_id", df1Var.f37532c);
                    bundle.putLong("topic_id", tL_forumTopic.f22432id);
                    bundle.putBoolean("exception", true);
                    s01 s01Var = new s01(bundle, null);
                    s01Var.f42525r = new nl0(26, af1Var, tL_forumTopic);
                    df1Var.presentFragment(s01Var);
                }
                dy dyVar = we1Var.H0;
                if (dyVar != null) {
                    dyVar.O3(j12, j13, true, we1Var);
                }
            } else if (we1Var.W.size() > 0) {
                we1Var.N0(view);
            } else {
                if (we1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : we1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof dy) {
                            dy dyVar2 = (dy) o2Var;
                            if (dyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = dyVar2.f37687l2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    we1Var.M0 = j13;
                    we1Var.U0(false, false);
                }
                vf.c.m(we1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean V(we1 we1Var, View view, float f10) {
        if (we1Var.f43770p0 || we1Var.getParentLayout() == null || ((ActionBarLayout) we1Var.getParentLayout()).y()) {
            return false;
        }
        if (!we1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof se1)) {
            se1 se1Var = (se1) view;
            if (se1Var.R(f10)) {
                we1Var.M0(se1Var);
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

    public static void W(we1 we1Var) {
        ViewGroup viewGroup;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                viewGroup = we1Var.J;
            } else {
                re1 re1Var = we1Var.f43768n0;
                if (re1Var != null) {
                    viewGroup = re1Var.Q;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).a0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = we1Var.actionBar;
        if (kVar != null) {
            kVar.D(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8), true);
            we1Var.actionBar.E(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false, true);
            we1Var.actionBar.E(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), true, true);
            we1Var.actionBar.F(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.I5), true);
        }
        yi0 yi0Var = we1Var.L0;
        if (yi0Var != null && Build.VERSION.SDK_INT >= 23) {
            yi0Var.setForeground(new ColorDrawable(i0.a.k(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), 100)));
        }
        we1Var.P0();
    }

    public static void a0(we1 we1Var, boolean z10) {
        float f10;
        boolean z11;
        yw ywVar;
        we1Var.f43769o0 = z10;
        ValueAnimator valueAnimator = we1Var.U0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            we1Var.U0.cancel();
        }
        if (we1Var.W0 == null) {
            org.telegram.ui.Components.m71 n10 = we1Var.f43768n0.n(8, false);
            we1Var.W0 = n10;
            if (we1Var.I0 != null) {
                n10.setBackgroundColor(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
            }
            we1Var.f43752e.addView(we1Var.W0, g7.e6.c(44.0f, -1));
        }
        float f11 = we1Var.S;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        we1Var.U0 = ValueAnimator.ofFloat(f11, f10);
        AndroidUtilities.updateViewVisibilityAnimated(we1Var.f43768n0, false, 1.0f, true);
        dy dyVar = we1Var.I0;
        if (dyVar != null && (ywVar = dyVar.B3) != null) {
            ywVar.I = !z10;
        }
        if (!z10 && we1Var.f43768n0.getVisibility() == 0 && we1Var.f43768n0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        we1Var.V0 = z11;
        we1Var.U0.addUpdateListener(new v01(we1Var, 17));
        we1Var.f43768n0.setVisibility(0);
        if (!z10) {
            we1Var.m0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(we1Var.getParentActivity(), we1Var.classGuid);
            we1Var.Q0(false);
        }
        we1Var.U0.addListener(new ee1(we1Var, z10, 0));
        we1Var.U0.setDuration(200L);
        we1Var.U0.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        we1Var.U0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        int i9;
        float f10;
        float f11;
        dy dyVar = this.I0;
        float f12 = 0.0f;
        if (dyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.bs bsVar = dyVar.F1;
            if (bsVar != null) {
                f10 = bsVar.c(dp);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.bs bsVar2 = this.Q0;
            if (bsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.bs bsVar3 = this.I0.F1;
                if (bsVar3 != null) {
                    f11 = bsVar3.getMetadata().f47790c.f47800a;
                } else {
                    f11 = 0.0f;
                }
                bsVar2.setTranslationY(f13 - (f11 * dp2));
                org.telegram.ui.Components.bs bsVar4 = this.Q0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.bs bsVar5 = this.I0.F1;
                if (bsVar5 != null) {
                    f12 = bsVar5.getMetadata().f47790c.f47800a;
                }
                f12 = bsVar4.c(AndroidUtilities.lerp(dp3, dp4, f12)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.bs bsVar6 = this.Q0;
            if (bsVar6 != null) {
                f12 = 0.0f + bsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i10 = this.f43743a1 + this.Y0;
        if (this.R) {
            i9 = AndroidUtilities.dp(51.0f);
        } else {
            i9 = 0;
        }
        this.J.setPadding(0, (int) f12, 0, i10 + i9);
    }

    public final void B0() {
        this.W.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.J);
        R0();
    }

    public final void C0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f43774s.findTopic(this.f43741a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(9));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
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
        int i9;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f43741a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f43755f.getSharedMediaPreloader());
        profileActivity.K4(this.F);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f43755f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        profileActivity.N4(i9);
        presentFragment(profileActivity);
    }

    @Override
    public final long H() {
        return 0L;
    }

    public final void I0(int i9) {
        int i10;
        int i11;
        if (this.I != i9) {
            this.I = i9;
            org.telegram.ui.Components.k51 k51Var = this.H;
            if (i9 == 0) {
                i10 = org.telegram.ui.ActionBar.f6.Ae;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23230q7;
            }
            k51Var.setTextColorKey(i10);
            ImageView imageView = this.S0;
            if (i9 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ce1 ce1Var = this.d;
        if (ce1Var != null) {
            if (z10) {
                ce1Var.setLayerType(2, null);
                ce1Var.setClipChildren(false);
                ce1Var.setClipToPadding(false);
            } else {
                ce1Var.setLayerType(0, null);
                ce1Var.setClipChildren(true);
                ce1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.O0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ge1 ge1Var = this.J;
            if (ge1Var != null) {
                float C = j3.r0.C(1.0f, this.O0, 0.05f, 1.0f);
                ge1Var.setPivotX(0.0f);
                ge1Var.setPivotY(0.0f);
                ge1Var.setScaleX(C);
                ge1Var.setScaleY(C);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(C);
                this.actionBar.setScaleY(C);
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
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.J;
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new be1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(foVar.f28520f);
        foVar.f28528o = 1;
        long j11 = this.f43741a;
        long j12 = -j11;
        foVar.d(j12, tL_forumTopic.f22432id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final we1 f43458b;

                {
                    this.f43458b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            we1 we1Var = this.f43458b;
                            we1Var.f43784y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43774s;
                            long j13 = we1Var.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            return;
                        case 1:
                            we1 we1Var2 = this.f43458b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43774s;
                            long j14 = we1Var2.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43458b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f22432id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new ih.p5(this, tL_forumTopic, (Serializable) r32, b10, 6));
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
                public final we1 f43458b;

                {
                    this.f43458b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            we1 we1Var = this.f43458b;
                            we1Var.f43784y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43774s;
                            long j13 = we1Var.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            return;
                        case 1:
                            we1 we1Var2 = this.f43458b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43774s;
                            long j14 = we1Var2.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43458b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final we1 f43458b;

                {
                    this.f43458b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            we1 we1Var = this.f43458b;
                            we1Var.f43784y0 = true;
                            we1Var.J0 = true;
                            TopicsController topicsController = we1Var.f43774s;
                            long j13 = we1Var.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22432id, !tL_forumTopic2.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            return;
                        case 1:
                            we1 we1Var2 = this.f43458b;
                            we1Var2.J0 = true;
                            TopicsController topicsController2 = we1Var2.f43774s;
                            long j14 = we1Var2.f43741a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22432id, true ^ tL_forumTopic3.closed);
                            we1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22432id));
                            we1 we1Var3 = this.f43458b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
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
            this.parentLayout.getOverlayContainerView().addView(this.L0, g7.e6.c(-1.0f, -1));
        }
        qn qnVar = new qn(e2.c.g(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(r2Var.J.from_id);
        } else {
            j10 = r2Var.J.f22432id;
        }
        vf.c.a(qnVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(qnVar, r32[0]);
    }

    public final void N0(View view) {
        se1 se1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if ((view instanceof se1) && (tL_forumTopic = (se1Var = (se1) view).J) != null) {
            int i18 = tL_forumTopic.f22432id;
            Integer valueOf = Integer.valueOf(i18);
            HashSet hashSet = this.W;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i18));
            }
            se1Var.U(hashSet.contains(Integer.valueOf(i18)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f43741a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f23998a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.Y = numberTextView;
                    numberTextView.setTextSize(18);
                    this.Y.setTypeface(AndroidUtilities.bold());
                    this.Y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8));
                    j11.addView(this.Y, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
                    this.Y.setOnTouchListener(new wd1(0));
                    this.Z = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f43742a0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f43745b0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f43748c0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f43750d0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f43753e0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.f43762i0 = h11;
                    this.f43756f0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f43758g0 = this.f43762i0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f43760h0 = this.f43762i0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.N(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f43774s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i19++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i22++;
                            } else {
                                i21++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i20++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i19 > 0) {
                    this.f43756f0.setVisibility(0);
                    this.f43756f0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f43756f0.setVisibility(8);
                }
                if (i20 != 0) {
                    this.f43782x0 = false;
                    this.f43745b0.setIcon(R.drawable.msg_unmute);
                    this.f43745b0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.f43782x0 = true;
                    this.f43745b0.setIcon(R.drawable.msg_mute);
                    this.f43745b0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.Z;
                if (i21 == z10 && i22 == 0) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                w0Var.setVisibility(i9);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f43742a0;
                if (i22 == z10 && i21 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var2.setVisibility(i10);
                this.Y.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i25++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f22432id == 1) {
                                if (findTopic2.hidden) {
                                    i27++;
                                } else {
                                    i26++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i23++;
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f43758g0;
                if (i23 == 0 && i24 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                g1Var.setVisibility(i11);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f43758g0;
                if (i24 > 1) {
                    i12 = R.string.CloseTopics;
                } else {
                    i12 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i12));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f43760h0;
                if (i24 == 0 && i23 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                g1Var3.setVisibility(i13);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f43760h0;
                if (i23 > 1) {
                    i14 = R.string.RestartTopics;
                } else {
                    i14 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f43748c0;
                if (i25 == hashSet3.size()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                w0Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f43750d0;
                if (i26 == 1 && hashSet3.size() == 1) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var4.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f43753e0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var5.setVisibility(i17);
                this.f43762i0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.we1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f43764j0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ae));
        this.h.g();
        b81 b81Var = this.f43765k0;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        b81Var.setBackgroundColor(getThemedColor(i9));
        this.actionBar.setActionModeColor(getThemedColor(i9));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8));
        }
        this.f43768n0.setBackgroundColor(getThemedColor(i9));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.M == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43741a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i9 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f43769o0 && !this.f43770p0 && !this.F0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.G = z11;
        org.telegram.ui.ActionBar.g1 g1Var = this.M;
        if (!z11) {
            i9 = 8;
        }
        g1Var.setVisibility(i9);
        F0(!this.G, z10);
    }

    @Override
    public final boolean R(MotionEvent motionEvent, boolean z10) {
        return false;
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
            ke1 ke1Var = this.f43772r;
            ke1Var.q(0, ke1Var.h());
        }
    }

    public final void S0(float f10) {
        this.S = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23321v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23371y8;
        kVar.C(i0.a.d(this.S, themedColor, getThemedColor(i9)), false);
        this.actionBar.C(i0.a.d(this.S, getThemedColor(i9), getThemedColor(i9)), true);
        this.actionBar.A(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.f6.f23287t8), getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8), getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)));
        }
        float f11 = 1.0f - f10;
        this.f43755f.getTitleTextView().setAlpha(f11);
        this.f43755f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.m71 m71Var = this.W0;
        if (m71Var != null) {
            m71Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.W0.setAlpha(f10);
        }
        this.f43768n0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.f43768n0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f43752e.invalidate();
        }
        this.d.invalidate();
        this.J.setAlpha(f11);
        if (this.V0) {
            float z10 = e2.c.z(1.0f, this.S, 0.02f, 0.98f);
            this.J.setScaleX(z10);
            this.J.setScaleY(z10);
        }
    }

    public final void T0() {
        ih.b5 b5Var = this.f43785z0;
        if (b5Var != null && b5Var.f28885e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.ic_ab_other, 0);
            eqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.f43785z0.f28885e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43741a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.f43785z0.f28885e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        xd1 xd1Var;
        ie1 ie1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.J0) {
            z10 = true;
        }
        this.J0 = false;
        TopicsController topicsController = this.f43774s;
        long j10 = this.f43741a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f43744b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ie1 ie1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f43771q0) {
                arrayList.add(new me1(3, null));
            }
            for (int i9 = 0; i9 < topics.size(); i9++) {
                HashSet hashSet = this.f43780w0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i9).f22432id))) {
                    arrayList.add(new me1(0, topics.get(i9)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.R0) {
                arrayList.add(new me1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.G0.b(size + 4);
                z10 = false;
            }
            this.f43781x = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                me1 me1Var = (me1) arrayList.get(i10);
                if (me1Var != null && (tL_forumTopic = me1Var.f40405c) != null && tL_forumTopic.hidden) {
                    this.f43781x++;
                }
            }
            ge1 ge1Var = this.J;
            if (ge1Var != null) {
                f2.w0 itemAnimator = ge1Var.getItemAnimator();
                if (z10) {
                    ie1Var = this.E0;
                } else {
                    ie1Var = null;
                }
                if (itemAnimator != ie1Var) {
                    ge1 ge1Var2 = this.J;
                    if (z10) {
                        ie1Var2 = this.E0;
                    }
                    ge1Var2.setItemAnimator(ie1Var2);
                }
            }
            ke1 ke1Var = this.f43772r;
            if (ke1Var != null) {
                ke1Var.E(arrayList2, arrayList);
            }
            if ((this.f43784y0 || size == 0) && (xd1Var = this.B) != null) {
                xd1Var.h1(0, 0);
                this.f43784y0 = false;
            }
        }
        z0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f43741a;
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
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        dy dyVar = this.I0;
        if (dyVar != null && dyVar.S) {
            i9 = AndroidUtilities.dp(72.0f);
        } else {
            i9 = 0;
        }
        this.Y0 = i9;
        dy dyVar2 = this.I0;
        if (dyVar2 != null && dyVar2.S) {
            i10 = AndroidUtilities.dp(64.0f);
        } else {
            i10 = 0;
        }
        this.Z0 = i10;
        ce1 ce1Var = new ce1(this, context);
        this.d = ce1Var;
        this.fragmentView = ce1Var;
        ce1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fe1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final we1 f42671b;

            {
                this.f42671b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        we1 we1Var = this.f42671b;
                        we1Var.presentFragment(rd1.Z(we1Var.f43741a, 0L));
                        return;
                    case 1:
                        we1 we1Var2 = this.f42671b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43741a, null, we1Var2.g());
                        we1Var2.O0(false);
                        return;
                    case 2:
                        we1 we1Var3 = this.f42671b;
                        if (!we1Var3.f43769o0) {
                            we1Var3.G0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f42671b.finishPreviewFragment();
                        return;
                    default:
                        dy dyVar3 = this.f42671b.I0;
                        if (dyVar3 != null && (w0Var = dyVar3.f37656f0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.I0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f43766l0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final we1 f42671b;

                {
                    this.f42671b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            we1 we1Var = this.f42671b;
                            we1Var.presentFragment(rd1.Z(we1Var.f43741a, 0L));
                            return;
                        case 1:
                            we1 we1Var2 = this.f42671b;
                            we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43741a, null, we1Var2.g());
                            we1Var2.O0(false);
                            return;
                        case 2:
                            we1 we1Var3 = this.f42671b;
                            if (!we1Var3.f43769o0) {
                                we1Var3.G0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f42671b.finishPreviewFragment();
                            return;
                        default:
                            dy dyVar3 = this.f42671b.I0;
                            if (dyVar3 != null && (w0Var = dyVar3.f37656f0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a3 = n10.a(0, R.drawable.outline_header_search);
            this.f43766l0 = a3;
            a3.F();
            a3.D = new cb(this, 17);
            this.f43766l0.setSearchPaddingStart(56);
            this.f43766l0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f43766l0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.f6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.m0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.m0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.N = this.m0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        int i12 = R.raw.boosts;
        this.P = w0Var.d(14, 0, new org.telegram.ui.Components.mi0(i12, AndroidUtilities.dp(24.0f), "" + R.raw.boosts, AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.f23912i0);
        this.M = this.m0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.Q = this.m0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.O = this.m0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, this, false, this.resourceProvider);
        this.f43755f = tnVar;
        tnVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.tn tnVar2 = this.f43755f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        tnVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.tn tnVar3 = this.f43755f;
        long j10 = -this.f43741a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tnVar3.f32726b = z12;
        tnVar3.setClipChildren(false);
        this.actionBar.addView(this.f43755f, 0, g7.e6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f43770p0) {
            this.f43755f.getAvatarImageView().setOnClickListener(new x7(this, 3));
        }
        this.J = new ge1(this, context);
        pg.i iVar = new pg.i(this.d);
        ViewGroup viewGroup = this.d;
        ig.a aVar = this.f43754e1;
        aVar.d = iVar;
        aVar.f11131e = viewGroup;
        ge1 ge1Var = this.J;
        dy dyVar3 = this.I0;
        if (dyVar3 != null) {
            viewGroup = (ViewGroup) dyVar3.getFragmentView();
        }
        ge1 ge1Var2 = this.J;
        Objects.requireNonNull(ge1Var2);
        this.f43757f1 = new ig.k(ge1Var, viewGroup, new u8(ge1Var2, 2));
        this.J.C0(new td1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        vf.b c11 = vf.c.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f43779w = kwVar;
        kwVar.b();
        if (this.A) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.f43783y = i11;
        kw kwVar2 = this.f43779w;
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        kwVar2.X = z13;
        ie1 ie1Var = new ie1(this);
        this.J.setHideIfEmpty(false);
        ie1Var.f5532m = false;
        ie1Var.C = false;
        ge1 ge1Var3 = this.J;
        this.E0 = ie1Var;
        ge1Var3.setItemAnimator(ie1Var);
        this.J.setOnScrollListener(new yd1(this, 1));
        ge1 ge1Var4 = this.J;
        ge1Var4.U1 = true;
        ge1Var4.V1 = 0;
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(ge1Var4, true);
        this.G0 = dk0Var;
        this.J.setItemsEnterAnimator(dk0Var);
        this.J.setOnItemClickListener(new c21(this, 8));
        this.J.setOnItemLongClickListener(new ud1(this));
        this.J.setOnScrollListener(new yd1(this, 2));
        ge1 ge1Var5 = this.J;
        xd1 xd1Var = new xd1(this);
        this.B = xd1Var;
        ge1Var5.setLayoutManager(xd1Var);
        new SparseArray();
        new HashMap();
        this.J.setAdapter(this.f43772r);
        this.J.setClipToPadding(false);
        this.J.j(new yd1(this, 0));
        ve1 ve1Var = new ve1(this);
        this.L = ve1Var;
        zd1 zd1Var = new zd1(this, ve1Var);
        this.K = zd1Var;
        zd1Var.d(this.J);
        this.d.addView(this.J, g7.e6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(getParentActivity(), this.resourceProvider, false);
        this.h = j10Var;
        this.d.addView(j10Var, org.telegram.ui.Components.j10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final we1 f42671b;

            {
                this.f42671b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        we1 we1Var = this.f42671b;
                        we1Var.presentFragment(rd1.Z(we1Var.f43741a, 0L));
                        return;
                    case 1:
                        we1 we1Var2 = this.f42671b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43741a, null, we1Var2.g());
                        we1Var2.O0(false);
                        return;
                    case 2:
                        we1 we1Var3 = this.f42671b;
                        if (!we1Var3.f43769o0) {
                            we1Var3.G0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f42671b.finishPreviewFragment();
                        return;
                    default:
                        dy dyVar32 = this.f42671b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f37656f0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f29579c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f29579c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f29579c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(24);
        e00Var.setVisibility(8);
        e00Var.f27885w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f40121a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z14) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f43767n = frameLayout;
        textView.setAlpha(0.0f);
        ih.b5 b5Var = new ih.b5(this, context, e00Var);
        this.f43785z0 = b5Var;
        try {
            b5Var.f28883b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.f43785z0.e(this.F0, this.fragmentBeginToShow);
        this.f43785z0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f43767n.addView(e00Var);
        this.f43767n.addView(this.f43785z0);
        this.d.addView(this.f43767n);
        this.J.setEmptyView(this.f43767n);
        this.f43765k0 = new b81(context, 5);
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context);
        this.H = k51Var;
        this.f43765k0.addView(k51Var);
        this.d.addView(this.f43765k0, g7.e6.e(-1, 51, 80));
        this.H.setOnClickListener(new ae1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f43764j0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f43764j0.setVisibility(4);
        this.f43765k0.addView(this.f43764j0, g7.e6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.S0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.S0;
        int i13 = org.telegram.ui.ActionBar.f6.f23008de;
        imageView2.setBackground(org.telegram.ui.ActionBar.v5.c(null, org.telegram.ui.ActionBar.v5.b(getThemedColor(i13))));
        this.S0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.S0.setScaleType(ImageView.ScaleType.CENTER);
        this.f43765k0.addView(this.S0, g7.e6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final we1 f42671b;

            {
                this.f42671b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        we1 we1Var = this.f42671b;
                        we1Var.presentFragment(rd1.Z(we1Var.f43741a, 0L));
                        return;
                    case 1:
                        we1 we1Var2 = this.f42671b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43741a, null, we1Var2.g());
                        we1Var2.O0(false);
                        return;
                    case 2:
                        we1 we1Var3 = this.f42671b;
                        if (!we1Var3.f43769o0) {
                            we1Var3.G0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f42671b.finishPreviewFragment();
                        return;
                    default:
                        dy dyVar32 = this.f42671b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f37656f0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.setVisibility(8);
        O0(false);
        m0 m0Var = new m0(this, context, 25);
        this.f43752e = m0Var;
        if (this.I0 == null) {
            this.d.addView(m0Var, g7.e6.e(-1, -1, 119));
        }
        re1 re1Var = new re1(this, context);
        this.f43768n0 = re1Var;
        re1Var.setVisibility(8);
        this.f43752e.addView(this.f43768n0, g7.e6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        re1 re1Var2 = this.f43768n0;
        int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
        re1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f43741a, true, null, true, false, 0);
        org.telegram.ui.Components.bs bsVar = new org.telegram.ui.Components.bs(context);
        this.Q0 = bsVar;
        bsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        kg.d c12 = aVar.c(this.Q0, mg.c.m(this.resourceProvider), false);
        c12.p(AndroidUtilities.dp(24.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        this.Q0.setBlurredBackground(c12);
        this.Q0.setOnAnimatedHeightChangedListener(new td1(this, 0));
        this.d.addView(this.Q0, g7.e6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            eh.e eVar = new eh.e(g10, this);
            this.N0 = eVar;
            this.Q0.addView(eVar.c(), g7.e6.n(-1, 40));
            this.Q0.h(3, this.N0.c());
            this.Q0.g(this.N0.c());
            eh.e eVar2 = this.N0;
            eVar2.f5184m = new ud1(this);
            TLRPC.ChatFull chatFull = this.F;
            eVar2.f5181j = chatFull;
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
            w8 w8Var = new w8(this, context, this);
            this.C0 = w8Var;
            this.B0.addView(w8Var);
            this.Q0.setCallFragmentContextView(this.C0);
        }
        FrameLayout.LayoutParams c13 = g7.e6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        x0();
        yi0 yi0Var = new yi0(this, context, 9);
        this.L0 = yi0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            yi0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        }
        this.L0.setFocusable(false);
        this.L0.setImportantForAccessibility(2);
        this.L0.setOnClickListener(new View.OnClickListener(this) {
            public final we1 f42671b;

            {
                this.f42671b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        we1 we1Var = this.f42671b;
                        we1Var.presentFragment(rd1.Z(we1Var.f43741a, 0L));
                        return;
                    case 1:
                        we1 we1Var2 = this.f42671b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.f43741a, null, we1Var2.g());
                        we1Var2.O0(false);
                        return;
                    case 2:
                        we1 we1Var3 = this.f42671b;
                        if (!we1Var3.f43769o0) {
                            we1Var3.G0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f42671b.finishPreviewFragment();
                        return;
                    default:
                        dy dyVar32 = this.f42671b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f37656f0) != null) {
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
                if (o2Var instanceof dy) {
                    dy dyVar4 = (dy) o2Var;
                    if (dyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = dyVar4.f37687l2;
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new sb(this, 5));
        }
        View view = this.fragmentView;
        ud1 ud1Var = new ud1(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(view, ud1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f43741a;
        if (i9 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.F) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f22381id == j10) {
                O0(false);
                eh.e eVar = this.N0;
                if (eVar != null) {
                    eVar.f5181j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                y0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i9 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i9 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i9 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    x0();
                }
                z0();
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
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
        } else if (i9 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.D0 = getMessagesController().getGroupCall(l10.longValue(), false);
                w8 w8Var = this.C0;
                if (w8Var != null) {
                    w8Var.a(!this.fragmentBeginToShow);
                }
                y0(false);
            }
        } else if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i9 != NotificationCenter.chatSwitchedForum && i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i9 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
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
        return getMessagesController().getChat(Long.valueOf(this.f43741a));
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
        org.telegram.ui.Components.wk0 wk0Var;
        sx0 sx0Var = new sx0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        re1 re1Var = this.f43768n0;
        if (re1Var != null && (wk0Var = re1Var.Q) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, wk0Var);
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User i() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i9;
        if (this.f43769o0) {
            i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        }
        int themedColor = getThemedColor(i9);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.w8);
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
    public final org.telegram.ui.Components.tn o() {
        return this.f43755f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.W.isEmpty()) {
            if (z10) {
                B0();
                return false;
            }
        } else if (this.f43769o0) {
            if (z10) {
                this.actionBar.v(this.f43766l0.L(false));
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
        long j10 = this.f43741a;
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
        HashSet hashSet = f43740j1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43741a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        dy dyVar = this.I0;
        if (dyVar != null && dyVar.B3 != null) {
            dyVar.getActionBar().setSearchAvatarImageView(null);
            this.I0.B3.I = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f43741a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f43741a;
        topicsController.onTopicFragmentResume(j10);
        this.C = false;
        AndroidUtilities.updateVisibleRows(this.J);
        this.C = true;
        setBulletinDelegate(new x8(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.P0) {
            L0(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        yw ywVar;
        yi0 yi0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (yi0Var = this.L0) != null) {
            if (yi0Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.L0.setBackground(null);
        }
        if (z10) {
            y0(false);
        }
        this.K0.unlock();
        if (!z10) {
            if (this.f43770p0 && this.D) {
                removeSelfFromStack();
                dy dyVar = this.H0;
                if (dyVar != null) {
                    dyVar.removeSelfFromStack();
                }
            } else if (this.E) {
                removeSelfFromStack();
                dy dyVar2 = this.I0;
                if (dyVar2 != null && (ywVar = dyVar2.B3) != null && ywVar.c()) {
                    this.I0.B3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        yi0 yi0Var = this.L0;
        if (yi0Var != null && yi0Var.getVisibility() == 0) {
            if (z10) {
                this.L0.setAlpha(1.0f - f10);
            } else {
                this.L0.setAlpha(f10);
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
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.tn tnVar = this.f43755f;
        if (tnVar != null) {
            tnVar.setAlpha(f10);
            this.m0.setAlpha(f10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f43766l0;
            if (w0Var != null) {
                w0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.tn tnVar = this.f43755f;
        if (tnVar != null) {
            tnVar.setAlpha(f10);
            this.f43755f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void w0() {
        ig.e eVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i9;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f43746b1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.Q0.c(AndroidUtilities.dp(14.0f)));
            dy dyVar = this.I0;
            if (dyVar != null) {
                view = dyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (dyVar != null) {
                kVar = dyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f43743a1) - AndroidUtilities.dp(8.0f);
            this.f43761h1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f43763i1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.I0 != null) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            eVar.g(i9, this.f43759g1);
            eVar.e(this.f43757f1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void x0() {
        xd1 xd1Var;
        TopicsController topicsController = this.f43774s;
        long j10 = this.f43741a;
        if (!topicsController.endIsReached(j10) && (xd1Var = this.B) != null) {
            int N0 = xd1Var.N0();
            if (this.f43744b.isEmpty() || N0 >= this.f43772r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            z0();
        }
    }

    @Override
    public final ng.d y() {
        return this.f43751d1;
    }

    public final void y0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f43741a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.D0;
        if (call != null && ((str = this.f43777u0) != null || this.f43778v0)) {
            org.telegram.ui.Components.voip.e2.m(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43777u0 = null;
            this.f43778v0 = false;
        } else if (this.f43777u0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.l0.p(R.string.LinkHashExpired, org.telegram.ui.Components.oc.a0(this), R.raw.linkbroken, 36);
            this.f43777u0 = null;
        }
    }

    @Override
    public final org.telegram.ui.Components.xu0 z() {
        return this.d;
    }

    public final void z0() {
        this.F0 = this.f43774s.isLoading(this.f43741a);
        if (this.f43785z0 != null) {
            ArrayList arrayList = this.f43744b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((me1) arrayList.get(0)).f40405c != null && ((me1) arrayList.get(0)).f40405c.f22432id == 1)) {
                this.f43785z0.e(this.F0, this.fragmentBeginToShow);
            }
        }
        ge1 ge1Var = this.J;
        if (ge1Var != null) {
            ge1Var.J0(ge1Var.u1());
        }
        Q0(true);
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i9, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
