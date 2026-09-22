package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41955a;
    public final i f41956b;
    public LoudnessCodecController f41957c;

    public j() {
        i iVar = i.f41953a;
        this.f41955a = new HashSet();
        this.f41956b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41957c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41955a.add(mediaCodec));
    }

    public final void b() {
        this.f41955a.clear();
        LoudnessCodecController loudnessCodecController = this.f41957c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41955a.remove(mediaCodec) && (loudnessCodecController = this.f41957c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41957c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41957c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11051a, new h(this));
        this.f41957c = create;
        Iterator it = this.f41955a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
