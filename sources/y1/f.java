package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
public final class f extends VolumeProvider {
    public final p f46991a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f46991a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f46991a;
        ((c2.e) ((androidx.biometric.e) pVar.f782f).d).f1911a.post(new c2.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f46991a;
        ((c2.e) ((androidx.biometric.e) pVar.f782f).d).f1911a.post(new c2.c(pVar, i10, 0));
    }
}
