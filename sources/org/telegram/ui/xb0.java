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
public final class xb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.l4 E;
    public tb0 F;
    public org.telegram.ui.Cells.e9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ea I;
    public org.telegram.ui.Components.zn0 J;
    public tb0 K;
    public org.telegram.ui.Cells.e9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public wb0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int f42698a;
    public final long f42699b;
    public org.telegram.ui.Components.sv0 f42700c;
    public org.telegram.ui.Components.sv0 d;
    public TLRPC.TL_chatInviteExported f42701e;
    public ub0 f42702f;
    public org.telegram.ui.Cells.e9 h;
    public org.telegram.ui.Cells.w8 f42703n;
    public vb0 f42704r;
    public TextView f42705s;
    public org.telegram.ui.Cells.e9 v;
    public TextView f42706w;
    public org.telegram.ui.Cells.l4 f42707x;
    public org.telegram.ui.Cells.e9 f42708y;

    public xb0(int i10, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f42698a = i10;
        this.f42699b = j3;
    }

    public final void V(int i10) {
        int[] iArr;
        long j3 = i10;
        this.f42706w.setText(LocaleController.formatDateAudio(j3, false));
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
        this.f42700c.b(i13, null, strArr);
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
                this.f42700c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.f42701e = tL_chatInviteExported;
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
            ub0 ub0Var = this.f42702f;
            if (ub0Var != null) {
                ub0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                this.f42702f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.w8 w8Var = this.f42703n;
            if (w8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                w8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                ub0 ub0Var2 = this.f42702f;
                if (ub0Var2 != null) {
                    ub0Var2.setChecked(false);
                    this.f42702f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.e9 e9Var = this.h;
                if (e9Var != null) {
                    e9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            vb0 vb0Var = this.f42704r;
            if (vb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vb0Var.setVisibility(i10);
                this.f42704r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f42704r.f22101b.setClickable(false);
                this.f42704r.f22101b.setFocusable(false);
                this.f42704r.f22101b.setFocusableInTouchMode(false);
                this.f42704r.f22101b.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.l4 l4Var = this.E;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        l4Var.setVisibility(i10);
        org.telegram.ui.Components.sv0 sv0Var = this.f42700c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        sv0Var.setVisibility(i11);
        tb0 tb0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        tb0Var.setVisibility(i12);
        org.telegram.ui.Cells.e9 e9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        e9Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f42698a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 4));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.h5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final xb0 f39851b;

            {
                this.f39851b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qb0.onClick(android.view.View):void");
            }
        });
        this.M.setSingleLine();
        if (i11 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.z5.a(this.M);
        this.actionBar.addView(this.M, w7.x5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        sb0 sb0Var = new sb0(this, context);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, sb0Var, this.resourceProvider, true);
        this.J = zn0Var;
        this.actionBar.setAdaptiveBackground(zn0Var);
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(4, prVar);
        layoutTransition.setInterpolator(1, prVar);
        layoutTransition.setInterpolator(3, prVar);
        sb0Var.setLayoutTransition(layoutTransition);
        sb0Var.setOrientation(1);
        sb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(sb0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f42707x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        sb0Var.addView(this.f42707x);
        org.telegram.ui.Components.sv0 sv0Var = new org.telegram.ui.Components.sv0(context, null);
        this.d = sv0Var;
        sb0Var.addView(sv0Var);
        TextView textView2 = new TextView(context);
        this.f42706w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f42706w.setGravity(16);
        this.f42706w.setTextSize(1, 16.0f);
        this.f42706w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f42706w.setOnClickListener(new tv(14, this, context));
        this.d.setCallback(new nb0(this, 2));
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
        sb0Var.addView(this.f42706w, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f42708y = e9Var;
        e9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        sb0Var.addView(this.f42708y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        sb0Var.addView(this.E);
        org.telegram.ui.Components.sv0 sv0Var2 = new org.telegram.ui.Components.sv0(context, null);
        this.f42700c = sv0Var2;
        sv0Var2.setCallback(new nb0(this, 3));
        X();
        sb0Var.addView(this.f42700c);
        tb0 tb0Var = new tb0(context, 0);
        this.F = tb0Var;
        tb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new rb0(this, 1));
        sb0Var.addView(this.F, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.G = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        sb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j3 = this.f42699b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? w8Var2 = new org.telegram.ui.Cells.w8(context);
        this.f42702f = w8Var2;
        int i13 = org.telegram.ui.ActionBar.j6.f20690d6;
        w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f42702f.setTag(Integer.valueOf(i13));
        this.f42702f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f42702f.setOnClickListener(new bi.w2(7, this, z10));
        sb0Var.addView(this.f42702f, w7.x5.n(-1, 56));
        org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.h = e9Var3;
        if (z10) {
            this.f42702f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            e9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        sb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((this.f42701e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.f42701e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.w8 w8Var3 = new org.telegram.ui.Cells.w8(context);
                this.f42703n = w8Var3;
                w8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                this.f42703n.setDrawCheckRipple(true);
                this.f42703n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.f42701e != null) {
                    this.f42703n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f42703n.setEnabled(false);
                }
                this.f42703n.setOnClickListener(new tv(15, this, new Runnable[1]));
                sb0Var.addView(this.f42703n, w7.x5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f42705s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f42705s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                vb0 vb0Var = new vb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f42704r = vb0Var;
                vb0Var.f22101b.setInputType(2);
                this.f42704r.f22101b.setRawInputType(2);
                this.f42704r.setBackgroundColor(getThemedColor(i13));
                vb0 vb0Var2 = this.f42704r;
                vb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(vb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = vb0Var2.f22101b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.s2(gVar, 2));
                this.f42704r.addView(this.f42705s, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                vb0 vb0Var3 = this.f42704r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                vb0Var3.getClass();
                ImageView imageView = new ImageView(vb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                vb0Var3.addView(imageView, w7.x5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = vb0Var3.f22101b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                sb0Var.addView(this.f42704r, w7.x5.n(-1, 48));
                this.f42704r.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
                this.v = e9Var4;
                if (this.f42701e != null) {
                    e9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new mb0(this, 2)));
                }
                sb0Var.addView(this.v, w7.x5.n(-1, -2));
            }
        }
        tb0 tb0Var2 = new tb0(context, 1);
        this.K = tb0Var2;
        tb0Var2.addTextChangedListener(new rb0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        tb0 tb0Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.j6.f21069y6;
        tb0Var3.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        tb0 tb0Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        tb0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.K.setTextSize(1, 16.0f);
        sb0Var.addView(this.K, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.L = e9Var5;
        e9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        sb0Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.I = eaVar;
            eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
            this.I.setOnClickListener(new View.OnClickListener(this) {
                public final xb0 f39851b;

                {
                    this.f39851b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qb0.onClick(android.view.View):void");
                }
            });
            sb0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i16 = org.telegram.ui.ActionBar.j6.f20634a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new di.j4(w8Var, false, new org.telegram.ui.ActionBar.j3(4));
        w8Var.addView(this.H, w7.x5.e(-1, -2, 80));
        this.f42707x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f42706w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f42700c.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f42706w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f42706w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.F.setCursorVisible(false);
        Y(this.f42701e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        sb0Var.setClipChildren(false);
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
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42707x, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.l4 l4Var = this.f42707x;
        int i11 = org.telegram.ui.ActionBar.j6.f20690d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(l4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42700c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42706w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42708y, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20964s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f21069y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20907p7));
        return arrayList;
    }
}
