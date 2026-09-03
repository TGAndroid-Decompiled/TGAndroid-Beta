package s2;

import androidx.biometric.f0;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.yh;
public final class j extends com.googlecode.mp4parser.c {
    public static final f0 B;
    public static final f0 C;
    public static final f0 f46896w;
    public static final f0 f46897x;
    public static final f0 f46898y;
    public String f46899e;
    public String f46900f;
    public long h;
    public long f46901n;
    public long f46902r;
    public boolean f46903s;
    public long v;

    static {
        de.a aVar = new de.a(j.class, "HandlerBox.java");
        f46896w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f46897x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f46898y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        B = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        C = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
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
        this.f46899e = r2.b.d(byteBuffer);
        this.h = r2.b.i(byteBuffer);
        this.f46901n = r2.b.i(byteBuffer);
        this.f46902r = r2.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f46900f = str;
                if (str.endsWith("\u0000")) {
                    this.f46900f = e2.c.j(this.f46900f, 1, 0);
                    this.f46903s = true;
                    return;
                }
                this.f46903s = false;
                return;
            } catch (UnsupportedEncodingException e6) {
                throw new Error(e6);
            }
        }
        this.f46903s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(r2.c.d(this.f46899e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f46901n);
        byteBuffer.putInt((int) this.f46902r);
        String str = this.f46900f;
        if (str != null) {
            byteBuffer.put(r2.b.b(str));
        }
        if (this.f46903s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f46903s) {
            l10 = r2.b.l(this.f46900f) + 25;
        } else {
            l10 = r2.b.l(this.f46900f) + 24;
        }
        return l10;
    }

    public final String toString() {
        sf.f b10 = de.a.b(C, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        yh.x(de.a.b(f46896w, this, this));
        sb.append(this.f46899e);
        sb.append(";name=");
        yh.x(de.a.b(B, this, this));
        return android.support.v4.media.a.r(sb, this.f46900f, "]");
    }
}
