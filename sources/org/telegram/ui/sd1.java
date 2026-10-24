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
public final class sd1 extends org.telegram.ui.ActionBar.o2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f41350a;
    public long f41351b;
    public long f41352c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public rd1 f41353f;
    public org.telegram.ui.Components.u9[] h;
    public String f41354n;
    public boolean f41355r;
    public org.telegram.ui.Components.wq f41356s;
    public org.telegram.ui.Components.qm0 v;
    public TLRPC.TL_forumTopic f41357w;
    public og.a f41358x;
    public sn f41359y;

    public static int X(sd1 sd1Var) {
        return sd1Var.currentAccount;
    }

    public static sd1 a0(long j10, long j11) {
        Bundle e = si.o0.e(j10, "chat_id");
        e.putLong("topic_id", j11);
        ?? o2Var = new org.telegram.ui.ActionBar.o2(e);
        o2Var.h = new org.telegram.ui.Components.u9[2];
        o2Var.f41354n = "";
        o2Var.F = new AnimationNotificationsLocker();
        return o2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.u9[] u9VarArr = this.h;
        if (this.f41353f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f41353f.setSelected(Long.valueOf(longValue));
            if (this.f41351b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.p5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.vc.a0(this).r(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new nd1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f41351b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(10, this.currentAccount, longValue);
                    p5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21514v3);
                    u9VarArr[1].setAnimatedEmojiDrawable(p5Var);
                    u9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(1, null);
                    e90Var.a(this.f41354n);
                    this.v.b(e90Var, false);
                    u9VarArr[1].setImageDrawable(this.f41356s);
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
        if (this.f41357w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new od1(this));
        if (this.f41357w == null) {
            this.actionBar.m().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.m().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.nw0 nw0Var = new org.telegram.ui.Components.nw0(context, null);
        this.fragmentView = nw0Var;
        org.telegram.ui.ActionBar.r6.i(i10, nw0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        nw0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f41357w;
        if (tL_forumTopic != null && tL_forumTopic.f20396id == 1) {
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
            public final sd1 f39571b;

            {
                this.f39571b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                sd1 sd1Var = this.f39571b;
                switch (i11) {
                    case 0:
                        if (sd1Var.f41351b == 0 && sd1Var.f41357w == null) {
                            og.a aVar = sd1Var.f41358x;
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
                            sd1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = sd1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            u9VarArr[i11] = u9Var;
            frameLayout2.addView(u9Var, w7.z5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.z5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21184d6;
        Drawable e02 = org.telegram.ui.ActionBar.k6.e0(dp, getThemedColor(i12));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, e02, O, null, resourceProvider);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f41357w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f20396id == 1) {
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
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f41357w.hidden, false, false);
            org.telegram.ui.Cells.v8 v8Var2 = this.d;
            int themedColor = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.ActionBar.r6.S(v8Var2, org.telegram.ui.ActionBar.k6.a0(themedColor, getThemedColor(i13), 16, 16), org.telegram.ui.ActionBar.r6.O(i12), org.telegram.ui.ActionBar.r6.O(i13), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final sd1 f39571b;

                {
                    this.f39571b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    sd1 sd1Var = this.f39571b;
                    switch (i112) {
                        case 0:
                            if (sd1Var.f41351b == 0 && sd1Var.f41357w == null) {
                                og.a aVar = sd1Var.f41358x;
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
                                sd1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var3 = sd1Var.d;
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
            rd1 rd1Var = new rd1(this, this, getParentActivity());
            this.f41353f = rd1Var;
            rd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f41353f.setClipChildren(false);
            frameLayout3.addView(this.f41353f, w7.z5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.wq d = og.d.d(this.E, "");
            this.f41358x = (og.a) d.f32322a;
            this.v = new org.telegram.ui.Components.qm0(context);
            org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(d, this.v, 0, 0);
            wqVar.f32329w = true;
            this.f41353f.setForumIconDrawable(wqVar);
            this.f41356s = wqVar;
            org.telegram.ui.Components.qm0 qm0Var = this.v;
            org.telegram.ui.Components.u9 u9Var2 = u9VarArr[0];
            ArrayList arrayList = qm0Var.f29962n;
            if (!arrayList.contains(u9Var2)) {
                arrayList.add(u9Var2);
            }
            org.telegram.ui.Components.qm0 qm0Var2 = this.v;
            org.telegram.ui.Components.u9 u9Var3 = u9VarArr[1];
            ArrayList arrayList2 = qm0Var2.f29962n;
            if (!arrayList2.contains(u9Var3)) {
                arrayList2.add(u9Var3);
            }
            u9VarArr[0].setImageDrawable(this.f41356s);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[1], false, 1.0f, false);
            this.f41358x.d.add(u9VarArr[0]);
            this.f41358x.d.add(u9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.z5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f41357w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f41357w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41350a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f41352c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f41350a, this.f41352c);
            this.f41357w = findTopic;
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
        if (!z10 && this.f41355r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        rd1 rd1Var = this.f41353f;
        if (rd1Var != null) {
            rd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
