package v3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.y;
import g7.r;
import g7.s;
import h3.t0;
import j4.v0;
import java.util.Arrays;
import m3.p;
import org.telegram.ui.Cells.e3;
public final class c extends i {
    public FlacStreamMetadata f48322n;
    public v0 f48323o;

    @Override
    public final long b(y yVar) {
        byte[] bArr = yVar.f4410a;
        if (bArr[0] == -1) {
            int i9 = (bArr[2] & 255) >> 4;
            if (i9 == 6 || i9 == 7) {
                yVar.D(4);
                yVar.x();
            }
            int b10 = r.b(i9, yVar);
            yVar.C(0);
            return b10;
        }
        return -1L;
    }

    @Override
    public final boolean c(y yVar, long j10, e3 e3Var) {
        byte[] bArr = yVar.f4410a;
        FlacStreamMetadata flacStreamMetadata = this.f48322n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f48322n = flacStreamMetadata2;
            e3Var.f24286b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, yVar.f4412c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            p b11 = s.b(yVar);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(b11);
            this.f48322n = copyWithSeekTable;
            ?? obj = new Object();
            obj.f13590c = copyWithSeekTable;
            obj.d = b11;
            obj.f13588a = -1L;
            obj.f13589b = -1L;
            this.f48323o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            v0 v0Var = this.f48323o;
            if (v0Var != null) {
                v0Var.f13588a = j10;
                e3Var.f24287c = v0Var;
            }
            ((t0) e3Var.f24286b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48322n = null;
            this.f48323o = null;
        }
    }
}
