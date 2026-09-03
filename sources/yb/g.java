package yb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f50872p = Logger.getLogger(g.class.getName());
    public int d;
    public int f50873e;
    public int f50874f;
    public int f50875g;
    public int h;
    public int f50876i;
    public String f50877j;
    public int f50878k;
    public int f50879l;
    public d f50880m;
    public m f50881n;
    public ArrayList f50882o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f50873e = i12;
        this.f50874f = (a2 >>> 6) & 1;
        this.f50875g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f50878k = r2.b.h(byteBuffer);
        }
        if (this.f50874f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.f50876i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f50877j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                throw new Error(e6);
            }
        }
        if (this.f50875g == 1) {
            this.f50879l = r2.b.h(byteBuffer);
        }
        int i13 = this.f50860c + 4;
        int i14 = 0;
        if (this.f50873e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f50874f == 1) {
            i11 = this.f50876i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f50875g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f50872p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f50880m = (d) a12;
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
                this.f50881n = (m) a14;
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
            this.f50882o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f50873e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f50874f > 0) {
            i10 += this.f50876i + 1;
        }
        if (this.f50875g > 0) {
            i10 += 2;
        }
        a aVar = this.f50880m.f50869j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f50838e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f50881n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f50882o;
                if (this.f50874f == gVar.f50874f && this.f50876i == gVar.f50876i && this.f50878k == gVar.f50878k && this.d == gVar.d && this.f50879l == gVar.f50879l && this.f50875g == gVar.f50875g && this.f50873e == gVar.f50873e && this.h == gVar.h) {
                    String str = this.f50877j;
                    if (str != null) {
                        if (!str.equals(gVar.f50877j)) {
                            return false;
                        }
                    } else if (gVar.f50877j != null) {
                        return false;
                    }
                    d dVar = this.f50880m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f50880m)) {
                            return false;
                        }
                    } else if (gVar.f50880m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f50882o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f50881n;
                    m mVar2 = gVar.f50881n;
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
        int i13 = ((((((((((this.d * 31) + this.f50873e) * 31) + this.f50874f) * 31) + this.f50875g) * 31) + this.h) * 31) + this.f50876i) * 31;
        String str = this.f50877j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f50878k) * 31) + this.f50879l) * 31;
        d dVar = this.f50880m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f50881n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f50882o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f50873e + ", URLFlag=" + this.f50874f + ", oCRstreamFlag=" + this.f50875g + ", streamPriority=" + this.h + ", URLLength=" + this.f50876i + ", URLString='" + this.f50877j + "', remoteODFlag=0, dependsOnEsId=" + this.f50878k + ", oCREsId=" + this.f50879l + ", decoderConfigDescriptor=" + this.f50880m + ", slConfigDescriptor=" + this.f50881n + '}';
    }
}
