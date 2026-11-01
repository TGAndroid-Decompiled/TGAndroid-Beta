package vh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class s8 {
    public final org.telegram.ui.Components.t5 f51949a;
    public final int f51950b;
    public final short[] d;
    public short e;
    public final MediaExtractor f51952f;
    public final MediaFormat f51953g;
    public final long h;
    public final FfmpegAudioWaveformLoader f51956k;
    public final z8 f51957l;
    public int f51951c = 0;
    public final Object f51954i = new Object();
    public boolean f51955j = false;

    public s8(z8 z8Var, String str, int i10) {
        long j10;
        this.f51957l = z8Var;
        this.f51949a = new org.telegram.ui.Components.t5(z8Var, 0L, 600L, gr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f51952f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f51952f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f51952f.selectTrack(i11);
                        this.f51953g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f51953g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        u8 u8Var = z8Var.h;
        if (u8Var != null) {
            j10 = u8Var.e;
        } else if (!z8Var.f52315s.isEmpty()) {
            j10 = z8Var.getBaseDuration();
        } else if (z8Var.E) {
            j10 = z8Var.H;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, z8Var.getMaxScrollDuration()))) * i10) / Math.round(org.telegram.messenger.i0.N(3.3333f))), 4000);
        this.f51950b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f51953g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new d0(this, 20));
            } else {
                this.f51956k = new FfmpegAudioWaveformLoader(str, min, new qh.d(this, 23));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f51956k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new d0(this, 20));
        synchronized (this.f51954i) {
            this.f51955j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f51951c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.e = s11;
            }
        }
        this.f51951c += i10;
        this.f51957l.invalidate();
    }
}
