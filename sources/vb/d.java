package vb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public final class d extends b {

    public static final Logger f48853m = Logger.getLogger(d.class.getName());
    public int d;

    public int f48854e;

    public int f48855f;

    public int f48856g;
    public long h;

    public long f48857i;

    public a f48858j;

    public ArrayList f48859k;

    public byte[] f48860l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = p2.b.a(byteBuffer.get());
        int iA = p2.b.a(byteBuffer.get());
        this.f48854e = iA >>> 2;
        this.f48855f = (iA >> 1) & 1;
        this.f48856g = p2.b.a(byteBuffer.get()) + (p2.b.h(byteBuffer) << 8);
        this.h = p2.b.i(byteBuffer);
        this.f48857i = p2.b.i(byteBuffer);
        int iRemaining = byteBuffer.remaining();
        Logger logger = f48853m;
        if (iRemaining > 2) {
            int iPosition = byteBuffer.position();
            b bVarA = k.a(this.d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            logger.finer(bVarA + " - DecoderConfigDescr1 read: " + iPosition2 + ", size: " + Integer.valueOf(bVarA.a()));
            int iA2 = bVarA.a();
            if (iPosition2 < iA2) {
                byte[] bArr = new byte[iA2 - iPosition2];
                this.f48860l = bArr;
                byteBuffer.get(bArr);
            }
            if (bVarA instanceof a) {
                this.f48858j = (a) bVarA;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long jPosition = byteBuffer.position();
            b bVarA2 = k.a(this.d, byteBuffer);
            logger.finer(bVarA2 + " - DecoderConfigDescr2 read: " + (((long) byteBuffer.position()) - jPosition) + ", size: " + Integer.valueOf(bVarA2.a()));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.f48854e);
        sb2.append(", upStream=");
        sb2.append(this.f48855f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f48856g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f48857i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f48858j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f48860l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(p2.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f48859k;
        sb2.append(arrayList == null ? "null" : Arrays.asList(arrayList).toString());
        sb2.append('}');
        return sb2.toString();
    }
}
