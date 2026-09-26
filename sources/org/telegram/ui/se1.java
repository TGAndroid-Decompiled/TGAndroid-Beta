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
public final class se1 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f37721a;
    public long f37722b;
    public long f37723c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public re1 f37724f;
    public org.telegram.ui.Components.w9[] h;
    public String f37725n;
    public boolean f37726r;
    public org.telegram.ui.Components.rq f37727s;
    public org.telegram.ui.Components.cm0 v;
    public TLRPC.TL_forumTopic f37728w;
    public ng.a f37729x;
    public wn f37730y;

    public static se1 a0(long j3, long j10) {
        Bundle e = v7.j.e(j3, "chat_id");
        e.putLong("topic_id", j10);
        ?? m2Var = new org.telegram.ui.ActionBar.m2(e);
        m2Var.h = new org.telegram.ui.Components.w9[2];
        m2Var.f37725n = "";
        m2Var.F = new AnimationNotificationsLocker();
        return m2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f37724f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f37724f.setSelected(Long.valueOf(longValue));
            if (this.f37722b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.xc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ne1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f37722b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(10, this.currentAccount, longValue);
                    q5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f19387v3);
                    w9VarArr[1].setAnimatedEmojiDrawable(q5Var);
                    w9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(1, null);
                    x80Var.a(this.f37725n);
                    this.v.b(x80Var, false);
                    w9VarArr[1].setImageDrawable(this.f37727s);
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
        if (this.f37728w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new oe1(this));
        if (this.f37728w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19003a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(context, null);
        this.fragmentView = bw0Var;
        bw0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bw0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f37728w;
        if (tL_forumTopic != null && tL_forumTopic.f18387id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.y5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new m0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final se1 f35545b;

            {
                this.f35545b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                se1 se1Var = this.f35545b;
                switch (i11) {
                    case 0:
                        if (se1Var.f37722b == 0 && se1Var.f37728w == null) {
                            ng.a aVar = se1Var.f37729x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = ng.a.f15444k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f15451i = i13;
                            aVar.h = (int[]) ng.a.f15445l.get(i13);
                            if (org.telegram.ui.ActionBar.h6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            se1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = se1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9VarArr[i11] = w9Var;
            frameLayout2.addView(w9Var, w7.y5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.y5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f19059d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.y5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37728w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f18387id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.y5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.y5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f37728w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f19148i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final se1 f35545b;

                {
                    this.f35545b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    se1 se1Var = this.f35545b;
                    switch (i112) {
                        case 0:
                            if (se1Var.f37722b == 0 && se1Var.f37728w == null) {
                                ng.a aVar = se1Var.f37729x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = ng.a.f15444k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f15451i = i13;
                                aVar.h = (int[]) ng.a.f15445l.get(i13);
                                if (org.telegram.ui.ActionBar.h6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                se1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = se1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.y5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.y5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.y5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            re1 re1Var = new re1(this, this, getParentActivity());
            this.f37724f = re1Var;
            re1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f37724f.setClipChildren(false);
            frameLayout3.addView(this.f37724f, w7.y5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.rq d = ng.d.d(this.E, "");
            this.f37729x = (ng.a) d.f28028a;
            this.v = new org.telegram.ui.Components.cm0(context);
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(d, this.v, 0, 0);
            rqVar.f28035w = true;
            this.f37724f.setForumIconDrawable(rqVar);
            this.f37727s = rqVar;
            org.telegram.ui.Components.cm0 cm0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = cm0Var.f23359n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.cm0 cm0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = cm0Var2.f23359n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.f37727s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            ng.a aVar = this.f37729x;
            aVar.d.add(w9VarArr[0]);
            ng.a aVar2 = this.f37729x;
            aVar2.d.add(w9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.y5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f37728w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f37728w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37721a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f37723c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f37721a, this.f37723c);
            this.f37728w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.f15444k[Math.abs(Utilities.random.nextInt() % 6)];
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
        if (!z10 && this.f37726r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        re1 re1Var = this.f37724f;
        if (re1Var != null) {
            re1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
