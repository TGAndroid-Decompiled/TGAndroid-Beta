package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.g3;
public final class e extends VolumeProvider {
    public final p f49893a;

    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f49893a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f49893a;
        ((p4.e) ((g3) pVar.f3117f).d).f44097a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f49893a;
        ((p4.e) ((g3) pVar.f3117f).d).f44097a.post(new p4.c(pVar, i10, 0));
    }
}
