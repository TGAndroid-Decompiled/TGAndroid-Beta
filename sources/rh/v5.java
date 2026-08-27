package rh;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public abstract class v5 {

    public static final int[] f47523a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i10, TL_iv.PageBlock pageBlock, boolean z10) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i11 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                a(spannableStringBuilder, richText2, i10, pageBlock, z10);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean zJ = j(textdiff.text);
            boolean zJ2 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (zJ) {
                a(spannableStringBuilder, textdiff.old_text, i10, pageBlock, z10);
                if (spannableStringBuilder.length() > length) {
                    xz0 xz0Var = new xz0();
                    xz0Var.f34734a = 8192;
                    spannableStringBuilder.setSpan(new yz0(xz0Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i10, pageBlock, z10);
            if (!zJ2) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new lv0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    xz0 xz0Var2 = new xz0();
                    xz0Var2.f34734a = 4096;
                    spannableStringBuilder.setSpan(new yz0(xz0Var2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i10, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            t5Var.cacheType = org.telegram.ui.Components.k5.g();
            spannableStringBuilder.setSpan(t5Var, length2, spannableStringBuilder.length(), 33);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() > length4) {
                String string = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                xz0 xz0Var3 = new xz0();
                xz0Var3.f34734a |= 128;
                spannableStringBuilder.setSpan(new v00(string, xz0Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object objA = r.a(textmath.source, g6.w0(null, g6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (objA != null) {
                spannableStringBuilder.setSpan(objA, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence2 = textmath.source;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence2);
            }
            if (spannableStringBuilder.length() <= length5 || i10 == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i10, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i10, pageBlock, z10);
            if (z10 && spannableStringBuilder.length() > length7 && c4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new c4(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i11 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i11 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i11 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i11 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i11 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i11 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i11 = 16384;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i11 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i11 = 65536;
        }
        if (i11 != 0) {
            a(spannableStringBuilder, richText.text, i10 | i11, pageBlock, z10);
        } else {
            b(spannableStringBuilder, l(richText), i10, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i10, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i10 != 0) {
            spannableStringBuilder.setSpan(p(i10, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i10, int i11, int i12, TL_iv.PageBlock pageBlock) {
        if (i10 >= i11 || i12 == 0) {
            return;
        }
        spannable.setSpan(p(i12, pageBlock), i10, i11, 33);
    }

    public static int d(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class);
        for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
            arrayList.add(t5Var);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = t5VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i10];
                if (spanned.getSpanStart(t5Var2) == spanStart && spanned.getSpanEnd(t5Var2) == spanEnd) {
                    break;
                }
                i10++;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (spanned.getSpanStart(obj) <= i11 && spanned.getSpanEnd(obj) > i11) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i10, int i11) {
        yz0[] yz0VarArr = (yz0[]) spanned.getSpans(i10, i11, yz0.class);
        int i12 = 0;
        for (yz0 yz0Var : yz0VarArr) {
            int i13 = yz0Var.f35101b.f34734a;
            if ((i13 & 512) != 0) {
                i13 |= 256;
            }
            i12 |= i13;
        }
        return 114975 & i12;
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText f(java.lang.CharSequence r14) {
        throw new UnsupportedOperationException("Method not decompiled: rh.v5.f(java.lang.CharSequence):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static boolean g(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax < iMax2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (iMax < iMax2) {
                int iNextSpanTransition = editable.nextSpanTransition(iMax, iMax2, v00.class);
                if (((v00[]) editable.getSpans(iMax, iNextSpanTransition, v00.class)).length != 0) {
                    iMax = iNextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax < iMax2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (iMax < iMax2) {
                int iNextSpanTransition = editable.nextSpanTransition(iMax, iMax2, t41.class);
                if (((t41[]) editable.getSpans(iMax, iNextSpanTransition, t41.class)).length != 0) {
                    iMax = iNextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i10, int i11, int i12, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax >= iMax2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (iMax < iMax2) {
            int iNextSpanTransition = spanned.nextSpanTransition(iMax, iMax2, yz0.class);
            if ((e(spanned, iMax, iNextSpanTransition) & i12) == 0) {
                return false;
            }
            iMax = iNextSpanTransition;
        }
        return true;
    }

    public static boolean j(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null || str.isEmpty();
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            return str2 == null || str2.isEmpty();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return j(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) && j(textdiff.old_text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static t41 k(String str) {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a = 1024;
        return new t41(str, xz0Var);
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null ? "" : str;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            return str2 == null ? "" : str2;
        }
        if (richText instanceof TL_iv.textMath) {
            return " ";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return l(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) ? l(textdiff.old_text) : l(textdiff.text);
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }

    public static void m(Editable editable, int i10, int i11) {
        int length = editable.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax >= iMax2) {
            return;
        }
        for (v00 v00Var : (v00[]) editable.getSpans(iMax, iMax2, v00.class)) {
            editable.removeSpan(v00Var);
        }
    }

    public static void n(Editable editable, int i10, int i11) {
        int length = editable.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax >= iMax2) {
            return;
        }
        for (t41 t41Var : (t41[]) editable.getSpans(iMax, iMax2, t41.class)) {
            int spanStart = editable.getSpanStart(t41Var);
            int spanEnd = editable.getSpanEnd(t41Var);
            editable.removeSpan(t41Var);
            if (spanStart < iMax) {
                editable.setSpan(k(t41Var.getURL()), spanStart, iMax, 33);
            }
            if (spanEnd > iMax2) {
                editable.setSpan(k(t41Var.getURL()), iMax2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i10, int i11, int i12, boolean z10, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int iMax = Math.max(0, Math.min(i10, length));
        int iMax2 = Math.max(0, Math.min(i11, length));
        if (iMax >= iMax2) {
            return;
        }
        for (yz0 yz0Var : (yz0[]) spannable.getSpans(iMax, iMax2, yz0.class)) {
            int spanStart = spannable.getSpanStart(yz0Var);
            int spanEnd = spannable.getSpanEnd(yz0Var);
            int i13 = yz0Var.f35101b.f34734a;
            spannable.removeSpan(yz0Var);
            c(spannable, spanStart, iMax, i13, pageBlock);
            c(spannable, iMax2, spanEnd, i13, pageBlock);
            c(spannable, Math.max(spanStart, iMax), Math.min(spanEnd, iMax2), z10 ? i13 | i12 : (~i12) & i13, pageBlock);
        }
        if (z10) {
            while (iMax < iMax2) {
                int iNextSpanTransition = spannable.nextSpanTransition(iMax, iMax2, yz0.class);
                if (e(spannable, iMax, iNextSpanTransition) == 0) {
                    c(spannable, iMax, iNextSpanTransition, i12, pageBlock);
                }
                iMax = iNextSpanTransition;
            }
        }
    }

    public static yz0 p(int i10, TL_iv.PageBlock pageBlock) {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a = i10;
        xz0Var.f34737e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new yz0(xz0Var, 0);
    }

    public static int q(int i10, int i11, CharSequence charSequence) {
        int i12 = 0;
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = f47523a[i13];
            if (i(i10, i11, i14, charSequence)) {
                i12 |= i14;
            }
        }
        return i12;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z10);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, u5 u5Var) {
        TL_iv.RichText richText;
        c4 c4Var = u5Var.f47506f;
        if (c4Var != null) {
            return c4Var.f47088a;
        }
        if (u5Var.f47505e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = u5Var.f47505e;
            return textmath;
        }
        long j10 = u5Var.d;
        if (j10 != 0) {
            TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
            textcustomemoji.document_id = j10;
            if (str == null) {
                str = "";
            }
            textcustomemoji.alt = str;
            richText = textcustomemoji;
        } else {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            richText = textplain;
        }
        int i10 = u5Var.f47502a;
        TL_iv.RichText richText2 = richText;
        if ((i10 & 1) != 0) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i10 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i10 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i10 & 8) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i10 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i10 & 256) != 0) {
            TL_iv.textSpoiler textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i10 & 16384) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i10) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i10 & 65536) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (u5Var.f47503b != null) {
            TL_iv.textUrl texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = u5Var.f47503b;
            richText11 = texturl;
        }
        v00 v00Var = u5Var.f47504c;
        if (v00Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = v00Var.f33240b;
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText11;
        textdate.flags = tL_messageEntityFormattedDate.flags;
        textdate.relative = tL_messageEntityFormattedDate.relative;
        textdate.short_time = tL_messageEntityFormattedDate.short_time;
        textdate.long_time = tL_messageEntityFormattedDate.long_time;
        textdate.short_date = tL_messageEntityFormattedDate.short_date;
        textdate.long_date = tL_messageEntityFormattedDate.long_date;
        textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
        textdate.date = tL_messageEntityFormattedDate.date;
        return textdate;
    }
}
