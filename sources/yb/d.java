package yb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class d extends b {
    public static final Logger f50828m = Logger.getLogger(d.class.getName());
    public int d;
    public int f50829e;
    public int f50830f;
    public int f50831g;
    public long h;
    public long f50832i;
    public a f50833j;
    public ArrayList f50834k;
    public byte[] f50835l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        b a2;
        this.d = r2.b.a(byteBuffer.get());
        int a10 = r2.b.a(byteBuffer.get());
        this.f50829e = a10 >>> 2;
        this.f50830f = (a10 >> 1) & 1;
        this.f50831g = r2.b.a(byteBuffer.get()) + (r2.b.h(byteBuffer) << 8);
        this.h = r2.b.i(byteBuffer);
        this.f50832i = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = f50828m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a11 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a11 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a11.a()));
            int a12 = a11.a();
            if (position2 < a12) {
                byte[] bArr = new byte[a12 - position2];
                this.f50835l = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof a) {
                this.f50833j = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            logger.finer(k.a(this.d, byteBuffer) + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a2.a()));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.d);
        sb.append(", streamType=");
        sb.append(this.f50829e);
        sb.append(", upStream=");
        sb.append(this.f50830f);
        sb.append(", bufferSizeDB=");
        sb.append(this.f50831g);
        sb.append(", maxBitRate=");
        sb.append(this.h);
        sb.append(", avgBitRate=");
        sb.append(this.f50832i);
        sb.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb.append(this.f50833j);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f50835l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(r2.b.c(0, bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f50834k;
        if (arrayList == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(arrayList).toString();
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
