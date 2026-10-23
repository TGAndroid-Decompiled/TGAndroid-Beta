package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class td1 extends org.telegram.ui.ActionBar.o2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f41958a;
    public long f41959b;
    public long f41960c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public sd1 f41961f;
    public org.telegram.ui.Components.w9[] h;
    public String f41962n;
    public boolean f41963r;
    public org.telegram.ui.Components.yq f41964s;
    public org.telegram.ui.Components.rm0 v;
    public TLRPC.TL_forumTopic f41965w;
    public og.a f41966x;
    public sn f41967y;

    public static int X(td1 td1Var) {
        return td1Var.currentAccount;
    }

    public static td1 a0(long j10, long j11) {
        Bundle e = si.o0.e(j10, "chat_id");
        e.putLong("topic_id", j11);
        ?? o2Var = new org.telegram.ui.ActionBar.o2(e);
        o2Var.h = new org.telegram.ui.Components.w9[2];
        o2Var.f41962n = "";
        o2Var.F = new AnimationNotificationsLocker();
        return o2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f41961f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f41961f.setSelected(Long.valueOf(longValue));
            if (this.f41959b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.r5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.xc.a0(this).r(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new od1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f41959b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(10, this.currentAccount, longValue);
                    r5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21513v3);
                    w9VarArr[1].setAnimatedEmojiDrawable(r5Var);
                    w9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(1, null);
                    g90Var.a(this.f41962n);
                    this.v.b(g90Var, false);
                    w9VarArr[1].setImageDrawable(this.f41964s);
                    w9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.w9 w9Var = w9VarArr[0];
                org.telegram.ui.Components.w9 w9Var2 = w9VarArr[1];
                w9VarArr[0] = w9Var2;
                w9VarArr[1] = w9Var;
                AndroidUtilities.updateViewVisibilityAnimated(w9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f41965w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new pd1(this));
        if (this.f41965w == null) {
            this.actionBar.m().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.m().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21125a7;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, null);
        this.fragmentView = ow0Var;
        org.telegram.ui.ActionBar.r6.i(i10, ow0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ow0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f41965w;
        if (tL_forumTopic != null && tL_forumTopic.f20395id == 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        org.telegram.ui.ActionBar.r6.C(this.e, org.telegram.ui.ActionBar.k6.Vd, getResourceProvider());
        org.telegram.ui.ActionBar.r6.W(this.e, org.telegram.ui.ActionBar.k6.Ud, getResourceProvider());
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.z5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new n0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final td1 f39853b;

            {
                this.f39853b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                td1 td1Var = this.f39853b;
                switch (i11) {
                    case 0:
                        if (td1Var.f41959b == 0 && td1Var.f41965w == null) {
                            og.a aVar = td1Var.f41966x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = og.a.f17793k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f17800i = i13;
                            aVar.h = (int[]) og.a.f17794l.get(i13);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ah.l0(10, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            td1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = td1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9VarArr[i11] = w9Var;
            frameLayout2.addView(w9Var, w7.z5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.z5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
        Drawable e02 = org.telegram.ui.ActionBar.k6.e0(dp, getThemedColor(i12));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, e02, O, null, resourceProvider);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f41965w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f20395id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ac, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView, w7.z5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.z5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            InsetDrawable e03 = org.telegram.ui.ActionBar.k6.e0(AndroidUtilities.dp(16.0f), getThemedColor(i12));
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
            org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
            frameLayout4.setBackground(e03);
            org.telegram.ui.ActionBar.r6.k(frameLayout4, e03, O2, null, resourceProvider2);
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f41965w.hidden, false, false);
            org.telegram.ui.Cells.v8 v8Var2 = this.d;
            int themedColor = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
            org.telegram.ui.ActionBar.r6.S(v8Var2, org.telegram.ui.ActionBar.k6.a0(themedColor, getThemedColor(i13), 16, 16), org.telegram.ui.ActionBar.r6.O(i12), org.telegram.ui.ActionBar.r6.O(i13), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final td1 f39853b;

                {
                    this.f39853b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    td1 td1Var = this.f39853b;
                    switch (i112) {
                        case 0:
                            if (td1Var.f41959b == 0 && td1Var.f41965w == null) {
                                og.a aVar = td1Var.f41966x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = og.a.f17793k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i132 = iArr[aVar.e];
                                aVar.f17800i = i132;
                                aVar.h = (int[]) og.a.f17794l.get(i132);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ah.l0(10, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                td1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var3 = td1Var.d;
                            v8Var3.setChecked(true ^ v8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.z5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.z5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.z5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            sd1 sd1Var = new sd1(this, this, getParentActivity());
            this.f41961f = sd1Var;
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f41961f.setClipChildren(false);
            frameLayout3.addView(this.f41961f, w7.z5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.yq d = og.d.d(this.E, "");
            this.f41966x = (og.a) d.f33012a;
            this.v = new org.telegram.ui.Components.rm0(context);
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(d, this.v, 0, 0);
            yqVar.f33019w = true;
            this.f41961f.setForumIconDrawable(yqVar);
            this.f41964s = yqVar;
            org.telegram.ui.Components.rm0 rm0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = rm0Var.f30230n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.rm0 rm0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = rm0Var2.f30230n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.f41964s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            this.f41966x.d.add(w9VarArr[0]);
            this.f41966x.d.add(w9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.z5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f41965w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f41965w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41958a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f41960c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f41958a, this.f41960c);
            this.f41965w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = og.a.f17793k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f41963r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        sd1 sd1Var = this.f41961f;
        if (sd1Var != null) {
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.lock();
        }
    }
}
