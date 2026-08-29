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
public final class td1 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public AnimationNotificationsLocker B;
    public long f42660a;
    public long f42661b;
    public long f42662c;
    public org.telegram.ui.Cells.p8 d;
    public EditTextBoldCursor f42663e;
    public sd1 f42664f;
    public org.telegram.ui.Components.t9[] h;
    public String f42665n;
    public boolean f42666r;
    public org.telegram.ui.Components.jq f42667s;
    public org.telegram.ui.Components.ol0 v;
    public TLRPC.TL_forumTopic f42668w;
    public yf.b f42669x;
    public tn f42670y;

    public static int X(td1 td1Var) {
        return td1Var.currentAccount;
    }

    public static td1 a0(long j10, long j11) {
        Bundle g10 = j7.l1.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        ?? o2Var = new org.telegram.ui.ActionBar.o2(g10);
        o2Var.h = new org.telegram.ui.Components.t9[2];
        o2Var.f42665n = "";
        o2Var.B = new AnimationNotificationsLocker();
        return o2Var;
    }

    public final void b0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.t9[] t9VarArr = this.h;
        if (this.f42664f != null && this.v != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f42664f.setSelected(Long.valueOf(longValue));
            if (this.f42661b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f9 = org.telegram.ui.Components.p5.f(this.currentAccount, l10.longValue());
                    if (f9 != null) {
                        org.telegram.ui.Components.tc.a0(this).q(f9, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new od1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f42661b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(10, this.currentAccount, longValue);
                    p5Var.setColorFilter(org.telegram.ui.ActionBar.g6.f23380v3);
                    t9VarArr[1].setAnimatedEmojiDrawable(p5Var);
                    t9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(1, null);
                    h80Var.a(this.f42665n);
                    this.v.b(h80Var, false);
                    t9VarArr[1].setImageDrawable(this.f42667s);
                    t9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.t9 t9Var = t9VarArr[0];
                org.telegram.ui.Components.t9 t9Var2 = t9VarArr[1];
                t9VarArr[0] = t9Var2;
                t9VarArr[1] = t9Var;
                AndroidUtilities.updateViewVisibilityAnimated(t9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.t9[] t9VarArr = this.h;
        if (this.f42668w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new pd1(this));
        if (this.f42668w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.hv0 hv0Var = new org.telegram.ui.Components.hv0(context, null);
        this.fragmentView = hv0Var;
        hv0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        hv0Var.addView(linearLayout);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f42668w;
        if (tL_forumTopic != null && tL_forumTopic.f22444id == 1) {
            k4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            k4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42663e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f42663e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
        this.f42663e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ud));
        this.f42663e.setPadding(AndroidUtilities.dp(0.0f), this.f42663e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f42663e.getPaddingBottom());
        this.f42663e.setBackground(null);
        this.f42663e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f42663e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f42663e, i7.f6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f42663e.addTextChangedListener(new p0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final td1 f40784b;

            {
                this.f40784b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                td1 td1Var = this.f40784b;
                switch (i11) {
                    case 0:
                        if (td1Var.f42661b == 0 && td1Var.f42668w == null) {
                            yf.b bVar = td1Var.f42669x;
                            int i12 = bVar.f50531e + 1;
                            bVar.f50531e = i12;
                            int[] iArr = yf.b.f50526k;
                            if (i12 > 5) {
                                bVar.f50531e = 0;
                            }
                            int[] iArr2 = bVar.h;
                            int i13 = iArr[bVar.f50531e];
                            bVar.f50534i = i13;
                            bVar.h = (int[]) yf.b.f50527l.get(i13);
                            if (org.telegram.ui.ActionBar.g6.I.q()) {
                                bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                            }
                            bVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new yf.a(0, bVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            td1Var.A = iArr[bVar.f50531e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.p8 p8Var = td1Var.d;
                        p8Var.setChecked(true ^ p8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9VarArr[i11] = t9Var;
            frameLayout2.addView(t9Var, i7.f6.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, i7.f6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(k4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, i7.f6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f42668w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f22444id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, i7.f6.e(22, 22, 17));
            frameLayout3.addView(new View(context), i7.f6.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.d = p8Var;
            p8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f42668w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final td1 f40784b;

                {
                    this.f40784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    td1 td1Var = this.f40784b;
                    switch (i112) {
                        case 0:
                            if (td1Var.f42661b == 0 && td1Var.f42668w == null) {
                                yf.b bVar = td1Var.f42669x;
                                int i122 = bVar.f50531e + 1;
                                bVar.f50531e = i122;
                                int[] iArr = yf.b.f50526k;
                                if (i122 > 5) {
                                    bVar.f50531e = 0;
                                }
                                int[] iArr2 = bVar.h;
                                int i13 = iArr[bVar.f50531e];
                                bVar.f50534i = i13;
                                bVar.h = (int[]) yf.b.f50527l.get(i13);
                                if (org.telegram.ui.ActionBar.g6.I.q()) {
                                    bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                                }
                                bVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new yf.a(0, bVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                td1Var.A = iArr[bVar.f50531e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.p8 p8Var2 = td1Var.d;
                            p8Var2.setChecked(true ^ p8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, i7.f6.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, i7.f6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(y8Var, i7.f6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            sd1 sd1Var = new sd1(this, this, getParentActivity());
            this.f42664f = sd1Var;
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f42664f.setClipChildren(false);
            frameLayout3.addView(this.f42664f, i7.f6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.jq d = yf.d.d(this.A, "");
            this.f42669x = (yf.b) d.f29784a;
            this.v = new org.telegram.ui.Components.ol0(context);
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(d, this.v, 0, 0);
            jqVar.f29792w = true;
            this.f42664f.setForumIconDrawable(jqVar);
            this.f42667s = jqVar;
            org.telegram.ui.Components.ol0 ol0Var = this.v;
            org.telegram.ui.Components.t9 t9Var2 = t9VarArr[0];
            ArrayList arrayList = ol0Var.f31388n;
            if (!arrayList.contains(t9Var2)) {
                arrayList.add(t9Var2);
            }
            org.telegram.ui.Components.ol0 ol0Var2 = this.v;
            org.telegram.ui.Components.t9 t9Var3 = t9VarArr[1];
            ArrayList arrayList2 = ol0Var2.f31388n;
            if (!arrayList2.contains(t9Var3)) {
                arrayList2.add(t9Var3);
            }
            t9VarArr[0].setImageDrawable(this.f42667s);
            AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[1], false, 1.0f, false);
            yf.b bVar = this.f42669x;
            bVar.d.add(t9VarArr[0]);
            yf.b bVar2 = this.f42669x;
            bVar2.d.add(t9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, i7.f6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f42668w;
        if (tL_forumTopic3 != null) {
            this.f42663e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f42668w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42660a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f42662c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f42660a, this.f42662c);
            this.f42668w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.A = findTopic.icon_color;
        } else {
            this.A = yf.b.f50526k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f42663e.requestFocus();
        AndroidUtilities.showKeyboard(this.f42663e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f42666r) {
            removeSelfFromStack();
        }
        this.B.unlock();
        sd1 sd1Var = this.f42664f;
        if (sd1Var != null) {
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.B.lock();
        }
    }
}
