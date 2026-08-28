package zb;

import com.google.firebase.messaging.t;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.j2;
import ub.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final zd.b f50398b;
    public static final zd.b f50399c;
    public static final zd.b d;
    public static final zd.b f50400e;
    public static final zd.b f50401f;
    public static final zd.b h;
    public static final zd.b f50402n;
    public static final zd.b f50403r;
    public static final zd.b f50404s;
    public static final zd.b v;
    public static final zd.b f50405w;
    public static final zd.b f50406x;
    public static final zd.b f50407y;
    public b f50408a;

    static {
        zd.a aVar = new zd.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f50400e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f50401f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f50402n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f50403r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f50404s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f50405w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f50406x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f50407y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f50398b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f50399c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i9;
        ?? obj = new Object();
        obj.f50413f = new ArrayList();
        obj.f50414g = new ArrayList();
        obj.h = true;
        obj.f50415i = 1;
        obj.f50416j = 0;
        obj.f50417k = 0;
        obj.f50418l = new ArrayList();
        obj.f50419m = 63;
        obj.f50420n = 7;
        obj.f50421o = 31;
        obj.f50422p = 31;
        obj.f50423q = 31;
        obj.f50409a = p2.b.k(byteBuffer);
        obj.f50410b = p2.b.a(byteBuffer.get());
        obj.f50411c = p2.b.a(byteBuffer.get());
        obj.d = p2.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f50419m = cVar.a(6);
        obj.f50412e = cVar.a(2);
        obj.f50420n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i10 = 0; i10 < a2; i10++) {
            byte[] bArr = new byte[p2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f50413f.add(bArr);
        }
        long a3 = p2.b.a(byteBuffer.get());
        for (int i11 = 0; i11 < a3; i11++) {
            byte[] bArr2 = new byte[p2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f50414g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i9 = obj.f50410b) == 100 || i9 == 110 || i9 == 122 || i9 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f50421o = cVar2.a(6);
            obj.f50415i = cVar2.a(2);
            obj.f50422p = cVar2.a(5);
            obj.f50416j = cVar2.a(3);
            obj.f50423q = cVar2.a(5);
            obj.f50417k = cVar2.a(3);
            long a10 = p2.b.a(byteBuffer.get());
            for (int i12 = 0; i12 < a10; i12++) {
                byte[] bArr3 = new byte[p2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f50418l.add(bArr3);
            }
        } else {
            obj.f50415i = -1;
            obj.f50416j = -1;
            obj.f50417k = -1;
        }
        this.f50408a = obj;
    }

    public final void d(int i9) {
        j2.t(zd.a.c(f50400e, this, this, new Integer(i9)));
        this.f50408a.d = i9;
    }

    public final void e(int i9) {
        j2.t(zd.a.c(f50399c, this, this, new Integer(i9)));
        this.f50408a.f50410b = i9;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        j2.t(zd.a.c(f50406x, this, this, byteBuffer));
        b bVar = this.f50408a;
        p2.b.r(bVar.f50409a, byteBuffer);
        byteBuffer.put((byte) (bVar.f50410b & 255));
        byteBuffer.put((byte) (bVar.f50411c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f50419m, 6);
        cVar.c(bVar.f50412e, 2);
        cVar.c(bVar.f50420n, 3);
        cVar.c(bVar.f50414g.size(), 5);
        ArrayList arrayList = bVar.f50413f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            p2.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f50414g.size() & 255));
        ArrayList arrayList2 = bVar.f50414g;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj2;
            p2.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i12 = bVar.f50410b;
            if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f50421o, 6);
                cVar2.c(bVar.f50415i, 2);
                cVar2.c(bVar.f50422p, 5);
                cVar2.c(bVar.f50416j, 3);
                cVar2.c(bVar.f50423q, 5);
                cVar2.c(bVar.f50417k, 3);
                ArrayList arrayList3 = bVar.f50418l;
                int size3 = arrayList3.size();
                while (i9 < size3) {
                    Object obj3 = arrayList3.get(i9);
                    i9++;
                    byte[] bArr3 = (byte[]) obj3;
                    p2.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i9;
        j2.t(zd.a.b(f50405w, this, this));
        b bVar = this.f50408a;
        ArrayList arrayList = bVar.f50413f;
        int size = arrayList.size();
        long j10 = 6;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j10 = j10 + 2 + ((byte[]) obj).length;
        }
        long j11 = j10 + 1;
        ArrayList arrayList2 = bVar.f50414g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i9 = bVar.f50410b) == 100 || i9 == 110 || i9 == 122 || i9 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f50418l;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                j12 = j12 + 2 + ((byte[]) obj3).length;
            }
            return j12;
        }
        return j11;
    }

    public final String toString() {
        t b10 = zd.a.b(f50407y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f50408a + '}';
    }
}
