package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class vd extends LinearLayout {
    public final LinearLayout f50458a;
    public final LinearLayout[] f50459b;
    public final org.telegram.ui.Components.o5[] f50460c;
    public final TextView[] d;
    public final TextView f50461e;
    public final DecimalFormat f50462f;

    public vd(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50459b = new LinearLayout[2];
        this.f50460c = new org.telegram.ui.Components.o5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50458a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i3 = 0; i3 < 2; i3++) {
            this.f50459b[i3] = new LinearLayout(context);
            this.f50459b[i3].setOrientation(0);
            this.f50458a.addView(this.f50459b[i3], b8.mf.p(-1, -2, 1.0f, 119));
            this.f50460c[i3] = new org.telegram.ui.Components.o5(context);
            this.f50460c[i3].setTypeface(org.telegram.messenger.g0.o());
            this.f50460c[i3].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(this.f50460c[i3], org.telegram.ui.ActionBar.k6.G6, e6Var);
            this.f50459b[i3].addView(this.f50460c[i3], b8.mf.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i3] = new org.telegram.ui.Components.o5(context);
            this.d[i3].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.r6.V(this.d[i3], org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
            this.f50459b[i3].addView(this.d[i3], b8.mf.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f50461e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        addView(textView, b8.mf.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f50462f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void set(ud udVar) {
        String str;
        long j10;
        int i3;
        int indexOf;
        this.f50461e.setText(udVar.f50053c);
        int i10 = 0;
        while (i10 < 2) {
            if (i10 == 0) {
                str = udVar.f50052b;
            } else {
                str = udVar.h;
            }
            if (i10 == 0) {
                j10 = udVar.f50054e;
            } else {
                j10 = udVar.f50058j;
            }
            LinearLayout[] linearLayoutArr = this.f50459b;
            if (i10 == 0 && !udVar.f50051a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 == 1 && !udVar.f50056g) {
                linearLayoutArr[i10].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t4.c.q(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f50460c;
                if (equalsIgnoreCase) {
                    String format = this.f50462f.format(udVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i3 = i10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.E((long) Math.floor(udVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i3 = i10;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = xd.K(spannableStringBuilder, textViewArr[i3].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i3 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i3 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.E(udVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) ci.wb.M0(udVar.f50057i, 0.8f, ' '));
                        }
                        spannableStringBuilder = ci.wb.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(udVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i3].setVisibility(0);
                textViewArr[i3].setText(spannableStringBuilder2);
                TextView textView = this.d[i3];
                textView.setText("≈" + org.telegram.messenger.r1.i().f(j10, udVar.f50055f));
                i10 = i3 + 1;
            }
            i3 = i10;
            i10 = i3 + 1;
        }
    }
}
