package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.h3;
public final class e extends VolumeProvider {
    public final p f48504a;

    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f48504a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f48504a;
        ((p4.e) ((h3) pVar.f1509f).d).f42705a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f48504a;
        ((p4.e) ((h3) pVar.f1509f).d).f42705a.post(new p4.c(pVar, i10, 0));
    }
}
