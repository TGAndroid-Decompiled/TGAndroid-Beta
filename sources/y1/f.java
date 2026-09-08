package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m2.t;
public final class f extends VolumeProvider {
    public final p f49503a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f49503a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f49503a;
        ((p4.e) ((t) pVar.f1378f).d).f43832a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f49503a;
        ((p4.e) ((t) pVar.f1378f).d).f43832a.post(new p4.c(pVar, i10, 0));
    }
}
