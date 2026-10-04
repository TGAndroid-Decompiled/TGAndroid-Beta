package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f45725a;
    public final i f45726b;
    public LoudnessCodecController f45727c;

    public j() {
        i iVar = i.f45723a;
        this.f45725a = new HashSet();
        this.f45726b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45727c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f45725a.add(mediaCodec));
    }

    public final void b() {
        this.f45725a.clear();
        LoudnessCodecController loudnessCodecController = this.f45727c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45725a.remove(mediaCodec) && (loudnessCodecController = this.f45727c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45727c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45727c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12024a, new h(this));
        this.f45727c = create;
        Iterator it = this.f45725a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
