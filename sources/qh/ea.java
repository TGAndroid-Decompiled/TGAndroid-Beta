package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class ea {
    public final org.telegram.ui.Components.z5 f45310a;
    public final int f45311b;
    public final short[] d;
    public short f45313e;
    public final MediaExtractor f45314f;
    public final MediaFormat f45315g;
    public final long h;
    public final FfmpegAudioWaveformLoader f45318k;
    public final la f45319l;
    public int f45312c = 0;
    public final Object f45316i = new Object();
    public boolean f45317j = false;

    public ea(la laVar, String str, int i10) {
        long j10;
        this.f45319l = laVar;
        this.f45310a = new org.telegram.ui.Components.z5(laVar, 0L, 600L, pr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f45314f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f45314f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f45314f.selectTrack(i11);
                        this.f45315g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f45315g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ga gaVar = laVar.h;
        if (gaVar != null) {
            j10 = gaVar.f45372e;
        } else if (!laVar.f45702s.isEmpty()) {
            j10 = laVar.getBaseDuration();
        } else if (laVar.B) {
            j10 = laVar.E;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, laVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f45311b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f45315g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new u9(this, 1));
            } else {
                this.f45318k = new FfmpegAudioWaveformLoader(str, min, new c4(this, 4));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f45318k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new u9(this, 1));
        synchronized (this.f45316i) {
            this.f45317j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f45312c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s6 = this.f45313e;
            short s9 = sArr[i11];
            if (s6 < s9) {
                this.f45313e = s9;
            }
        }
        this.f45312c += i10;
        this.f45319l.invalidate();
    }
}
