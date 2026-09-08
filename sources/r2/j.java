package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f44855a;
    public final i f44856b;
    public LoudnessCodecController f44857c;

    public j() {
        i iVar = i.f44853a;
        this.f44855a = new HashSet();
        this.f44856b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44857c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f44855a.add(mediaCodec));
    }

    public final void b() {
        this.f44855a.clear();
        LoudnessCodecController loudnessCodecController = this.f44857c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44855a.remove(mediaCodec) && (loudnessCodecController = this.f44857c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44857c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44857c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11946a, new h(this));
        this.f44857c = create;
        Iterator it = this.f44855a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
