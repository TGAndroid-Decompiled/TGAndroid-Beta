package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class ue1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f41161a;
    public long f41162b;
    public long f41163c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor f41164e;
    public te1 f41165f;
    public org.telegram.ui.Components.w9[] h;
    public String f41166n;
    public boolean f41167r;
    public org.telegram.ui.Components.sq f41168s;
    public org.telegram.ui.Components.hm0 v;
    public TLRPC.TL_forumTopic f41169w;
    public ng.a f41170x;
    public yn f41171y;

    public static ue1 Z(long j3, long j10) {
        Bundle f7 = sa.e.f(j3, "chat_id");
        f7.putLong("topic_id", j10);
        ?? n2Var = new org.telegram.ui.ActionBar.n2(f7);
        n2Var.h = new org.telegram.ui.Components.w9[2];
        n2Var.f41166n = "";
        n2Var.F = new AnimationNotificationsLocker();
        return n2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f41165f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f41165f.setSelected(Long.valueOf(longValue));
            if (this.f41162b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.yc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new pe1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f41162b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(10, this.currentAccount, longValue);
                    q5Var.setColorFilter(org.telegram.ui.ActionBar.i6.f21154v3);
                    w9VarArr[1].setAnimatedEmojiDrawable(q5Var);
                    w9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.z80 z80Var = new org.telegram.ui.Components.z80(1, null);
                    z80Var.a(this.f41166n);
                    this.v.b(z80Var, false);
                    w9VarArr[1].setImageDrawable(this.f41168s);
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
        if (this.f41169w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new qe1(this));
        if (this.f41169w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20766a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context, null);
        this.fragmentView = lw0Var;
        lw0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        lw0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f41169w;
        if (tL_forumTopic != null && tL_forumTopic.f20094id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41164e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f41164e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.i6.Vd));
        this.f41164e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ud));
        this.f41164e.setPadding(AndroidUtilities.dp(0.0f), this.f41164e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f41164e.getPaddingBottom());
        this.f41164e.setBackground(null);
        this.f41164e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f41164e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f41164e, w7.z5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f41164e.addTextChangedListener(new m0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final ue1 f39177b;

            {
                this.f39177b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ue1 ue1Var = this.f39177b;
                switch (i11) {
                    case 0:
                        if (ue1Var.f41162b == 0 && ue1Var.f41169w == null) {
                            ng.a aVar = ue1Var.f41170x;
                            int i12 = aVar.f16894e + 1;
                            aVar.f16894e = i12;
                            int[] iArr = ng.a.f16889k;
                            if (i12 > 5) {
                                aVar.f16894e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.f16894e];
                            aVar.f16897i = i13;
                            aVar.h = (int[]) ng.a.f16890l.get(i13);
                            if (org.telegram.ui.ActionBar.i6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            ue1Var.E = iArr[aVar.f16894e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = ue1Var.d;
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
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.i6.f20822d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.i6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f41169w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f20094id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.z5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.z5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f41169w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.i6.f20913i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final ue1 f39177b;

                {
                    this.f39177b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ue1 ue1Var = this.f39177b;
                    switch (i112) {
                        case 0:
                            if (ue1Var.f41162b == 0 && ue1Var.f41169w == null) {
                                ng.a aVar = ue1Var.f41170x;
                                int i122 = aVar.f16894e + 1;
                                aVar.f16894e = i122;
                                int[] iArr = ng.a.f16889k;
                                if (i122 > 5) {
                                    aVar.f16894e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.f16894e];
                                aVar.f16897i = i13;
                                aVar.h = (int[]) ng.a.f16890l.get(i13);
                                if (org.telegram.ui.ActionBar.i6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                ue1Var.E = iArr[aVar.f16894e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = ue1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
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
            te1 te1Var = new te1(this, this, getParentActivity());
            this.f41165f = te1Var;
            te1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f41165f.setClipChildren(false);
            frameLayout3.addView(this.f41165f, w7.z5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.sq d = ng.d.d(this.E, "");
            this.f41170x = (ng.a) d.f30855a;
            this.v = new org.telegram.ui.Components.hm0(context);
            org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(d, this.v, 0, 0);
            sqVar.f30863w = true;
            this.f41165f.setForumIconDrawable(sqVar);
            this.f41168s = sqVar;
            org.telegram.ui.Components.hm0 hm0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = hm0Var.f27171n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.hm0 hm0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = hm0Var2.f27171n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.f41168s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            ng.a aVar = this.f41170x;
            aVar.d.add(w9VarArr[0]);
            ng.a aVar2 = this.f41170x;
            aVar2.d.add(w9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.z5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f41169w;
        if (tL_forumTopic3 != null) {
            this.f41164e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f41169w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41161a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f41163c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f41161a, this.f41163c);
            this.f41169w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.f16889k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f41164e.requestFocus();
        AndroidUtilities.showKeyboard(this.f41164e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f41167r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        te1 te1Var = this.f41165f;
        if (te1Var != null) {
            te1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
