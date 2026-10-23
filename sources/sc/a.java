package sc;

import com.google.android.gms.internal.play_billing.k3;
import com.google.firebase.messaging.r;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import nc.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final te.b f46167b;
    public static final te.b f46168c;
    public static final te.b d;
    public static final te.b e;
    public static final te.b f46169f;
    public static final te.b h;
    public static final te.b f46170n;
    public static final te.b f46171r;
    public static final te.b f46172s;
    public static final te.b v;
    public static final te.b f46173w;
    public static final te.b f46174x;
    public static final te.b f46175y;
    public b f46176a;

    static {
        te.a aVar = new te.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f46169f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f46170n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f46171r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f46172s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f46173w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f46174x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f46175y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f46167b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f46168c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f46180f = new ArrayList();
        obj.f46181g = new ArrayList();
        obj.h = true;
        obj.f46182i = 1;
        obj.f46183j = 0;
        obj.f46184k = 0;
        obj.f46185l = new ArrayList();
        obj.f46186m = 63;
        obj.f46187n = 7;
        obj.f46188o = 31;
        obj.f46189p = 31;
        obj.f46190q = 31;
        obj.f46177a = e5.b.k(byteBuffer);
        obj.f46178b = e5.b.a(byteBuffer.get());
        obj.f46179c = e5.b.a(byteBuffer.get());
        obj.d = e5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f46186m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f46187n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f46180f.add(bArr);
        }
        long a10 = e5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f46181g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f46178b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f46188o = cVar2.a(6);
            obj.f46182i = cVar2.a(2);
            obj.f46189p = cVar2.a(5);
            obj.f46183j = cVar2.a(3);
            obj.f46190q = cVar2.a(5);
            obj.f46184k = cVar2.a(3);
            long a11 = e5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[e5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f46185l.add(bArr3);
            }
        } else {
            obj.f46182i = -1;
            obj.f46183j = -1;
            obj.f46184k = -1;
        }
        this.f46176a = obj;
    }

    public final void d(int i10) {
        k3.p(te.a.c(e, this, this, new Integer(i10)));
        this.f46176a.d = i10;
    }

    public final void e(int i10) {
        k3.p(te.a.c(f46168c, this, this, new Integer(i10)));
        this.f46176a.f46178b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        k3.p(te.a.c(f46174x, this, this, byteBuffer));
        b bVar = this.f46176a;
        e5.b.r(bVar.f46177a, byteBuffer);
        byteBuffer.put((byte) (bVar.f46178b & 255));
        byteBuffer.put((byte) (bVar.f46179c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f46186m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f46187n, 3);
        cVar.c(bVar.f46181g.size(), 5);
        ArrayList arrayList = bVar.f46180f;
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
        byteBuffer.put((byte) (bVar.f46181g.size() & 255));
        ArrayList arrayList2 = bVar.f46181g;
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
            int i13 = bVar.f46178b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f46188o, 6);
                cVar2.c(bVar.f46182i, 2);
                cVar2.c(bVar.f46189p, 5);
                cVar2.c(bVar.f46183j, 3);
                cVar2.c(bVar.f46190q, 5);
                cVar2.c(bVar.f46184k, 3);
                ArrayList arrayList3 = bVar.f46185l;
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
        k3.p(te.a.b(f46173w, this, this));
        b bVar = this.f46176a;
        ArrayList arrayList = bVar.f46180f;
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
        ArrayList arrayList2 = bVar.f46181g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f46178b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f46185l;
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
        r b10 = te.a.b(f46175y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f46176a + '}';
    }
}
