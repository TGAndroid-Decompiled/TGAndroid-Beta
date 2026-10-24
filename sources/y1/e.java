package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.g3;
public final class e extends VolumeProvider {
    public final p f50336a;

    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f50336a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f50336a;
        ((p4.e) ((g3) pVar.f3124f).d).f44515a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f50336a;
        ((p4.e) ((g3) pVar.f3124f).d).f44515a.post(new p4.c(pVar, i10, 0));
    }
}
