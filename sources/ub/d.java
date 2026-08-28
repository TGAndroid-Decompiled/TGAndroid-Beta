package ub;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class d extends b {
    public static final Logger f48168m = Logger.getLogger(d.class.getName());
    public int d;
    public int f48169e;
    public int f48170f;
    public int f48171g;
    public long h;
    public long f48172i;
    public a f48173j;
    public ArrayList f48174k;
    public byte[] f48175l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        b a2;
        this.d = p2.b.a(byteBuffer.get());
        int a3 = p2.b.a(byteBuffer.get());
        this.f48169e = a3 >>> 2;
        this.f48170f = (a3 >> 1) & 1;
        this.f48171g = p2.b.a(byteBuffer.get()) + (p2.b.h(byteBuffer) << 8);
        this.h = p2.b.i(byteBuffer);
        this.f48172i = p2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = f48168m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a10 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a10 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a10.a()));
            int a11 = a10.a();
            if (position2 < a11) {
                byte[] bArr = new byte[a11 - position2];
                this.f48175l = bArr;
                byteBuffer.get(bArr);
            }
            if (a10 instanceof a) {
                this.f48173j = (a) a10;
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
        sb2.append(this.f48169e);
        sb2.append(", upStream=");
        sb2.append(this.f48170f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f48171g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f48172i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f48173j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f48175l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(p2.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f48174k;
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
