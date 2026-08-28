package se;

import com.google.firebase.messaging.d;
import ie.p;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public final class b extends p {
    public final int f47514g;

    public b(d dVar, p pVar, String str, int i9) {
        super(dVar, pVar, str);
        this.f47514g = i9;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f11123c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((ue.a) ((d) this.f11122b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f11125f;
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
            b c10 = c();
            if (((String) c10.d).matches(str)) {
                return c10;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f11124e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f11124e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int skipBytes = ((DataInputStream) this.f11124e).skipBytes(i9 - i10);
            if (skipBytes > 0) {
                i10 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f47514g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.f11123c).f11122b).f4135b;
                d dVar = (d) this.f11122b;
                stringBuffer.append(j10 - dVar.f4135b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f4135b);
                stringBuffer.append(",len=");
                ue.a aVar = (ue.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f4135b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return aa.d.q(new StringBuilder("mp4[pos="), ((d) this.f11122b).f4135b, "]");
        }
    }
}
