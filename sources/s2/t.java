package s2;

import android.util.Base64;
import e2.t0;
import h2.l0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements b3.r {
    public final q f57026a;
    public final n f57027b;
    public static final Pattern f56994c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern f56997e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f56999f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f57007n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f57012r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f57014s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern f57019w = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f57021x = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f57023y = Pattern.compile("MIME=\"(.+?)\"");
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
    public static final Pattern f56992a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern f56993b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f56995c0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern f56996d0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f56998e0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f57000f0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f57001g0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f57002h0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f57003i0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f57004j0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f57005k0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f57006l0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern f57008n0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f57009o0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f57010p0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f57011q0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f57013r0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f57015s0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern f57016t0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f57017u0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f57018v0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f57020w0 = a("AUTOSELECT");
    public static final Pattern f57022x0 = a("DEFAULT");
    public static final Pattern f57024y0 = a("FORCED");
    public static final Pattern f57025z0 = a("INDEPENDENT");
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

    public t(q qVar, n nVar) {
        this.f57026a = qVar;
        this.f57027b = nVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static e2.r b(String str, e2.q[] qVarArr) {
        e2.q[] qVarArr2 = new e2.q[qVarArr.length];
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            e2.q qVar = qVarArr[i7];
            qVarArr2[i7] = new e2.q(qVar.f10625b, qVar.f10626c, qVar.d, null);
        }
        return new e2.r(str, true, qVarArr2);
    }

    public static e2.q c(String str, String str2, HashMap hashMap, org.telegram.utils.twidget.w wVar) {
        String j3 = j(str, f57006l0, "1", hashMap, wVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = m0;
        if (equals) {
            String k10 = k(str, pattern, hashMap, wVar);
            return new e2.q(e2.l.f10485e, null, "video/mp4", Base64.decode(k10.substring(k10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = e2.l.f10485e;
            String str3 = l0.f13778a;
            return new e2.q(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j3)) {
            return null;
        } else {
            String k11 = k(str, pattern, hashMap, wVar);
            byte[] decode = Base64.decode(k11.substring(k11.indexOf(44)), 0);
            UUID uuid2 = e2.l.f10486f;
            return new e2.q(uuid2, null, "video/mp4", z3.p.a(uuid2, null, decode));
        }
    }

    public static s2.n d(s2.q r140, s2.n r141, org.telegram.ui.Components.i61 r142, android.net.Uri r143, org.telegram.utils.twidget.w r144) {
        throw new UnsupportedOperationException("Method not decompiled: s2.t.d(s2.q, s2.n, org.telegram.ui.Components.i61, android.net.Uri, org.telegram.utils.twidget.w):s2.n");
    }

    public static s2.q e(org.telegram.ui.Components.i61 r50, android.net.Uri r51, org.telegram.utils.twidget.w r52) {
        throw new UnsupportedOperationException("Method not decompiled: s2.t.e(org.telegram.ui.Components.i61, android.net.Uri, org.telegram.utils.twidget.w):s2.q");
    }

    public static boolean f(String str, Pattern pattern, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            return "YES".equals(b10.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d2;
    }

    public static long i(String str, Pattern pattern, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            String group = b10.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String j(String str, Pattern pattern, String str2, Map map, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            str2 = b10.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map, wVar);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map, org.telegram.utils.twidget.w wVar) {
        String j3 = j(str, pattern, null, map, wVar);
        if (j3 != null) {
            return j3;
        }
        throw t0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, X0, wVar);
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

    public static void m(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw t0.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object g(android.net.Uri r8, j2.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: s2.t.g(android.net.Uri, j2.k):java.lang.Object");
    }
}
