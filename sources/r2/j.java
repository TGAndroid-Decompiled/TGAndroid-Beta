package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41911a;
    public final i f41912b;
    public LoudnessCodecController f41913c;

    public j() {
        i iVar = i.f41909a;
        this.f41911a = new HashSet();
        this.f41912b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41913c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41911a.add(mediaCodec));
    }

    public final void b() {
        this.f41911a.clear();
        LoudnessCodecController loudnessCodecController = this.f41913c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41911a.remove(mediaCodec) && (loudnessCodecController = this.f41913c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41913c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41913c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11039a, new h(this));
        this.f41913c = create;
        Iterator it = this.f41911a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
