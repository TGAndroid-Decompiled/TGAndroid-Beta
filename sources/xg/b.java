package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dq;
import rg.x1;
import w7.x5;
public final class b extends vg.c {
    public final dq f51123s;
    public TLRPC.TL_help_country v;
    public final TextPaint f51124w;
    public final x1 f51125x;

    public b(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.f51124w = textPaint;
        this.f51125x = new x1(this, 15);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f49578f.setVisibility(8);
        this.f49576c.setVisibility(8);
        dq dqVar = new dq(context, 21, e6Var);
        this.f51123s = dqVar;
        dqVar.b(i6.B5, i6.f20907j7, i6.C5);
        dqVar.setDrawUnchecked(true);
        dqVar.setDrawBackgroundAsArc(10);
        addView(dqVar);
        dqVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        dqVar.setLayoutParams(x5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, i10 | 16));
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
        dq dqVar = this.f51123s;
        if (dqVar.getVisibility() == 0) {
            dqVar.a(z10, z11);
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
        boolean z10 = LocaleController.isRTL;
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
        this.d.setLayoutParams(x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i13));
        boolean z11 = LocaleController.isRTL;
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
        this.f49577e.setLayoutParams(x5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, i14));
        boolean z12 = LocaleController.isRTL;
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
        this.f49578f.setLayoutParams(x5.a(22.0f, f13, 0.0f, f14, 0.0f, 22, i15));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.v;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.f51124w.getFontMetricsInt(), 0, this.f51125x);
        if (replaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(replaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(16), replaceWithRestrictedEmoji.length(), replaceWithRestrictedEmoji.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(34), 0, 1, 0);
        }
        String countryName = LocaleController.getCountryName(tL_help_country.iso2);
        if (TextUtils.isEmpty(countryName)) {
            countryName = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) countryName);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.v;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
