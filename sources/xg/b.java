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
import org.telegram.ui.Components.np;
import rg.w1;
import w7.x5;
public final class b extends vg.c {
    public final np f45753r;
    public TLRPC.TL_help_country f45754s;
    public final TextPaint v;
    public final w1 f45755w;

    public b(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f45755w = new w1(this, 11);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f44310f.setVisibility(8);
        this.f44309c.setVisibility(8);
        np npVar = new np(context, 21, e6Var);
        this.f45753r = npVar;
        npVar.b(i6.B5, i6.f18945j7, i6.C5);
        npVar.setDrawUnchecked(true);
        npVar.setDrawBackgroundAsArc(10);
        addView(npVar);
        npVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        npVar.setLayoutParams(x5.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        np npVar = this.f45753r;
        if (npVar.getVisibility() == 0) {
            npVar.a(z10, z11);
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
        this.d.setLayoutParams(x5.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
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
        this.e.setLayoutParams(x5.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
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
        this.f44310f.setLayoutParams(x5.d(22, 22.0f, i15, f13, 0.0f, f14, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f45754s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f45755w);
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
        return this.f45754s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
