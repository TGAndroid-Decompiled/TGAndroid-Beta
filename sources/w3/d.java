package w3;

import com.google.android.gms.common.api.internal.w;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import s8.i0;
import s8.l;
import s8.t;
import s8.v;
public abstract class d {
    public static final String[] f49384a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f49385b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f49386c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static f2.c a(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: w3.d.a(java.lang.String):f2.c");
    }

    public static i0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        t tVar = v.f47174b;
        l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        boolean z4 = false;
        do {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t6 = h5.a.t(xmlPullParser, concat3);
                String t9 = h5.a.t(xmlPullParser, concat4);
                String t10 = h5.a.t(xmlPullParser, concat5);
                String t11 = h5.a.t(xmlPullParser, concat6);
                if (t6 != null && t9 != null) {
                    long j11 = 0;
                    if (t10 != null) {
                        j10 = Long.parseLong(t10);
                    } else {
                        j10 = 0;
                    }
                    if (t11 != null) {
                        j11 = Long.parseLong(t11);
                    }
                    b bVar = new b(t6, j10, j11, t9);
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        objArr = Arrays.copyOf(objArr, w.g(objArr.length, i11));
                    } else {
                        if (z4) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i10] = bVar;
                        i10++;
                    }
                    z4 = false;
                    objArr[i10] = bVar;
                    i10++;
                } else {
                    return i0.f47139e;
                }
            }
        } while (!h5.a.y(xmlPullParser, concat2));
        return v.s(i10, objArr);
    }
}
