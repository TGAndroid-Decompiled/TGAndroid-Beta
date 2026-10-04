package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f45726a;
    public final i f45727b;
    public LoudnessCodecController f45728c;

    public j() {
        i iVar = i.f45724a;
        this.f45726a = new HashSet();
        this.f45727b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45728c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f45726a.add(mediaCodec));
    }

    public final void b() {
        this.f45726a.clear();
        LoudnessCodecController loudnessCodecController = this.f45728c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45726a.remove(mediaCodec) && (loudnessCodecController = this.f45728c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45728c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45728c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12024a, new h(this));
        this.f45728c = create;
        Iterator it = this.f45726a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
