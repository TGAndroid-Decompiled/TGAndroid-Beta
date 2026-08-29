package x3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import f5.w;
import i7.i0;
import i7.j0;
import j3.t0;
import java.util.Arrays;
import l4.v0;
import o3.p;
import v5.n;
public final class c extends i {
    public FlacStreamMetadata f50060n;
    public v0 f50061o;

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f6640a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                wVar.D(4);
                wVar.x();
            }
            int b10 = i0.b(i10, wVar);
            wVar.C(0);
            return b10;
        }
        return -1L;
    }

    @Override
    public final boolean c(w wVar, long j10, n nVar) {
        byte[] bArr = wVar.f6640a;
        FlacStreamMetadata flacStreamMetadata = this.f50060n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f50060n = flacStreamMetadata2;
            nVar.f49431b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, wVar.f6642c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            p b11 = j0.b(wVar);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(b11);
            this.f50060n = copyWithSeekTable;
            ?? obj = new Object();
            obj.f14449c = copyWithSeekTable;
            obj.d = b11;
            obj.f14447a = -1L;
            obj.f14448b = -1L;
            this.f50061o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            v0 v0Var = this.f50061o;
            if (v0Var != null) {
                v0Var.f14447a = j10;
                nVar.f49432c = v0Var;
            }
            ((t0) nVar.f49431b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50060n = null;
            this.f50061o = null;
        }
    }
}
