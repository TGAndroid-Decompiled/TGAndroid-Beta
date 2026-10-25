package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
public final class e extends VolumeProvider {
    public final p f51923a;

    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f51923a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f51923a;
        ((p4.e) ((k6.c) pVar.f2570f).d).f46655a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f51923a;
        ((p4.e) ((k6.c) pVar.f2570f).d).f46655a.post(new p4.c(pVar, i10, 0));
    }
}
