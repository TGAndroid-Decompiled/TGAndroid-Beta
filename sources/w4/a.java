package w4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.g0;
import d5.z;
import f2.s1;
import h7.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r4.f;
import r4.g;
import w3.b0;

public final class a extends f {

    public static final Pattern f49241g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    public final boolean f49242b;

    public final s1 f49243c;
    public LinkedHashMap d;

    public float f49244e;

    public float f49245f;

    public a(List list) {
        super("SsaDecoder");
        this.f49244e = -3.4028235E38f;
        this.f49245f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f49242b = false;
            this.f49243c = null;
            return;
        }
        this.f49242b = true;
        String strL = g0.l((byte[]) list.get(0));
        d5.a.f(strL.startsWith("Format:"));
        s1 s1VarB = s1.b(strL);
        s1VarB.getClass();
        this.f49243c = s1VarB;
        e(new z((byte[]) list.get(1)));
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long f(String str) {
        Matcher matcher = f49241g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = g0.f4795a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override
    public final g c(int i10, boolean z10, byte[] bArr) {
        z zVar;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int iA;
        int i22;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        z zVar2 = new z(bArr, i10);
        boolean z11 = aVar.f49242b;
        if (!z11) {
            aVar.e(zVar2);
        }
        s1 s1VarB = z11 ? aVar.f49243c : null;
        while (true) {
            String strF = zVar2.f(o8.d.f19363c);
            if (strF == null) {
                return new b0(1, arrayList, arrayList2);
            }
            if (strF.startsWith("Format:")) {
                s1VarB = s1.b(strF);
            } else {
                if (strF.startsWith("Dialogue:")) {
                    if (s1VarB == null) {
                        d5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strF));
                    } else {
                        int i23 = s1VarB.f5828e;
                        d5.a.f(strF.startsWith("Dialogue:"));
                        String[] strArrSplit = strF.substring(9).split(",", i23);
                        if (strArrSplit.length != i23) {
                            d5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strF));
                        } else {
                            if (f(strArrSplit[s1VarB.f5825a]) == -9223372036854775807L) {
                                d5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(strF));
                            } else {
                                long jF = f(strArrSplit[s1VarB.f5826b]);
                                if (jF == -9223372036854775807L) {
                                    d5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(strF));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.d;
                                    d dVar = (linkedHashMap == null || (i22 = s1VarB.f5827c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i22].trim());
                                    String str = strArrSplit[s1VarB.d];
                                    Matcher matcher = c.f49255a.matcher(str);
                                    PointF pointF = null;
                                    int i24 = -1;
                                    while (matcher.find()) {
                                        z zVar3 = zVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = c.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = d.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i24 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        zVar2 = zVar3;
                                    }
                                    zVar = zVar2;
                                    String strReplace = c.f49255a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f16 = aVar.f49244e;
                                    float f17 = aVar.f49245f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (dVar != null) {
                                        boolean z12 = dVar.f49263g;
                                        Integer num = dVar.d;
                                        Integer num2 = dVar.f49260c;
                                        if (num2 != null) {
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i16 = 33;
                                            i17 = 0;
                                        }
                                        if (dVar.f49265j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                        }
                                        float f18 = dVar.f49261e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i18 = Integer.MIN_VALUE;
                                        } else {
                                            f14 = f18 / f17;
                                            i18 = 1;
                                        }
                                        boolean z13 = dVar.f49262f;
                                        if (z13 && z12) {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            if (z13) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z12 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i21, spannableString.length(), i20);
                                        }
                                        if (dVar.f49264i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i21, spannableString.length(), i20);
                                        }
                                        f10 = f15;
                                        i12 = i19;
                                        i11 = -1;
                                    } else {
                                        s1VarB = s1VarB;
                                        f16 = f16;
                                        i11 = -1;
                                        i12 = Integer.MIN_VALUE;
                                        f10 = -3.4028235E38f;
                                    }
                                    if (i24 != i11) {
                                        i11 = i24;
                                    } else if (dVar != null) {
                                        i11 = dVar.f49259b;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i25 = Integer.MIN_VALUE;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i13 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = 2;
                                            break;
                                    }
                                    switch (i11) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i25 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i25 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i25 = 0;
                                            break;
                                    }
                                    if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        float f19 = 0.05f;
                                        if (i13 != 0) {
                                            i15 = 1;
                                            if (i13 != 1) {
                                                i14 = 2;
                                                f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i14 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i14 = 2;
                                            i15 = 1;
                                            f11 = 0.05f;
                                        }
                                        if (i25 != 0) {
                                            f19 = i25 != i15 ? i25 != i14 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f12 = f19;
                                        f13 = f11;
                                    } else {
                                        f13 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                    }
                                    r4.c cVar = new r4.c(spannableString, alignment2, null, null, f12, 0, i25, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iD = d(jF, arrayList2, arrayList);
                                    for (int iD2 = d(r9, arrayList2, arrayList); iD2 < iD; iD2++) {
                                        ((List) arrayList.get(iD2)).add(cVar);
                                    }
                                }
                            }
                        }
                    }
                    zVar = zVar2;
                    s1VarB = s1VarB;
                } else {
                    zVar = zVar2;
                    s1VarB = s1VarB;
                }
                aVar = this;
                zVar2 = zVar;
                s1VarB = s1VarB;
            }
        }
    }

    public final void e(z zVar) {
        float f10;
        int i10;
        d dVar;
        float f11;
        while (true) {
            String strF = zVar.f(o8.d.f19363c);
            if (strF == null) {
                return;
            }
            char c10 = '[';
            if ("[Script Info]".equalsIgnoreCase(strF)) {
                while (true) {
                    String strF2 = zVar.f(o8.d.f19363c);
                    if (strF2 == null || (zVar.a() != 0 && (zVar.f4858a[zVar.f4859b] & 255) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strF2.split(":");
                    if (strArrSplit.length == 2) {
                        String strB = d0.b(strArrSplit[0].trim());
                        strB.getClass();
                        if (strB.equals("playresx")) {
                            this.f49244e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.f49245f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strF)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String strF3 = zVar.f(o8.d.f19363c);
                    if (strF3 != null && (zVar.a() == 0 || (zVar.f4858a[zVar.f4859b] & 255) != c10)) {
                        int i11 = -1;
                        if (strF3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strF3.substring(7), ",");
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            for (int i22 = 0; i22 < strArrSplit2.length; i22++) {
                                String strB2 = d0.b(strArrSplit2[i22].trim());
                                strB2.getClass();
                                switch (strB2) {
                                    case "italic":
                                        i18 = i22;
                                        break;
                                    case "underline":
                                        i19 = i22;
                                        break;
                                    case "strikeout":
                                        i20 = i22;
                                        break;
                                    case "primarycolour":
                                        i14 = i22;
                                        break;
                                    case "bold":
                                        i17 = i22;
                                        break;
                                    case "name":
                                        i12 = i22;
                                        break;
                                    case "fontsize":
                                        i16 = i22;
                                        break;
                                    case "borderstyle":
                                        i21 = i22;
                                        break;
                                    case "alignment":
                                        i13 = i22;
                                        break;
                                    case "outlinecolour":
                                        i15 = i22;
                                        break;
                                }
                            }
                            bVar = i12 != -1 ? new b(i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, strArrSplit2.length) : null;
                        } else {
                            if (strF3.startsWith("Style:")) {
                                if (bVar == null) {
                                    d5.a.K("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strF3));
                                } else {
                                    d5.a.f(strF3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strF3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i23 = bVar.f49254k;
                                    if (length != i23) {
                                        int length2 = strArrSplit3.length;
                                        int i24 = g0.f4795a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("Skipping malformed 'Style:' line (expected ", i23, " values, found ", length2, "): '");
                                        sbP.append(strF3);
                                        sbP.append("'");
                                        d5.a.K("SsaStyle", sbP.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[bVar.f49246a].trim();
                                            int i25 = bVar.f49247b;
                                            int iA = i25 != -1 ? d.a(strArrSplit3[i25].trim()) : -1;
                                            int i26 = bVar.f49248c;
                                            Integer numC = i26 != -1 ? d.c(strArrSplit3[i26].trim()) : null;
                                            int i27 = bVar.d;
                                            Integer numC2 = i27 != -1 ? d.c(strArrSplit3[i27].trim()) : null;
                                            int i28 = bVar.f49249e;
                                            if (i28 != -1) {
                                                String strTrim2 = strArrSplit3[i28].trim();
                                                try {
                                                    f11 = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e9) {
                                                    d5.a.L("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e9);
                                                    f11 = -3.4028235E38f;
                                                }
                                                f10 = f11;
                                            } else {
                                                f10 = -3.4028235E38f;
                                            }
                                            int i29 = bVar.f49250f;
                                            boolean z10 = i29 != -1 && d.b(strArrSplit3[i29].trim());
                                            int i30 = bVar.f49251g;
                                            boolean z11 = i30 != -1 && d.b(strArrSplit3[i30].trim());
                                            int i31 = bVar.h;
                                            boolean z12 = i31 != -1 && d.b(strArrSplit3[i31].trim());
                                            int i32 = bVar.f49252i;
                                            boolean z13 = i32 != -1 && d.b(strArrSplit3[i32].trim());
                                            int i33 = bVar.f49253j;
                                            if (i33 != -1) {
                                                String strTrim3 = strArrSplit3[i33].trim();
                                                try {
                                                    int i34 = Integer.parseInt(strTrim3.trim());
                                                    if (i34 == 1 || i34 == 3) {
                                                        i11 = i34;
                                                    } else {
                                                        d5.a.K("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                i10 = i11;
                                            } else {
                                                i10 = -1;
                                            }
                                            dVar = new d(strTrim, iA, numC, numC2, f10, z10, z11, z12, z13, i10);
                                        } catch (RuntimeException e10) {
                                            d5.a.L("SsaStyle", "Skipping malformed 'Style:' line: '" + strF3 + "'", e10);
                                            dVar = null;
                                        }
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.f49258a, dVar);
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                        linkedHashMap.put(dVar.f49258a, dVar);
                                    }
                                }
                            }
                            c10 = '[';
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strF)) {
                d5.a.v("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strF)) {
                return;
            }
        }
    }
}
