package q2;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.Cells.j2;
public final class j extends com.googlecode.mp4parser.c {
    public static final zd.b A;
    public static final zd.b B;
    public static final zd.b f45926w;
    public static final zd.b f45927x;
    public static final zd.b f45928y;
    public String f45929e;
    public String f45930f;
    public long h;
    public long f45931n;
    public long f45932r;
    public boolean f45933s;
    public long v;

    static {
        zd.a aVar = new zd.a(j.class, "HandlerBox.java");
        f45926w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f45927x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f45928y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
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
        this.v = p2.b.i(byteBuffer);
        this.f45929e = p2.b.d(byteBuffer);
        this.h = p2.b.i(byteBuffer);
        this.f45931n = p2.b.i(byteBuffer);
        this.f45932r = p2.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f45930f = str;
                if (str.endsWith("\u0000")) {
                    this.f45930f = e2.c.m(this.f45930f, 1, 0);
                    this.f45933s = true;
                    return;
                }
                this.f45933s = false;
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        this.f45933s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(p2.c.d(this.f45929e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f45931n);
        byteBuffer.putInt((int) this.f45932r);
        String str = this.f45930f;
        if (str != null) {
            byteBuffer.put(p2.b.b(str));
        }
        if (this.f45933s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f45933s) {
            l10 = p2.b.l(this.f45930f) + 25;
        } else {
            l10 = p2.b.l(this.f45930f) + 24;
        }
        return l10;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(B, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        j2.t(zd.a.b(f45926w, this, this));
        sb2.append(this.f45929e);
        sb2.append(";name=");
        j2.t(zd.a.b(A, this, this));
        return aa.d.r(sb2, this.f45930f, "]");
    }
}
