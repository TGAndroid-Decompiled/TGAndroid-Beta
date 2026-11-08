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
public final class xd extends LinearLayout {
    public final LinearLayout f51831a;
    public final LinearLayout[] f51832b;
    public final org.telegram.ui.Components.q5[] f51833c;
    public final TextView[] d;
    public final TextView f51834e;
    public final DecimalFormat f51835f;

    public xd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f51832b = new LinearLayout[2];
        this.f51833c = new org.telegram.ui.Components.q5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51831a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f51832b[i7] = new LinearLayout(context);
            this.f51832b[i7].setOrientation(0);
            this.f51831a.addView(this.f51832b[i7], c8.ha.p(-1, -2, 1.0f, 119));
            this.f51833c[i7] = new org.telegram.ui.Components.q5(context);
            this.f51833c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f51833c[i7].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(this.f51833c[i7], org.telegram.ui.ActionBar.k6.G6, f6Var);
            this.f51832b[i7].addView(this.f51833c[i7], c8.ha.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i7] = new org.telegram.ui.Components.q5(context);
            this.d[i7].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.r6.V(this.d[i7], org.telegram.ui.ActionBar.k6.f28244y6, f6Var);
            this.f51832b[i7].addView(this.d[i7], c8.ha.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f51834e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28244y6, f6Var);
        addView(textView, c8.ha.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f51835f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void set(wd wdVar) {
        String str;
        long j3;
        int i7;
        int indexOf;
        this.f51834e.setText(wdVar.f51066c);
        int i10 = 0;
        while (i10 < 2) {
            if (i10 == 0) {
                str = wdVar.f51065b;
            } else {
                str = wdVar.h;
            }
            if (i10 == 0) {
                j3 = wdVar.f51067e;
            } else {
                j3 = wdVar.f51071j;
            }
            LinearLayout[] linearLayoutArr = this.f51832b;
            if (i10 == 0 && !wdVar.f51064a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 == 1 && !wdVar.f51069g) {
                linearLayoutArr[i10].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rf.b.r(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f51833c;
                if (equalsIgnoreCase) {
                    String format = this.f51835f.format(wdVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.E((long) Math.floor(wdVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = zd.K(spannableStringBuilder, textViewArr[i7].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i7 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i7 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.E(wdVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) bi.dd.M0(wdVar.f51070i, 0.8f, ' '));
                        }
                        spannableStringBuilder = bi.dd.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(wdVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i7].setVisibility(0);
                textViewArr[i7].setText(spannableStringBuilder2);
                TextView textView = this.d[i7];
                textView.setText("≈" + org.telegram.messenger.r1.i().f(j3, wdVar.f51068f));
                i10 = i7 + 1;
            }
            i7 = i10;
            i10 = i7 + 1;
        }
    }
}
