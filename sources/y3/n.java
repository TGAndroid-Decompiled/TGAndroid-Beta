package y3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d5.f0;
import h3.t0;
import j3.r0;
public final class n {
    public final String f49505a;
    public final String f49506b;
    public final String f49507c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean f49508e;
    public final boolean f49509f;
    public final boolean f49510g;
    public final boolean h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f49505a = str;
        this.f49506b = str2;
        this.f49507c = str3;
        this.d = codecCapabilities;
        this.f49510g = z10;
        this.f49508e = z11;
        this.f49509f = z12;
        this.h = d5.q.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(f0.f(i9, widthAlignment) * widthAlignment, f0.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    public static y3.n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: y3.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):y3.n");
    }

    public final k3.l b(t0 t0Var, t0 t0Var2) {
        int i9;
        t0 t0Var3;
        t0 t0Var4;
        int i10;
        if (!f0.a(t0Var.B, t0Var2.B)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        if (this.h) {
            if (t0Var.J != t0Var2.J) {
                i9 |= 1024;
            }
            if (!this.f49508e && (t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                i9 |= 512;
            }
            if (!f0.a(t0Var.N, t0Var2.N)) {
                i9 |= 2048;
            }
            if (f0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f49505a) && !t0Var.b(t0Var2)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                if (t0Var.b(t0Var2)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new k3.l(this.f49505a, t0Var, t0Var2, i10, 0);
            }
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
        } else {
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
            if (t0Var3.O != t0Var4.O) {
                i9 |= 4096;
            }
            if (t0Var3.P != t0Var4.P) {
                i9 |= 8192;
            }
            if (t0Var3.Q != t0Var4.Q) {
                i9 |= 16384;
            }
            String str = this.f49506b;
            if (i9 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d = w.d(t0Var3);
                Pair d9 = w.d(t0Var4);
                if (d != null && d9 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d9.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new k3.l(this.f49505a, t0Var3, t0Var4, 3, 0);
                    }
                }
            }
            if (!t0Var3.b(t0Var4)) {
                i9 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new k3.l(this.f49505a, t0Var3, t0Var4, 1, 0);
            }
        }
        return new k3.l(this.f49505a, t0Var3, t0Var4, 0, i9);
    }

    public final boolean c(t0 t0Var, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i9;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = w.d(t0Var);
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(t0Var.B);
            int i10 = 8;
            String str = this.f49506b;
            if (equals) {
                if ("video/avc".equals(str)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (f0.f4349a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        i9 = videoCapabilities.getBitrateRange().getUpper().intValue();
                    } else {
                        i9 = 0;
                    }
                    if (i9 >= 180000000) {
                        i10 = 1024;
                    } else if (i9 >= 120000000) {
                        i10 = 512;
                    } else if (i9 >= 60000000) {
                        i10 = 256;
                    } else if (i9 >= 30000000) {
                        i10 = 128;
                    } else if (i9 >= 18000000) {
                        i10 = 64;
                    } else if (i9 >= 12000000) {
                        i10 = 32;
                    } else if (i9 >= 7200000) {
                        i10 = 16;
                    } else if (i9 < 3600000) {
                        if (i9 >= 1800000) {
                            i10 = 4;
                        } else if (i9 >= 800000) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == intValue) {
                            String str2 = f0.f4350b;
                            if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + t0Var.f9766r + ", " + this.f49507c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t0 t0Var) {
        boolean z10;
        int i9;
        String str = t0Var.B;
        String str2 = this.f49506b;
        boolean z11 = false;
        if (!str2.equals(str) && !str2.equals(w.b(t0Var))) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = t0Var.H;
        int i11 = t0Var.G;
        if (!z10 || !c(t0Var, true)) {
            return false;
        }
        if (this.h) {
            if (i11 > 0 && i10 > 0) {
                if (f0.f4349a >= 21) {
                    return f(i11, i10, t0Var.I);
                }
                if (i11 * i10 <= w.j()) {
                    z11 = true;
                }
                if (!z11) {
                    g("legacyFrameSize, " + i11 + "x" + i10);
                }
                return z11;
            }
        } else {
            int i12 = f0.f4349a;
            if (i12 >= 21) {
                int i13 = t0Var.P;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i13 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i13)) {
                        g("sampleRate.support, " + i13);
                        return false;
                    }
                }
                int i14 = t0Var.O;
                if (i14 != -1) {
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
                    if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i9 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i9 = 16;
                        } else {
                            i9 = 30;
                        }
                        d5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f49505a + ", [" + maxInputChannelCount + " to " + i9 + "]");
                        maxInputChannelCount = i9;
                    }
                    if (maxInputChannelCount < i14) {
                        g("channelCount.support, " + i14);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean e(t0 t0Var) {
        if (this.h) {
            return this.f49508e;
        }
        Pair d = w.d(t0Var);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i9, int i10, double d) {
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
        if (f0.f4349a >= 29) {
            int a2 = m.a(videoCapabilities, i9, i10, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder o6 = e2.c.o("sizeAndRate.cover, ", i9, "x", i10, "@");
                o6.append(d);
                g(o6.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i9, i10, d)) {
            if (i9 < i10) {
                String str = this.f49505a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(f0.f4350b)) && a(videoCapabilities, i10, i9, d)) {
                    StringBuilder o9 = e2.c.o("sizeAndRate.rotated, ", i9, "x", i10, "@");
                    o9.append(d);
                    StringBuilder q10 = r0.q("AssumedSupport [", o9.toString(), "] [", str, ", ");
                    q10.append(this.f49506b);
                    q10.append("] [");
                    q10.append(f0.f4352e);
                    q10.append("]");
                    d5.a.n("MediaCodecInfo", q10.toString());
                }
            }
            StringBuilder o10 = e2.c.o("sizeAndRate.support, ", i9, "x", i10, "@");
            o10.append(d);
            g(o10.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder t10 = aa.d.t("NoSupport [", str, "] [");
        t10.append(this.f49505a);
        t10.append(", ");
        t10.append(this.f49506b);
        t10.append("] [");
        t10.append(f0.f4352e);
        t10.append("]");
        d5.a.n("MediaCodecInfo", t10.toString());
    }

    public final String toString() {
        return this.f49505a;
    }
}
