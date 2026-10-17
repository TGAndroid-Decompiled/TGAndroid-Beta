package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.g3;
public final class f extends VolumeProvider {
    public final p f49910a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f49910a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f49910a;
        ((p4.e) ((g3) pVar.f3120f).d).f44115a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f49910a;
        ((p4.e) ((g3) pVar.f3120f).d).f44115a.post(new p4.c(pVar, i10, 0));
    }
}
