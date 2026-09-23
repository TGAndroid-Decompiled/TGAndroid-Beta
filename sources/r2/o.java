package r2;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b2.r0;
import e2.d0;
import j$.util.Objects;
import java.util.HashMap;
import w7.z6;
public final class o {
    public final String f41915a;
    public final String f41916b;
    public final String f41917c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f41918f;
    public final boolean f41919g;
    public final boolean h;
    public final boolean f41920i;
    public int f41921j;
    public int f41922k;
    public float f41923l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f41915a = str;
        this.f41916b = str2;
        this.f41917c = str3;
        this.d = codecCapabilities;
        this.f41919g = z10;
        this.e = z13;
        this.f41918f = z14;
        this.h = z15;
        this.f41920i = r0.m(str2);
        this.f41923l = -3.4028235E38f;
        this.f41921j = -1;
        this.f41922k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(d0.f(i10, widthAlignment) * widthAlignment, d0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i12, i13, floor)) {
                if (Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public static r2.o i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: r2.o.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):r2.o");
    }

    public final i2.h b(b2.s sVar, b2.s sVar2) {
        int i10;
        b2.s sVar3;
        b2.s sVar4;
        int i11;
        int i12;
        String str = sVar.f3301r;
        b2.j jVar = sVar.H;
        String str2 = sVar2.f3301r;
        b2.j jVar2 = sVar2.H;
        boolean equals = Objects.equals(str, str2);
        boolean z10 = false;
        if (!equals) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f41920i) {
            if (sVar.D != sVar2.D) {
                i10 |= 1024;
            }
            z10 = (sVar.f3307y == sVar2.f3307y && sVar.f3308z == sVar2.f3308z) ? true : true;
            if (!this.e && z10) {
                i10 |= 512;
            }
            if ((!b2.j.e(jVar) || !b2.j.e(jVar2)) && !Objects.equals(jVar, jVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f41915a) && !sVar.b(sVar2)) {
                i10 |= 2;
            }
            int i13 = sVar.A;
            if (i13 != -1 && (i12 = sVar.B) != -1 && i13 == sVar2.A && i12 == sVar2.B && z10) {
                i10 |= 2;
            }
            if (i10 == 0) {
                if (sVar.b(sVar2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new i2.h(this.f41915a, sVar, sVar2, i11, 0);
            }
            sVar3 = sVar;
            sVar4 = sVar2;
        } else {
            sVar3 = sVar;
            sVar4 = sVar2;
            if (sVar3.J != sVar4.J) {
                i10 |= 4096;
            }
            if (sVar3.K != sVar4.K) {
                i10 |= 8192;
            }
            if (sVar3.L != sVar4.L) {
                i10 |= 16384;
            }
            String str3 = this.f41916b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap hashMap = w.f41958a;
                Pair b10 = e2.e.b(sVar3);
                Pair b11 = e2.e.b(sVar4);
                if (b10 != null && b11 != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    int intValue2 = ((Integer) b11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i2.h(this.f41915a, sVar3, sVar4, 3, 0);
                    }
                }
            }
            if (!sVar3.b(sVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new i2.h(this.f41915a, sVar3, sVar4, 1, 0);
            }
        }
        return new i2.h(this.f41915a, sVar3, sVar4, 0, i10);
    }

    public final boolean c(b2.s r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: r2.o.c(b2.s, boolean):boolean");
    }

    public final boolean d(b2.s sVar) {
        if (Objects.equals(sVar.f3301r, "audio/flac") && sVar.L == 22 && Build.VERSION.SDK_INT < 34 && this.f41915a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(b2.s sVar) {
        int i10;
        int i11;
        String str = sVar.f3301r;
        String str2 = this.f41916b;
        if ((!str2.equals(str) && !str2.equals(w.b(sVar))) || !c(sVar, true) || !d(sVar)) {
            return false;
        }
        if (this.f41920i) {
            int i12 = sVar.f3307y;
            if (i12 > 0 && (i11 = sVar.f3308z) > 0) {
                return g(i12, i11, sVar.C);
            }
        } else {
            int i13 = sVar.K;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i13)) {
                    h("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = sVar.J;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i10 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i10 = 16;
                    } else {
                        i10 = 30;
                    }
                    e2.a.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f41915a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    h("channelCount.support, " + i14);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(b2.s sVar) {
        if (this.f41920i) {
            return this.e;
        }
        HashMap hashMap = w.f41958a;
        Pair b10 = e2.e.b(sVar);
        if (b10 != null && ((Integer) b10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10, int i11, double d) {
        int i12;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            if (i13 >= 29 && ((bool = z6.f44832a) == null || !bool.booleanValue())) {
                i12 = b2.c.b(videoCapabilities, i10, i11, d);
            } else {
                i12 = 0;
            }
            if (i12 != 2) {
                if (i12 == 1) {
                    StringBuilder m10 = hg.c.m("sizeAndRate.cover, ", i10, "x", i11, "@");
                    m10.append(d);
                    h(m10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.f41915a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder m11 = hg.c.m("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    m11.append(d);
                    StringBuilder x10 = a4.a.x("AssumedSupport [", m11.toString(), "] [", str, ", ");
                    x10.append(this.f41916b);
                    x10.append("] [");
                    x10.append(d0.f7871a);
                    x10.append("]");
                    e2.a.d("MediaCodecInfo", x10.toString());
                    return true;
                }
            }
            StringBuilder m12 = hg.c.m("sizeAndRate.support, ", i10, "x", i11, "@");
            m12.append(d);
            h(m12.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder w10 = a4.a.w("NoSupport [", str, "] [");
        w10.append(this.f41915a);
        w10.append(", ");
        w10.append(this.f41916b);
        w10.append("] [");
        w10.append(d0.f7871a);
        w10.append("]");
        e2.a.d("MediaCodecInfo", w10.toString());
    }

    public final String toString() {
        return this.f41915a;
    }
}
