package r2;

import android.util.Base64;
import d2.v0;
import g2.n0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class s implements a3.s {
    public final p f54226a;
    public final m f54227b;
    public static final Pattern f54194c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern f54197e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f54199f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f54207n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f54212r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f54214s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern f54219w = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f54221x = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f54223y = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern I = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern J = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern S = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern T = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern U = a("CAN-SKIP-DATERANGES");
    public static final Pattern V = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern W = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern Y = a("CAN-BLOCK-RELOAD");
    public static final Pattern Z = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern f54192a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern f54193b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f54195c0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern f54196d0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f54198e0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f54200f0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f54201g0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f54202h0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f54203i0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f54204j0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f54205k0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f54206l0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern f54208n0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f54209o0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f54210p0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f54211q0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f54213r0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f54215s0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern f54216t0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f54217u0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f54218v0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f54220w0 = a("AUTOSELECT");
    public static final Pattern f54222x0 = a("DEFAULT");
    public static final Pattern f54224y0 = a("FORCED");
    public static final Pattern f54225z0 = a("INDEPENDENT");
    public static final Pattern A0 = a("GAP");
    public static final Pattern B0 = a("PRECISE");
    public static final Pattern C0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern K0 = a("END-ON-NEXT");
    public static final Pattern L0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern W0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public s(p pVar, m mVar) {
        this.f54226a = pVar;
        this.f54227b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static d2.s b(String str, d2.r[] rVarArr) {
        d2.r[] rVarArr2 = new d2.r[rVarArr.length];
        for (int i3 = 0; i3 < rVarArr.length; i3++) {
            d2.r rVar = rVarArr[i3];
            rVarArr2[i3] = new d2.r(rVar.f8337b, rVar.f8338c, rVar.d, null);
        }
        return new d2.s(str, true, rVarArr2);
    }

    public static d2.r c(String str, String str2, HashMap hashMap, q2.d dVar) {
        String i3 = i(str, f54206l0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = m0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new d2.r(d2.m.f8185e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = d2.m.f8185e;
            String str3 = n0.f11873a;
            return new d2.r(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i3)) {
            return null;
        } else {
            String j11 = j(str, pattern, hashMap, dVar);
            byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
            UUID uuid2 = d2.m.f8186f;
            return new d2.r(uuid2, null, "video/mp4", y3.q.a(uuid2, null, decode));
        }
    }

    public static r2.m d(r2.p r140, r2.m r141, p7.d r142, android.net.Uri r143, q2.d r144) {
        throw new UnsupportedOperationException("Method not decompiled: r2.s.d(r2.p, r2.m, p7.d, android.net.Uri, q2.d):r2.m");
    }

    public static r2.p e(p7.d r50, android.net.Uri r51, q2.d r52) {
        throw new UnsupportedOperationException("Method not decompiled: r2.s.e(p7.d, android.net.Uri, q2.d):r2.p");
    }

    public static boolean f(String str, Pattern pattern, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            return "YES".equals(b10.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d10;
    }

    public static long h(String str, Pattern pattern, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            str2 = b10.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map, dVar);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map, q2.d dVar) {
        String i3 = i(str, pattern, null, map, dVar);
        if (i3 != null) {
            return i3;
        }
        throw v0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, q2.d dVar) {
        Matcher b10 = q2.d.b(str, X0, dVar);
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
        throw v0.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object L(android.net.Uri r8, i2.l r9) {
        throw new UnsupportedOperationException("Method not decompiled: r2.s.L(android.net.Uri, i2.l):java.lang.Object");
    }
}
