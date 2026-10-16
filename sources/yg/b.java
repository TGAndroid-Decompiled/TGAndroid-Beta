package yg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aq;
import ri.h0;
import w7.z5;
public final class b extends wg.c {
    public final aq f48747s;
    public TLRPC.TL_help_country v;
    public final TextPaint f48748w;
    public final h0 f48749x;

    public b(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.f48748w = textPaint;
        this.f48749x = new h0(this, 22);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f47567f.setVisibility(8);
        this.f47566c.setVisibility(8);
        aq aqVar = new aq(context, 21, c6Var);
        this.f48747s = aqVar;
        aqVar.b(g6.B5, g6.f19709j7, g6.C5);
        aqVar.setDrawUnchecked(true);
        aqVar.setDrawBackgroundAsArc(10);
        addView(aqVar);
        aqVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aqVar.setLayoutParams(z5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, i10 | 16));
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
        aq aqVar = this.f48747s;
        if (aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
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
        this.d.setLayoutParams(z5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i13));
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
        this.e.setLayoutParams(z5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, i14));
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
        this.f47567f.setLayoutParams(z5.a(22.0f, f13, 0.0f, f14, 0.0f, 22, i15));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.v;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.f48748w.getFontMetricsInt(), 0, this.f48749x);
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
