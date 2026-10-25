package tc;

import c3.h0;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import li.e3;
import oc.c;
import ti.e;
public final class a extends com.googlecode.mp4parser.a {
    public static final e3 f48764b;
    public static final e3 f48765c;
    public static final e3 d;
    public static final e3 e;
    public static final e3 f48766f;
    public static final e3 h;
    public static final e3 f48767n;
    public static final e3 f48768r;
    public static final e3 f48769s;
    public static final e3 v;
    public static final e3 f48770w;
    public static final e3 f48771x;
    public static final e3 f48772y;
    public b f48773a;

    static {
        ue.a aVar = new ue.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f48766f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f48767n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f48768r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f48769s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f48770w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f48771x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f48772y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f48764b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f48765c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f48777f = new ArrayList();
        obj.f48778g = new ArrayList();
        obj.h = true;
        obj.f48779i = 1;
        obj.f48780j = 0;
        obj.f48781k = 0;
        obj.f48782l = new ArrayList();
        obj.f48783m = 63;
        obj.f48784n = 7;
        obj.f48785o = 31;
        obj.f48786p = 31;
        obj.f48787q = 31;
        obj.f48774a = f5.b.k(byteBuffer);
        obj.f48775b = f5.b.a(byteBuffer.get());
        obj.f48776c = f5.b.a(byteBuffer.get());
        obj.d = f5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f48783m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f48784n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[f5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f48777f.add(bArr);
        }
        long a10 = f5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[f5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f48778g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f48775b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f48785o = cVar2.a(6);
            obj.f48779i = cVar2.a(2);
            obj.f48786p = cVar2.a(5);
            obj.f48780j = cVar2.a(3);
            obj.f48787q = cVar2.a(5);
            obj.f48781k = cVar2.a(3);
            long a11 = f5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[f5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f48782l.add(bArr3);
            }
        } else {
            obj.f48779i = -1;
            obj.f48780j = -1;
            obj.f48781k = -1;
        }
        this.f48773a = obj;
    }

    public final void d(int i10) {
        h0.s(ue.a.c(e, this, this, new Integer(i10)));
        this.f48773a.d = i10;
    }

    public final void e(int i10) {
        h0.s(ue.a.c(f48765c, this, this, new Integer(i10)));
        this.f48773a.f48775b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        h0.s(ue.a.c(f48771x, this, this, byteBuffer));
        b bVar = this.f48773a;
        f5.b.r(bVar.f48774a, byteBuffer);
        byteBuffer.put((byte) (bVar.f48775b & 255));
        byteBuffer.put((byte) (bVar.f48776c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f48783m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f48784n, 3);
        cVar.c(bVar.f48778g.size(), 5);
        ArrayList arrayList = bVar.f48777f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            byte[] bArr = (byte[]) obj;
            f5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f48778g.size() & 255));
        ArrayList arrayList2 = bVar.f48778g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj2;
            f5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i13 = bVar.f48775b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f48785o, 6);
                cVar2.c(bVar.f48779i, 2);
                cVar2.c(bVar.f48786p, 5);
                cVar2.c(bVar.f48780j, 3);
                cVar2.c(bVar.f48787q, 5);
                cVar2.c(bVar.f48781k, 3);
                ArrayList arrayList3 = bVar.f48782l;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    byte[] bArr3 = (byte[]) obj3;
                    f5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i10;
        h0.s(ue.a.b(f48770w, this, this));
        b bVar = this.f48773a;
        ArrayList arrayList = bVar.f48777f;
        int size = arrayList.size();
        long j10 = 6;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            j10 = j10 + 2 + ((byte[]) obj).length;
        }
        long j11 = j10 + 1;
        ArrayList arrayList2 = bVar.f48778g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f48775b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f48782l;
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                j12 = j12 + 2 + ((byte[]) obj3).length;
            }
            return j12;
        }
        return j11;
    }

    public final String toString() {
        e b10 = ue.a.b(f48772y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f48773a + '}';
    }
}
