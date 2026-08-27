package v3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.z;
import h3.t0;
import h7.r;
import h7.s;
import j4.u0;
import java.util.Arrays;
import m3.p;
import org.telegram.ui.i6;

public final class c extends i {

    public FlacStreamMetadata f48749n;

    public u0 f48750o;

    @Override
    public final long b(z zVar) {
        byte[] bArr = zVar.f4858a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            zVar.D(4);
            zVar.x();
        }
        int iB = r.b(i10, zVar);
        zVar.C(0);
        return iB;
    }

    @Override
    public final boolean c(z zVar, long j10, i6 i6Var) {
        byte[] bArr = zVar.f4858a;
        FlacStreamMetadata flacStreamMetadata = this.f48749n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f48749n = flacStreamMetadata2;
            i6Var.f38984b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, zVar.f4860c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            u0 u0Var = this.f48750o;
            if (u0Var != null) {
                u0Var.f12685a = j10;
                i6Var.f38985c = u0Var;
            }
            ((t0) i6Var.f38984b).getClass();
            return false;
        }
        p pVarB = s.b(zVar);
        FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(pVarB);
        this.f48749n = flacStreamMetadataCopyWithSeekTable;
        u0 u0Var2 = new u0();
        u0Var2.f12687c = flacStreamMetadataCopyWithSeekTable;
        u0Var2.d = pVarB;
        u0Var2.f12685a = -1L;
        u0Var2.f12686b = -1L;
        this.f48750o = u0Var2;
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48749n = null;
            this.f48750o = null;
        }
    }
}
