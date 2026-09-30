package rc;

import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ka.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final c f42479b;
    public static final c f42480c;
    public static final c d;
    public static final c e;
    public static final c f42481f;
    public static final c h;
    public static final c f42482n;
    public static final c f42483r;
    public static final c f42484s;
    public static final c v;
    public static final c f42485w;
    public static final c f42486x;
    public static final c f42487y;
    public b f42488a;

    static {
        re.a aVar = new re.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f42481f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f42482n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f42483r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f42484s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f42485w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f42486x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f42487y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f42479b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f42480c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f42492f = new ArrayList();
        obj.f42493g = new ArrayList();
        obj.h = true;
        obj.f42494i = 1;
        obj.f42495j = 0;
        obj.f42496k = 0;
        obj.f42497l = new ArrayList();
        obj.f42498m = 63;
        obj.f42499n = 7;
        obj.f42500o = 31;
        obj.f42501p = 31;
        obj.f42502q = 31;
        obj.f42489a = e5.b.k(byteBuffer);
        obj.f42490b = e5.b.a(byteBuffer.get());
        obj.f42491c = e5.b.a(byteBuffer.get());
        obj.d = e5.b.a(byteBuffer.get());
        mc.c cVar = new mc.c(0, byteBuffer);
        obj.f42498m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f42499n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f42492f.add(bArr);
        }
        long a10 = e5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f42493g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f42490b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            mc.c cVar2 = new mc.c(0, byteBuffer);
            obj.f42500o = cVar2.a(6);
            obj.f42494i = cVar2.a(2);
            obj.f42501p = cVar2.a(5);
            obj.f42495j = cVar2.a(3);
            obj.f42502q = cVar2.a(5);
            obj.f42496k = cVar2.a(3);
            long a11 = e5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[e5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f42497l.add(bArr3);
            }
        } else {
            obj.f42494i = -1;
            obj.f42495j = -1;
            obj.f42496k = -1;
        }
        this.f42488a = obj;
    }

    public final void d(int i10) {
        e2.q(re.a.c(e, this, this, new Integer(i10)));
        this.f42488a.d = i10;
    }

    public final void e(int i10) {
        e2.q(re.a.c(f42480c, this, this, new Integer(i10)));
        this.f42488a.f42490b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        e2.q(re.a.c(f42486x, this, this, byteBuffer));
        b bVar = this.f42488a;
        e5.b.r(bVar.f42489a, byteBuffer);
        byteBuffer.put((byte) (bVar.f42490b & 255));
        byteBuffer.put((byte) (bVar.f42491c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        mc.c cVar = new mc.c(1, byteBuffer);
        cVar.c(bVar.f42498m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f42499n, 3);
        cVar.c(bVar.f42493g.size(), 5);
        ArrayList arrayList = bVar.f42492f;
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
        byteBuffer.put((byte) (bVar.f42493g.size() & 255));
        ArrayList arrayList2 = bVar.f42493g;
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
            int i13 = bVar.f42490b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                mc.c cVar2 = new mc.c(1, byteBuffer);
                cVar2.c(bVar.f42500o, 6);
                cVar2.c(bVar.f42494i, 2);
                cVar2.c(bVar.f42501p, 5);
                cVar2.c(bVar.f42495j, 3);
                cVar2.c(bVar.f42502q, 5);
                cVar2.c(bVar.f42496k, 3);
                ArrayList arrayList3 = bVar.f42497l;
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
        e2.q(re.a.b(f42485w, this, this));
        b bVar = this.f42488a;
        ArrayList arrayList = bVar.f42492f;
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
        ArrayList arrayList2 = bVar.f42493g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j10 = j10 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f42490b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j11 = j10 + 4;
            ArrayList arrayList3 = bVar.f42497l;
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
        t b10 = re.a.b(f42487y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f42488a + '}';
    }
}
