package qc;

import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import lc.c;
import ui.e;
import y7.i6;
public final class a extends com.googlecode.mp4parser.a {
    public static final i6 D;
    public static final i6 f54062b;
    public static final i6 f54063c;
    public static final i6 d;
    public static final i6 f54064e;
    public static final i6 f54065f;
    public static final i6 h;
    public static final i6 f54066n;
    public static final i6 f54067r;
    public static final i6 f54068s;
    public static final i6 f54069w;
    public static final i6 f54070x;
    public static final i6 f54071y;
    public b f54072a;

    static {
        ze.a aVar = new ze.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f54064e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f54065f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f54066n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f54067r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f54068s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f54069w = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f54070x = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f54071y = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        D = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f54062b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f54063c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i7;
        ?? obj = new Object();
        obj.f54077f = new ArrayList();
        obj.f54078g = new ArrayList();
        obj.h = true;
        obj.f54079i = 1;
        obj.f54080j = 0;
        obj.f54081k = 0;
        obj.f54082l = new ArrayList();
        obj.f54083m = 63;
        obj.f54084n = 7;
        obj.f54085o = 31;
        obj.f54086p = 31;
        obj.f54087q = 31;
        obj.f54073a = h5.b.k(byteBuffer);
        obj.f54074b = h5.b.a(byteBuffer.get());
        obj.f54075c = h5.b.a(byteBuffer.get());
        obj.d = h5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f54083m = cVar.a(6);
        obj.f54076e = cVar.a(2);
        obj.f54084n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i10 = 0; i10 < a10; i10++) {
            byte[] bArr = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f54077f.add(bArr);
        }
        long a11 = h5.b.a(byteBuffer.get());
        for (int i11 = 0; i11 < a11; i11++) {
            byte[] bArr2 = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f54078g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i7 = obj.f54074b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f54085o = cVar2.a(6);
            obj.f54079i = cVar2.a(2);
            obj.f54086p = cVar2.a(5);
            obj.f54080j = cVar2.a(3);
            obj.f54087q = cVar2.a(5);
            obj.f54081k = cVar2.a(3);
            long a12 = h5.b.a(byteBuffer.get());
            for (int i12 = 0; i12 < a12; i12++) {
                byte[] bArr3 = new byte[h5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f54082l.add(bArr3);
            }
        } else {
            obj.f54079i = -1;
            obj.f54080j = -1;
            obj.f54081k = -1;
        }
        this.f54072a = obj;
    }

    public final void d(int i7) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(f54064e, this, this, new Integer(i7)));
        this.f54072a.d = i7;
    }

    public final void e(int i7) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(f54063c, this, this, new Integer(i7)));
        this.f54072a.f54074b = i7;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(f54071y, this, this, byteBuffer));
        b bVar = this.f54072a;
        h5.b.r(bVar.f54073a, byteBuffer);
        byteBuffer.put((byte) (bVar.f54074b & 255));
        byteBuffer.put((byte) (bVar.f54075c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f54083m, 6);
        cVar.c(bVar.f54076e, 2);
        cVar.c(bVar.f54084n, 3);
        cVar.c(bVar.f54078g.size(), 5);
        ArrayList arrayList = bVar.f54077f;
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
        byteBuffer.put((byte) (bVar.f54078g.size() & 255));
        ArrayList arrayList2 = bVar.f54078g;
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
            int i12 = bVar.f54074b;
            if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f54085o, 6);
                cVar2.c(bVar.f54079i, 2);
                cVar2.c(bVar.f54086p, 5);
                cVar2.c(bVar.f54080j, 3);
                cVar2.c(bVar.f54087q, 5);
                cVar2.c(bVar.f54081k, 3);
                ArrayList arrayList3 = bVar.f54082l;
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
        com.google.android.recaptcha.internal.a.t(ze.a.b(f54070x, this, this));
        b bVar = this.f54072a;
        ArrayList arrayList = bVar.f54077f;
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
        ArrayList arrayList2 = bVar.f54078g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j10 = j10 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i7 = bVar.f54074b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            long j11 = j10 + 4;
            ArrayList arrayList3 = bVar.f54082l;
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
        e b10 = ze.a.b(D, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f54072a + '}';
    }
}
