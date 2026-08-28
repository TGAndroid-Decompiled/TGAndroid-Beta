package y4;

import d5.f0;
import d5.p;
import gh.l4;
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
import r4.h;
public final class c extends r4.e {
    public static final Pattern f49566c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern f49567e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f49568f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f49569g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern f49570i = Pattern.compile("^(\\d+) (\\d+)$");
    public static final l4 f49571j = new l4(30.0f, 1, 1);
    public static final com.google.android.gms.internal.cast.a f49572k = new com.google.android.gms.internal.cast.a(15);
    public final XmlPullParserFactory f49573b;

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f49573b = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f d(f fVar) {
        if (fVar == null) {
            return new f();
        }
        return fVar;
    }

    public static boolean e(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static com.google.android.gms.internal.cast.a f(XmlPullParser xmlPullParser, com.google.android.gms.internal.cast.a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f49570i.matcher(attributeValue);
        if (!matcher.matches()) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new com.google.android.gms.internal.cast.a(parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    public static void g(String str, f fVar) {
        Matcher matcher;
        int i9 = f0.f4349a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f49567e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            d5.a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(aa.d.l(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    fVar.f49600j = 3;
                    break;
                case 1:
                    fVar.f49600j = 2;
                    break;
                case 2:
                    fVar.f49600j = 1;
                    break;
                default:
                    throw new Exception(aa.d.o("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f49601k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(aa.d.o("Invalid expression for fontSize: '", str, "'."));
    }

    public static l4 h(XmlPullParser xmlPullParser) {
        int i9;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i9 = Integer.parseInt(attributeValue);
        } else {
            i9 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = f0.f4349a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f10 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        l4 l4Var = f49571j;
        int i11 = l4Var.f8489b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = l4Var.f8490c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new l4(i9 * f10, i11, i12);
    }

    public static void i(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, com.google.android.gms.internal.cast.a r21, d5.p r22, java.util.HashMap r23, java.util.HashMap r24) {
        throw new UnsupportedOperationException("Method not decompiled: y4.c.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.google.android.gms.internal.cast.a, d5.p, java.util.HashMap, java.util.HashMap):void");
    }

    public static d j(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, l4 l4Var) {
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f k10 = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeName = xmlPullParser.getAttributeName(i9);
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = l(attributeValue, l4Var);
                    break;
                case 2:
                    j12 = l(attributeValue, l4Var);
                    break;
                case 3:
                    j11 = l(attributeValue, l4Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i10 = f0.f4349a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j14 = dVar.d;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        }
        if (j12 == -9223372036854775807L) {
            if (j13 != -9223372036854775807L) {
                j12 = j11 + j13;
            } else if (dVar != null) {
                long j15 = dVar.f49577e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new d(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, dVar);
                }
            }
        }
        j10 = j12;
        return new d(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, dVar);
    }

    public static y4.f k(org.xmlpull.v1.XmlPullParser r18, y4.f r19) {
        throw new UnsupportedOperationException("Method not decompiled: y4.c.k(org.xmlpull.v1.XmlPullParser, y4.f):y4.f");
    }

    public static long l(java.lang.String r13, gh.l4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: y4.c.l(java.lang.String, gh.l4):long");
    }

    public static p m(XmlPullParser xmlPullParser) {
        String t10 = d5.a.t(xmlPullParser, "extent");
        if (t10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(t10);
        if (!matcher.matches()) {
            d5.a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(t10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new p(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            d5.a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(t10));
            return null;
        }
    }

    @Override
    public final r4.f c(int i9, boolean z10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f49573b.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            p pVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i9), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            l4 l4Var = f49571j;
            com.google.android.gms.internal.cast.a aVar = f49572k;
            b3.b bVar = null;
            l4 l4Var2 = l4Var;
            com.google.android.gms.internal.cast.a aVar2 = aVar;
            int i10 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            l4Var2 = h(newPullParser);
                            aVar2 = f(newPullParser, aVar);
                            pVar = m(newPullParser);
                        }
                        l4 l4Var3 = l4Var2;
                        com.google.android.gms.internal.cast.a aVar3 = aVar2;
                        if (!e(name)) {
                            d5.a.v("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                i(newPullParser, hashMap, aVar3, pVar, hashMap2, hashMap3);
                            } else {
                                try {
                                    d j10 = j(newPullParser, dVar, hashMap2, l4Var3);
                                    arrayDeque.push(j10);
                                    if (dVar != null) {
                                        if (dVar.f49584m == null) {
                                            dVar.f49584m = new ArrayList();
                                        }
                                        dVar.f49584m.add(j10);
                                    }
                                } catch (h e10) {
                                    d5.a.L("TtmlDecoder", "Suppressing parser error", e10);
                                }
                            }
                            aVar2 = aVar3;
                            l4Var2 = l4Var3;
                        }
                        i10++;
                        aVar2 = aVar3;
                        l4Var2 = l4Var3;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a2 = d.a(newPullParser.getText());
                        if (dVar.f49584m == null) {
                            dVar.f49584m = new ArrayList();
                        }
                        dVar.f49584m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            bVar = new b3.b(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            if (bVar != null) {
                return bVar;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new Exception("Unable to decode source", e12);
        }
    }
}
