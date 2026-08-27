package r3;

import h3.t1;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p8.l;
import p8.l0;
import p8.w;
import p8.x;
import p8.z;

public abstract class d {

    public static final String[] f46717a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    public static final String[] f46718b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    public static final String[] f46719c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static f2.c a(String str) {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!d5.a.z(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw t1.a("Couldn't find xmp metadata", null);
        }
        x xVar = z.f45604b;
        l0 l0VarB = l0.f45555e;
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (d5.a.z(xmlPullParserNewPullParser, "rdf:Description")) {
                for (int i10 = 0; i10 < 4; i10++) {
                    String strT = d5.a.t(xmlPullParserNewPullParser, f46717a[i10]);
                    if (strT != null) {
                        if (Integer.parseInt(strT) != 1) {
                            break loop0;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                String strT2 = d5.a.t(xmlPullParserNewPullParser, f46718b[i11]);
                                if (strT2 != null) {
                                    j10 = Long.parseLong(strT2);
                                    if (j10 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i11++;
                            }
                            j10 = -9223372036854775807L;
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 2) {
                                x xVar2 = z.f45604b;
                                l0VarB = l0.f45555e;
                                break;
                            }
                            String strT3 = d5.a.t(xmlPullParserNewPullParser, f46719c[i12]);
                            if (strT3 != null) {
                                l0VarB = z.t(new b("image/jpeg", 0L, 0L, "Primary"), new b("video/mp4", Long.parseLong(strT3), 0L, "MotionPhoto"));
                                break;
                            }
                            i12++;
                        }
                    }
                }
                return null;
            }
            if (d5.a.z(xmlPullParserNewPullParser, "Container:Directory")) {
                l0VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (d5.a.z(xmlPullParserNewPullParser, "GContainer:Directory")) {
                l0VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!d5.a.y(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (l0VarB.isEmpty()) {
            break loop0;
        }
        return new f2.c(j10, l0VarB, 9);
        return null;
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        x xVar = z.f45604b;
        l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strT = d5.a.t(xmlPullParser, strConcat3);
                String strT2 = d5.a.t(xmlPullParser, strConcat4);
                String strT3 = d5.a.t(xmlPullParser, strConcat5);
                String strT4 = d5.a.t(xmlPullParser, strConcat6);
                if (strT == null || strT2 == null) {
                    return l0.f45555e;
                }
                b bVar = new b(strT, strT3 != null ? Long.parseLong(strT3) : 0L, strT4 != null ? Long.parseLong(strT4) : 0L, strT2);
                int i11 = i10 + 1;
                if (objArrCopyOf.length < i11) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, w.d(objArrCopyOf.length, i11));
                }
                objArrCopyOf[i10] = bVar;
                i10 = i11;
            }
        } while (!d5.a.y(xmlPullParser, strConcat2));
        return z.s(i10, objArrCopyOf);
    }
}
