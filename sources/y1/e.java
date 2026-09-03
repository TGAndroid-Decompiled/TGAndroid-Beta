package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
public final class e extends VolumeProvider {
    public final p f47084a;

    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f47084a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f47084a;
        ((c2.e) ((af.d) pVar.f794f).d).f1938a.post(new c2.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f47084a;
        ((c2.e) ((af.d) pVar.f794f).d).f1938a.post(new c2.c(pVar, i10, 0));
    }
}
