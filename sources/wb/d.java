package wb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class d extends b {
    public static final Logger f49828m = Logger.getLogger(d.class.getName());
    public int d;
    public int f49829e;
    public int f49830f;
    public int f49831g;
    public long h;
    public long f49832i;
    public a f49833j;
    public ArrayList f49834k;
    public byte[] f49835l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        b a2;
        this.d = r2.b.a(byteBuffer.get());
        int a10 = r2.b.a(byteBuffer.get());
        this.f49829e = a10 >>> 2;
        this.f49830f = (a10 >> 1) & 1;
        this.f49831g = r2.b.a(byteBuffer.get()) + (r2.b.h(byteBuffer) << 8);
        this.h = r2.b.i(byteBuffer);
        this.f49832i = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = f49828m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a11 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a11 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a11.a()));
            int a12 = a11.a();
            if (position2 < a12) {
                byte[] bArr = new byte[a12 - position2];
                this.f49835l = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof a) {
                this.f49833j = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            logger.finer(k.a(this.d, byteBuffer) + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a2.a()));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.f49829e);
        sb2.append(", upStream=");
        sb2.append(this.f49830f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f49831g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f49832i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f49833j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f49835l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(r2.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f49834k;
        if (arrayList == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(arrayList).toString();
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
