package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.e3;
public final class f extends VolumeProvider {
    public final p f46404a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f46404a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f46404a;
        ((p4.e) ((e3) pVar.f1044f).d).f39677a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f46404a;
        ((p4.e) ((e3) pVar.f1044f).d).f39677a.post(new p4.c(pVar, i10, 0));
    }
}
