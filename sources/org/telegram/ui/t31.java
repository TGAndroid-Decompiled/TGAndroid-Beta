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
public final class t31 extends org.telegram.ui.Components.ra {
    public static final int Z1 = 0;
    public final di.b T1;
    public final LinearLayout U1;
    public final LinearLayout V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Components.b51 Y1;

    public t31(final Context context, final int i7, final org.telegram.ui.ActionBar.i6 i6Var, final ki.n2 n2Var) {
        super(1, context, i6Var, true);
        int i10;
        int i11;
        this.f30223a = i7;
        this.f39253v1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        di.b bVar = new di.b(context, i7, cg.b.f5269b, i6Var);
        this.T1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.f30229c.addView(bVar, 0, c8.na.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.sa.a(bVar);
        bVar.setOnClickListener(new bi.p(2, context, i6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.mp.u1(i7).C8;
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
        imageView.setImageResource(2131231063);
        linearLayout.addView(imageView, c8.na.t(80, 80, 1, 0, 0, 0, 8));
        int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
        TextView b10 = c8.wa.b(context, 20.0f, i12, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744997, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131744996, null));
        spannableStringBuilder.setSpan(new fi.j0(i6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, c8.na.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = c8.wa.b(context, 14.0f, i12, false, null);
        org.telegram.messenger.f3.k(b11, 17, null, 2131744998);
        linearLayout.addView(b11, c8.na.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = c8.wa.b(context, 14.0f, org.telegram.ui.ActionBar.n6.L6, true, null);
        b12.setText(org.telegram.messenger.gd.N0(2131745000, null));
        linearLayout2.addView(b12, c8.na.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(context, i6Var);
        linearLayout2.addView(dy0Var, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        dy0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        dy0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{2131231058, 2131231059, 2131231060, 2131231061, 2131231062, 2131231063, 2131231063}, i6Var, dy0Var, 21);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = c8.wa.b(context, 14.0f, org.telegram.ui.ActionBar.n6.f29843y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131231063, 0);
        kqVar.d = false;
        kqVar.I = 0.8f;
        kqVar.J = 0.8f;
        spannableStringBuilder2.setSpan(kqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.g0.M2(org.telegram.messenger.gd.N0(2131744999, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, c8.na.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, c8.na.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.V1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.vb0 vb0Var = new org.telegram.ui.Components.vb0(context, i6Var);
        vb0Var.setForceForceUseCenter(true);
        vb0Var.setText(org.telegram.messenger.gd.N0(2131745001, null));
        vb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, org.telegram.ui.ActionBar.n6.G6, i6Var);
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
        org.telegram.ui.ActionBar.u6.C(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29607lg, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.n6.f29624mg, i6Var);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new di.r9(vb0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231056);
        linearLayout4.addView(imageView2, c8.na.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, c8.na.p(-1, -2, 1.0f, 119));
        vb0Var.e(editTextBoldCursor);
        vb0Var.addView(linearLayout4, c8.na.e(-1, -2, 48));
        linearLayout3.addView(vb0Var, c8.na.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, null);
        vb0Var.addView(textView, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j3 = tL_emojiGameDiceInfo.prev_stake;
        j3 = j3 <= 0 ? 1000000000L : j3;
        editTextBoldCursor.setText(di.pb.P0(j3));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.r1.i().getClass();
        sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) ((j3 / 1.0E9d) * ((org.telegram.messenger.i0) org.telegram.messenger.mp.u1(i7).A7.f26246l.f13936b).f24630a * 100.0d), false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        vb0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new s31(i7, editTextBoldCursor, vb0Var, iArr, textView));
        org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() {
            @Override
            public final Object a(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i13 = org.telegram.ui.ActionBar.n6.Fi;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.u6.U(textView2, i13, i6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.w0(i13, i6Var2)));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.15f, i13);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(textView2, d02, K, null, i6Var2);
                textView2.setText(di.pb.R0(di.pb.P0(l10.longValue()) + " 💎", 0.75f));
                c8.sa.a(textView2);
                textView2.setOnClickListener(new ig0(13, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.mp.u1(i7).f25734e7;
        int i13 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.f22874a;
            int i14 = 3;
            if (i13 < (length2 + 2) / 3) {
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
                int i15 = 0;
                while (true) {
                    int i16 = i13 * 3;
                    if (i15 < Math.min(i14, jArr.length - i16)) {
                        View view = (View) x10Var.a(Long.valueOf(jArr[i16 + i15]));
                        if (i15 == 2) {
                            i11 = 0;
                        } else {
                            i11 = 6;
                        }
                        g10.addView(view, c8.na.q(0, 26, 1.0f, 112, 0, 0, i11, 0));
                        i15++;
                        i14 = 3;
                    }
                }
                this.V1.addView(g10, c8.na.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i13++;
            } else {
                hi.e eVar = new hi.e(context, i6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.kq kqVar2 = new org.telegram.ui.Components.kq(2131231976, 0);
                kqVar2.f36854s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder3.setSpan(kqVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.N0(2131745002, null));
                eVar.i(spannableStringBuilder3, false, true);
                eVar.setOnClickListener(new View.OnClickListener() {
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
                            int i18 = (parseDouble > (org.telegram.messenger.mp.u1(i17).f25724d7 / 1.0E9d) ? 1 : (parseDouble == (org.telegram.messenger.mp.u1(i17).f25724d7 / 1.0E9d) ? 0 : -1));
                            org.telegram.ui.Components.vb0 vb0Var2 = vb0Var;
                            int[] iArr2 = iArr;
                            if (i18 > 0) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.mp.u1(i17).f25724d7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i19 = -iArr2[0];
                                iArr2[0] = i19;
                                org.telegram.messenger.g0.E3(i19, vb0Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < org.telegram.messenger.mp.u1(i17).f25716c7 / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.mp.u1(i17).f25716c7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i20 = -iArr2[0];
                                iArr2[0] = i20;
                                org.telegram.messenger.g0.E3(i20, vb0Var2, null);
                            } else if (di.y8.y(i17, true).f10050f.toDouble() < parseDouble) {
                                new ii.s(context, i6Var, cg.a.j((long) (parseDouble * 1.0E9d), cg.b.f5269b), true, new cd0(5));
                            } else {
                                n2Var.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                t31.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(eVar, c8.na.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.f30226b;
                int i17 = this.f30261u0;
                viewGroup.addView(frameLayout, c8.na.f(-2.0f, -1, 87, i17, 0, i17, 0));
                org.telegram.ui.Components.ek0 ek0Var = this.f39246o1;
                int i18 = this.f30261u0;
                ek0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(68.0f));
                this.Y1.O(false);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.f30223a, 0, false, new a5(this, 28), this.J0);
        this.Y1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131744997, null);
    }

    @Override
    public final boolean Y(float f10, float f11) {
        di.b bVar = this.T1;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    public final void e1() {
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
                org.telegram.messenger.m10.n(scaleY, f12, 180L);
            }
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    @Override
    public final void n0() {
        this.W1 = false;
        e1();
    }

    @Override
    public final void v() {
        this.W1 = true;
        e1();
    }
}
