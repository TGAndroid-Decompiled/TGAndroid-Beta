package qg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import ph.x1;
import w7.b6;
public final class b extends og.d {
    public final ep f45532s;
    public TLRPC.TL_help_country f45533w;
    public final TextPaint f45534x;
    public final x1 f45535y;

    public b(Context context, p6 p6Var) {
        super(context, p6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.f45534x = textPaint;
        this.f45535y = new x1(this, 1);
        textPaint.setTextSize(i0.L(20.0f));
        this.f14180f.setVisibility(8);
        this.f14179c.setVisibility(8);
        ep epVar = new ep(21, context, p6Var);
        this.f45532s = epVar;
        epVar.b(t6.B5, t6.f21040j7, t6.C5);
        epVar.setDrawUnchecked(true);
        epVar.setDrawBackgroundAsArc(10);
        addView(epVar);
        epVar.a(false, false);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        epVar.setLayoutParams(b6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    public final int a() {
        return 22;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f45532s;
        if (epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10 = dd.X;
        int i12 = 3;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 52.0f;
        }
        if (z10) {
            f10 = 52.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        boolean z11 = dd.X;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 52.0f;
        }
        if (z11) {
            f12 = 52.0f;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        boolean z12 = dd.X;
        if (z12) {
            i12 = 5;
        }
        int i15 = i12 | 16;
        if (z12) {
            f13 = 15.0f;
        } else {
            f13 = 20.0f;
        }
        if (z12) {
            f14 = 20.0f;
        } else {
            f14 = 15.0f;
        }
        this.f14180f.setLayoutParams(b6.d(22, 22.0f, i15, f13, 0.0f, f14, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f45533w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o10 = k6.o(dd.E0(tL_help_country.iso2), this.f45534x.getFontMetricsInt(), 0, this.f45535y);
        if (o10 != null) {
            spannableStringBuilder.append(o10).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(16), o10.length(), o10.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(34), 0, 1, 0);
        }
        String i02 = dd.i0(2131750530, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.f45533w;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
