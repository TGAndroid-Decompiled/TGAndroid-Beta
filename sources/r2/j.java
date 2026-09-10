package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41178a;
    public final i f41179b;
    public LoudnessCodecController f41180c;

    public j() {
        i iVar = i.f41176a;
        this.f41178a = new HashSet();
        this.f41179b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41180c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41178a.add(mediaCodec));
    }

    public final void b() {
        this.f41178a.clear();
        LoudnessCodecController loudnessCodecController = this.f41180c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41178a.remove(mediaCodec) && (loudnessCodecController = this.f41180c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41180c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41180c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f10533a, new h(this));
        this.f41180c = create;
        Iterator it = this.f41178a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
