package x4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import d5.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o8.d;
import r4.c;
import r4.f;
import r4.g;
import w3.b0;

public final class a extends f {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    public static final Pattern f49360e = Pattern.compile("\\{\\\\.*?\\}");

    public final StringBuilder f49361b;

    public final ArrayList f49362c;

    public a() {
        super("SubripDecoder");
        this.f49361b = new StringBuilder();
        this.f49362c = new ArrayList();
    }

    public static long d(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    @Override
    public final g c(int i10, boolean z10, byte[] bArr) {
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        c cVar;
        this = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        z zVar = new z(bArr, i10);
        Charset charsetY = zVar.y();
        if (charsetY == null) {
            charsetY = d.f19363c;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            String strF = zVar.f(charsetY);
            if (strF != null) {
                if (strF.length() != 0) {
                    try {
                        Integer.parseInt(strF);
                        String strF2 = zVar.f(charsetY);
                        if (strF2 == null) {
                            d5.a.K("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = d.matcher(strF2);
                            if (matcher.matches()) {
                                long jD = d(matcher, 1);
                                if (i16 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16 * 2);
                                }
                                int i17 = i16 + 1;
                                jArrCopyOf[i16] = jD;
                                long jD2 = d(matcher, 6);
                                if (i17 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17 * 2);
                                }
                                i16 += 2;
                                jArrCopyOf[i17] = jD2;
                                StringBuilder sb2 = this.f49361b;
                                sb2.setLength(i15);
                                ArrayList arrayList2 = this.f49362c;
                                arrayList2.clear();
                                for (String strF3 = zVar.f(charsetY); !TextUtils.isEmpty(strF3); strF3 = zVar.f(charsetY)) {
                                    if (sb2.length() > 0) {
                                        sb2.append("<br>");
                                    }
                                    String strTrim = strF3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f49360e.matcher(strTrim);
                                    int i18 = 0;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i18;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i18 += length;
                                    }
                                    sb2.append(sb3.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i19);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i19++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    cVar = new c(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620679:
                                            str.equals("{\\an2}");
                                            i11 = 1;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i11 = 1;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620493:
                                            str.equals("{\\an8}");
                                            i11 = 1;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        default:
                                            i11 = 1;
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620617:
                                            str.equals("{\\an4}");
                                            i12 = 1;
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i12 = 1;
                                            break;
                                        case -685620555:
                                            str.equals("{\\an6}");
                                            i12 = 1;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        default:
                                            i12 = 1;
                                            break;
                                    }
                                    float f11 = 0.08f;
                                    if (i11 != 0) {
                                        i13 = 1;
                                        if (i11 != 1) {
                                            i14 = 2;
                                            if (i11 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f10 = 0.92f;
                                        } else {
                                            i14 = 2;
                                            f10 = 0.5f;
                                        }
                                    } else {
                                        i13 = 1;
                                        i14 = 2;
                                        f10 = 0.08f;
                                    }
                                    if (i12 != 0) {
                                        if (i12 == i13) {
                                            f11 = 0.5f;
                                        } else {
                                            if (i12 != i14) {
                                                throw new IllegalArgumentException();
                                            }
                                            f11 = 0.92f;
                                        }
                                    }
                                    cVar = new c(spannedFromHtml, null, null, null, f11, 0, i12, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(cVar);
                                arrayList.add(c.D);
                                jArrCopyOf = jArrCopyOf;
                                zVar = zVar;
                            } else {
                                d5.a.K("SubripDecoder", "Skipping invalid timing: ".concat(strF2));
                            }
                            i15 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        d5.a.K("SubripDecoder", "Skipping invalid index: ".concat(strF));
                    }
                }
            }
        }
        return new b0(4, (c[]) arrayList.toArray(new c[0]), Arrays.copyOf(jArrCopyOf, i16));
    }
}
