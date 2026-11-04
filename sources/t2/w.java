package t2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b8.xb;
import ci.y4;
import d2.u0;
import g9.f0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public abstract class w {
    public static final HashMap f54899a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f54852a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new y4(new Object(), 4));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f54852a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i3, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i3;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String c(d2.v vVar) {
        Pair b10;
        String str = vVar.f8489s;
        String str2 = vVar.f8489s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = g2.h.b(vVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                d2.n nVar = vVar.I;
                if (nVar != null && nVar.f8230c == 6 && nVar.f8229b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        } else if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List e(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = f54899a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList f10 = f(sVar, new e5.u(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f10.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f10 = f(sVar, new ra.e(23));
                    if (!f10.isEmpty()) {
                        g2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f10.get(0)).f54852a);
                    }
                }
                a(str, f10);
                i0 q10 = i0.q(f10);
                hashMap.put(sVar, q10);
                return q10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static java.util.ArrayList f(t2.s r20, t2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: t2.w.f(t2.s, t2.u):java.util.ArrayList");
    }

    public static s1 g(i iVar, d2.v vVar, boolean z10, boolean z11) {
        List b10;
        List b11 = iVar.b(vVar.f8489s, z10, z11);
        String c2 = c(vVar);
        if (c2 == null) {
            b10 = s1.f12146e;
        } else {
            b10 = iVar.b(c2, z10, z11);
        }
        f0 p10 = i0.p();
        p10.d(b11);
        p10.d(b10);
        return p10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i3 != 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!u0.i(str)) {
            String c2 = xb.c(mediaCodecInfo.getName());
            if (!c2.startsWith("arc.")) {
                if (!c2.startsWith("omx.google.") && !c2.startsWith("omx.ffmpeg.")) {
                    if ((!c2.startsWith("omx.sec.") || !c2.contains(".sw.")) && !c2.equals("omx.qcom.video.decoder.hevcswvdec") && !c2.startsWith("c2.android.") && !c2.startsWith("c2.google.")) {
                        if (c2.startsWith("omx.") || c2.startsWith("c2.")) {
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
}
