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
public final class s91 extends org.telegram.ui.Components.db {
    public static final int f41655d0 = 0;
    public final yh.a X;
    public final LinearLayout Y;
    public final LinearLayout Z;
    public boolean f41656a0;
    public boolean f41657b0;
    public org.telegram.ui.Components.e71 f41658c0;

    public s91(final Context context, final int i10, final org.telegram.ui.ActionBar.d6 d6Var, final oc ocVar) {
        super(1, context, d6Var, true);
        int i11;
        int i12;
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        yh.a aVar = new yh.a(context, i10, zf.b.f54531b, d6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, 0, w7.x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new n91(context, 0, d6Var));
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
        linearLayout.addView(imageView, w7.x5.t(80, 80, 1, 0, 0, 0, 8));
        int i13 = org.telegram.ui.ActionBar.h6.f20894j5;
        TextView b10 = w7.b6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new q91(d6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, w7.x5.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.StakeDiceText));
        linearLayout.addView(b11, w7.x5.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.L6, true, null);
        b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(b12, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.t01 t01Var = new org.telegram.ui.Components.t01(context, d6Var);
        linearLayout2.addView(t01Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        t01Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        t01Var.addView(tableRow2);
        int i14 = R.drawable.dice1;
        int i15 = R.drawable.dice2;
        int i16 = R.drawable.dice3;
        int i17 = R.drawable.dice4;
        int i18 = R.drawable.dice5;
        int i19 = R.drawable.dice6;
        a1.d dVar = new a1.d(context, new int[]{i14, i15, i16, i17, i18, i19, i19}, d6Var, t01Var, 18);
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
        TextView b13 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.f21171y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.dice6, 0);
        erVar.recolorDrawable = false;
        erVar.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(erVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(b13, w7.x5.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, w7.x5.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.Z = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0(context, d6Var);
        be0Var.setForceForceUseCenter(true);
        be0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        be0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21109uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21126vf, d6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setOnFocusChangeListener(new ei.w1(be0Var, editTextBoldCursor, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, w7.x5.o(-1, -2, 1.0f, 119));
        be0Var.e(editTextBoldCursor);
        be0Var.addView(linearLayout4, w7.x5.e(-1, -2, 48));
        linearLayout3.addView(be0Var, w7.x5.n(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
        be0Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        long j3 = tL_emojiGameDiceInfo.prev_stake;
        editTextBoldCursor.setText(yh.p7.N0(j3 <= 0 ? 1000000000L : j3));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j3 / 1.0E9d) * 100.0d), "USD", 2));
        final int[] iArr = {2};
        be0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        editTextBoldCursor.addTextChangedListener(new r91(i10, editTextBoldCursor, be0Var, iArr, textView));
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Long l4 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.h6.Oh;
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var2));
                textView2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.w0(i20, d6Var2))));
                textView2.setText(yh.p7.P0(yh.p7.N0(l4.longValue()) + " 💎", 0.75f));
                w7.z5.a(textView2);
                textView2.setOnClickListener(new uy0(5, editTextBoldCursor, l4));
                return textView2;
            }
        };
        long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
        int i20 = 0;
        while (i20 < Utilities.divCeil(jArr.length, 3)) {
            LinearLayout e7 = org.telegram.messenger.ai.e(context, 0);
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
                    e7.addView(view, w7.x5.p(0, 26, 1.0f, 112, 0, 0, i12, 0));
                    i21++;
                    f7 = f10;
                }
            }
            this.Z.addView(e7, w7.x5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            i20++;
            f7 = f7;
        }
        float f11 = f7;
        ci.d dVar2 = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.er erVar2 = new org.telegram.ui.Components.er(R.drawable.mini_roll, 0);
        erVar2.setTranslateY(AndroidUtilities.dp(f11));
        spannableStringBuilder3.setSpan(erVar2, 0, spannableStringBuilder3.length(), 33);
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
                    org.telegram.ui.Components.be0 be0Var2 = be0Var;
                    int[] iArr2 = iArr;
                    if (i24 > 0) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i25 = -iArr2[0];
                        iArr2[0] = i25;
                        AndroidUtilities.shakeViewSpring(be0Var2, i25);
                    } else if (!TextUtils.isEmpty(text) && parseDouble < MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i26 = -iArr2[0];
                        iArr2[0] = i26;
                        AndroidUtilities.shakeViewSpring(be0Var2, i26);
                    } else if (yh.n5.y(i23, true).f53001f.toDouble() < parseDouble) {
                        new di.h(context, d6Var, zf.a.i((long) (parseDouble * 1.0E9d), zf.b.f54531b), true, new s21(2));
                    } else {
                        ocVar.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                        s91.this.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dVar2, w7.x5.t(-1, 48, 87, 16, 0, 16, 10));
        ViewGroup viewGroup = this.containerView;
        int i23 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, w7.x5.f(-2.0f, 87, i23, 0, i23, 0));
        org.telegram.ui.Components.sm0 sm0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(68.0f));
        this.f41658c0.N(false);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }

    public final void Q() {
        boolean z10;
        float f7;
        if (this.f41656a0 && !isDismissed() && !isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f41657b0 != z10) {
            this.f41657b0 = z10;
            yh.a aVar = this.X;
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
                org.telegram.messenger.ai.s(scaleY, f11, 180L);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        yh.a aVar = this.X;
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
        this.f41656a0 = false;
        Q();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f41656a0 = true;
        Q();
    }

    @Override
    public final org.telegram.ui.Components.rm0 x(org.telegram.ui.Components.sm0 sm0Var) {
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(sm0Var, getContext(), this.currentAccount, 0, false, new a5(this, 27), this.resourcesProvider);
        this.f41658c0 = e71Var;
        return e71Var;
    }
}
