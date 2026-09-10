package rc;

import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.s;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m.g3;
import mc.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final g3 f41403b;
    public static final g3 f41404c;
    public static final g3 d;
    public static final g3 e;
    public static final g3 f41405f;
    public static final g3 h;
    public static final g3 f41406n;
    public static final g3 f41407r;
    public static final g3 f41408s;
    public static final g3 v;
    public static final g3 f41409w;
    public static final g3 f41410x;
    public static final g3 f41411y;
    public b f41412a;

    static {
        re.a aVar = new re.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f41405f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f41406n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f41407r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f41408s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f41409w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f41410x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f41411y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f41403b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f41404c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f41416f = new ArrayList();
        obj.f41417g = new ArrayList();
        obj.h = true;
        obj.f41418i = 1;
        obj.f41419j = 0;
        obj.f41420k = 0;
        obj.f41421l = new ArrayList();
        obj.f41422m = 63;
        obj.f41423n = 7;
        obj.f41424o = 31;
        obj.f41425p = 31;
        obj.f41426q = 31;
        obj.f41413a = e5.b.k(byteBuffer);
        obj.f41414b = e5.b.a(byteBuffer.get());
        obj.f41415c = e5.b.a(byteBuffer.get());
        obj.d = e5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f41422m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f41423n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f41416f.add(bArr);
        }
        long a10 = e5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f41417g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f41414b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f41424o = cVar2.a(6);
            obj.f41418i = cVar2.a(2);
            obj.f41425p = cVar2.a(5);
            obj.f41419j = cVar2.a(3);
            obj.f41426q = cVar2.a(5);
            obj.f41420k = cVar2.a(3);
            long a11 = e5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[e5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f41421l.add(bArr3);
            }
        } else {
            obj.f41418i = -1;
            obj.f41419j = -1;
            obj.f41420k = -1;
        }
        this.f41412a = obj;
    }

    public final void d(int i10) {
        e2.q(re.a.c(e, this, this, new Integer(i10)));
        this.f41412a.d = i10;
    }

    public final void e(int i10) {
        e2.q(re.a.c(f41404c, this, this, new Integer(i10)));
        this.f41412a.f41414b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        e2.q(re.a.c(f41410x, this, this, byteBuffer));
        b bVar = this.f41412a;
        e5.b.r(bVar.f41413a, byteBuffer);
        byteBuffer.put((byte) (bVar.f41414b & 255));
        byteBuffer.put((byte) (bVar.f41415c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f41422m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f41423n, 3);
        cVar.c(bVar.f41417g.size(), 5);
        ArrayList arrayList = bVar.f41416f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            byte[] bArr = (byte[]) obj;
            e5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f41417g.size() & 255));
        ArrayList arrayList2 = bVar.f41417g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj2;
            e5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i13 = bVar.f41414b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f41424o, 6);
                cVar2.c(bVar.f41418i, 2);
                cVar2.c(bVar.f41425p, 5);
                cVar2.c(bVar.f41419j, 3);
                cVar2.c(bVar.f41426q, 5);
                cVar2.c(bVar.f41420k, 3);
                ArrayList arrayList3 = bVar.f41421l;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    byte[] bArr3 = (byte[]) obj3;
                    e5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i10;
        e2.q(re.a.b(f41409w, this, this));
        b bVar = this.f41412a;
        ArrayList arrayList = bVar.f41416f;
        int size = arrayList.size();
        long j3 = 6;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            j3 = j3 + 2 + ((byte[]) obj).length;
        }
        long j10 = j3 + 1;
        ArrayList arrayList2 = bVar.f41417g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j10 = j10 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f41414b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j11 = j10 + 4;
            ArrayList arrayList3 = bVar.f41421l;
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                j11 = j11 + 2 + ((byte[]) obj3).length;
            }
            return j11;
        }
        return j10;
    }

    public final String toString() {
        s b10 = re.a.b(f41411y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f41412a + '}';
    }
}
