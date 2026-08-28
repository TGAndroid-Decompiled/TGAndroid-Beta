package ub;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f48176p = Logger.getLogger(g.class.getName());
    public int d;
    public int f48177e;
    public int f48178f;
    public int f48179g;
    public int h;
    public int f48180i;
    public String f48181j;
    public int f48182k;
    public int f48183l;
    public d f48184m;
    public m f48185n;
    public ArrayList f48186o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i9;
        int i10;
        this.d = p2.b.h(byteBuffer);
        int a2 = p2.b.a(byteBuffer.get());
        int i11 = a2 >>> 7;
        this.f48177e = i11;
        this.f48178f = (a2 >>> 6) & 1;
        this.f48179g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i11 == 1) {
            this.f48182k = p2.b.h(byteBuffer);
        }
        if (this.f48178f == 1) {
            int a3 = p2.b.a(byteBuffer.get());
            this.f48180i = a3;
            byte[] bArr = new byte[a3];
            byteBuffer.get(bArr);
            try {
                this.f48181j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.f48179g == 1) {
            this.f48183l = p2.b.h(byteBuffer);
        }
        int i12 = this.f48164c + 4;
        int i13 = 0;
        if (this.f48177e == 1) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int i14 = i12 + i9;
        if (this.f48178f == 1) {
            i10 = this.f48180i + 1;
        } else {
            i10 = 0;
        }
        int i15 = i14 + i10;
        if (this.f48179g == 1) {
            i13 = 2;
        }
        int i16 = i15 + i13;
        int position = byteBuffer.position();
        int a10 = a();
        int i17 = i16 + 2;
        Logger logger = f48176p;
        if (a10 > i17) {
            b a11 = k.a(-1, byteBuffer);
            logger.finer(a11 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a11.a()));
            int a12 = a11.a();
            byteBuffer.position(position + a12);
            i16 += a12;
            if (a11 instanceof d) {
                this.f48184m = (d) a11;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i16 + 2) {
            b a13 = k.a(-1, byteBuffer);
            logger.finer(a13 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a13.a()));
            int a14 = a13.a();
            byteBuffer.position(position2 + a14);
            i16 += a14;
            if (a13 instanceof m) {
                this.f48185n = (m) a13;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i16 > 2) {
            int position3 = byteBuffer.position();
            b a15 = k.a(-1, byteBuffer);
            logger.finer(a15 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a15.a()));
            int a16 = a15.a();
            byteBuffer.position(position3 + a16);
            i16 += a16;
            this.f48186o.add(a15);
        }
    }

    public final int c() {
        int i9;
        int i10;
        if (this.f48177e > 0) {
            i9 = 7;
        } else {
            i9 = 5;
        }
        if (this.f48178f > 0) {
            i9 += this.f48180i + 1;
        }
        if (this.f48179g > 0) {
            i9 += 2;
        }
        a aVar = this.f48184m.f48173j;
        if (aVar == null) {
            i10 = 0;
        } else if (aVar.f48142e == 2) {
            i10 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i11 = i10 + 15 + i9;
        this.f48185n.getClass();
        return i11 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f48186o;
                if (this.f48178f == gVar.f48178f && this.f48180i == gVar.f48180i && this.f48182k == gVar.f48182k && this.d == gVar.d && this.f48183l == gVar.f48183l && this.f48179g == gVar.f48179g && this.f48177e == gVar.f48177e && this.h == gVar.h) {
                    String str = this.f48181j;
                    if (str != null) {
                        if (!str.equals(gVar.f48181j)) {
                            return false;
                        }
                    } else if (gVar.f48181j != null) {
                        return false;
                    }
                    d dVar = this.f48184m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f48184m)) {
                            return false;
                        }
                    } else if (gVar.f48184m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f48186o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f48185n;
                    m mVar2 = gVar.f48185n;
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
        int i9;
        int i10;
        int i11;
        int i12 = ((((((((((this.d * 31) + this.f48177e) * 31) + this.f48178f) * 31) + this.f48179g) * 31) + this.h) * 31) + this.f48180i) * 31;
        String str = this.f48181j;
        int i13 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (((((i12 + i9) * 961) + this.f48182k) * 31) + this.f48183l) * 31;
        d dVar = this.f48184m;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        m mVar = this.f48185n;
        if (mVar != null) {
            i11 = mVar.d;
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        ArrayList arrayList = this.f48186o;
        if (arrayList != null) {
            i13 = arrayList.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f48177e + ", URLFlag=" + this.f48178f + ", oCRstreamFlag=" + this.f48179g + ", streamPriority=" + this.h + ", URLLength=" + this.f48180i + ", URLString='" + this.f48181j + "', remoteODFlag=0, dependsOnEsId=" + this.f48182k + ", oCREsId=" + this.f48183l + ", decoderConfigDescriptor=" + this.f48184m + ", slConfigDescriptor=" + this.f48185n + '}';
    }
}
