package r3;

import java.util.Arrays;
import o8.l;
import o8.l0;
import o8.w;
import o8.x;
import o8.z;
import org.xmlpull.v1.XmlPullParser;
public abstract class d {
    public static final String[] f47027a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f47028b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f47029c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static f2.d a(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: r3.d.a(java.lang.String):f2.d");
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        x xVar = z.f19105b;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i9 = 0;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t10 = d5.a.t(xmlPullParser, concat3);
                String t11 = d5.a.t(xmlPullParser, concat4);
                String t12 = d5.a.t(xmlPullParser, concat5);
                String t13 = d5.a.t(xmlPullParser, concat6);
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
                    int i10 = i9 + 1;
                    if (objArr.length < i10) {
                        objArr = Arrays.copyOf(objArr, w.d(objArr.length, i10));
                    }
                    objArr[i9] = bVar;
                    i9 = i10;
                } else {
                    return l0.f19056e;
                }
            }
        } while (!d5.a.y(xmlPullParser, concat2));
        return z.s(i9, objArr);
    }
}
