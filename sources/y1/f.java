package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import li.k;
public final class f extends VolumeProvider {
    public final p f54127a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f54127a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f54127a;
        ((p4.e) ((k) pVar.f1404f).d).f44710a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f54127a;
        ((p4.e) ((k) pVar.f1404f).d).f44710a.post(new p4.c(pVar, i10, 0));
    }
}
