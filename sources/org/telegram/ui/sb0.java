package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.m4 E;
    public ob0 F;
    public org.telegram.ui.Cells.f9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.fa I;
    public org.telegram.ui.Components.zn0 J;
    public ob0 K;
    public org.telegram.ui.Cells.f9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public rb0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int f37226a;
    public final long f37227b;
    public org.telegram.ui.Components.tv0 f37228c;
    public org.telegram.ui.Components.tv0 d;
    public TLRPC.TL_chatInviteExported e;
    public pb0 f37229f;
    public org.telegram.ui.Cells.f9 h;
    public org.telegram.ui.Cells.x8 f37230n;
    public qb0 f37231r;
    public TextView f37232s;
    public org.telegram.ui.Cells.f9 v;
    public TextView f37233w;
    public org.telegram.ui.Cells.m4 f37234x;
    public org.telegram.ui.Cells.f9 f37235y;

    public sb0(int i10, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f37226a = i10;
        this.f37227b = j3;
    }

    public final void V(int i10) {
        int[] iArr;
        long j3 = i10;
        this.f37233w.setText(LocaleController.formatDateAudio(j3, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.vision.e2.e(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i14] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j10 < 31449600) {
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(j3 * 1000);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(j3 * 1000);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.S;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = com.google.android.gms.internal.vision.e2.e(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.f37228c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i10 < iArr.length) {
                i10 = com.google.android.gms.internal.vision.e2.e(iArr[i10], i10, 1, arrayList);
            } else {
                this.f37228c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i11 = tL_chatInviteExported.expire_date;
            if (i11 > 0) {
                V(i11);
                this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.W = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                W(i12);
                this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            pb0 pb0Var = this.f37229f;
            if (pb0Var != null) {
                pb0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                this.f37229f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.x8 x8Var = this.f37230n;
            if (x8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                x8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                pb0 pb0Var2 = this.f37229f;
                if (pb0Var2 != null) {
                    pb0Var2.setChecked(false);
                    this.f37229f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.f9 f9Var = this.h;
                if (f9Var != null) {
                    f9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            qb0 qb0Var = this.f37231r;
            if (qb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                qb0Var.setVisibility(i10);
                this.f37231r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f37231r.f20177b.setClickable(false);
                this.f37231r.f20177b.setFocusable(false);
                this.f37231r.f20177b.setFocusableInTouchMode(false);
                this.f37231r.f20177b.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.m4 m4Var = this.E;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        m4Var.setVisibility(i10);
        org.telegram.ui.Components.tv0 tv0Var = this.f37228c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tv0Var.setVisibility(i11);
        ob0 ob0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ob0Var.setVisibility(i12);
        org.telegram.ui.Cells.f9 f9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        f9Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37226a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 3));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.g5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final sb0 f34908b;

            {
                this.f34908b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb0.onClick(android.view.View):void");
            }
        });
        this.M.setSingleLine();
        if (i11 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.z5.a(this.M);
        this.actionBar.addView(this.M, w7.x5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        nb0 nb0Var = new nb0(this, context);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, nb0Var, this.resourceProvider, true);
        this.J = zn0Var;
        this.actionBar.setAdaptiveBackground(zn0Var);
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        layoutTransition.setInterpolator(2, rrVar);
        layoutTransition.setInterpolator(0, rrVar);
        layoutTransition.setInterpolator(4, rrVar);
        layoutTransition.setInterpolator(1, rrVar);
        layoutTransition.setInterpolator(3, rrVar);
        nb0Var.setLayoutTransition(layoutTransition);
        nb0Var.setOrientation(1);
        nb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(nb0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f37234x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        nb0Var.addView(this.f37234x);
        org.telegram.ui.Components.tv0 tv0Var = new org.telegram.ui.Components.tv0(context, null);
        this.d = tv0Var;
        nb0Var.addView(tv0Var);
        TextView textView2 = new TextView(context);
        this.f37233w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f37233w.setGravity(16);
        this.f37233w.setTextSize(1, 16.0f);
        this.f37233w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f37233w.setOnClickListener(new pv(14, this, context));
        this.d.setCallback(new ib0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = com.google.android.gms.internal.vision.e2.e(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        nb0Var.addView(this.f37233w, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.f37235y = f9Var;
        f9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        nb0Var.addView(this.f37235y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.E = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        nb0Var.addView(this.E);
        org.telegram.ui.Components.tv0 tv0Var2 = new org.telegram.ui.Components.tv0(context, null);
        this.f37228c = tv0Var2;
        tv0Var2.setCallback(new ib0(this, 3));
        X();
        nb0Var.addView(this.f37228c);
        ob0 ob0Var = new ob0(context, 0);
        this.F = ob0Var;
        ob0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new mb0(this, 1));
        nb0Var.addView(this.F, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.G = f9Var2;
        f9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        nb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j3 = this.f37227b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? x8Var = new org.telegram.ui.Cells.x8(context);
        this.f37229f = x8Var;
        int i13 = org.telegram.ui.ActionBar.h6.f18789d6;
        x8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.f37229f.setTag(Integer.valueOf(i13));
        this.f37229f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f37229f.setOnClickListener(new ai.j3(7, this, z10));
        nb0Var.addView(this.f37229f, w7.x5.n(-1, 56));
        org.telegram.ui.Cells.f9 f9Var3 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.h = f9Var3;
        if (z10) {
            this.f37229f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            f9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        nb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
                this.f37230n = x8Var2;
                x8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                this.f37230n.setDrawCheckRipple(true);
                this.f37230n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f37230n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f37230n.setEnabled(false);
                }
                this.f37230n.setOnClickListener(new pv(15, this, new Runnable[1]));
                nb0Var.addView(this.f37230n, w7.x5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f37232s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f37232s.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                qb0 qb0Var = new qb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f37231r = qb0Var;
                qb0Var.f20177b.setInputType(2);
                this.f37231r.f20177b.setRawInputType(2);
                this.f37231r.setBackgroundColor(getThemedColor(i13));
                qb0 qb0Var2 = this.f37231r;
                qb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(qb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = qb0Var2.f20177b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.s2(gVar, 2));
                this.f37231r.addView(this.f37232s, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                qb0 qb0Var3 = this.f37231r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                qb0Var3.getClass();
                ImageView imageView = new ImageView(qb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                qb0Var3.addView(imageView, w7.x5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = qb0Var3.f20177b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                nb0Var.addView(this.f37231r, w7.x5.n(-1, 48));
                this.f37231r.setVisibility(8);
                org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
                this.v = f9Var4;
                if (this.e != null) {
                    f9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    f9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new hb0(this, 2)));
                }
                nb0Var.addView(this.v, w7.x5.n(-1, -2));
            }
        }
        ob0 ob0Var2 = new ob0(context, 1);
        this.K = ob0Var2;
        ob0Var2.addTextChangedListener(new mb0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        ob0 ob0Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.h6.f19170y6;
        ob0Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        ob0 ob0Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        ob0Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.K.setTextSize(1, 16.0f);
        nb0Var.addView(this.K, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var5 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.L = f9Var5;
        f9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        nb0Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
            this.I = faVar;
            faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
            this.I.setOnClickListener(new View.OnClickListener(this) {
                public final sb0 f34908b;

                {
                    this.f34908b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb0.onClick(android.view.View):void");
                }
            });
            nb0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i16 = org.telegram.ui.ActionBar.h6.f18733a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new ci.i4(w8Var, false, new ai.i(17));
        w8Var.addView(this.H, w7.x5.e(-1, -2, 80));
        this.f37234x.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.f37233w.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.f37228c.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.f37233w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.f37233w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.F.setCursorVisible(false);
        Y(this.e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        nb0Var.setClipChildren(false);
        return w8Var;
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37234x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.m4 m4Var = this.f37234x;
        int i11 = org.telegram.ui.ActionBar.h6.f18789d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(m4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37228c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37233w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37235y, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f19008p7));
        return arrayList;
    }
}
