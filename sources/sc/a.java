package sc;

import com.google.android.gms.internal.play_billing.k3;
import com.google.firebase.messaging.s;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ji.w4;
import nc.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final w4 f45087b;
    public static final w4 f45088c;
    public static final w4 d;
    public static final w4 e;
    public static final w4 f45089f;
    public static final w4 h;
    public static final w4 f45090n;
    public static final w4 f45091r;
    public static final w4 f45092s;
    public static final w4 v;
    public static final w4 f45093w;
    public static final w4 f45094x;
    public static final w4 f45095y;
    public b f45096a;

    static {
        te.a aVar = new te.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f45089f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f45090n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f45091r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f45092s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f45093w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f45094x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f45095y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f45087b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f45088c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f45100f = new ArrayList();
        obj.f45101g = new ArrayList();
        obj.h = true;
        obj.f45102i = 1;
        obj.f45103j = 0;
        obj.f45104k = 0;
        obj.f45105l = new ArrayList();
        obj.f45106m = 63;
        obj.f45107n = 7;
        obj.f45108o = 31;
        obj.f45109p = 31;
        obj.f45110q = 31;
        obj.f45097a = e5.b.k(byteBuffer);
        obj.f45098b = e5.b.a(byteBuffer.get());
        obj.f45099c = e5.b.a(byteBuffer.get());
        obj.d = e5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f45106m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f45107n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f45100f.add(bArr);
        }
        long a10 = e5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f45101g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f45098b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f45108o = cVar2.a(6);
            obj.f45102i = cVar2.a(2);
            obj.f45109p = cVar2.a(5);
            obj.f45103j = cVar2.a(3);
            obj.f45110q = cVar2.a(5);
            obj.f45104k = cVar2.a(3);
            long a11 = e5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[e5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f45105l.add(bArr3);
            }
        } else {
            obj.f45102i = -1;
            obj.f45103j = -1;
            obj.f45104k = -1;
        }
        this.f45096a = obj;
    }

    public final void d(int i10) {
        k3.p(te.a.c(e, this, this, new Integer(i10)));
        this.f45096a.d = i10;
    }

    public final void e(int i10) {
        k3.p(te.a.c(f45088c, this, this, new Integer(i10)));
        this.f45096a.f45098b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        k3.p(te.a.c(f45094x, this, this, byteBuffer));
        b bVar = this.f45096a;
        e5.b.r(bVar.f45097a, byteBuffer);
        byteBuffer.put((byte) (bVar.f45098b & 255));
        byteBuffer.put((byte) (bVar.f45099c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f45106m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f45107n, 3);
        cVar.c(bVar.f45101g.size(), 5);
        ArrayList arrayList = bVar.f45100f;
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
        byteBuffer.put((byte) (bVar.f45101g.size() & 255));
        ArrayList arrayList2 = bVar.f45101g;
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
            int i13 = bVar.f45098b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f45108o, 6);
                cVar2.c(bVar.f45102i, 2);
                cVar2.c(bVar.f45109p, 5);
                cVar2.c(bVar.f45103j, 3);
                cVar2.c(bVar.f45110q, 5);
                cVar2.c(bVar.f45104k, 3);
                ArrayList arrayList3 = bVar.f45105l;
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
        k3.p(te.a.b(f45093w, this, this));
        b bVar = this.f45096a;
        ArrayList arrayList = bVar.f45100f;
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
        ArrayList arrayList2 = bVar.f45101g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f45098b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f45105l;
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
        s b10 = te.a.b(f45095y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f45096a + '}';
    }
}
