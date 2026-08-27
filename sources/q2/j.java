package q2;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.Cells.pa;

public final class j extends com.googlecode.mp4parser.c {
    public static final ae.b A;
    public static final ae.b B;

    public static final ae.b f46090w;

    public static final ae.b f46091x;

    public static final ae.b f46092y;

    public String f46093e;

    public String f46094f;
    public long h;

    public long f46095n;

    public long f46096r;

    public boolean f46097s;
    public long v;

    static {
        ae.a aVar = new ae.a(j.class, "HandlerBox.java");
        f46090w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f46091x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f46092y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        A = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        B = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        DesugarCollections.unmodifiableMap(map);
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.v = p2.b.i(byteBuffer);
        this.f46093e = p2.b.d(byteBuffer);
        this.h = p2.b.i(byteBuffer);
        this.f46095n = p2.b.i(byteBuffer);
        this.f46096r = p2.b.i(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f46097s = false;
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            String str = new String(bArr, "UTF-8");
            this.f46094f = str;
            if (!str.endsWith("\u0000")) {
                this.f46097s = false;
            } else {
                this.f46094f = com.google.android.recaptcha.internal.a.n(this.f46094f, 1, 0);
                this.f46097s = true;
            }
        } catch (UnsupportedEncodingException e9) {
            throw new Error(e9);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(p2.c.d(this.f46093e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f46095n);
        byteBuffer.putInt((int) this.f46096r);
        String str = this.f46094f;
        if (str != null) {
            byteBuffer.put(p2.b.b(str));
        }
        if (this.f46097s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        return this.f46097s ? p2.b.l(this.f46094f) + 25 : p2.b.l(this.f46094f) + 24;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(B, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        pa.u(ae.a.b(f46090w, this, this));
        sb2.append(this.f46093e);
        sb2.append(";name=");
        pa.u(ae.a.b(A, this, this));
        return a9.p.p(sb2, this.f46094f, "]");
    }
}
