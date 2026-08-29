package wb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f49836p = Logger.getLogger(g.class.getName());
    public int d;
    public int f49837e;
    public int f49838f;
    public int f49839g;
    public int h;
    public int f49840i;
    public String f49841j;
    public int f49842k;
    public int f49843l;
    public d f49844m;
    public m f49845n;
    public ArrayList f49846o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f49837e = i12;
        this.f49838f = (a2 >>> 6) & 1;
        this.f49839g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f49842k = r2.b.h(byteBuffer);
        }
        if (this.f49838f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.f49840i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f49841j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.f49839g == 1) {
            this.f49843l = r2.b.h(byteBuffer);
        }
        int i13 = this.f49824c + 4;
        int i14 = 0;
        if (this.f49837e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f49838f == 1) {
            i11 = this.f49840i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f49839g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f49836p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f49844m = (d) a12;
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
                this.f49845n = (m) a14;
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
            this.f49846o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f49837e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f49838f > 0) {
            i10 += this.f49840i + 1;
        }
        if (this.f49839g > 0) {
            i10 += 2;
        }
        a aVar = this.f49844m.f49833j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f49802e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f49845n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f49846o;
                if (this.f49838f == gVar.f49838f && this.f49840i == gVar.f49840i && this.f49842k == gVar.f49842k && this.d == gVar.d && this.f49843l == gVar.f49843l && this.f49839g == gVar.f49839g && this.f49837e == gVar.f49837e && this.h == gVar.h) {
                    String str = this.f49841j;
                    if (str != null) {
                        if (!str.equals(gVar.f49841j)) {
                            return false;
                        }
                    } else if (gVar.f49841j != null) {
                        return false;
                    }
                    d dVar = this.f49844m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f49844m)) {
                            return false;
                        }
                    } else if (gVar.f49844m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f49846o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f49845n;
                    m mVar2 = gVar.f49845n;
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
        int i13 = ((((((((((this.d * 31) + this.f49837e) * 31) + this.f49838f) * 31) + this.f49839g) * 31) + this.h) * 31) + this.f49840i) * 31;
        String str = this.f49841j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f49842k) * 31) + this.f49843l) * 31;
        d dVar = this.f49844m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f49845n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f49846o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f49837e + ", URLFlag=" + this.f49838f + ", oCRstreamFlag=" + this.f49839g + ", streamPriority=" + this.h + ", URLLength=" + this.f49840i + ", URLString='" + this.f49841j + "', remoteODFlag=0, dependsOnEsId=" + this.f49842k + ", oCREsId=" + this.f49843l + ", decoderConfigDescriptor=" + this.f49844m + ", slConfigDescriptor=" + this.f49845n + '}';
    }
}
