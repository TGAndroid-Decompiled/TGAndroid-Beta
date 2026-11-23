package qc;

import ab.c0;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import lc.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final ze.b E;
    public static final ze.b f56128b;
    public static final ze.b f56129c;
    public static final ze.b d;
    public static final ze.b f56130e;
    public static final ze.b f56131f;
    public static final ze.b h;
    public static final ze.b f56132n;
    public static final ze.b f56133r;
    public static final ze.b f56134s;
    public static final ze.b f56135w;
    public static final ze.b f56136x;
    public static final ze.b f56137y;
    public b f56138a;

    static {
        ze.a aVar = new ze.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f56130e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f56131f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f56132n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f56133r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f56134s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f56135w = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f56136x = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f56137y = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        E = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f56128b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f56129c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i7;
        ?? obj = new Object();
        obj.f56143f = new ArrayList();
        obj.f56144g = new ArrayList();
        obj.h = true;
        obj.f56145i = 1;
        obj.f56146j = 0;
        obj.f56147k = 0;
        obj.f56148l = new ArrayList();
        obj.f56149m = 63;
        obj.f56150n = 7;
        obj.f56151o = 31;
        obj.f56152p = 31;
        obj.f56153q = 31;
        obj.f56139a = h5.b.k(byteBuffer);
        obj.f56140b = h5.b.a(byteBuffer.get());
        obj.f56141c = h5.b.a(byteBuffer.get());
        obj.d = h5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f56149m = cVar.a(6);
        obj.f56142e = cVar.a(2);
        obj.f56150n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i10 = 0; i10 < a10; i10++) {
            byte[] bArr = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f56143f.add(bArr);
        }
        long a11 = h5.b.a(byteBuffer.get());
        for (int i11 = 0; i11 < a11; i11++) {
            byte[] bArr2 = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f56144g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i7 = obj.f56140b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f56151o = cVar2.a(6);
            obj.f56145i = cVar2.a(2);
            obj.f56152p = cVar2.a(5);
            obj.f56146j = cVar2.a(3);
            obj.f56153q = cVar2.a(5);
            obj.f56147k = cVar2.a(3);
            long a12 = h5.b.a(byteBuffer.get());
            for (int i12 = 0; i12 < a12; i12++) {
                byte[] bArr3 = new byte[h5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f56148l.add(bArr3);
            }
        } else {
            obj.f56145i = -1;
            obj.f56146j = -1;
            obj.f56147k = -1;
        }
        this.f56138a = obj;
    }

    public final void d(int i7) {
        i5.c.w(ze.a.c(f56130e, this, this, new Integer(i7)));
        this.f56138a.d = i7;
    }

    public final void e(int i7) {
        i5.c.w(ze.a.c(f56129c, this, this, new Integer(i7)));
        this.f56138a.f56140b = i7;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i5.c.w(ze.a.c(f56137y, this, this, byteBuffer));
        b bVar = this.f56138a;
        h5.b.r(bVar.f56139a, byteBuffer);
        byteBuffer.put((byte) (bVar.f56140b & 255));
        byteBuffer.put((byte) (bVar.f56141c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f56149m, 6);
        cVar.c(bVar.f56142e, 2);
        cVar.c(bVar.f56150n, 3);
        cVar.c(bVar.f56144g.size(), 5);
        ArrayList arrayList = bVar.f56143f;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            h5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f56144g.size() & 255));
        ArrayList arrayList2 = bVar.f56144g;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj2;
            h5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i12 = bVar.f56140b;
            if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f56151o, 6);
                cVar2.c(bVar.f56145i, 2);
                cVar2.c(bVar.f56152p, 5);
                cVar2.c(bVar.f56146j, 3);
                cVar2.c(bVar.f56153q, 5);
                cVar2.c(bVar.f56147k, 3);
                ArrayList arrayList3 = bVar.f56148l;
                int size3 = arrayList3.size();
                while (i7 < size3) {
                    Object obj3 = arrayList3.get(i7);
                    i7++;
                    byte[] bArr3 = (byte[]) obj3;
                    h5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i7;
        i5.c.w(ze.a.b(f56136x, this, this));
        b bVar = this.f56138a;
        ArrayList arrayList = bVar.f56143f;
        int size = arrayList.size();
        long j3 = 6;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j3 = j3 + 2 + ((byte[]) obj).length;
        }
        long j10 = j3 + 1;
        ArrayList arrayList2 = bVar.f56144g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j10 = j10 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i7 = bVar.f56140b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            long j11 = j10 + 4;
            ArrayList arrayList3 = bVar.f56148l;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                j11 = j11 + 2 + ((byte[]) obj3).length;
            }
            return j11;
        }
        return j10;
    }

    public final String toString() {
        c0 b10 = ze.a.b(E, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f56138a + '}';
    }
}
