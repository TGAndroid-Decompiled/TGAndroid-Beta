package y4;

import a9.p;
import af.h;
import android.text.Layout;
import android.text.TextUtils;
import d5.g0;
import h7.d0;
import hh.j4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p8.c0;
import p8.l;
import p8.r0;
import p8.t0;
import p8.w0;
import r4.g;
import r4.i;

public final class c extends r4.f {

    public static final Pattern f49556c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    public static final Pattern f49557e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    public static final Pattern f49558f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    public static final Pattern f49559g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    public static final Pattern f49560i = Pattern.compile("^(\\d+) (\\d+)$");

    public static final j4 f49561j = new j4(30.0f, 1, 1);

    public static final com.google.android.gms.internal.cast.a f49562k = new com.google.android.gms.internal.cast.a(15);

    public final XmlPullParserFactory f49563b;

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f49563b = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    public static f d(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static com.google.android.gms.internal.cast.a f(XmlPullParser xmlPullParser, com.google.android.gms.internal.cast.a aVar) throws i {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f49560i.matcher(attributeValue);
        if (!matcher.matches()) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new com.google.android.gms.internal.cast.a(i11);
            }
            throw new i("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    public static void g(String str, f fVar) throws i {
        Matcher matcher;
        int i10 = g0.f4795a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f49557e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new i(p.k(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            d5.a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new i(p.m("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.f49590j = 3;
                break;
            case "em":
                fVar.f49590j = 2;
                break;
            case "px":
                fVar.f49590j = 1;
                break;
            default:
                throw new i(p.m("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.f49591k = Float.parseFloat(strGroup2);
    }

    public static j4 h(XmlPullParser xmlPullParser) throws i {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = g0.f4795a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new i("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f10 = 1.0f;
        }
        j4 j4Var = f49561j;
        int i12 = j4Var.f9525b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = j4Var.f9526c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new j4(i10 * f10, i12, i13);
    }

    public static void i(XmlPullParser xmlPullParser, HashMap map, com.google.android.gms.internal.cast.a aVar, d5.p pVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strT;
        float f10;
        float f11;
        String strT2;
        Matcher matcher;
        Matcher matcher2;
        float f12;
        float f13;
        String strT3;
        float f14;
        int i10;
        String strT4;
        int i11;
        e eVar;
        String strB;
        String strB2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "style")) {
                String strT5 = d5.a.t(xmlPullParser, "style");
                f fVarK = k(xmlPullParser, new f());
                if (strT5 != null) {
                    String strTrim = strT5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i12 = g0.f4795a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        fVarK.a((f) map.get(str));
                    }
                }
                String str2 = fVarK.f49592l;
                if (str2 != null) {
                    map.put(str2, fVarK);
                }
            } else if (d5.a.z(xmlPullParser, "region")) {
                String strT6 = d5.a.t(xmlPullParser, "id");
                if (strT6 != null) {
                    String strT7 = d5.a.t(xmlPullParser, "origin");
                    if (strT7 != null) {
                        Pattern pattern = f49559g;
                        Matcher matcher3 = pattern.matcher(strT7);
                        Pattern pattern2 = h;
                        Matcher matcher4 = pattern2.matcher(strT7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                f10 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f11 = Float.parseFloat(strGroup2) / 100.0f;
                                strT2 = d5.a.t(xmlPullParser, "extent");
                                if (strT2 != null) {
                                    matcher = pattern.matcher(strT2);
                                    matcher2 = pattern2.matcher(strT2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f12 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f13 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            d5.a.K("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strT7));
                                            eVar = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        d5.a.K("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strT7));
                                    } else if (pVar == null) {
                                        d5.a.K("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strT7));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i13 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i14 = Integer.parseInt(strGroup6);
                                            f12 = i13 / pVar.f4821a;
                                            f13 = i14 / pVar.f4822b;
                                        } catch (NumberFormatException unused2) {
                                            d5.a.K("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strT7));
                                            eVar = null;
                                        }
                                    }
                                    float f15 = f12;
                                    strT3 = d5.a.t(xmlPullParser, "displayAlign");
                                    if (strT3 != null) {
                                        strB2 = d0.b(strT3);
                                        strB2.getClass();
                                        if (!strB2.equals("center")) {
                                            f14 = f11 + (f13 / 2.0f);
                                            i10 = 1;
                                        } else if (strB2.equals("after")) {
                                            f14 = f11 + f13;
                                            i10 = 2;
                                        } else {
                                            f14 = f11;
                                            i10 = 0;
                                        }
                                    } else {
                                        f14 = f11;
                                        i10 = 0;
                                    }
                                    float f16 = 1.0f / aVar.f3426a;
                                    strT4 = d5.a.t(xmlPullParser, "writingMode");
                                    if (strT4 != null) {
                                        strB = d0.b(strT4);
                                        strB.getClass();
                                        switch (strB) {
                                            case "tb":
                                            case "tblr":
                                                i11 = 2;
                                                break;
                                            case "tbrl":
                                                i11 = 1;
                                                break;
                                            default:
                                                i11 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i11 = Integer.MIN_VALUE;
                                    }
                                    eVar = new e(strT6, f10, f14, 0, i10, f15, f13, 1, f16, i11);
                                } else {
                                    d5.a.K("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                d5.a.K("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strT7));
                            }
                        } else if (!matcher4.matches()) {
                            d5.a.K("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strT7));
                        } else if (pVar == null) {
                            d5.a.K("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strT7));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i15 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i16 = Integer.parseInt(strGroup8);
                                float f17 = i15 / pVar.f4821a;
                                f11 = i16 / pVar.f4822b;
                                f10 = f17;
                                strT2 = d5.a.t(xmlPullParser, "extent");
                                if (strT2 != null) {
                                    matcher = pattern.matcher(strT2);
                                    matcher2 = pattern2.matcher(strT2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f12 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f13 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        d5.a.K("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strT7));
                                    } else if (pVar == null) {
                                        d5.a.K("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strT7));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i17 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i18 = Integer.parseInt(strGroup12);
                                        f12 = i17 / pVar.f4821a;
                                        f13 = i18 / pVar.f4822b;
                                    }
                                    float f18 = f12;
                                    strT3 = d5.a.t(xmlPullParser, "displayAlign");
                                    if (strT3 != null) {
                                        strB2 = d0.b(strT3);
                                        strB2.getClass();
                                        if (!strB2.equals("center")) {
                                            f14 = f11 + (f13 / 2.0f);
                                            i10 = 1;
                                        } else if (strB2.equals("after")) {
                                            f14 = f11;
                                            i10 = 0;
                                        } else {
                                            f14 = f11 + f13;
                                            i10 = 2;
                                        }
                                    } else {
                                        f14 = f11;
                                        i10 = 0;
                                    }
                                    float f19 = 1.0f / aVar.f3426a;
                                    strT4 = d5.a.t(xmlPullParser, "writingMode");
                                    if (strT4 != null) {
                                        strB = d0.b(strT4);
                                        strB.getClass();
                                        switch (strB) {
                                            case 3694:
                                                if (!strB.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strB.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strB.equals("tbrl")) {
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        throw new UnsupportedOperationException("Method not decompiled: y4.c.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.google.android.gms.internal.cast.a, d5.p, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    public static d j(XmlPullParser xmlPullParser, d dVar, HashMap map, j4 j4Var) throws i {
                                        long j10;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        String[] strArr = null;
                                        f fVarK = k(xmlPullParser, null);
                                        String strSubstring = null;
                                        String str = "";
                                        long jL = -9223372036854775807L;
                                        long jL2 = -9223372036854775807L;
                                        long jL3 = -9223372036854775807L;
                                        for (int i10 = 0; i10 < attributeCount; i10++) {
                                            String attributeName = xmlPullParser.getAttributeName(i10);
                                            String attributeValue = xmlPullParser.getAttributeValue(i10);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    if (map.containsKey(attributeValue)) {
                                                        str = attributeValue;
                                                        continue;
                                                    }
                                                    break;
                                                case "dur":
                                                    jL3 = l(attributeValue, j4Var);
                                                    break;
                                                case "end":
                                                    jL2 = l(attributeValue, j4Var);
                                                    break;
                                                case "begin":
                                                    jL = l(attributeValue, j4Var);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i11 = g0.f4795a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundImage":
                                                    if (attributeValue.startsWith("#")) {
                                                        strSubstring = attributeValue.substring(1);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        if (dVar != null) {
                                            long j11 = dVar.d;
                                            if (j11 != -9223372036854775807L) {
                                                if (jL != -9223372036854775807L) {
                                                    jL += j11;
                                                }
                                                if (jL2 != -9223372036854775807L) {
                                                    jL2 += j11;
                                                }
                                            }
                                        }
                                        if (jL2 != -9223372036854775807L) {
                                            j10 = jL2;
                                        } else {
                                            if (jL3 != -9223372036854775807L) {
                                                jL2 = jL + jL3;
                                            } else if (dVar != null) {
                                                long j12 = dVar.f49567e;
                                                if (j12 != -9223372036854775807L) {
                                                    j10 = j12;
                                                }
                                            }
                                            j10 = jL2;
                                        }
                                        return new d(xmlPullParser.getName(), null, jL, j10, fVarK, strArr, str, strSubstring, dVar);
                                    }

                                    public static f k(XmlPullParser xmlPullParser, f fVar) {
                                        byte b10;
                                        int i10;
                                        t0 t0VarI;
                                        t0 t0VarI2;
                                        t0 t0VarI3;
                                        String str;
                                        int iHashCode;
                                        String str2;
                                        int iHashCode2;
                                        int i11;
                                        b bVar;
                                        String str3;
                                        int iHashCode3;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        f fVarD = fVar;
                                        for (int i12 = 0; i12 < attributeCount; i12++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i12);
                                            String attributeName = xmlPullParser.getAttributeName(i12);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    b10 = 0;
                                                    break;
                                                case "fontFamily":
                                                    b10 = 1;
                                                    break;
                                                case "textAlign":
                                                    b10 = 2;
                                                    break;
                                                case "textDecoration":
                                                    b10 = 3;
                                                    break;
                                                case "fontWeight":
                                                    b10 = 4;
                                                    break;
                                                case "id":
                                                    b10 = 5;
                                                    break;
                                                case "ruby":
                                                    b10 = 6;
                                                    break;
                                                case "color":
                                                    b10 = 7;
                                                    break;
                                                case "shear":
                                                    b10 = 8;
                                                    break;
                                                case "textCombine":
                                                    b10 = 9;
                                                    break;
                                                case "fontSize":
                                                    b10 = 10;
                                                    break;
                                                case "textEmphasis":
                                                    b10 = 11;
                                                    break;
                                                case "rubyPosition":
                                                    b10 = 12;
                                                    break;
                                                case "backgroundColor":
                                                    b10 = 13;
                                                    break;
                                                case "multiRowAlign":
                                                    b10 = 14;
                                                    break;
                                                default:
                                                    b10 = -1;
                                                    break;
                                            }
                                            Layout.Alignment alignment = null;
                                            switch (b10) {
                                                case 0:
                                                    fVarD = d(fVarD);
                                                    fVarD.f49589i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    fVarD = d(fVarD);
                                                    fVarD.f49583a = attributeValue;
                                                    break;
                                                case 2:
                                                    fVarD = d(fVarD);
                                                    String strB = d0.b(attributeValue);
                                                    strB.getClass();
                                                    switch (strB) {
                                                        case "center":
                                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                                            break;
                                                        case "end":
                                                        case "right":
                                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                            break;
                                                        case "left":
                                                        case "start":
                                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                                            break;
                                                    }
                                                    fVarD.f49595o = alignment;
                                                    break;
                                                case 3:
                                                    String strB2 = d0.b(attributeValue);
                                                    strB2.getClass();
                                                    switch (strB2) {
                                                        case "nounderline":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49588g = 0;
                                                            break;
                                                        case "underline":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49588g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49587f = 0;
                                                            break;
                                                        case "linethrough":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49587f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    fVarD = d(fVarD);
                                                    fVarD.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if ("style".equals(xmlPullParser.getName())) {
                                                        fVarD = d(fVarD);
                                                        fVarD.f49592l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String strB3 = d0.b(attributeValue);
                                                    strB3.getClass();
                                                    switch (strB3) {
                                                        case "baseContainer":
                                                        case "base":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49593m = 2;
                                                            break;
                                                        case "container":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49593m = 1;
                                                            break;
                                                        case "delimiter":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49593m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            fVarD = d(fVarD);
                                                            fVarD.f49593m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    fVarD = d(fVarD);
                                                    try {
                                                        fVarD.f49584b = d5.b.a(attributeValue, false);
                                                        fVarD.f49585c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        s3.c.k("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 8:
                                                    f fVarD2 = d(fVarD);
                                                    Matcher matcher = f49558f.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e9) {
                                                            d5.a.L("TtmlDecoder", "Failed to parse shear: " + attributeValue, e9);
                                                        }
                                                    } else {
                                                        s3.c.k("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    fVarD2.f49599s = fMin;
                                                    fVarD = fVarD2;
                                                    break;
                                                case 9:
                                                    String strB4 = d0.b(attributeValue);
                                                    strB4.getClass();
                                                    if (strB4.equals("all")) {
                                                        fVarD = d(fVarD);
                                                        fVarD.f49597q = 1;
                                                    } else if (strB4.equals("none")) {
                                                        fVarD = d(fVarD);
                                                        fVarD.f49597q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        fVarD = d(fVarD);
                                                        g(attributeValue, fVarD);
                                                    } catch (i unused2) {
                                                        s3.c.k("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 11:
                                                    fVarD = d(fVarD);
                                                    Pattern pattern = b.f49551b;
                                                    if (attributeValue == null) {
                                                        bVar = null;
                                                    } else {
                                                        String strB5 = d0.b(attributeValue.trim());
                                                        if (strB5.isEmpty()) {
                                                            bVar = null;
                                                        } else {
                                                            String[] strArrSplit = TextUtils.split(strB5, b.f49551b);
                                                            int length = strArrSplit.length;
                                                            c0 c0VarT = length != 0 ? length != 1 ? c0.t(strArrSplit.length, (Object[]) strArrSplit.clone()) : new w0(strArrSplit[0]) : r0.f45581s;
                                                            String str4 = (String) l.f(l.i(b.f49554f, c0VarT), "outside");
                                                            int iHashCode4 = str4.hashCode();
                                                            if (iHashCode4 != -1392885889) {
                                                                if (iHashCode4 != -1106037339) {
                                                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                                                        i10 = 2;
                                                                    }
                                                                } else if (str4.equals("outside")) {
                                                                    i10 = -2;
                                                                }
                                                                t0VarI = l.i(b.f49552c, c0VarT);
                                                                if (t0VarI.isEmpty()) {
                                                                    t0VarI2 = l.i(b.f49553e, c0VarT);
                                                                    t0VarI3 = l.i(b.d, c0VarT);
                                                                    if (t0VarI2.isEmpty() || !t0VarI3.isEmpty()) {
                                                                        str = (String) l.f(t0VarI2, "filled");
                                                                        iHashCode = str.hashCode();
                                                                        if (iHashCode != -1274499742) {
                                                                            int i13 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                                                            str2 = (String) l.f(t0VarI3, "circle");
                                                                            iHashCode2 = str2.hashCode();
                                                                            if (iHashCode2 != -1360216880) {
                                                                                if (iHashCode2 != -905816648) {
                                                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                                                        i11 = 2;
                                                                                    }
                                                                                } else if (str2.equals("sesame")) {
                                                                                    i11 = 3;
                                                                                }
                                                                                bVar = new b(i11, i13, i10);
                                                                            } else {
                                                                                str2.equals("circle");
                                                                            }
                                                                            i11 = 1;
                                                                            bVar = new b(i11, i13, i10);
                                                                        } else {
                                                                            str.equals("filled");
                                                                        }
                                                                        str2 = (String) l.f(t0VarI3, "circle");
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i11 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i11 = 3;
                                                                            }
                                                                            bVar = new b(i11, i13, i10);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i11 = 1;
                                                                        bVar = new b(i11, i13, i10);
                                                                    } else {
                                                                        bVar = new b(-1, 0, i10);
                                                                    }
                                                                } else {
                                                                    str3 = (String) new p8.d0(t0VarI).next();
                                                                    iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != 3005871) {
                                                                        int i14 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                                                        bVar = new b(i14, 0, i10);
                                                                    } else {
                                                                        str3.equals("auto");
                                                                    }
                                                                    bVar = new b(i14, 0, i10);
                                                                }
                                                            } else {
                                                                str4.equals("before");
                                                            }
                                                            i10 = 1;
                                                            t0VarI = l.i(b.f49552c, c0VarT);
                                                            if (t0VarI.isEmpty()) {
                                                                str3 = (String) new p8.d0(t0VarI).next();
                                                                iHashCode3 = str3.hashCode();
                                                                if (iHashCode3 != 3005871) {
                                                                    if (iHashCode3 != 3387192) {
                                                                    }
                                                                    bVar = new b(i14, 0, i10);
                                                                } else {
                                                                    str3.equals("auto");
                                                                }
                                                                bVar = new b(i14, 0, i10);
                                                            } else {
                                                                t0VarI2 = l.i(b.f49553e, c0VarT);
                                                                t0VarI3 = l.i(b.d, c0VarT);
                                                                if (t0VarI2.isEmpty()) {
                                                                    str = (String) l.f(t0VarI2, "filled");
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1274499742) {
                                                                        if (iHashCode != 3417674) {
                                                                        }
                                                                        str2 = (String) l.f(t0VarI3, "circle");
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i11 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i11 = 3;
                                                                            }
                                                                            bVar = new b(i11, i13, i10);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i11 = 1;
                                                                        bVar = new b(i11, i13, i10);
                                                                    } else {
                                                                        str.equals("filled");
                                                                    }
                                                                    str2 = (String) l.f(t0VarI3, "circle");
                                                                    iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1360216880) {
                                                                        if (iHashCode2 != -905816648) {
                                                                            if (iHashCode2 == 99657) {
                                                                                i11 = 2;
                                                                            }
                                                                        } else if (str2.equals("sesame")) {
                                                                            i11 = 3;
                                                                        }
                                                                        bVar = new b(i11, i13, i10);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i11 = 1;
                                                                    bVar = new b(i11, i13, i10);
                                                                } else {
                                                                    str = (String) l.f(t0VarI2, "filled");
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1274499742) {
                                                                        if (iHashCode != 3417674) {
                                                                        }
                                                                        str2 = (String) l.f(t0VarI3, "circle");
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i11 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i11 = 3;
                                                                            }
                                                                            bVar = new b(i11, i13, i10);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i11 = 1;
                                                                        bVar = new b(i11, i13, i10);
                                                                    } else {
                                                                        str.equals("filled");
                                                                    }
                                                                    str2 = (String) l.f(t0VarI3, "circle");
                                                                    iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1360216880) {
                                                                        if (iHashCode2 != -905816648) {
                                                                            if (iHashCode2 == 99657) {
                                                                                i11 = 2;
                                                                            }
                                                                        } else if (str2.equals("sesame")) {
                                                                            i11 = 3;
                                                                        }
                                                                        bVar = new b(i11, i13, i10);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i11 = 1;
                                                                    bVar = new b(i11, i13, i10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    fVarD.f49598r = bVar;
                                                    break;
                                                case 12:
                                                    String strB6 = d0.b(attributeValue);
                                                    strB6.getClass();
                                                    if (strB6.equals("before")) {
                                                        fVarD = d(fVarD);
                                                        fVarD.f49594n = 1;
                                                    } else if (strB6.equals("after")) {
                                                        fVarD = d(fVarD);
                                                        fVarD.f49594n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    fVarD = d(fVarD);
                                                    try {
                                                        fVarD.d = d5.b.a(attributeValue, false);
                                                        fVarD.f49586e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        s3.c.k("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 14:
                                                    fVarD = d(fVarD);
                                                    String strB7 = d0.b(attributeValue);
                                                    strB7.getClass();
                                                    switch (strB7) {
                                                        case "center":
                                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                                            break;
                                                        case "end":
                                                        case "right":
                                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                            break;
                                                        case "left":
                                                        case "start":
                                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                                            break;
                                                    }
                                                    fVarD.f49596p = alignment;
                                                    break;
                                            }
                                        }
                                        return fVarD;
                                    }

                                    public static long l(String str, j4 j4Var) throws i {
                                        double d10;
                                        double d11;
                                        Matcher matcher = f49556c.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d12 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d14 = d13 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / j4Var.f9524a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) j4Var.f9525b)) / ((double) j4Var.f9524a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = d.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new i(s3.c.e("Malformed time expression: ", str));
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d17 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        switch (strGroup8) {
                                            case "f":
                                                d10 = j4Var.f9524a;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            case "h":
                                                d11 = 3600.0d;
                                                break;
                                            case "m":
                                                d11 = 60.0d;
                                                break;
                                            case "t":
                                                d10 = j4Var.f9526c;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            case "ms":
                                                d10 = 1000.0d;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            default:
                                                return (long) (d17 * 1000000.0d);
                                        }
                                        d17 *= d11;
                                        return (long) (d17 * 1000000.0d);
                                    }

                                    public static d5.p m(XmlPullParser xmlPullParser) {
                                        String strT = d5.a.t(xmlPullParser, "extent");
                                        if (strT == null) {
                                            return null;
                                        }
                                        Matcher matcher = h.matcher(strT);
                                        if (!matcher.matches()) {
                                            d5.a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strT));
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i10 = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new d5.p(i10, Integer.parseInt(strGroup2));
                                        } catch (NumberFormatException unused) {
                                            d5.a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strT));
                                            return null;
                                        }
                                    }

                                    @Override
                                    public final g c(int i10, boolean z10, byte[] bArr) throws i {
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.f49563b.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            d5.p pVarM = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            j4 j4Var = f49561j;
                                            com.google.android.gms.internal.cast.a aVar = f49562k;
                                            h hVar = null;
                                            j4 j4VarH = j4Var;
                                            com.google.android.gms.internal.cast.a aVarF = aVar;
                                            int i11 = 0;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                d dVar = (d) arrayDeque.peek();
                                                if (i11 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            j4VarH = h(xmlPullParserNewPullParser);
                                                            aVarF = f(xmlPullParserNewPullParser, aVar);
                                                            pVarM = m(xmlPullParserNewPullParser);
                                                        }
                                                        j4 j4Var2 = j4VarH;
                                                        com.google.android.gms.internal.cast.a aVar2 = aVarF;
                                                        if (e(name)) {
                                                            if ("head".equals(name)) {
                                                                i(xmlPullParserNewPullParser, map, aVar2, pVarM, map2, map3);
                                                            } else {
                                                                try {
                                                                    d dVarJ = j(xmlPullParserNewPullParser, dVar, map2, j4Var2);
                                                                    arrayDeque.push(dVarJ);
                                                                    if (dVar != null) {
                                                                        if (dVar.f49574m == null) {
                                                                            dVar.f49574m = new ArrayList();
                                                                        }
                                                                        dVar.f49574m.add(dVarJ);
                                                                    }
                                                                } catch (i e9) {
                                                                    d5.a.L("TtmlDecoder", "Suppressing parser error", e9);
                                                                    i11++;
                                                                }
                                                            }
                                                            aVarF = aVar2;
                                                            j4VarH = j4Var2;
                                                        } else {
                                                            d5.a.v("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                        }
                                                        i11++;
                                                        aVarF = aVar2;
                                                        j4VarH = j4Var2;
                                                    } else if (eventType == 4) {
                                                        dVar.getClass();
                                                        d dVarA = d.a(xmlPullParserNewPullParser.getText());
                                                        if (dVar.f49574m == null) {
                                                            dVar.f49574m = new ArrayList();
                                                        }
                                                        dVar.f49574m.add(dVarA);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            d dVar2 = (d) arrayDeque.peek();
                                                            dVar2.getClass();
                                                            hVar = new h(dVar2, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i11++;
                                                } else if (eventType == 3) {
                                                    i11--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (hVar != null) {
                                                return hVar;
                                            }
                                            throw new i("No TTML subtitles found");
                                        } catch (IOException e10) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e10);
                                        } catch (XmlPullParserException e11) {
                                            throw new i("Unable to decode source", e11);
                                        }
                                    }
                                }
