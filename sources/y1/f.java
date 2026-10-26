package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
public final class f extends VolumeProvider {
    public final p f51927a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f51927a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f51927a;
        ((p4.e) ((k6.c) pVar.f2570f).d).f46658a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f51927a;
        ((p4.e) ((k6.c) pVar.f2570f).d).f46658a.post(new p4.c(pVar, i10, 0));
    }
}
