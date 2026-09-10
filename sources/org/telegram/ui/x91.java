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
public final class x91 extends org.telegram.ui.Components.ab {
    public static final int f38646d0 = 0;
    public final xh.a X;
    public final LinearLayout Y;
    public final LinearLayout Z;
    public boolean f38647a0;
    public boolean f38648b0;
    public org.telegram.ui.Components.j61 f38649c0;

    public x91(final Context context, final int i10, final org.telegram.ui.ActionBar.f6 f6Var, final pf pfVar) {
        super(1, context, f6Var, true);
        int i11;
        int i12;
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        xh.a aVar = new xh.a(context, i10, yf.b.f46929b, f6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, 0, w7.a6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new s91(context, 0, f6Var));
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
        linearLayout.addView(imageView, w7.a6.t(80, 80, 1, 0, 0, 0, 8));
        int i13 = org.telegram.ui.ActionBar.j6.f18034j5;
        TextView b10 = w7.e6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new v91(f6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, w7.a6.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = w7.e6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.StakeDiceText));
        linearLayout.addView(b11, w7.a6.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = w7.e6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.L6, true, null);
        b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(b12, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01(context, f6Var);
        linearLayout2.addView(b01Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        b01Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        b01Var.addView(tableRow2);
        int i14 = R.drawable.dice1;
        int i15 = R.drawable.dice2;
        int i16 = R.drawable.dice3;
        int i17 = R.drawable.dice4;
        int i18 = R.drawable.dice5;
        int i19 = R.drawable.dice6;
        a1.d dVar = new a1.d(context, new int[]{i14, i15, i16, i17, i18, i19, i19}, f6Var, b01Var, 18);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = w7.e6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f18306y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.dice6, 0);
        uqVar.recolorDrawable = false;
        uqVar.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(uqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(b13, w7.a6.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, w7.a6.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.Z = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, f6Var);
        hd0Var.setForceForceUseCenter(true);
        hd0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        hd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setOnFocusChangeListener(new di.z1(hd0Var, editTextBoldCursor, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, w7.a6.o(-1, -2, 1.0f, 119));
        hd0Var.e(editTextBoldCursor);
        hd0Var.addView(linearLayout4, w7.a6.e(-1, -2, 48));
        linearLayout3.addView(hd0Var, w7.a6.n(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        hd0Var.addView(textView, w7.a6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j3 = tL_emojiGameDiceInfo.prev_stake;
        j3 = j3 <= 0 ? 1000000000L : j3;
        editTextBoldCursor.setText(xh.z7.M0(j3));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j3 / 1.0E9d) * 100.0d), "USD", 2));
        final int[] iArr = {2};
        hd0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        editTextBoldCursor.addTextChangedListener(new w91(i10, editTextBoldCursor, hd0Var, iArr, textView));
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Long l4 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.j6.Oh;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i20, f6Var2));
                textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(i20, f6Var2))));
                textView2.setText(xh.z7.O0(xh.z7.M0(l4.longValue()) + " 💎", 0.75f));
                w7.c6.a(textView2);
                textView2.setOnClickListener(new w71(2, editTextBoldCursor, l4));
                return textView2;
            }
        };
        long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
        for (int i20 = 0; i20 < Utilities.divCeil(jArr.length, 3); i20++) {
            LinearLayout f7 = org.telegram.messenger.em.f(context, 0);
            int i21 = 0;
            while (true) {
                int i22 = i20 * 3;
                if (i21 < Math.min(3, jArr.length - i22)) {
                    View view = (View) callbackReturn.run(Long.valueOf(jArr[i22 + i21]));
                    if (i21 == 2) {
                        i12 = 0;
                    } else {
                        i12 = 6;
                    }
                    f7.addView(view, w7.a6.p(0, 26, 1.0f, 112, 0, 0, i12, 0));
                    i21++;
                }
            }
            this.Z.addView(f7, w7.a6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
        }
        bi.d dVar2 = new bi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.uq uqVar2 = new org.telegram.ui.Components.uq(R.drawable.mini_roll, 0);
        uqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder3.setSpan(uqVar2, 0, spannableStringBuilder3.length(), 33);
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
                    org.telegram.ui.Components.hd0 hd0Var2 = hd0Var;
                    int[] iArr2 = iArr;
                    if (parseDouble > MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i24 = -iArr2[0];
                        iArr2[0] = i24;
                        AndroidUtilities.shakeViewSpring(hd0Var2, i24);
                    } else if (!TextUtils.isEmpty(text) && parseDouble < MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i25 = -iArr2[0];
                        iArr2[0] = i25;
                        AndroidUtilities.shakeViewSpring(hd0Var2, i25);
                    } else if (xh.v5.y(i23, true).f46179f.toDouble() < parseDouble) {
                        new ci.i(context, f6Var, yf.a.i((long) (parseDouble * 1.0E9d), yf.b.f46929b), true, new org.telegram.ui.Components.c30(25));
                    } else {
                        pfVar.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                        x91.this.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dVar2, w7.a6.t(-1, 48, 87, 16, 0, 16, 10));
        ViewGroup viewGroup = this.containerView;
        int i23 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, w7.a6.f(-2.0f, 87, i23, 0, i23, 0));
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(68.0f));
        this.f38649c0.N(false);
    }

    public final void P() {
        boolean z10;
        float f7;
        if (this.f38647a0 && !isDismissed() && !isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38648b0 != z10) {
            this.f38648b0 = z10;
            xh.a aVar = this.X;
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
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        xh.a aVar = this.X;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        P();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f38647a0 = false;
        P();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f38647a0 = true;
        P();
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(vl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 27), this.resourcesProvider);
        this.f38649c0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
