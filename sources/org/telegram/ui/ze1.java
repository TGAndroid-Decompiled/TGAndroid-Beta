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
public final class ze1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f40147a;
    public long f40148b;
    public long f40149c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public ye1 f40150f;
    public org.telegram.ui.Components.u9[] h;
    public String f40151n;
    public boolean f40152r;
    public org.telegram.ui.Components.pq f40153s;
    public org.telegram.ui.Components.ql0 v;
    public TLRPC.TL_forumTopic f40154w;
    public ng.a f40155x;
    public bo f40156y;

    public static ze1 a0(long j3, long j10) {
        Bundle e = w.f.e(j3, "chat_id");
        e.putLong("topic_id", j10);
        ?? n2Var = new org.telegram.ui.ActionBar.n2(e);
        n2Var.h = new org.telegram.ui.Components.u9[2];
        n2Var.f40151n = "";
        n2Var.F = new AnimationNotificationsLocker();
        return n2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.u9[] u9VarArr = this.h;
        if (this.f40150f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f40150f.setSelected(Long.valueOf(longValue));
            if (this.f40148b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.o5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.vc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ue1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f40148b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(10, this.currentAccount, longValue);
                    o5Var.setColorFilter(org.telegram.ui.ActionBar.i6.f19163v3);
                    u9VarArr[1].setAnimatedEmojiDrawable(o5Var);
                    u9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(this.f40151n);
                    this.v.b(l80Var, false);
                    u9VarArr[1].setImageDrawable(this.f40153s);
                    u9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.u9 u9Var = u9VarArr[0];
                org.telegram.ui.Components.u9 u9Var2 = u9VarArr[1];
                u9VarArr[0] = u9Var2;
                u9VarArr[1] = u9Var;
                AndroidUtilities.updateViewVisibilityAnimated(u9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.u9[] u9VarArr = this.h;
        if (this.f40154w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ve1(this));
        if (this.f40154w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f18780a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.pv0 pv0Var = new org.telegram.ui.Components.pv0(context, null);
        this.fragmentView = pv0Var;
        pv0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        pv0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f40154w;
        if (tL_forumTopic != null && tL_forumTopic.f18164id == 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.i6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.x5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new l0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final ze1 f37662b;

            {
                this.f37662b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ze1 ze1Var = this.f37662b;
                switch (i11) {
                    case 0:
                        if (ze1Var.f40148b == 0 && ze1Var.f40154w == null) {
                            ng.a aVar = ze1Var.f40155x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = ng.a.f15217k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f15224i = i13;
                            aVar.h = (int[]) ng.a.f15218l.get(i13);
                            if (org.telegram.ui.ActionBar.i6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            ze1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = ze1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            u9VarArr[i11] = u9Var;
            frameLayout2.addView(u9Var, w7.x5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.x5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.i6.f18836d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.i6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f40154w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f18164id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.x5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.x5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f40154w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.i6.f18926i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final ze1 f37662b;

                {
                    this.f37662b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ze1 ze1Var = this.f37662b;
                    switch (i112) {
                        case 0:
                            if (ze1Var.f40148b == 0 && ze1Var.f40154w == null) {
                                ng.a aVar = ze1Var.f40155x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = ng.a.f15217k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f15224i = i13;
                                aVar.h = (int[]) ng.a.f15218l.get(i13);
                                if (org.telegram.ui.ActionBar.i6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                ze1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = ze1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.x5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.x5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.x5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            ye1 ye1Var = new ye1(this, this, getParentActivity());
            this.f40150f = ye1Var;
            ye1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f40150f.setClipChildren(false);
            frameLayout3.addView(this.f40150f, w7.x5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.pq d = ng.d.d(this.E, "");
            this.f40155x = (ng.a) d.f27118a;
            this.v = new org.telegram.ui.Components.ql0(context);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(d, this.v, 0, 0);
            pqVar.f27125w = true;
            this.f40150f.setForumIconDrawable(pqVar);
            this.f40153s = pqVar;
            org.telegram.ui.Components.ql0 ql0Var = this.v;
            org.telegram.ui.Components.u9 u9Var2 = u9VarArr[0];
            ArrayList arrayList = ql0Var.f27384n;
            if (!arrayList.contains(u9Var2)) {
                arrayList.add(u9Var2);
            }
            org.telegram.ui.Components.ql0 ql0Var2 = this.v;
            org.telegram.ui.Components.u9 u9Var3 = u9VarArr[1];
            ArrayList arrayList2 = ql0Var2.f27384n;
            if (!arrayList2.contains(u9Var3)) {
                arrayList2.add(u9Var3);
            }
            u9VarArr[0].setImageDrawable(this.f40153s);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[1], false, 1.0f, false);
            ng.a aVar = this.f40155x;
            aVar.d.add(u9VarArr[0]);
            ng.a aVar2 = this.f40155x;
            aVar2.d.add(u9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.x5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f40154w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f40154w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f40147a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f40149c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f40147a, this.f40149c);
            this.f40154w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.f15217k[Math.abs(Utilities.random.nextInt() % 6)];
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
        if (!z10 && this.f40152r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        ye1 ye1Var = this.f40150f;
        if (ye1Var != null) {
            ye1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
