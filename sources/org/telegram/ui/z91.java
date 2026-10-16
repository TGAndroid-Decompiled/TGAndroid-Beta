package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z91 extends org.telegram.ui.Components.db {
    public static final int f42247d0 = 0;
    public final zh.a X;
    public final LinearLayout Y;
    public final LinearLayout Z;
    public boolean f42248a0;
    public boolean f42249b0;
    public org.telegram.ui.Components.a71 f42250c0;

    public z91(final Context context, final int i10, final org.telegram.ui.ActionBar.c6 c6Var, final uc ucVar) {
        super(1, context, c6Var, true);
        int i11;
        int i12;
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        zh.a aVar = new zh.a(context, i10, ag.b.f634b, c6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, 0, w7.z5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.b6.a(aVar);
        aVar.setOnClickListener(new u91(context, 0, c6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i10).stakeDiceInfo;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.dice6);
        linearLayout.addView(imageView, w7.z5.t(80, 80, 1, 0, 0, 0, 8));
        int i13 = org.telegram.ui.ActionBar.g6.f19707j5;
        TextView b10 = w7.d6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new x91(c6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, w7.z5.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.StakeDiceText));
        linearLayout.addView(b11, w7.z5.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.L6, true, null);
        b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(b12, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.o01 o01Var = new org.telegram.ui.Components.o01(context, c6Var);
        linearLayout2.addView(o01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        o01Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        o01Var.addView(tableRow2);
        int i14 = R.drawable.dice1;
        int i15 = R.drawable.dice2;
        int i16 = R.drawable.dice3;
        int i17 = R.drawable.dice4;
        int i18 = R.drawable.dice5;
        int i19 = R.drawable.dice6;
        a1.d dVar = new a1.d(context, new int[]{i14, i15, i16, i17, i18, i19, i19}, c6Var, o01Var, 18);
        float f7 = 1.0f;
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f19988y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.dice6, 0);
        brVar.recolorDrawable = false;
        brVar.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(brVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(b13, w7.z5.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, w7.z5.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.Z = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context, c6Var);
        yd0Var.setForceForceUseCenter(true);
        yd0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        yd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19924uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19942vf, c6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setOnFocusChangeListener(new fi.v1(yd0Var, editTextBoldCursor, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        yd0Var.e(editTextBoldCursor);
        yd0Var.addView(linearLayout4, w7.z5.e(-1, -2, 48));
        linearLayout3.addView(yd0Var, w7.z5.n(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A6, false));
        yd0Var.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        editTextBoldCursor.setText(zh.p7.N0(j10 <= 0 ? 1000000000L : j10));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
        final int[] iArr = {2};
        yd0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        editTextBoldCursor.addTextChangedListener(new y91(i10, editTextBoldCursor, yd0Var, iArr, textView));
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Long l4 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.g6.Oh;
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, c6Var2));
                textView2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, org.telegram.ui.ActionBar.g6.w0(i20, c6Var2))));
                textView2.setText(zh.p7.P0(zh.p7.N0(l4.longValue()) + " 💎", 0.75f));
                w7.b6.a(textView2);
                textView2.setOnClickListener(new bz0(5, editTextBoldCursor, l4));
                return textView2;
            }
        };
        long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
        int i20 = 0;
        while (i20 < Utilities.divCeil(jArr.length, 3)) {
            LinearLayout e = org.telegram.messenger.sk.e(context, 0);
            int i21 = 0;
            while (true) {
                int i22 = i20 * 3;
                if (i21 < Math.min(3, jArr.length - i22)) {
                    View view = (View) callbackReturn.run(Long.valueOf(jArr[i22 + i21]));
                    float f10 = f7;
                    if (i21 == 2) {
                        i12 = 0;
                    } else {
                        i12 = 6;
                    }
                    e.addView(view, w7.z5.p(0, 26, 1.0f, 112, 0, 0, i12, 0));
                    i21++;
                    f7 = f10;
                }
            }
            this.Z.addView(e, w7.z5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            i20++;
            f7 = f7;
        }
        float f11 = f7;
        di.d dVar2 = new di.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.br brVar2 = new org.telegram.ui.Components.br(R.drawable.mini_roll, 0);
        brVar2.setTranslateY(AndroidUtilities.dp(f11));
        spannableStringBuilder3.setSpan(brVar2, 0, spannableStringBuilder3.length(), 33);
        spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                double parseDouble;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                Editable text = editTextBoldCursor2.getText();
                try {
                    if (TextUtils.isEmpty(text)) {
                        parseDouble = 0.0d;
                    } else {
                        parseDouble = Double.parseDouble(text.toString());
                    }
                    int i23 = i10;
                    int i24 = (parseDouble > (MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d) ? 1 : (parseDouble == (MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d) ? 0 : -1));
                    org.telegram.ui.Components.yd0 yd0Var2 = yd0Var;
                    int[] iArr2 = iArr;
                    if (i24 > 0) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i25 = -iArr2[0];
                        iArr2[0] = i25;
                        AndroidUtilities.shakeViewSpring(yd0Var2, i25);
                    } else if (!TextUtils.isEmpty(text) && parseDouble < MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i26 = -iArr2[0];
                        iArr2[0] = i26;
                        AndroidUtilities.shakeViewSpring(yd0Var2, i26);
                    } else if (zh.n5.y(i23, true).f50868f.toDouble() < parseDouble) {
                        new ei.h(context, c6Var, ag.a.i((long) (parseDouble * 1.0E9d), ag.b.f634b), true, new b31(3));
                    } else {
                        ucVar.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                        z91.this.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dVar2, w7.z5.t(-1, 48, 87, 16, 0, 16, 10));
        ViewGroup viewGroup = this.containerView;
        int i23 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, w7.z5.f(-2.0f, 87, i23, 0, i23, 0));
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(68.0f));
        this.f42250c0.N(false);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }

    public final void Q() {
        boolean z10;
        float f7;
        if (this.f42248a0 && !isDismissed() && !isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42249b0 != z10) {
            this.f42249b0 = z10;
            zh.a aVar = this.X;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                org.telegram.messenger.sk.s(scaleY, f11, 180L);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        zh.a aVar = this.X;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        Q();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f42248a0 = false;
        Q();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f42248a0 = true;
        Q();
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 27), this.resourcesProvider);
        this.f42250c0 = a71Var;
        return a71Var;
    }
}
