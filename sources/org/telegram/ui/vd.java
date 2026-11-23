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
    public final LinearLayout f52797a;
    public final LinearLayout[] f52798b;
    public final org.telegram.ui.Components.x5[] f52799c;
    public final TextView[] d;
    public final TextView f52800e;
    public final DecimalFormat f52801f;

    public vd(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f52798b = new LinearLayout[2];
        this.f52799c = new org.telegram.ui.Components.x5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52797a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f52798b[i7] = new LinearLayout(context);
            this.f52798b[i7].setOrientation(0);
            this.f52797a.addView(this.f52798b[i7], c8.ma.p(-1, -2, 1.0f, 119));
            this.f52799c[i7] = new org.telegram.ui.Components.x5(context);
            this.f52799c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f52799c[i7].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.U(this.f52799c[i7], org.telegram.ui.ActionBar.m6.G6, h6Var);
            this.f52798b[i7].addView(this.f52799c[i7], c8.ma.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i7] = new org.telegram.ui.Components.x5(context);
            this.d[i7].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.t6.U(this.d[i7], org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
            this.f52798b[i7].addView(this.d[i7], c8.ma.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f52800e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        addView(textView, c8.ma.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f52801f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void set(ud udVar) {
        String str;
        long j3;
        int i7;
        int indexOf;
        this.f52800e.setText(udVar.f52549c);
        int i10 = 0;
        while (i10 < 2) {
            if (i10 == 0) {
                str = udVar.f52548b;
            } else {
                str = udVar.h;
            }
            if (i10 == 0) {
                j3 = udVar.f52550e;
            } else {
                j3 = udVar.f52554j;
            }
            LinearLayout[] linearLayoutArr = this.f52798b;
            if (i10 == 0 && !udVar.f52547a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 == 1 && !udVar.f52552g) {
                linearLayoutArr[i10].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p5.c.v(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f52799c;
                if (equalsIgnoreCase) {
                    String format = this.f52801f.format(udVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.E((long) Math.floor(udVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = xd.K(spannableStringBuilder, textViewArr[i7].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i7 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i7 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.E(udVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) di.pb.M0(udVar.f52553i, 0.8f, ' '));
                        }
                        spannableStringBuilder = di.pb.b1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(udVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i7].setVisibility(0);
                textViewArr[i7].setText(spannableStringBuilder2);
                TextView textView = this.d[i7];
                textView.setText("≈" + org.telegram.messenger.r1.i().f(j3, udVar.f52551f));
                i10 = i7 + 1;
            }
            i7 = i10;
            i10 = i7 + 1;
        }
    }
}
