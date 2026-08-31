package xe;

import com.google.firebase.messaging.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import ne.p;
public final class b extends p {
    public final int f50538g;

    public b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.f50538g = i10;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f15975c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((ze.a) ((d) this.f15974b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f15977f;
        if (bVar != null) {
            j10 = bVar.i();
        } else {
            j10 = 0;
        }
        if (j10 < i()) {
            return true;
        }
        return false;
    }

    public b k(String str) {
        while (i() > 0) {
            b c3 = c();
            if (((String) c3.d).matches(str)) {
                return c3;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f15976e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f15976e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int skipBytes = ((DataInputStream) this.f15976e).skipBytes(i10 - i11);
            if (skipBytes > 0) {
                i11 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f50538g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.f15975c).f15974b).f4045b;
                d dVar = (d) this.f15974b;
                stringBuffer.append(j10 - dVar.f4045b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f4045b);
                stringBuffer.append(",len=");
                ze.a aVar = (ze.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f4045b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return android.support.v4.media.a.q(new StringBuilder("mp4[pos="), ((d) this.f15974b).f4045b, "]");
        }
    }
}
