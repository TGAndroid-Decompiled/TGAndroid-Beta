package yb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f50836p = Logger.getLogger(g.class.getName());
    public int d;
    public int f50837e;
    public int f50838f;
    public int f50839g;
    public int h;
    public int f50840i;
    public String f50841j;
    public int f50842k;
    public int f50843l;
    public d f50844m;
    public m f50845n;
    public ArrayList f50846o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f50837e = i12;
        this.f50838f = (a2 >>> 6) & 1;
        this.f50839g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f50842k = r2.b.h(byteBuffer);
        }
        if (this.f50838f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.f50840i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f50841j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                throw new Error(e6);
            }
        }
        if (this.f50839g == 1) {
            this.f50843l = r2.b.h(byteBuffer);
        }
        int i13 = this.f50824c + 4;
        int i14 = 0;
        if (this.f50837e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f50838f == 1) {
            i11 = this.f50840i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f50839g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f50836p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f50844m = (d) a12;
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
                this.f50845n = (m) a14;
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
            this.f50846o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f50837e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f50838f > 0) {
            i10 += this.f50840i + 1;
        }
        if (this.f50839g > 0) {
            i10 += 2;
        }
        a aVar = this.f50844m.f50833j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f50802e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f50845n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f50846o;
                if (this.f50838f == gVar.f50838f && this.f50840i == gVar.f50840i && this.f50842k == gVar.f50842k && this.d == gVar.d && this.f50843l == gVar.f50843l && this.f50839g == gVar.f50839g && this.f50837e == gVar.f50837e && this.h == gVar.h) {
                    String str = this.f50841j;
                    if (str != null) {
                        if (!str.equals(gVar.f50841j)) {
                            return false;
                        }
                    } else if (gVar.f50841j != null) {
                        return false;
                    }
                    d dVar = this.f50844m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f50844m)) {
                            return false;
                        }
                    } else if (gVar.f50844m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f50846o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f50845n;
                    m mVar2 = gVar.f50845n;
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
        int i13 = ((((((((((this.d * 31) + this.f50837e) * 31) + this.f50838f) * 31) + this.f50839g) * 31) + this.h) * 31) + this.f50840i) * 31;
        String str = this.f50841j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f50842k) * 31) + this.f50843l) * 31;
        d dVar = this.f50844m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f50845n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f50846o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f50837e + ", URLFlag=" + this.f50838f + ", oCRstreamFlag=" + this.f50839g + ", streamPriority=" + this.h + ", URLLength=" + this.f50840i + ", URLString='" + this.f50841j + "', remoteODFlag=0, dependsOnEsId=" + this.f50842k + ", oCREsId=" + this.f50843l + ", decoderConfigDescriptor=" + this.f50844m + ", slConfigDescriptor=" + this.f50845n + '}';
    }
}
