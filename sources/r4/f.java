package r4;

import android.net.Uri;
import android.text.TextUtils;
import g5.o0;
import j$.util.DesugarTimeZone;
import j3.r1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class f implements o0 {
    public static final Pattern f43283a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override
    public final Object r(Uri uri, g5.o oVar) {
        long j10;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(oVar, r8.d.f43389c)).readLine();
        try {
            Matcher matcher = f43283a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j10 = 1;
                    } else {
                        j10 = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= (((parseLong2 * 60) + parseLong) * 60000) * j10;
                }
                return Long.valueOf(time);
            }
            throw r1.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e) {
            throw r1.b(null, e);
        }
    }
}
