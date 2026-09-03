package ph;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class ha {
    public final org.telegram.ui.Components.z5 f41756a;
    public final int f41757b;
    public final short[] d;
    public short e;
    public final MediaExtractor f41759f;
    public final MediaFormat f41760g;
    public final long h;
    public final FfmpegAudioWaveformLoader f41763k;
    public final oa f41764l;
    public int f41758c = 0;
    public final Object f41761i = new Object();
    public boolean f41762j = false;

    public ha(oa oaVar, String str, int i10) {
        long j10;
        this.f41764l = oaVar;
        this.f41756a = new org.telegram.ui.Components.z5(oaVar, 0L, 600L, mr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f41759f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f41759f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f41759f.selectTrack(i11);
                        this.f41760g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f41760g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ja jaVar = oaVar.h;
        if (jaVar != null) {
            j10 = jaVar.e;
        } else if (!oaVar.f42159s.isEmpty()) {
            j10 = oaVar.getBaseDuration();
        } else if (oaVar.B) {
            j10 = oaVar.E;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, oaVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f41757b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f41760g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new ga(this, 0));
            } else {
                this.f41763k = new FfmpegAudioWaveformLoader(str, min, new d4(this, 4));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f41763k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new ga(this, 0));
        synchronized (this.f41761i) {
            this.f41762j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f41758c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s6 = this.e;
            short s9 = sArr[i11];
            if (s6 < s9) {
                this.e = s9;
            }
        }
        this.f41758c += i10;
        this.f41764l.invalidate();
    }
}
