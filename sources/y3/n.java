package y3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d5.g0;
import h3.t0;

public final class n {

    public final String f49495a;

    public final String f49496b;

    public final String f49497c;
    public final MediaCodecInfo.CodecCapabilities d;

    public final boolean f49498e;

    public final boolean f49499f;

    public final boolean f49500g;
    public final boolean h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f49495a = str;
        this.f49496b = str2;
        this.f49497c = str3;
        this.d = codecCapabilities;
        this.f49500g = z10;
        this.f49498e = z11;
        this.f49499f = z12;
        this.h = d5.q.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(g0.f(i10, widthAlignment) * widthAlignment, g0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d));
    }

    public static n h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (codecCapabilities != null && (i10 = g0.f4795a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i10 <= 22) {
                String str4 = g0.d;
                z12 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null && g0.f4795a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new n(str, str2, str3, codecCapabilities, z10, z12, z11 || (codecCapabilities != null && g0.f4795a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final k3.l b(t0 t0Var, t0 t0Var2) {
        t0 t0Var3;
        t0 t0Var4;
        int i10 = !g0.a(t0Var.B, t0Var2.B) ? 8 : 0;
        if (this.h) {
            if (t0Var.J != t0Var2.J) {
                i10 |= 1024;
            }
            if (!this.f49498e && (t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                i10 |= 512;
            }
            if (!g0.a(t0Var.N, t0Var2.N)) {
                i10 |= 2048;
            }
            if (g0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f49495a) && !t0Var.b(t0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new k3.l(this.f49495a, t0Var, t0Var2, t0Var.b(t0Var2) ? 3 : 2, 0);
            }
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
        } else {
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
            if (t0Var3.O != t0Var4.O) {
                i10 |= 4096;
            }
            if (t0Var3.P != t0Var4.P) {
                i10 |= 8192;
            }
            if (t0Var3.Q != t0Var4.Q) {
                i10 |= 16384;
            }
            String str = this.f49496b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = w.d(t0Var3);
                Pair pairD2 = w.d(t0Var4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new k3.l(this.f49495a, t0Var3, t0Var4, 3, 0);
                    }
                }
            }
            if (!t0Var3.b(t0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new k3.l(this.f49495a, t0Var3, t0Var4, 1, 0);
            }
        }
        return new k3.l(this.f49495a, t0Var3, t0Var4, 0, i10);
    }

    public final boolean c(t0 t0Var, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = w.d(t0Var);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(t0Var.B);
            int i10 = 8;
            String str = this.f49496b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (g0.f4795a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = g0.f4796b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + t0Var.f8190r + ", " + this.f49497c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t0 t0Var) {
        int i10;
        String str = t0Var.B;
        String str2 = this.f49496b;
        boolean z10 = str2.equals(str) || str2.equals(w.b(t0Var));
        int i11 = t0Var.H;
        int i12 = t0Var.G;
        if (!z10 || !c(t0Var, true)) {
            return false;
        }
        if (!this.h) {
            int i13 = g0.f4795a;
            if (i13 >= 21) {
                int i14 = t0Var.P;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i14)) {
                        g("sampleRate.support, " + i14);
                        return false;
                    }
                }
                int i15 = t0Var.O;
                if (i15 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i10 = 6;
                        } else {
                            i10 = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        d5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f49495a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                        maxInputChannelCount = i10;
                    }
                    if (maxInputChannelCount < i15) {
                        g("channelCount.support, " + i15);
                        return false;
                    }
                }
            }
        } else if (i12 > 0 && i11 > 0) {
            if (g0.f4795a >= 21) {
                return f(i12, i11, t0Var.I);
            }
            boolean z11 = i12 * i11 <= w.j();
            if (!z11) {
                g("legacyFrameSize, " + i12 + "x" + i11);
            }
            return z11;
        }
        return true;
    }

    public final boolean e(t0 t0Var) {
        if (this.h) {
            return this.f49498e;
        }
        Pair pairD = w.d(t0Var);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i10, int i11, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (g0.f4795a >= 29) {
            int iA = m.a(videoCapabilities, i10, i11, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbP = com.google.android.recaptcha.internal.a.p("sizeAndRate.cover, ", i10, "x", i11, "@");
                sbP.append(d);
                g(sbP.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.f49495a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(g0.f4796b)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder sbP2 = com.google.android.recaptcha.internal.a.p("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    sbP2.append(d);
                    StringBuilder sbP3 = i0.a.p("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                    sbP3.append(this.f49496b);
                    sbP3.append("] [");
                    sbP3.append(g0.f4798e);
                    sbP3.append("]");
                    d5.a.n("MediaCodecInfo", sbP3.toString());
                }
            }
            StringBuilder sbP4 = com.google.android.recaptcha.internal.a.p("sizeAndRate.support, ", i10, "x", i11, "@");
            sbP4.append(d);
            g(sbP4.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbR = a9.p.r("NoSupport [", str, "] [");
        sbR.append(this.f49495a);
        sbR.append(", ");
        sbR.append(this.f49496b);
        sbR.append("] [");
        sbR.append(g0.f4798e);
        sbR.append("]");
        d5.a.n("MediaCodecInfo", sbR.toString());
    }

    public final String toString() {
        return this.f49495a;
    }
}
