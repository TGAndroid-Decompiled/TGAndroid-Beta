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
public final class rd1 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public AnimationNotificationsLocker B;
    public long f42369a;
    public long f42370b;
    public long f42371c;
    public org.telegram.ui.Cells.s8 d;
    public EditTextBoldCursor f42372e;
    public qd1 f42373f;
    public org.telegram.ui.Components.o9[] h;
    public String f42374n;
    public boolean f42375r;
    public org.telegram.ui.Components.fq f42376s;
    public org.telegram.ui.Components.bl0 v;
    public TLRPC.TL_forumTopic f42377w;
    public vf.a f42378x;
    public qn f42379y;

    public static int W(rd1 rd1Var) {
        return rd1Var.currentAccount;
    }

    public static rd1 Z(long j10, long j11) {
        Bundle g10 = e2.c.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        ?? o2Var = new org.telegram.ui.ActionBar.o2(g10);
        o2Var.h = new org.telegram.ui.Components.o9[2];
        o2Var.f42374n = "";
        o2Var.B = new AnimationNotificationsLocker();
        return o2Var;
    }

    public final void a0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.o9[] o9VarArr = this.h;
        if (this.f42373f != null && this.v != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f42373f.setSelected(Long.valueOf(longValue));
            if (this.f42370b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f10 = org.telegram.ui.Components.k5.f(this.currentAccount, l10.longValue());
                    if (f10 != null) {
                        org.telegram.ui.Components.oc.a0(this).q(f10, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new md1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f42370b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(10, this.currentAccount, longValue);
                    k5Var.setColorFilter(org.telegram.ui.ActionBar.f6.f23317v3);
                    o9VarArr[1].setAnimatedEmojiDrawable(k5Var);
                    o9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(1, null);
                    u70Var.a(this.f42374n);
                    this.v.b(u70Var, false);
                    o9VarArr[1].setImageDrawable(this.f42376s);
                    o9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.o9 o9Var = o9VarArr[0];
                org.telegram.ui.Components.o9 o9Var2 = o9VarArr[1];
                o9VarArr[0] = o9Var2;
                o9VarArr[1] = o9Var;
                AndroidUtilities.updateViewVisibilityAnimated(o9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.o9[] o9VarArr = this.h;
        if (this.f42377w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new nd1(this));
        if (this.f42377w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        kVar.setBackgroundColor(getThemedColor(i9));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.xu0 xu0Var = new org.telegram.ui.Components.xu0(context, null);
        this.fragmentView = xu0Var;
        xu0Var.setBackgroundColor(getThemedColor(i9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        xu0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f42377w;
        if (tL_forumTopic != null && tL_forumTopic.f22432id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42372e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f42372e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.f6.Vd));
        this.f42372e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ud));
        this.f42372e.setPadding(AndroidUtilities.dp(0.0f), this.f42372e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f42372e.getPaddingBottom());
        this.f42372e.setBackground(null);
        this.f42372e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f42372e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f42372e, g7.e6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f42372e.addTextChangedListener(new o0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final rd1 f40115b;

            {
                this.f40115b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                rd1 rd1Var = this.f40115b;
                switch (i10) {
                    case 0:
                        if (rd1Var.f42370b == 0 && rd1Var.f42377w == null) {
                            vf.a aVar = rd1Var.f42378x;
                            int i11 = aVar.f48395e + 1;
                            aVar.f48395e = i11;
                            int[] iArr = vf.a.f48390k;
                            if (i11 > 5) {
                                aVar.f48395e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f48395e];
                            aVar.f48398i = i12;
                            aVar.h = (int[]) vf.a.f48391l.get(i12);
                            if (org.telegram.ui.ActionBar.f6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new f2.g(28, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            rd1Var.A = iArr[aVar.f48395e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s8 s8Var = rd1Var.d;
                        s8Var.setChecked(true ^ s8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9VarArr[i10] = o9Var;
            frameLayout2.addView(o9Var, g7.e6.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, g7.e6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.d0(dp, getThemedColor(i11)));
        linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f42377w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f22432id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, g7.e6.e(22, 22, 17));
            frameLayout3.addView(new View(context), g7.e6.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i11)));
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.d = s8Var;
            s8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f42377w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.f6.Z(getThemedColor(i11), getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final rd1 f40115b;

                {
                    this.f40115b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    rd1 rd1Var = this.f40115b;
                    switch (i102) {
                        case 0:
                            if (rd1Var.f42370b == 0 && rd1Var.f42377w == null) {
                                vf.a aVar = rd1Var.f42378x;
                                int i112 = aVar.f48395e + 1;
                                aVar.f48395e = i112;
                                int[] iArr = vf.a.f48390k;
                                if (i112 > 5) {
                                    aVar.f48395e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i12 = iArr[aVar.f48395e];
                                aVar.f48398i = i12;
                                aVar.h = (int[]) vf.a.f48391l.get(i12);
                                if (org.telegram.ui.ActionBar.f6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new f2.g(28, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                rd1Var.A = iArr[aVar.f48395e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.s8 s8Var2 = rd1Var.d;
                            s8Var2.setChecked(true ^ s8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, g7.e6.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, g7.e6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(b9Var, g7.e6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            qd1 qd1Var = new qd1(this, this, getParentActivity());
            this.f42373f = qd1Var;
            qd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f42373f.setClipChildren(false);
            frameLayout3.addView(this.f42373f, g7.e6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.fq d = vf.c.d(this.A, "");
            this.f42378x = (vf.a) d.f28542a;
            this.v = new org.telegram.ui.Components.bl0(context);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(d, this.v, 0, 0);
            fqVar.f28550w = true;
            this.f42373f.setForumIconDrawable(fqVar);
            this.f42376s = fqVar;
            org.telegram.ui.Components.bl0 bl0Var = this.v;
            org.telegram.ui.Components.o9 o9Var2 = o9VarArr[0];
            ArrayList arrayList = bl0Var.f27241n;
            if (!arrayList.contains(o9Var2)) {
                arrayList.add(o9Var2);
            }
            org.telegram.ui.Components.bl0 bl0Var2 = this.v;
            org.telegram.ui.Components.o9 o9Var3 = o9VarArr[1];
            ArrayList arrayList2 = bl0Var2.f27241n;
            if (!arrayList2.contains(o9Var3)) {
                arrayList2.add(o9Var3);
            }
            o9VarArr[0].setImageDrawable(this.f42376s);
            AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[1], false, 1.0f, false);
            vf.a aVar = this.f42378x;
            aVar.d.add(o9VarArr[0]);
            vf.a aVar2 = this.f42378x;
            aVar2.d.add(o9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, g7.e6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f42377w;
        if (tL_forumTopic3 != null) {
            this.f42372e.setText(tL_forumTopic3.title);
            a0(Long.valueOf(this.f42377w.icon_emoji_id), true);
        } else {
            a0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42369a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f42371c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f42369a, this.f42371c);
            this.f42377w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.A = findTopic.icon_color;
        } else {
            this.A = vf.a.f48390k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f42372e.requestFocus();
        AndroidUtilities.showKeyboard(this.f42372e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f42375r) {
            removeSelfFromStack();
        }
        this.B.unlock();
        qd1 qd1Var = this.f42373f;
        if (qd1Var != null) {
            qd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
