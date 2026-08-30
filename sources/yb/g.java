package yb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f47143p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f47144f;
    public int f47145g;
    public int h;
    public int f47146i;
    public String f47147j;
    public int f47148k;
    public int f47149l;
    public d f47150m;
    public m f47151n;
    public ArrayList f47152o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.e = i12;
        this.f47144f = (a2 >>> 6) & 1;
        this.f47145g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f47148k = r2.b.h(byteBuffer);
        }
        if (this.f47144f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.f47146i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f47147j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.f47145g == 1) {
            this.f47149l = r2.b.h(byteBuffer);
        }
        int i13 = this.f47132c + 4;
        int i14 = 0;
        if (this.e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f47144f == 1) {
            i11 = this.f47146i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f47145g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f47143p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f47150m = (d) a12;
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
                this.f47151n = (m) a14;
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
            this.f47152o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f47144f > 0) {
            i10 += this.f47146i + 1;
        }
        if (this.f47145g > 0) {
            i10 += 2;
        }
        a aVar = this.f47150m.f47140j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f47151n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f47152o;
                if (this.f47144f == gVar.f47144f && this.f47146i == gVar.f47146i && this.f47148k == gVar.f47148k && this.d == gVar.d && this.f47149l == gVar.f47149l && this.f47145g == gVar.f47145g && this.e == gVar.e && this.h == gVar.h) {
                    String str = this.f47147j;
                    if (str != null) {
                        if (!str.equals(gVar.f47147j)) {
                            return false;
                        }
                    } else if (gVar.f47147j != null) {
                        return false;
                    }
                    d dVar = this.f47150m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f47150m)) {
                            return false;
                        }
                    } else if (gVar.f47150m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f47152o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f47151n;
                    m mVar2 = gVar.f47151n;
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
        int i13 = ((((((((((this.d * 31) + this.e) * 31) + this.f47144f) * 31) + this.f47145g) * 31) + this.h) * 31) + this.f47146i) * 31;
        String str = this.f47147j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f47148k) * 31) + this.f47149l) * 31;
        d dVar = this.f47150m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f47151n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f47152o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f47144f + ", oCRstreamFlag=" + this.f47145g + ", streamPriority=" + this.h + ", URLLength=" + this.f47146i + ", URLString='" + this.f47147j + "', remoteODFlag=0, dependsOnEsId=" + this.f47148k + ", oCREsId=" + this.f47149l + ", decoderConfigDescriptor=" + this.f47150m + ", slConfigDescriptor=" + this.f47151n + '}';
    }
}
