package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
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
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r31 extends org.telegram.ui.Components.ja {
    public static final int Z1 = 0;
    public final di.b T1;
    public final LinearLayout U1;
    public final LinearLayout V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Components.p41 Y1;

    public r31(final Context context, final int i7, final org.telegram.ui.ActionBar.e6 e6Var, final li.v vVar) {
        super(1, context, e6Var, true);
        int i10;
        int i11;
        this.f29679a = i7;
        this.f35938v1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        di.b bVar = new di.b(context, i7, cg.b.f4991b, e6Var);
        this.T1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.f29685c.addView(bVar, 0, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.na.a(bVar);
        bVar.setOnClickListener(new bi.p(2, context, e6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.np.s1(i7).f25442x8;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231061);
        linearLayout.addView(imageView, c8.ja.t(80, 80, 1, 0, 0, 0, 8));
        int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
        TextView b10 = c8.sa.b(context, 20.0f, i12, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745238, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745237, null));
        spannableStringBuilder.setSpan(new fi.k0(e6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, c8.ja.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = c8.sa.b(context, 14.0f, i12, false, null);
        org.telegram.messenger.k5.l(b11, 17, null, 2131745239);
        linearLayout.addView(b11, c8.ja.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.L6, true, null);
        b12.setText(org.telegram.messenger.hd.M0(2131745241, null));
        linearLayout2.addView(b12, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, e6Var);
        linearLayout2.addView(vx0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        vx0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        vx0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{2131231056, 2131231057, 2131231058, 2131231059, 2131231060, 2131231061, 2131231061}, e6Var, vx0Var, 21);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231061, 0);
        eqVar.d = false;
        eqVar.I = 0.8f;
        eqVar.J = 0.8f;
        spannableStringBuilder2.setSpan(eqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.g0.M2(org.telegram.messenger.hd.M0(2131745240, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, c8.ja.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, c8.ja.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.V1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, e6Var);
        mb0Var.setForceForceUseCenter(true);
        mb0Var.setText(org.telegram.messenger.hd.M0(2131745242, null));
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, org.telegram.ui.ActionBar.j6.G6, e6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.q6.C(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f29005lg, e6Var);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new di.n9(mb0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231054);
        linearLayout4.addView(imageView2, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, c8.ja.p(-1, -2, 1.0f, 119));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(linearLayout4, c8.ja.e(-1, -2, 48));
        linearLayout3.addView(mb0Var, c8.ja.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.A6, null);
        mb0Var.addView(textView, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j3 = tL_emojiGameDiceInfo.prev_stake;
        j3 = j3 <= 0 ? 1000000000L : j3;
        editTextBoldCursor.setText(di.lb.P0(j3));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.r1.i().getClass();
        sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) ((j3 / 1.0E9d) * ((org.telegram.messenger.i0) org.telegram.messenger.np.s1(i7).f25451y7.f25857l.f13134b).f24257a * 100.0d), false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        mb0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new q31(i7, editTextBoldCursor, mb0Var, iArr, textView));
        org.telegram.messenger.a20 a20Var = new org.telegram.messenger.a20() {
            @Override
            public final Object a(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i13 = org.telegram.ui.ActionBar.j6.Fi;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.q6.U(textView2, i13, e6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var2)));
                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.15f, i13);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(textView2, d02, K, null, e6Var2);
                textView2.setText(di.lb.R0(di.lb.P0(l10.longValue()) + " 💎", 0.75f));
                c8.na.a(textView2);
                textView2.setOnClickListener(new a90(19, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.np.s1(i7).f25255c7;
        int i13 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.f22413a;
            int i14 = 3;
            if (i13 < (length2 + 2) / 3) {
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
                int i15 = 0;
                while (true) {
                    int i16 = i13 * 3;
                    if (i15 < Math.min(i14, jArr.length - i16)) {
                        View view = (View) a20Var.a(Long.valueOf(jArr[i16 + i15]));
                        if (i15 == 2) {
                            i11 = 0;
                        } else {
                            i11 = 6;
                        }
                        f10.addView(view, c8.ja.q(0, 26, 1.0f, 112, 0, 0, i11, 0));
                        i15++;
                        i14 = 3;
                    }
                }
                this.V1.addView(f10, c8.ja.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i13++;
            } else {
                hi.d dVar2 = new hi.d(context, e6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(2131231972, 0);
                eqVar2.f34415s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder3.setSpan(eqVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131745243, null));
                dVar2.i(spannableStringBuilder3, false, true);
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
                            int i17 = i7;
                            int i18 = (parseDouble > (org.telegram.messenger.np.s1(i17).f25245b7 / 1.0E9d) ? 1 : (parseDouble == (org.telegram.messenger.np.s1(i17).f25245b7 / 1.0E9d) ? 0 : -1));
                            org.telegram.ui.Components.mb0 mb0Var2 = mb0Var;
                            int[] iArr2 = iArr;
                            if (i18 > 0) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.np.s1(i17).f25245b7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i19 = -iArr2[0];
                                iArr2[0] = i19;
                                org.telegram.messenger.g0.F3(i19, mb0Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < org.telegram.messenger.np.s1(i17).f25235a7 / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.np.s1(i17).f25235a7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i20 = -iArr2[0];
                                iArr2[0] = i20;
                                org.telegram.messenger.g0.F3(i20, mb0Var2, null);
                            } else if (di.u8.y(i17, true).f9533f.toDouble() < parseDouble) {
                                new ii.e(context, e6Var, cg.a.i((long) (parseDouble * 1.0E9d), cg.b.f4991b), true, new ah0(3));
                            } else {
                                vVar.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                r31.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(dVar2, c8.ja.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.f29682b;
                int i17 = this.f29717u0;
                viewGroup.addView(frameLayout, c8.ja.f(-2.0f, -1, 87, i17, 0, i17, 0));
                org.telegram.ui.Components.uj0 uj0Var = this.f35931o1;
                int i18 = this.f29717u0;
                uj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(68.0f));
                this.Y1.O(false);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.f29679a, 0, false, new a5(this, 28), this.J0);
        this.Y1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745238, null);
    }

    @Override
    public final boolean Y(float f10, float f11) {
        di.b bVar = this.T1;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    public final void d1() {
        boolean z10;
        float f10;
        if (this.W1 && !this.J && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X1 != z10) {
            this.X1 = z10;
            di.b bVar = this.T1;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                org.telegram.messenger.i20.m(scaleY, f12, 180L);
            }
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override
    public final void n0() {
        this.W1 = false;
        d1();
    }

    @Override
    public final void v() {
        this.W1 = true;
        d1();
    }
}
