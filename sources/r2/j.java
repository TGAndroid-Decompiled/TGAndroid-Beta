package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41959a;
    public final i f41960b;
    public LoudnessCodecController f41961c;

    public j() {
        i iVar = i.f41957a;
        this.f41959a = new HashSet();
        this.f41960b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41961c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41959a.add(mediaCodec));
    }

    public final void b() {
        this.f41959a.clear();
        LoudnessCodecController loudnessCodecController = this.f41961c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41959a.remove(mediaCodec) && (loudnessCodecController = this.f41961c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41961c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41961c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11049a, new h(this));
        this.f41961c = create;
        Iterator it = this.f41959a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
