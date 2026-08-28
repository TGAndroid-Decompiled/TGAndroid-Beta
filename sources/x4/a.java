package x4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r4.e;
public final class a extends e {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern f48880e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f48881b;
    public final ArrayList f48882c;

    public a() {
        super("SubripDecoder");
        this.f48881b = new StringBuilder();
        this.f48882c = new ArrayList();
    }

    public static long d(Matcher matcher, int i9) {
        long j10;
        String group = matcher.group(i9 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i9 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i9 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i9 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final r4.f c(int r32, boolean r33, byte[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: x4.a.c(int, boolean, byte[]):r4.f");
    }
}
