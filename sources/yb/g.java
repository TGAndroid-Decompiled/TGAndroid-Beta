package yb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f50835p = Logger.getLogger(g.class.getName());
    public int d;
    public int f50836e;
    public int f50837f;
    public int f50838g;
    public int h;
    public int f50839i;
    public String f50840j;
    public int f50841k;
    public int f50842l;
    public d f50843m;
    public m f50844n;
    public ArrayList f50845o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f50836e = i12;
        this.f50837f = (a2 >>> 6) & 1;
        this.f50838g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f50841k = r2.b.h(byteBuffer);
        }
        if (this.f50837f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.f50839i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f50840j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                throw new Error(e6);
            }
        }
        if (this.f50838g == 1) {
            this.f50842l = r2.b.h(byteBuffer);
        }
        int i13 = this.f50823c + 4;
        int i14 = 0;
        if (this.f50836e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f50837f == 1) {
            i11 = this.f50839i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f50838g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f50835p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f50843m = (d) a12;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i17 + 2) {
            b a14 = k.a(-1, byteBuffer);
            logger.finer(a14 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a14.a()));
            int a15 = a14.a();
            byteBuffer.position(position2 + a15);
            i17 += a15;
            if (a14 instanceof m) {
                this.f50844n = (m) a14;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i17 > 2) {
            int position3 = byteBuffer.position();
            b a16 = k.a(-1, byteBuffer);
            logger.finer(a16 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a16.a()));
            int a17 = a16.a();
            byteBuffer.position(position3 + a17);
            i17 += a17;
            this.f50845o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f50836e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f50837f > 0) {
            i10 += this.f50839i + 1;
        }
        if (this.f50838g > 0) {
            i10 += 2;
        }
        a aVar = this.f50843m.f50832j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f50801e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f50844n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f50845o;
                if (this.f50837f == gVar.f50837f && this.f50839i == gVar.f50839i && this.f50841k == gVar.f50841k && this.d == gVar.d && this.f50842l == gVar.f50842l && this.f50838g == gVar.f50838g && this.f50836e == gVar.f50836e && this.h == gVar.h) {
                    String str = this.f50840j;
                    if (str != null) {
                        if (!str.equals(gVar.f50840j)) {
                            return false;
                        }
                    } else if (gVar.f50840j != null) {
                        return false;
                    }
                    d dVar = this.f50843m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f50843m)) {
                            return false;
                        }
                    } else if (gVar.f50843m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f50845o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f50844n;
                    m mVar2 = gVar.f50844n;
                    if (mVar != null) {
                        if (mVar.equals(mVar2)) {
                            return true;
                        }
                        return false;
                    } else if (mVar2 == null) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((((((((((this.d * 31) + this.f50836e) * 31) + this.f50837f) * 31) + this.f50838g) * 31) + this.h) * 31) + this.f50839i) * 31;
        String str = this.f50840j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f50841k) * 31) + this.f50842l) * 31;
        d dVar = this.f50843m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f50844n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f50845o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f50836e + ", URLFlag=" + this.f50837f + ", oCRstreamFlag=" + this.f50838g + ", streamPriority=" + this.h + ", URLLength=" + this.f50839i + ", URLString='" + this.f50840j + "', remoteODFlag=0, dependsOnEsId=" + this.f50841k + ", oCREsId=" + this.f50842l + ", decoderConfigDescriptor=" + this.f50843m + ", slConfigDescriptor=" + this.f50844n + '}';
    }
}
