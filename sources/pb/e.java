package pb;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
public final class e {
    public static final ArrayList f44268c = new ArrayList();
    public final CharsetEncoder[] f44269a;
    public final int f44270b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (((c) c.d.get(str)) != null) {
                try {
                    f44268c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public e(java.lang.String r12, java.nio.charset.Charset r13) {
        throw new UnsupportedOperationException("Method not decompiled: pb.e.<init>(java.lang.String, java.nio.charset.Charset):void");
    }
}
