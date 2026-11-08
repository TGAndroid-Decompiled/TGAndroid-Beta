package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56255a;
    public final i f56256b;
    public LoudnessCodecController f56257c;

    public j() {
        i iVar = i.f56253a;
        this.f56255a = new HashSet();
        this.f56256b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56257c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56255a.add(mediaCodec));
    }

    public final void b() {
        this.f56255a.clear();
        LoudnessCodecController loudnessCodecController = this.f56257c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56255a.remove(mediaCodec) && (loudnessCodecController = this.f56257c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56257c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56257c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19994a, new h(this));
        this.f56257c = create;
        Iterator it = this.f56255a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
