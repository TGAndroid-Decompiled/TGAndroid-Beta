package vb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

public final class g extends b {

    public static final Logger f48861p = Logger.getLogger(g.class.getName());
    public int d;

    public int f48862e;

    public int f48863f;

    public int f48864g;
    public int h;

    public int f48865i;

    public String f48866j;

    public int f48867k;

    public int f48868l;

    public d f48869m;

    public m f48870n;

    public ArrayList f48871o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = p2.b.h(byteBuffer);
        int iA = p2.b.a(byteBuffer.get());
        int i10 = iA >>> 7;
        this.f48862e = i10;
        this.f48863f = (iA >>> 6) & 1;
        this.f48864g = (iA >>> 5) & 1;
        this.h = iA & 31;
        if (i10 == 1) {
            this.f48867k = p2.b.h(byteBuffer);
        }
        if (this.f48863f == 1) {
            int iA2 = p2.b.a(byteBuffer.get());
            this.f48865i = iA2;
            byte[] bArr = new byte[iA2];
            byteBuffer.get(bArr);
            try {
                this.f48866j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e9) {
                throw new Error(e9);
            }
        }
        if (this.f48864g == 1) {
            this.f48868l = p2.b.h(byteBuffer);
        }
        int i11 = this.f48849c + 4 + (this.f48862e == 1 ? 2 : 0) + (this.f48863f == 1 ? this.f48865i + 1 : 0) + (this.f48864g == 1 ? 2 : 0);
        int iPosition = byteBuffer.position();
        int iA3 = a();
        int i12 = i11 + 2;
        Logger logger = f48861p;
        if (iA3 > i12) {
            b bVarA = k.a(-1, byteBuffer);
            logger.finer(bVarA + " - ESDescriptor1 read: " + (byteBuffer.position() - iPosition) + ", size: " + Integer.valueOf(bVarA.a()));
            int iA4 = bVarA.a();
            byteBuffer.position(iPosition + iA4);
            i11 += iA4;
            if (bVarA instanceof d) {
                this.f48869m = (d) bVarA;
            }
        }
        int iPosition2 = byteBuffer.position();
        if (a() > i11 + 2) {
            b bVarA2 = k.a(-1, byteBuffer);
            logger.finer(bVarA2 + " - ESDescriptor2 read: " + (byteBuffer.position() - iPosition2) + ", size: " + Integer.valueOf(bVarA2.a()));
            int iA5 = bVarA2.a();
            byteBuffer.position(iPosition2 + iA5);
            i11 += iA5;
            if (bVarA2 instanceof m) {
                this.f48870n = (m) bVarA2;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i11 > 2) {
            int iPosition3 = byteBuffer.position();
            b bVarA3 = k.a(-1, byteBuffer);
            logger.finer(bVarA3 + " - ESDescriptor3 read: " + (byteBuffer.position() - iPosition3) + ", size: " + Integer.valueOf(bVarA3.a()));
            int iA6 = bVarA3.a();
            byteBuffer.position(iPosition3 + iA6);
            i11 += iA6;
            this.f48871o.add(bVarA3);
        }
    }

    public final int c() {
        int i10;
        int i11 = this.f48862e > 0 ? 7 : 5;
        if (this.f48863f > 0) {
            i11 += this.f48865i + 1;
        }
        if (this.f48864g > 0) {
            i11 += 2;
        }
        a aVar = this.f48869m.f48858j;
        if (aVar == null) {
            i10 = 0;
        } else {
            if (aVar.f48827e != 2) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            i10 = 4;
        }
        int i12 = i10 + 15 + i11;
        this.f48870n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        ArrayList arrayList = gVar.f48871o;
        if (this.f48863f != gVar.f48863f || this.f48865i != gVar.f48865i || this.f48867k != gVar.f48867k || this.d != gVar.d || this.f48868l != gVar.f48868l || this.f48864g != gVar.f48864g || this.f48862e != gVar.f48862e || this.h != gVar.h) {
            return false;
        }
        String str = this.f48866j;
        if (str != null) {
            if (!str.equals(gVar.f48866j)) {
                return false;
            }
        } else if (gVar.f48866j != null) {
            return false;
        }
        d dVar = this.f48869m;
        if (dVar != null) {
            if (!dVar.equals(gVar.f48869m)) {
                return false;
            }
        } else if (gVar.f48869m != null) {
            return false;
        }
        ArrayList arrayList2 = this.f48871o;
        if (arrayList2 != null) {
            if (!arrayList2.equals(arrayList)) {
                return false;
            }
        } else if (arrayList != null) {
            return false;
        }
        m mVar = this.f48870n;
        m mVar2 = gVar.f48870n;
        if (mVar != null) {
            return mVar.equals(mVar2);
        }
        return mVar2 == null;
    }

    public final int hashCode() {
        int i10 = ((((((((((this.d * 31) + this.f48862e) * 31) + this.f48863f) * 31) + this.f48864g) * 31) + this.h) * 31) + this.f48865i) * 31;
        String str = this.f48866j;
        int iHashCode = (((((i10 + (str != null ? str.hashCode() : 0)) * 961) + this.f48867k) * 31) + this.f48868l) * 31;
        d dVar = this.f48869m;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        m mVar = this.f48870n;
        int i11 = (iHashCode2 + (mVar != null ? mVar.d : 0)) * 31;
        ArrayList arrayList = this.f48871o;
        return i11 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f48862e + ", URLFlag=" + this.f48863f + ", oCRstreamFlag=" + this.f48864g + ", streamPriority=" + this.h + ", URLLength=" + this.f48865i + ", URLString='" + this.f48866j + "', remoteODFlag=0, dependsOnEsId=" + this.f48867k + ", oCREsId=" + this.f48868l + ", decoderConfigDescriptor=" + this.f48869m + ", slConfigDescriptor=" + this.f48870n + '}';
    }
}
