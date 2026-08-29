package s2;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.th;
public final class j extends com.googlecode.mp4parser.c {
    public static final m5.i A;
    public static final m5.i B;
    public static final m5.i f47497w;
    public static final m5.i f47498x;
    public static final m5.i f47499y;
    public String f47500e;
    public String f47501f;
    public long h;
    public long f47502n;
    public long f47503r;
    public boolean f47504s;
    public long v;

    static {
        be.a aVar = new be.a(j.class, "HandlerBox.java");
        f47497w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f47498x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f47499y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        A = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        B = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.v = r2.b.i(byteBuffer);
        this.f47500e = r2.b.d(byteBuffer);
        this.h = r2.b.i(byteBuffer);
        this.f47502n = r2.b.i(byteBuffer);
        this.f47503r = r2.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f47501f = str;
                if (str.endsWith("\u0000")) {
                    this.f47501f = com.google.android.recaptcha.internal.a.m(this.f47501f, 1, 0);
                    this.f47504s = true;
                    return;
                }
                this.f47504s = false;
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        this.f47504s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(r2.c.d(this.f47500e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f47502n);
        byteBuffer.putInt((int) this.f47503r);
        String str = this.f47501f;
        if (str != null) {
            byteBuffer.put(r2.b.b(str));
        }
        if (this.f47504s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f47504s) {
            l10 = r2.b.l(this.f47501f) + 25;
        } else {
            l10 = r2.b.l(this.f47501f) + 24;
        }
        return l10;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(B, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        th.u(be.a.b(f47497w, this, this));
        sb2.append(this.f47500e);
        sb2.append(";name=");
        th.u(be.a.b(A, this, this));
        return a4.w.q(sb2, this.f47501f, "]");
    }
}
