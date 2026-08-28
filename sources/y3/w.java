package y3;

import android.media.MediaCodecInfo;
import android.util.Pair;
import bg.l0;
import d5.f0;
import g7.b0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import o8.z;
public abstract class w {
    public static final Pattern f49555a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap f49556b = new HashMap();
    public static int f49557c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (f0.f4349a < 26 && f0.f4350b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f49505a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new l0(new r(2), 5));
        }
        int i9 = f0.f4349a;
        if (i9 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f49505a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new l0(new r(3), 5));
            }
        }
        if (i9 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f49505a)) {
            arrayList.add((n) arrayList.remove(0));
        }
    }

    public static String b(t0 t0Var) {
        Pair d;
        if ("audio/eac3-joc".equals(t0Var.B)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(t0Var.B) && (d = d(t0Var)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    public static android.util.Pair d(h3.t0 r33) {
        throw new UnsupportedOperationException("Method not decompiled: y3.w.d(h3.t0):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        u aVar;
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = f49556b;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                int i9 = f0.f4349a;
                if (i9 >= 21) {
                    aVar = new n2.w(z10, z11);
                } else {
                    aVar = new wa.a(26);
                }
                ArrayList f10 = f(sVar, aVar);
                if (z10 && f10.isEmpty() && 21 <= i9 && i9 <= 23) {
                    f10 = f(sVar, new wa.a(26));
                    if (!f10.isEmpty()) {
                        d5.a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) f10.get(0)).f49505a);
                    }
                }
                a(str, f10);
                z u10 = z.u(f10);
                hashMap.put(sVar, u10);
                return u10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static java.util.ArrayList f(y3.s r18, y3.u r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.w.f(y3.s, y3.u):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i9 = f0.f4349a;
                if (i9 >= 21 || (!"CIPAACDecoder".equals(str) && !"CIPMP3Decoder".equals(str) && !"CIPVorbisDecoder".equals(str) && !"CIPAMRNBDecoder".equals(str) && !"AACDecoder".equals(str) && !"MP3Decoder".equals(str))) {
                    if (i9 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                        String str3 = f0.f4350b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(f0.f4351c) && str3.startsWith("HM")) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (i9 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                        String str4 = f0.f4350b;
                        if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                            return false;
                        }
                    }
                    if (i9 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                        String str5 = f0.f4350b;
                        if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                            return false;
                        }
                    }
                    if (i9 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(f0.f4351c))) {
                        String str6 = f0.f4350b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            return false;
                        }
                    }
                    if (i9 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(f0.f4351c)) {
                        String str7 = f0.f4350b;
                        if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                            return false;
                        }
                    }
                    if (i9 > 19 || !f0.f4350b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
                        if (i9 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (f0.f4349a >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (f0.f4349a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!d5.q.h(str)) {
            String b10 = b0.b(mediaCodecInfo.getName());
            if (!b10.startsWith("arc.")) {
                if (!b10.startsWith("omx.google.") && !b10.startsWith("omx.ffmpeg.")) {
                    if ((!b10.startsWith("omx.sec.") || !b10.contains(".sw.")) && !b10.equals("omx.qcom.video.decoder.hevcswvdec") && !b10.startsWith("c2.android.") && !b10.startsWith("c2.google.")) {
                        if (b10.startsWith("omx.") || b10.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static int j() {
        n nVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i9;
        int i10;
        if (f49557c == -1) {
            int i11 = 0;
            List e10 = e("video/avc", false, false);
            if (e10.isEmpty()) {
                nVar = null;
            } else {
                nVar = (n) e10.get(0);
            }
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case 64:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case 512:
                                i10 = 921600;
                                continue;
                            case 1024:
                                i10 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                continue;
                            case 8192:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                if (f0.f4349a >= 21) {
                    i9 = 345600;
                } else {
                    i9 = 172800;
                }
                i11 = Math.max(i12, i9);
            }
            f49557c = i11;
        }
        return f49557c;
    }
}
