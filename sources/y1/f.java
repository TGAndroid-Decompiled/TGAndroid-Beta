package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.h3;
public final class f extends VolumeProvider {
    public final p f48505a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f48505a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f48505a;
        ((p4.e) ((h3) pVar.f1509f).d).f42705a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f48505a;
        ((p4.e) ((h3) pVar.f1509f).d).f42705a.post(new p4.c(pVar, i10, 0));
    }
}
