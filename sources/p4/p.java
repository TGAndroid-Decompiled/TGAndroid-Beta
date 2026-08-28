package p4;

import android.util.Base64;
import com.google.android.exoplayer2.upstream.s0;
import d5.f0;
import h3.t1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class p implements s0 {
    public final m f45456a;
    public final j f45457b;
    public static final Pattern f45431c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern f45434e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f45436f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern f45444n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f45449r = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern f45451s = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f45453w = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern f45454x = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern f45455y = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern A = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern J = a("CAN-SKIP-DATERANGES");
    public static final Pattern K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = a("CAN-BLOCK-RELOAD");
    public static final Pattern O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern R = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern f45429a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern f45430b0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern f45432c0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f45433d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f45435e0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f45437f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern f45438g0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern f45439h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern f45440i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern f45441j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f45442k0 = a("AUTOSELECT");
    public static final Pattern f45443l0 = a("DEFAULT");
    public static final Pattern m0 = a("FORCED");
    public static final Pattern f45445n0 = a("INDEPENDENT");
    public static final Pattern f45446o0 = a("GAP");
    public static final Pattern f45447p0 = a("PRECISE");
    public static final Pattern f45448q0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern f45450r0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern f45452s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.f45456a = mVar;
        this.f45457b = jVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static l3.c b(String str, l3.b[] bVarArr) {
        l3.b[] bVarArr2 = new l3.b[bVarArr.length];
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            l3.b bVar = bVarArr[i9];
            bVarArr2[i9] = new l3.b(bVar.f16630b, bVar.f16631c, bVar.d, null);
        }
        return new l3.c(str, true, bVarArr2);
    }

    public static l3.b c(String str, String str2, HashMap hashMap) {
        String i9 = i(str, f45429a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f45430b0;
        if (equals) {
            String j10 = j(str, pattern, hashMap);
            return new l3.b(h3.h.d, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = h3.h.d;
            int i10 = f0.f4349a;
            return new l3.b(uuid, null, "hls", str.getBytes(n8.d.f18513c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i9)) {
            return null;
        } else {
            String j11 = j(str, pattern, hashMap);
            byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
            UUID uuid2 = h3.h.f9439e;
            return new l3.b(uuid2, null, "video/mp4", u3.j.a(uuid2, null, decode));
        }
    }

    public static p4.j d(p4.m r110, p4.j r111, j4.c r112, java.lang.String r113) {
        throw new UnsupportedOperationException("Method not decompiled: p4.p.d(p4.m, p4.j, j4.c, java.lang.String):p4.j");
    }

    public static p4.m e(j4.c r44, java.lang.String r45) {
        throw new UnsupportedOperationException("Method not decompiled: p4.p.e(j4.c, java.lang.String):p4.m");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i9 = i(str, pattern, null, map);
        if (i9 != null) {
            return i9;
        }
        throw t1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f45452s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override
    public final java.lang.Object D(android.net.Uri r7, com.google.android.exoplayer2.upstream.o r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.p.D(android.net.Uri, com.google.android.exoplayer2.upstream.o):java.lang.Object");
    }
}
