package s2;

import android.util.Base64;
import e2.t0;
import h2.m0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class s implements b3.q {
    public final p f54760a;
    public final m f54761b;
    public static final Pattern f54728c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern f54731e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f54733f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f54741n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f54746r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f54748s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern f54753w = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f54755x = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f54757y = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern D = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern I = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern K = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern N = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern O = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern S = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern T = a("CAN-SKIP-DATERANGES");
    public static final Pattern U = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern V = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern W = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = a("CAN-BLOCK-RELOAD");
    public static final Pattern Y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern f54726a0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f54727b0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern f54729c0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f54730d0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f54732e0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f54734f0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f54735g0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f54736h0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f54737i0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f54738j0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f54739k0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f54740l0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f54742n0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f54743o0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f54744p0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f54745q0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f54747r0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern f54749s0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f54750t0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f54751u0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f54752v0 = a("AUTOSELECT");
    public static final Pattern f54754w0 = a("DEFAULT");
    public static final Pattern f54756x0 = a("FORCED");
    public static final Pattern f54758y0 = a("INDEPENDENT");
    public static final Pattern f54759z0 = a("GAP");
    public static final Pattern A0 = a("PRECISE");
    public static final Pattern B0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern J0 = a("END-ON-NEXT");
    public static final Pattern K0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern N0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern X0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public s(p pVar, m mVar) {
        this.f54760a = pVar;
        this.f54761b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static e2.r b(String str, e2.q[] qVarArr) {
        e2.q[] qVarArr2 = new e2.q[qVarArr.length];
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            e2.q qVar = qVarArr[i7];
            qVarArr2[i7] = new e2.q(qVar.f10481b, qVar.f10482c, qVar.d, null);
        }
        return new e2.r(str, true, qVarArr2);
    }

    public static e2.q c(String str, String str2, HashMap hashMap, org.telegram.utils.twidget.v vVar) {
        String i7 = i(str, f54739k0, "1", hashMap, vVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f54740l0;
        if (equals) {
            String j3 = j(str, pattern, hashMap, vVar);
            return new e2.q(e2.l.f10341e, null, "video/mp4", Base64.decode(j3.substring(j3.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = e2.l.f10341e;
            String str3 = m0.f14112a;
            return new e2.q(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i7)) {
            return null;
        } else {
            String j10 = j(str, pattern, hashMap, vVar);
            byte[] decode = Base64.decode(j10.substring(j10.indexOf(44)), 0);
            UUID uuid2 = e2.l.f10342f;
            return new e2.q(uuid2, null, "video/mp4", z3.q.a(uuid2, null, decode));
        }
    }

    public static s2.m d(s2.p r140, s2.m r141, org.telegram.ui.hy0 r142, android.net.Uri r143, org.telegram.utils.twidget.v r144) {
        throw new UnsupportedOperationException("Method not decompiled: s2.s.d(s2.p, s2.m, org.telegram.ui.hy0, android.net.Uri, org.telegram.utils.twidget.v):s2.m");
    }

    public static s2.p e(org.telegram.ui.hy0 r50, android.net.Uri r51, org.telegram.utils.twidget.v r52) {
        throw new UnsupportedOperationException("Method not decompiled: s2.s.e(org.telegram.ui.hy0, android.net.Uri, org.telegram.utils.twidget.v):s2.p");
    }

    public static boolean f(String str, Pattern pattern, org.telegram.utils.twidget.v vVar) {
        Matcher b10 = org.telegram.utils.twidget.v.b(str, pattern, vVar);
        if (b10.find()) {
            return "YES".equals(b10.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, org.telegram.utils.twidget.v vVar) {
        Matcher b10 = org.telegram.utils.twidget.v.b(str, pattern, vVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d2;
    }

    public static long h(String str, Pattern pattern, org.telegram.utils.twidget.v vVar) {
        Matcher b10 = org.telegram.utils.twidget.v.b(str, pattern, vVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map, org.telegram.utils.twidget.v vVar) {
        Matcher b10 = org.telegram.utils.twidget.v.b(str, pattern, vVar);
        if (b10.find()) {
            str2 = b10.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map, vVar);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map, org.telegram.utils.twidget.v vVar) {
        String i7 = i(str, pattern, null, map, vVar);
        if (i7 != null) {
            return i7;
        }
        throw t0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, org.telegram.utils.twidget.v vVar) {
        Matcher b10 = org.telegram.utils.twidget.v.b(str, W0, vVar);
        StringBuffer stringBuffer = new StringBuffer();
        while (b10.find()) {
            String group = b10.group(1);
            if (map.containsKey(group)) {
                b10.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        b10.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void l(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw t0.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object L1(android.net.Uri r8, j2.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: s2.s.L1(android.net.Uri, j2.k):java.lang.Object");
    }
}
