package zb;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
public final class d {
    public static final ArrayList f60357c = new ArrayList();
    public final CharsetEncoder[] f60358a;
    public final int f60359b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i3 = 0; i3 < 20; i3++) {
            String str = strArr[i3];
            if (((c) c.d.get(str)) != null) {
                try {
                    f60357c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public d(java.lang.String r12, java.nio.charset.Charset r13) {
        throw new UnsupportedOperationException("Method not decompiled: zb.d.<init>(java.lang.String, java.nio.charset.Charset):void");
    }
}
