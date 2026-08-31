package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class fa {
    public final org.telegram.ui.Components.z5 f45336a;
    public final int f45337b;
    public final short[] d;
    public short f45339e;
    public final MediaExtractor f45340f;
    public final MediaFormat f45341g;
    public final long h;
    public final FfmpegAudioWaveformLoader f45344k;
    public final ma f45345l;
    public int f45338c = 0;
    public final Object f45342i = new Object();
    public boolean f45343j = false;

    public fa(ma maVar, String str, int i10) {
        long j10;
        this.f45345l = maVar;
        this.f45336a = new org.telegram.ui.Components.z5(maVar, 0L, 600L, pr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f45340f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f45340f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f45340f.selectTrack(i11);
                        this.f45341g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f45341g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ha haVar = maVar.h;
        if (haVar != null) {
            j10 = haVar.f45391e;
        } else if (!maVar.f45728s.isEmpty()) {
            j10 = maVar.getBaseDuration();
        } else if (maVar.B) {
            j10 = maVar.E;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, maVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f45337b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f45341g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new v9(this, 1));
            } else {
                this.f45344k = new FfmpegAudioWaveformLoader(str, min, new d4(this, 4));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f45344k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new v9(this, 1));
        synchronized (this.f45342i) {
            this.f45343j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f45338c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s6 = this.f45339e;
            short s9 = sArr[i11];
            if (s6 < s9) {
                this.f45339e = s9;
            }
        }
        this.f45338c += i10;
        this.f45345l.invalidate();
    }
}
