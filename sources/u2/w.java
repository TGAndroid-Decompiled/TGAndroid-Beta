package u2;

import a8.ga;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import bi.s5;
import e2.s0;
import h9.f0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public abstract class w {
    public static final HashMap f56319a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f56272a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new s5(new Object(), 6));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f56272a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i7, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i7;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String c(e2.u uVar) {
        Pair b10;
        String str = uVar.f10615s;
        String str2 = uVar.f10615s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = h2.g.b(uVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                e2.m mVar = uVar.I;
                if (mVar != null && mVar.f10365c == 6 && mVar.f10364b == 1) {
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

    public static synchronized List e(String str, boolean z9, boolean z10) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z9, z10);
                HashMap hashMap = f56319a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList f10 = f(sVar, new f5.u(z9, z10, str.equals("video/mv-hevc")));
                if (z9 && f10.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f10 = f(sVar, new nb.a(25));
                    if (!f10.isEmpty()) {
                        h2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f10.get(0)).f56272a);
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

    public static java.util.ArrayList f(u2.s r20, u2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w.f(u2.s, u2.u):java.util.ArrayList");
    }

    public static t1 g(i iVar, e2.u uVar, boolean z9, boolean z10) {
        List a10;
        List a11 = iVar.a(uVar.f10615s, z9, z10);
        String c10 = c(uVar);
        if (c10 == null) {
            a10 = t1.f14397e;
        } else {
            a10 = iVar.a(c10, z9, z10);
        }
        f0 p10 = i0.p();
        p10.d(a11);
        p10.d(a10);
        return p10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z9, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z9 || !str.endsWith(".secure")) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i7 != 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
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
        if (!s0.i(str)) {
            String c10 = ga.c(mediaCodecInfo.getName());
            if (!c10.startsWith("arc.")) {
                if (!c10.startsWith("omx.google.") && !c10.startsWith("omx.ffmpeg.")) {
                    if ((!c10.startsWith("omx.sec.") || !c10.contains(".sw.")) && !c10.equals("omx.qcom.video.decoder.hevcswvdec") && !c10.startsWith("c2.android.") && !c10.startsWith("c2.google.")) {
                        if (c10.startsWith("omx.") || c10.startsWith("c2.")) {
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
