package t3;

import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import q8.l;
import q8.l0;
import q8.w;
import q8.x;
import q8.z;
public abstract class d {
    public static final String[] f48110a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f48111b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f48112c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static f2.c a(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: t3.d.a(java.lang.String):f2.c");
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        x xVar = z.f46511b;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (f5.a.z(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t10 = f5.a.t(xmlPullParser, concat3);
                String t11 = f5.a.t(xmlPullParser, concat4);
                String t12 = f5.a.t(xmlPullParser, concat5);
                String t13 = f5.a.t(xmlPullParser, concat6);
                if (t10 != null && t11 != null) {
                    long j11 = 0;
                    if (t12 != null) {
                        j10 = Long.parseLong(t12);
                    } else {
                        j10 = 0;
                    }
                    if (t13 != null) {
                        j11 = Long.parseLong(t13);
                    }
                    b bVar = new b(t10, j10, j11, t11);
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        objArr = Arrays.copyOf(objArr, w.d(objArr.length, i11));
                    }
                    objArr[i10] = bVar;
                    i10 = i11;
                } else {
                    return l0.f46462e;
                }
            }
        } while (!f5.a.y(xmlPullParser, concat2));
        return z.s(i10, objArr);
    }
}
